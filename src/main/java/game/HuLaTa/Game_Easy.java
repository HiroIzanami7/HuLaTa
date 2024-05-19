package game.HuLaTa;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import game.HuLaTa.User;
import java.util.ArrayList;



public class Game_Easy extends javax.swing.JFrame {
    
    
    private javax.swing.Timer timer;
    private int secondsRemaining;
    private boolean addTimeAllowed;
    private boolean close1,close2, close3, close4,close5 ;
 
    
    public Game_Easy(int easyseconds) {
        initComponents();

        this.secondsRemaining = easyseconds;
        addTimeAllowed = false;
        close1 = true;
        close2 = true;
        close3 = true;
        close4 = true;
        close5 = true;
        updateTimerLabel();
        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondsRemaining--;
                if (secondsRemaining <= 0) {
                    timer.stop();
                    Time.setText("Time's up!");
                } else {
                    updateTimerLabel();
                }
            }
        });
        timer.start();
        
        Check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String userinput1 = Letter1.getText();
                String userinput2 = Letter2.getText();
                String userinput3 = Letter3.getText();
                String userinput4 = Letter4.getText();
                String userinput5 = Letter5.getText();

                if( close1){
                    switch (userinput1) {
                        case "G" -> {
                            Letter1.setBackground(Color.GREEN);
                            Letter1.setEnabled(false);
                            if(Letter1.getBackground() == Color.GREEN && !addTimeAllowed){
                                addExtraTime();
                                addTimeAllowed = false;
                                updateTimerLabel();
                                close1 =false;
                            }
                        }

                        case "T" -> {
                            Letter1.setBackground(Color.ORANGE);
                            Letter1.setEnabled(true);
                        }
                        case "S" -> {
                            Letter1.setBackground(Color.ORANGE);
                            Letter1.setEnabled(true);
                        }
                        case "A" -> {
                            Letter1.setBackground(Color.ORANGE);
                            Letter1.setEnabled(true);
                        }
                        default -> {
                            Letter1.setBackground(Color.RED);
                            Letter1.setEnabled(true);
                            Letter1.setText("");
                        }
                    }
                }
                if(close2 ){
                    switch (userinput2) {
                        case "A" -> {
                            Letter2.setBackground(Color.GREEN);
                            Letter2.setEnabled(false);
                            if(Letter2.getBackground() == Color.GREEN && !addTimeAllowed){
                                addTimeAllowed = true;
                                addExtraTime();
                                addTimeAllowed = false;
                                updateTimerLabel();
                                close2 = false;
                            }
                            
                        }
                        case "T" -> {
                            Letter2.setBackground(Color.ORANGE);
                            Letter2.setEnabled(true);
                        }
                        case "G" -> {
                            Letter2.setBackground(Color.ORANGE);
                            Letter2.setEnabled(true);
                        }
                        case "S" -> {
                            Letter2.setBackground(Color.ORANGE);
                            Letter2.setEnabled(true);
                        }
                        default -> {
                            Letter2.setBackground(Color.RED);
                            Letter2.setEnabled(true);
                            Letter2.setText("");
                        }
                    }
                }
                if(close3){
                    switch (userinput3) {
                        case "T" -> {
                            Letter3.setBackground(Color.GREEN);
                            Letter3.setEnabled(false);
                            if(Letter3.getBackground() == Color.GREEN && !addTimeAllowed){
                                addTimeAllowed = true;
                                addExtraTime();
                                addTimeAllowed = false;
                                updateTimerLabel();
                                close3=false;
                            }
                          
                        }
                        case "A" -> {
                            Letter3.setBackground(Color.ORANGE);
                            Letter3.setEnabled(true);
                        }
                        case "G" -> {
                            Letter3.setBackground(Color.ORANGE);
                            Letter3.setEnabled(true);
                        }
                        case "S" -> {
                            Letter3.setBackground(Color.ORANGE);
                            Letter3.setEnabled(true);
                        }
                        default -> {
                            Letter3.setBackground(Color.RED);
                            Letter3.setEnabled(true);
                            Letter3.setText("");
                        }
                    }
                }
        
                if(close4){
                    switch (userinput4) {
                        case "A" -> {
                            Letter4.setBackground(Color.GREEN);
                            Letter4.setEnabled(false);
                            if(Letter4.getBackground() == Color.GREEN && !addTimeAllowed){
                               addTimeAllowed = true;
                                addExtraTime();
                                addTimeAllowed = false;
                                updateTimerLabel();
                                close4=false;
                            }
                            
                        }
                        case "T" -> {
                            Letter4.setBackground(Color.ORANGE);
                            Letter4.setEnabled(true);
                        }
                        case "G" -> {
                            Letter4.setBackground(Color.ORANGE);
                            Letter4.setEnabled(true);
                        }
                        case "S" -> {
                            Letter4.setBackground(Color.ORANGE);
                            Letter4.setEnabled(true);
                        }
                        default -> {
                            Letter4.setBackground(Color.RED);
                            Letter4.setEnabled(true);
                            Letter4.setText("");
                        }
                    }
                }
        
                if(close5){
                    switch (userinput5) {
                        case "S" -> {
                            Letter5.setBackground(Color.GREEN);
                            Letter5.setEnabled(false);
                            if(Letter5.getBackground() == Color.GREEN && !addTimeAllowed){
                                addTimeAllowed = true;
                                addExtraTime();
                                addTimeAllowed = false;
                                updateTimerLabel();
                                close5=false;
                            }
                        }
                        case "A" -> {
                            Letter5.setBackground(Color.ORANGE);
                            Letter5.setEnabled(true);
                        }
                        case "G" -> {
                            Letter5.setBackground(Color.ORANGE);
                            Letter5.setEnabled(true);
                        }
                        case "T" -> {
                            Letter5.setBackground(Color.ORANGE);
                            Letter5.setEnabled(true);
                        }
                        default -> {
                            Letter5.setBackground(Color.RED);
                            Letter5.setEnabled(true);
                            Letter5.setText("");
                        }
                    }
                }  
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        Fact = new javax.swing.JDialog();
        Newgame = new javax.swing.JButton();
        Check = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Letter1 = new javax.swing.JTextField();
        Letter2 = new javax.swing.JTextField();
        Letter3 = new javax.swing.JTextField();
        Letter4 = new javax.swing.JTextField();
        Letter5 = new javax.swing.JTextField();
        Attempt = new javax.swing.JLabel();
        History = new javax.swing.JTextPane();
        Time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FactLayout = new javax.swing.GroupLayout(Fact.getContentPane());
        Fact.getContentPane().setLayout(FactLayout);
        FactLayout.setHorizontalGroup(
            FactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        FactLayout.setVerticalGroup(
            FactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        Newgame.setBackground(new java.awt.Color(0, 204, 255));
        Newgame.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        Newgame.setForeground(new java.awt.Color(255, 255, 255));
        Newgame.setText("NEW GAME");
        Newgame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewgameActionPerformed(evt);
            }
        });

        Check.setBackground(new java.awt.Color(102, 255, 102));
        Check.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        Check.setForeground(new java.awt.Color(255, 255, 255));
        Check.setText("CHECK");
        Check.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        Letter1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter1.setActionCommand("<Not Set>");
        Letter1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Letter1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter1KeyTyped(evt);
            }
        });

        Letter2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Letter2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter2KeyTyped(evt);
            }
        });

        Letter3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Letter3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter3KeyTyped(evt);
            }
        });

        Letter4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Letter4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter4KeyTyped(evt);
            }
        });

        Letter5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Letter5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(Letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Attempt.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Attempt.setText("Time Remaining:");

        History.setEditable(false);
        History.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PREVIOUS WORDS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Rounded MT Bold", 3, 14), new java.awt.Color(204, 0, 51))); // NOI18N

        Time.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        jLabel1.setText("CATEGORY:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Attempt))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Attempt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDialog(){
       JButton ok = new JButton("ok"); 
       ok.addActionListener(new ActionListener (){
         public void actionPerformed(ActionEvent e) {
          Fact.dispose();
          dispose();
          FunFact fun =new FunFact();
          fun.setVisible(true);
         }
       });
       Fact.setLayout(new FlowLayout());
       Fact.add(new JLabel("You Win!!!"));
       Fact.add(ok);
       
       Fact.setSize(200,100);
       Fact.setLocationRelativeTo(this);
       Fact.setVisible(true);
       
    }
    private void updateTimerLabel() {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        Time.setText(String.format("%02d:%02d", minutes, seconds));
    }
    private void addExtraTime(){
       secondsRemaining +=10;
    }
    
    private void NewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewgameActionPerformed
        this.setVisible(false);
        Game_Level levelFrame = new Game_Level();
        levelFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_NewgameActionPerformed

    private void Letter1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter1KeyTyped
           
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter1.getText().toUpperCase().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter1KeyTyped

    private void Letter2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter2KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter2.getText().toUpperCase().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter2KeyTyped

    private void Letter3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter3KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter3.getText().toUpperCase().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter3KeyTyped

    private void Letter4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter4KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter4.getText().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter4KeyTyped

    private void Letter5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter5KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter5.getText().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter5KeyTyped

    private void Letter1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter1KeyReleased
        int pos = Letter1.getCaretPosition();
        Letter1.setText(Letter1.getText().toUpperCase());
        Letter1.setCaretPosition(pos);
    }//GEN-LAST:event_Letter1KeyReleased

    private void Letter2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter2KeyReleased
        int pos = Letter2.getCaretPosition();
        Letter2.setText(Letter2.getText().toUpperCase());
        Letter2.setCaretPosition(pos);
    }//GEN-LAST:event_Letter2KeyReleased

    private void Letter3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter3KeyReleased
        int pos = Letter3.getCaretPosition();
        Letter3.setText(Letter3.getText().toUpperCase());
        Letter3.setCaretPosition(pos);// TODO add your handling code here:
    }//GEN-LAST:event_Letter3KeyReleased

    private void Letter4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter4KeyReleased
        int pos = Letter4.getCaretPosition();
        Letter4.setText(Letter4.getText().toUpperCase());
        Letter4.setCaretPosition(pos);
    }//GEN-LAST:event_Letter4KeyReleased

    private void Letter5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter5KeyReleased
        int pos = Letter5.getCaretPosition();
        Letter5.setText(Letter5.getText().toUpperCase());
        Letter5.setCaretPosition(pos);
    }//GEN-LAST:event_Letter5KeyReleased

    private void Letter1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Letter2.requestFocus();
        }// TODO add your handling code here:
    }//GEN-LAST:event_Letter1KeyPressed

    private void Letter2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter2KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Letter3.requestFocus();
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_Letter2KeyPressed

    private void Letter3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter3KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Letter4.requestFocus();
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_Letter3KeyPressed

    private void Letter4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter4KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Letter5.requestFocus();
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_Letter4KeyPressed

    private void Letter5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter5KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Check.requestFocus();
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_Letter5KeyPressed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        if(Letter1.getBackground() == Color.GREEN && Letter2.getBackground() == Color.GREEN && Letter3.getBackground() == Color.GREEN && Letter4.getBackground() == Color.GREEN && Letter5.getBackground() == Color.GREEN){
                   showDialog();
                   int score = 10;
                   
                }// TODO add your handling code here:
    }//GEN-LAST:event_CheckActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int easyseconds = 300; // 1 minute countdown
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_Easy(easyseconds).setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Attempt;
    public javax.swing.JButton Check;
    private javax.swing.JDialog Fact;
    private javax.swing.JTextPane History;
    private javax.swing.JTextField Letter1;
    private javax.swing.JTextField Letter2;
    private javax.swing.JTextField Letter3;
    private javax.swing.JTextField Letter4;
    private javax.swing.JTextField Letter5;
    private javax.swing.JButton Newgame;
    private javax.swing.JLabel Time;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
