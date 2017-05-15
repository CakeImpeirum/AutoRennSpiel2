import javafx.util.Pair;

public class SpielModel 
{
    Spielfeld fSpielfeld;
    int _baseSpeedIncrement = 10;
    
    public void Tick(Player aPlayer1, Player aPlayer2, Status aNewStatusPlayer1, Status aNewStatusPlayer2)
    {
        CalculatePlayerMovement(aPlayer1, fSpielfeld.getWetter(), aNewStatusPlayer1);
        CalculatePlayerMovement(aPlayer2, fSpielfeld.getWetter(), aNewStatusPlayer2);
    }
    
    public Pair<Player, Player> Initialization(String aPlayerName1, String aPlayerName2)
    {
       Player player1 = new Player(aPlayerName1);
       Player player2 = new Player(aPlayerName2);
       this.fSpielfeld = new Spielfeld();
       
       return new Pair(player1, player2);
    }
    
    public Wetter getCurrentWeather()
    {
        return fSpielfeld.getWetter();
    }
    
    private void CalculatePlayerMovement(Player aPlayer, Wetter aWeather, Status newStatus)
    {
        if (aPlayer.getStatus() == Status.win)
        {
            aPlayer.IncPoints();
        }
        
        if (aPlayer.getStatus() == newStatus)
            aPlayer.IncStatusDuration();
        else
        {
            aPlayer.setStatus(newStatus);
            aPlayer.ResetStatusDuration();
        }
        
        CalculatePlayerSpeedAfterStatus(aPlayer, aPlayer.getStatusDuration());
        CalculatePlayerSpeedAfterWeather(aPlayer, aWeather);
        CalculatePlayerFuelConsumption(aPlayer);
        
        if (!DetermineMovementEligibility(aPlayer))
            aPlayer.increaseSpeed(-aPlayer.getCurrentSpeed());        
    }
    
    private boolean DetermineMovementEligibility(Player aPlayer)
    {
        return aPlayer.getFuel() > 0;
    }
    
    private void CalculatePlayerSpeedAfterStatus(Player aPlayer, int aStatusDuration)
    {
        double speedIncrement = 0;
        if (aPlayer.getStatus() == Status.accelerate)
        {
            if (aPlayer.getCurrentSpeed() == 0)
                speedIncrement += _baseSpeedIncrement;
            else if (aStatusDuration < 2)
            {
                speedIncrement += aPlayer.getCurrentSpeed() * .15 * (double)aStatusDuration;
            }
            else
            {
                speedIncrement += aPlayer.getCurrentSpeed() * .45 - (.2 / (double)aStatusDuration);
            }
        }
        else if (aPlayer.getStatus() == Status.deccelerate)
        {
            if (aStatusDuration < 2)
            {
                speedIncrement -= aPlayer.getCurrentSpeed() * .15 * (double)aStatusDuration;
            }
            else
            {
                speedIncrement -= aPlayer.getCurrentSpeed() * .45 - (.2 / (double)aStatusDuration);
            }
        }

        aPlayer.increaseSpeed(speedIncrement);
    }
    
    private void CalculatePlayerSpeedAfterWeather(Player aPlayer, Wetter aWeather)
    {
        double speedIncrement = 0;
        
        if (aWeather == Wetter.headwind)
            speedIncrement -= aPlayer.getCurrentSpeed() * .08;
        else if (aWeather == Wetter.tailwind)
            speedIncrement += aPlayer.getCurrentSpeed() * .08;
        else if (aWeather == Wetter.rain)
        {
            if (aPlayer.getStatus() == Status.accelerate)
                speedIncrement -= aPlayer.getCurrentSpeed() * .05;
            else if (aPlayer.getStatus() == Status.deccelerate)
                speedIncrement += aPlayer.getCurrentSpeed() * .05;
        }
        else if (aWeather == Wetter.snow)
        {
            if (aPlayer.getStatus() == Status.accelerate)
                speedIncrement -= aPlayer.getCurrentSpeed() * .1;
            else if (aPlayer.getStatus() == Status.deccelerate)
                speedIncrement += aPlayer.getCurrentSpeed() * .1;            
        }
        
        aPlayer.increaseSpeed(speedIncrement);
    }
    
    private void CalculatePlayerFuelConsumption(Player aPlayer)
    {
        double consumptionValue = 0;
        
        consumptionValue = aPlayer.getCurrentSpeed() * .2;
        
        aPlayer.decreaseFuel(consumptionValue);
    }
}

