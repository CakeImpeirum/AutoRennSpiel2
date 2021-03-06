public class Player {

    private double fFuel = 100;

    private double fSpeed;

    private String fPlayerName;

    private Status fStatus;

    private int fPoints;

    private int fStatusDuration;

    public double getFuel() 
    {
        return this.fFuel;
    }

    public double getCurrentSpeed() 
    {
        return this.fSpeed;
    }

    public String getPlayerName() 
    {
        return this.fPlayerName;
    }

    public Status getStatus() 
    {
        return this.fStatus;
    }

    public int getPoints() 
    {
        return this.fPoints;
    }
    
    public int getStatusDuration()
    {
        return this.fStatusDuration;
    }

    public void IncPoints() 
    {
        ++this.fPoints;
    }
    
    public void IncStatusDuration()
    {
        ++this.fStatusDuration;
    }
    
    public void ResetStatusDuration()
    {
        this.fStatusDuration = 0;
    }

    public void increaseSpeed(double aAmount) 
    {
        this.fSpeed += aAmount;
        if (fSpeed < 0)
            fSpeed = 0;
    }

    public void setStatus(Status aStatus) 
    {
        this.fStatus = aStatus;
    }
    

    public void decreaseFuel(double aAmount) 
    {
        this.fFuel -= aAmount;
    }

    public void Tick() 
    {
        
    }

    public Player(String aPlayerName) 
    {
        this.fPlayerName = aPlayerName;
    }
    
    public void ResetPlayer()
    {
        this.fFuel = 100;
        this.fSpeed = 0;
        this.fStatus = Status.pass;
        this.fStatusDuration = 0;
    }
}
