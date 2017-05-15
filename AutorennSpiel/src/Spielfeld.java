
import java.util.Random;

public class Spielfeld {

    private Wetter fWetter;
    
    public Spielfeld()
    {
        int random = new Random().nextInt(5);
        fWetter = Wetter.values()[random];
    }
    
    public Wetter getWetter()
    {
        return this.fWetter;
    }
}
