
import javafx.util.Pair;
import javax.swing.JDialog;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bbsuser
 */
public class SpielFeldView extends javax.swing.JFrame {

    /**
     * Creates new form SpielFeldView
     */
    boolean Sieler1weiterclick, Spieler2Weiterklick;
    Status Ss1, Ss2;
    Player Player1, Player2;
    SpielModel logic;
    JDialog settingsContainer;
    SettingsView settingsView;
    
    public SpielFeldView() {
        initComponents();
        settingsContainer = new JDialog();
        settingsView = new SettingsView(settingsContainer);      
        settingsContainer.add(settingsView);        
        settingsContainer.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        settingsContainer.setLocationByPlatform(false);
        settingsContainer.pack();
        settingsContainer.setModal(true);  
        settingsContainer.setResizable(false);
        settingsContainer.setVisible(true);
        
        logic = new SpielModel();
        Pair<Player, Player> Players = logic.Initialization(settingsView.getNamePlayer1(), settingsView.getNamePlayer2());
        Player1 = Players.getKey();
        Player2 = Players.getValue();
        fuelDisplayPlayer1.setText("Tank " + Player1.getPlayerName());
        fuelDisplayPlayer2.setText("Tank " + Player2.getPlayerName());
        fuelGaugePlayer1.setValue(100);
        fuelGaugePlayer2.setValue(100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        continuePlayer1 = new javax.swing.JButton();
        acceleratePlayer1 = new javax.swing.JButton();
        brakePlayer1 = new javax.swing.JButton();
        brakePlayer2 = new javax.swing.JButton();
        continuePlayer2 = new javax.swing.JButton();
        acceleratePlayer2 = new javax.swing.JButton();
        weatherDisplay = new javax.swing.JLabel();
        fuelGaugePlayer1 = new javax.swing.JProgressBar();
        fuelGaugePlayer2 = new javax.swing.JProgressBar();
        fuelDisplayPlayer2 = new javax.swing.JLabel();
        fuelDisplayPlayer1 = new javax.swing.JLabel();
        currentWeatherInformation = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AutoSpieler2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        autoSpieler1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        continuePlayer1.setText("Weiter");
        continuePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuePlayer1ActionPerformed(evt);
            }
        });

        acceleratePlayer1.setText("Beschleunigen");
        acceleratePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceleratePlayer1ActionPerformed(evt);
            }
        });

        brakePlayer1.setText("Bremsen");
        brakePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brakePlayer1ActionPerformed(evt);
            }
        });

        brakePlayer2.setText("Bremsen");
        brakePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brakePlayer2ActionPerformed(evt);
            }
        });

        continuePlayer2.setText("Weiter");
        continuePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuePlayer2ActionPerformed(evt);
            }
        });

        acceleratePlayer2.setText("Beschleunigen");
        acceleratePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceleratePlayer2ActionPerformed(evt);
            }
        });

        weatherDisplay.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        weatherDisplay.setText("Aktuelles Wetter:");

        fuelDisplayPlayer2.setText("Tank Spieler 2:");

        fuelDisplayPlayer1.setText("Tank Spieler 1:");

        currentWeatherInformation.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        AutoSpieler2.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout AutoSpieler2Layout = new javax.swing.GroupLayout(AutoSpieler2);
        AutoSpieler2.setLayout(AutoSpieler2Layout);
        AutoSpieler2Layout.setHorizontalGroup(
            AutoSpieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        AutoSpieler2Layout.setVerticalGroup(
            AutoSpieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AutoSpieler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 328, Short.MAX_VALUE)
                .addComponent(AutoSpieler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        autoSpieler1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout autoSpieler1Layout = new javax.swing.GroupLayout(autoSpieler1);
        autoSpieler1.setLayout(autoSpieler1Layout);
        autoSpieler1Layout.setHorizontalGroup(
            autoSpieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        autoSpieler1Layout.setVerticalGroup(
            autoSpieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(autoSpieler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 328, Short.MAX_VALUE)
                .addComponent(autoSpieler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acceleratePlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(continuePlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brakePlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(fuelGaugePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fuelDisplayPlayer1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(weatherDisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentWeatherInformation)
                        .addGap(0, 213, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(acceleratePlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(continuePlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(brakePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fuelGaugePlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fuelDisplayPlayer2)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weatherDisplay)
                            .addComponent(currentWeatherInformation))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(fuelDisplayPlayer2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fuelDisplayPlayer1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuelGaugePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuelGaugePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(continuePlayer2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acceleratePlayer2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brakePlayer2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(continuePlayer1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acceleratePlayer1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brakePlayer1)))))
                .addGap(21, 21, 21))
        );

        continuePlayer1.getAccessibleContext().setAccessibleName("continuePlayer1");
        acceleratePlayer1.getAccessibleContext().setAccessibleName("accelPlayer1");
        brakePlayer1.getAccessibleContext().setAccessibleName("brakePlayer1");
        brakePlayer2.getAccessibleContext().setAccessibleName("brakePlayer2");
        continuePlayer2.getAccessibleContext().setAccessibleName("continuePlayer2");
        acceleratePlayer2.getAccessibleContext().setAccessibleName("accelPlayer2");
        weatherDisplay.getAccessibleContext().setAccessibleName("currentWeather");
        fuelGaugePlayer1.getAccessibleContext().setAccessibleName("fuelBarPlayer1");
        fuelGaugePlayer2.getAccessibleContext().setAccessibleName("fuelBarPlayer2");
        fuelDisplayPlayer2.getAccessibleContext().setAccessibleName("fuelPlayer2");
        fuelDisplayPlayer1.getAccessibleContext().setAccessibleName("fuelPlayer1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disabuttpl1()
    {
        continuePlayer1.setEnabled(false);
        acceleratePlayer1.setEnabled(false);
        brakePlayer1.setEnabled(false);    
    } 
    
    private void dbp2()
    {
        continuePlayer2.setEnabled(false);
        acceleratePlayer2.setEnabled(false);
        brakePlayer2.setEnabled(false);     
    }
    
    private void continuePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuePlayer1ActionPerformed
        Sieler1weiterclick = true;
        Ss1 = Status.pass;
        disabuttpl1();
        Tick();        
    }//GEN-LAST:event_continuePlayer1ActionPerformed

    private void continuePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuePlayer2ActionPerformed
        Spieler2Weiterklick = true;
        Ss2 = Status.pass;
        dbp2();
        Tick();
    }//GEN-LAST:event_continuePlayer2ActionPerformed

    private void acceleratePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceleratePlayer1ActionPerformed
        Sieler1weiterclick = true;
        Ss1 = Status.accelerate;
        disabuttpl1();
        Tick();   
    }//GEN-LAST:event_acceleratePlayer1ActionPerformed

    private void brakePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brakePlayer1ActionPerformed
        Sieler1weiterclick = true;
        Ss1 = Status.deccelerate;
        disabuttpl1();
        Tick();
    }//GEN-LAST:event_brakePlayer1ActionPerformed

    private void acceleratePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceleratePlayer2ActionPerformed
        Spieler2Weiterklick = true;
        Ss2 = Status.accelerate;
        dbp2();
        Tick();
    }//GEN-LAST:event_acceleratePlayer2ActionPerformed

    private void brakePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brakePlayer2ActionPerformed
        Spieler2Weiterklick = true;
        Ss2 = Status.deccelerate;
        dbp2();
        Tick();
    }//GEN-LAST:event_brakePlayer2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SpielFeldView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpielFeldView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpielFeldView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpielFeldView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpielFeldView().setVisible(true);
            }
        });
        
        
    }
    
    private Player Spieler1, Spieler2;
    
    private void Tick()
    {
        if (Sieler1weiterclick && Spieler2Weiterklick == true)
        {
            
        }     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AutoSpieler2;
    private javax.swing.JButton acceleratePlayer1;
    private javax.swing.JButton acceleratePlayer2;
    private javax.swing.JPanel autoSpieler1;
    private javax.swing.JButton brakePlayer1;
    private javax.swing.JButton brakePlayer2;
    private javax.swing.JButton continuePlayer1;
    private javax.swing.JButton continuePlayer2;
    private javax.swing.JLabel currentWeatherInformation;
    private javax.swing.JLabel fuelDisplayPlayer1;
    private javax.swing.JLabel fuelDisplayPlayer2;
    private javax.swing.JProgressBar fuelGaugePlayer1;
    private javax.swing.JProgressBar fuelGaugePlayer2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel weatherDisplay;
    // End of variables declaration//GEN-END:variables
}
