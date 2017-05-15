
import javax.swing.JDialog;
import javax.swing.JFrame;

public class GameSettings 
{
    private final SettingsView settingsView;
    private final JDialog settingsContainer;    
            
    public GameSettings(JFrame parent)
    {
        settingsContainer = new JDialog(parent);
        settingsView = new SettingsView(settingsContainer);
        settingsContainer.add(settingsView); 
        settingsContainer.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        settingsContainer.setLocationByPlatform(false);
        settingsContainer.pack();
        settingsContainer.setModal(true);  
        settingsContainer.setResizable(false);
    }
    
    public void execute()
    {               
        settingsContainer.setVisible(true);
    }
    
    public String getNamePlayer1()
    {
        return settingsView.getNamePlayer1();
    }
    
    public String getNamePlayer2()
    {
        return settingsView.getNamePlayer2();
    }
}
