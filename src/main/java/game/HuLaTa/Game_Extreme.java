package game.HuLaTa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game_Extreme extends javax.swing.JFrame {

    private javax.swing.Timer timer;
    private int secondsRemaining;
    
    public Game_Extreme(int extremeseconds) {
        initComponents();
        this.secondsRemaining = extremeseconds;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Check = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Letter2 = new javax.swing.JTextField();
        Letter3 = new javax.swing.JTextField();
        Letter4 = new javax.swing.JTextField();
        Letter5 = new javax.swing.JTextField();
        Letter6 = new javax.swing.JTextField();
        Letter7 = new javax.swing.JTextField();
        Letter1 = new javax.swing.JTextField();
        Letter8 = new javax.swing.JTextField();
        Newgame = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        History = new javax.swing.JTextPane();
        Attempt1 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        Letter2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter2.addKeyListener(new java.awt.event.KeyAdapter() {
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter5KeyTyped(evt);
            }
        });

        Letter6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter6KeyTyped(evt);
            }
        });

        Letter7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter7KeyTyped(evt);
            }
        });

        Letter1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter1.setActionCommand("<Not Set>");
        Letter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letter1ActionPerformed(evt);
            }
        });
        Letter1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter1KeyTyped(evt);
            }
        });

        Letter8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        Letter8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Letter8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Letter8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Letter8KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Letter7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Letter8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letter8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

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

        History.setEditable(false);
        History.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PREVIOUS WORDS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Rounded MT Bold", 3, 14), new java.awt.Color(204, 0, 51))); // NOI18N
        jScrollPane1.setViewportView(History);

        Attempt1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Attempt1.setText("Time Remaining:");

        Time.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(Attempt1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Attempt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Newgame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void updateTimerLabel() {
        int minutes = secondsRemaining / 60;
        int seconds = secondsRemaining % 60;
        Time.setText(String.format("%02d:%02d", minutes, seconds));
    }
    
    private void NewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewgameActionPerformed
        this.setVisible(false);
        Game_Level levelFrame = new Game_Level();
        levelFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_NewgameActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        String userinput1 = Letter1.getText();
        String userinput2 = Letter2.getText();
        String userinput3 = Letter3.getText();
        String userinput4 = Letter4.getText();
        String userinput5 = Letter5.getText();
        String userinput6 = Letter6.getText();
        String userinput7 = Letter7.getText();
        String userinput8 = Letter8.getText();
        if( true){
            if(userinput1.equals("M")){
                Letter1.setBackground(Color.GREEN);
                Letter1.setEnabled(false);
            }
            else if(userinput1.equals("I")){
                Letter1.setBackground(Color.ORANGE);
                Letter1.setEnabled(true);
            }
            else if(userinput1.equals("K")){
                Letter1.setBackground(Color.ORANGE);
                Letter1.setEnabled(true);
            }
            else if(userinput1.equals("T")){
                Letter1.setBackground(Color.ORANGE);
                Letter1.setEnabled(true);
            }
            else if(userinput1.equals("N")){
                Letter1.setBackground(Color.ORANGE);
                Letter1.setEnabled(true);
            }
            else if(userinput1.equals("G")){
                Letter1.setBackground(Color.ORANGE);
                Letter1.setEnabled(true);
            }
            else{
                Letter1.setBackground(Color.RED);
                Letter1.setEnabled(true);
            }
        }
        if( true){
            if(userinput2.equals("I")){
                Letter2.setBackground(Color.GREEN);
                Letter2.setEnabled(false);
            }
            else if(userinput2.equals("M")){
                Letter2.setBackground(Color.ORANGE);
                Letter2.setEnabled(true);
            }
            else if(userinput2.equals("K")){
                Letter2.setBackground(Color.ORANGE);
                Letter2.setEnabled(true);
            }
            else if(userinput2.equals("T")){
                Letter2.setBackground(Color.ORANGE);
                Letter2.setEnabled(true);
            }
            else if(userinput2.equals("N")){
                Letter2.setBackground(Color.ORANGE);
                Letter2.setEnabled(true);
            }
            else if(userinput2.equals("G")){
                Letter2.setBackground(Color.ORANGE);
                Letter2.setEnabled(true);
            }
            else{
                Letter2.setBackground(Color.RED);
                Letter2.setEnabled(true);
            }
        }
        if( true){
            if(userinput3.equals("K")){
                Letter3.setBackground(Color.GREEN);
                Letter3.setEnabled(false);
            }
            else if(userinput3.equals("M")){
                Letter3.setBackground(Color.ORANGE);
                Letter3.setEnabled(true);
            }
            else if(userinput3.equals("I")){
                Letter3.setBackground(Color.ORANGE);
                Letter3.setEnabled(true);
            }
            else if(userinput3.equals("T")){
                Letter3.setBackground(Color.ORANGE);
                Letter3.setEnabled(true);
            }
            else if(userinput3.equals("N")){
                Letter3.setBackground(Color.ORANGE);
                Letter3.setEnabled(true);
            }
            else if(userinput3.equals("G")){
                Letter3.setBackground(Color.ORANGE);
                Letter3.setEnabled(true);
            }
            else{
                Letter3.setBackground(Color.RED);
                Letter3.setEnabled(true);
            }
        }
        if( true){
            if(userinput4.equals("T")){
                Letter4.setBackground(Color.GREEN);
                Letter4.setEnabled(false);
            }
            else if(userinput4.equals("M")){
                Letter4.setBackground(Color.ORANGE);
                Letter4.setEnabled(true);
            }
            else if(userinput4.equals("I")){
                Letter4.setBackground(Color.ORANGE);
                Letter4.setEnabled(true);
            }
            else if(userinput4.equals("K")){
                Letter4.setBackground(Color.ORANGE);
                Letter4.setEnabled(true);
            }
            else if(userinput4.equals("N")){
                Letter4.setBackground(Color.ORANGE);
                Letter4.setEnabled(true);
            }
            else if(userinput4.equals("G")){
                Letter4.setBackground(Color.ORANGE);
                Letter4.setEnabled(true);
            }
            else{
                Letter4.setBackground(Color.RED);
                Letter4.setEnabled(true);
            }
        }
        if( true){
            if(userinput5.equals("I")){
                Letter5.setBackground(Color.GREEN);
                Letter5.setEnabled(false);
            }
            else if(userinput5.equals("T")){
                Letter5.setBackground(Color.ORANGE);
                Letter5.setEnabled(true);
            }
            else if(userinput5.equals("M")){
                Letter5.setBackground(Color.ORANGE);
                Letter5.setEnabled(true);
            }
            else if(userinput5.equals("K")){
                Letter5.setBackground(Color.ORANGE);
                Letter5.setEnabled(true);
            }
            else if(userinput5.equals("N")){
                Letter5.setBackground(Color.ORANGE);
                Letter5.setEnabled(true);
            }
            else if(userinput5.equals("G")){
                Letter5.setBackground(Color.ORANGE);
                Letter5.setEnabled(true);
            }
            else{
                Letter5.setBackground(Color.RED);
                Letter5.setEnabled(true);
            }
        }
        if( true){
            if(userinput6.equals("N")){
                Letter6.setBackground(Color.GREEN);
                Letter6.setEnabled(false);
            }
            else if(userinput6.equals("M")){
                Letter6.setBackground(Color.ORANGE);
                Letter6.setEnabled(true);
            }
            else if(userinput6.equals("I")){
                Letter6.setBackground(Color.ORANGE);
                Letter6.setEnabled(true);
            }
            else if(userinput6.equals("K")){
                Letter6.setBackground(Color.ORANGE);
                Letter6.setEnabled(true);
            }
            else if(userinput6.equals("T")){
                Letter6.setBackground(Color.ORANGE);
                Letter6.setEnabled(true);
            }
            else if(userinput6.equals("G")){
                Letter6.setBackground(Color.ORANGE);
                Letter6.setEnabled(true);
            }
            else{
                Letter6.setBackground(Color.RED);
                Letter6.setEnabled(true);
            }
        }
        if( true){
            if(userinput7.equals("I")){
                Letter7.setBackground(Color.GREEN);
                Letter7.setEnabled(false);
            }
            else if(userinput7.equals("T")){
                Letter7.setBackground(Color.ORANGE);
                Letter7.setEnabled(true);
            }
            else if(userinput7.equals("M")){
                Letter7.setBackground(Color.ORANGE);
                Letter7.setEnabled(true);
            }
            else if(userinput7.equals("K")){
                Letter7.setBackground(Color.ORANGE);
                Letter7.setEnabled(true);
            }
            else if(userinput7.equals("N")){
                Letter7.setBackground(Color.ORANGE);
                Letter7.setEnabled(true);
            }
            else if(userinput7.equals("G")){
                Letter7.setBackground(Color.ORANGE);
                Letter7.setEnabled(true);
            }
            else{
                Letter7.setBackground(Color.RED);
                Letter7.setEnabled(true);
            }
        }
        if( true){
            if(userinput8.equals("G")){
                Letter8.setBackground(Color.GREEN);
                Letter8.setEnabled(false);
            }
            else if(userinput8.equals("M")){
                Letter8.setBackground(Color.ORANGE);
                Letter8.setEnabled(true);
            }
            else if(userinput8.equals("I")){
                Letter8.setBackground(Color.ORANGE);
                Letter8.setEnabled(true);
            }
            else if(userinput8.equals("K")){
                Letter8.setBackground(Color.ORANGE);
                Letter8.setEnabled(true);
            }
            else if(userinput8.equals("T")){
                Letter8.setBackground(Color.ORANGE);
                Letter8.setEnabled(true);
            }
            else if(userinput8.equals("N")){
                Letter8.setBackground(Color.ORANGE);
                Letter8.setEnabled(true);
            
            }
            else{
                Letter8.setBackground(Color.RED);
                Letter8.setEnabled(true);
            }
        
            History.setText(userinput1+userinput2+userinput3+userinput4+userinput5+userinput6+userinput7+userinput8);
        }
    }//GEN-LAST:event_CheckActionPerformed

    private void Letter1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter1KeyReleased
        int pos = Letter1.getCaretPosition();
        Letter1.setText(Letter1.getText().toUpperCase());
        Letter1.setCaretPosition(pos);
    }//GEN-LAST:event_Letter1KeyReleased

    private void Letter1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter1KeyTyped

        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter1.getText().toUpperCase().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter1KeyTyped

    private void Letter2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter2KeyReleased
        int pos = Letter2.getCaretPosition();
        Letter2.setText(Letter2.getText().toUpperCase());
        Letter2.setCaretPosition(pos);
    }//GEN-LAST:event_Letter2KeyReleased

    private void Letter2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter2KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter2.getText().toUpperCase().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter2KeyTyped

    private void Letter3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter3KeyReleased
        int pos = Letter3.getCaretPosition();
        Letter3.setText(Letter3.getText().toUpperCase());
        Letter3.setCaretPosition(pos);// TODO add your handling code here:
    }//GEN-LAST:event_Letter3KeyReleased

    private void Letter3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter3KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter3.getText().toUpperCase().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter3KeyTyped

    private void Letter4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter4KeyReleased
        int pos = Letter4.getCaretPosition();
        Letter4.setText(Letter4.getText().toUpperCase());
        Letter4.setCaretPosition(pos);
    }//GEN-LAST:event_Letter4KeyReleased

    private void Letter4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter4KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter4.getText().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter4KeyTyped

    private void Letter5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter5KeyReleased
        int pos = Letter5.getCaretPosition();
        Letter5.setText(Letter5.getText().toUpperCase());
        Letter5.setCaretPosition(pos);
    }//GEN-LAST:event_Letter5KeyReleased

    private void Letter5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter5KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter5.getText().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter5KeyTyped

    private void Letter6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter6KeyReleased
        int pos = Letter6.getCaretPosition();
        Letter6.setText(Letter6.getText().toUpperCase());
        Letter6.setCaretPosition(pos);
             
    }//GEN-LAST:event_Letter6KeyReleased

    private void Letter6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter6KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter6.getText().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter6KeyTyped

    private void Letter7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter7KeyReleased
        int pos = Letter7.getCaretPosition();
        Letter7.setText(Letter7.getText().toUpperCase());
        Letter7.setCaretPosition(pos);
          
    }//GEN-LAST:event_Letter7KeyReleased

    private void Letter7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter7KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter7.getText().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter7KeyTyped

    private void Letter8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter8KeyReleased
        int pos = Letter8.getCaretPosition();
        Letter8.setText(Letter8.getText().toUpperCase());
        Letter8.setCaretPosition(pos);
             
    }//GEN-LAST:event_Letter8KeyReleased

    private void Letter8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Letter8KeyTyped
        if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
        else if (Letter8.getText().length() >= 1 ){
            evt.consume();
        }
    }//GEN-LAST:event_Letter8KeyTyped

    private void Letter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letter1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game_Extreme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_Extreme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_Extreme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_Extreme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        int extremeseconds = 300;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_Extreme(extremeseconds).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Attempt1;
    private javax.swing.JButton Check;
    private javax.swing.JTextPane History;
    private javax.swing.JTextField Letter1;
    private javax.swing.JTextField Letter2;
    private javax.swing.JTextField Letter3;
    private javax.swing.JTextField Letter4;
    private javax.swing.JTextField Letter5;
    private javax.swing.JTextField Letter6;
    private javax.swing.JTextField Letter7;
    private javax.swing.JTextField Letter8;
    private javax.swing.JButton Newgame;
    private javax.swing.JLabel Time;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
      
}
