
import javafx.util.Pair;

public class SpielModel {

    public void Tick(Status StatusSpieler1, Status StatusSpieler2) {
    }
    
    public Pair<Player, Player> Initialization(String PlayerName1, String PlayerName2)
    {
       
    }
    
    public int CalculatePlayerMovement(Player aPlayer, Wetter aWeather, Status newStatus)
    {
        if (aPlayer.getStatus() == Status.win)
            aPlayer.IncPoints();
        
        if (aPlayer.getStatus() == newStatus)
            aPlayer.IncStatusDuration();
        else
        {
            aPlayer.setStatus(newStatus);
        }
        
        int movementValue = 0;
        
        movementValue = CalculateMovementAfterSpeed(movementValue, aPlayer.getCurrentSpeed());
        
        return movementValue;
    }
    
    private int CalculateMovementAfterSpeed(int aMovementValue, double aPlayerSpeed)
    {
        return aMovementValue += aPlayerSpeed;
    }
    
    private int CalculateMovementAfterStatus(int aMovementValue, Status aPlayerStatus, int aStatusDuration)
    {
        double tempMovementValue = (double) aMovementValue;
        
        if (aPlayerStatus == Status.accelerate)
        {
            if (aStatusDuration < 2)
            {
                tempMovementValue += tempMovementValue * .15 * (double)aStatusDuration;
            }
            else
            {
                tempMovementValue += tempMovementValue * .45 - (.2 / (double)aStatusDuration);
            }
        }
        else if (aPlayerStatus == Status.deccelerate)
        {
            if (aStatusDuration < 2)
            {
                tempMovementValue -= tempMovementValue * .15 * (double)aStatusDuration;
            }
            else
            {
                tempMovementValue -= tempMovementValue * .45 - (.2 / (double)aStatusDuration);
            }
        }
        
        return aMovementValue;
    }
}

}
