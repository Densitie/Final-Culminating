package Game;

/*
 * Arun K
 * This is the game board the tictactoe game is played on
 * Jan 20 2020
 */

/**
 *
 * @author arkir7294
 */
 import java.awt.Graphics;
 import static Game.Player1.A1transfer;
 import static Game.Player1.A2transfer;
 import static Game.Player1.A3transfer;
 import static Game.Player1.B1transfer;
 import static Game.Player1.B2transfer;
 import static Game.Player1.B3transfer;
 import static Game.Player1.C1transfer;
 import static Game.Player1.C2transfer;
 import static Game.Player1.C3transfer;
// import static Game.Player1.buttonRemoval1;

 import static Game.Player2.A1transfer_P2;
 import static Game.Player2.A2transfer_P2;
 import static Game.Player2.A3transfer_P2;
 import static Game.Player2.B1transfer_P2;
 import static Game.Player2.B2transfer_P2;
 import static Game.Player2.B3transfer_P2;
 import static Game.Player2.C1transfer_P2;
 import static Game.Player2.C2transfer_P2;
 import static Game.Player2.C3transfer_P2;
// import static Game.Player2.buttonRemoval2;                                                                                                                                                                                                                                                                    ;
 import javax.swing.JOptionPane;

public class Board extends javax.swing.JFrame {
    //Variable Declaration 
    public static String check1;
    public static String check2;
    public static String check3;
    public static String check4;
    public static String check5;
    public static String check6;
    public static String check7;
    public static String check8;
    public static String check9;
    
    public static String pieceTransfer1;
    public static String pieceTransfer2;
    public static String pieceTransfer3;
    public static String pieceTransfer4;
    public static String pieceTransfer5;
    public static String pieceTransfer6;
    public static String pieceTransfer7;
    public static String pieceTransfer8;
    public static String pieceTransfer9;
    
    final String PIECE1 = "X" ;
    final String PIECE2 = "O" ;
    
    

    /**
     * Creates new form Board
     */
    public Board() {
        initComponents();
        
    }
    
    public void CheckWinner(){
        //Checks to see what spot the player clicked then adds X or O to board
        if (A1transfer == 1){
            A1_lbl.setText("X");
        }else if (A1transfer_P2 == 2){   
            A1_lbl.setText("O");
        }
       
        if (A2transfer == 1){
            A2_lbl.setText("X");
        }else if (A2transfer_P2 == 2){
            A2_lbl.setText("O");
        }
        
        if (A3transfer == 1){
            A3_lbl.setText("X");
        }else if (A3transfer_P2 == 2){
            A3_lbl.setText("O");
        }
        
        if (B1transfer == 1){
            B1_lbl.setText("X");
        }else if (B1transfer_P2 == 2){ 
            B1_lbl.setText("O");
        }
        
        if (B2transfer == 1){
            B2_lbl.setText("X");
        }else if (B2transfer_P2 == 2){
            B2_lbl.setText("O");
        }
        
        if (B3transfer == 1){
            B3_lbl.setText("X");
        }else if (B3transfer_P2 == 2){
            B3_lbl.setText("O");
        }
        
        if (C1transfer == 1){
            C1_lbl.setText("X");
        }else if (C1transfer_P2 == 2){   
            C1_lbl.setText("O");
        }
        
        if (C2transfer == 1){
            C2_lbl.setText("X");
        }else if (C2transfer_P2 == 2){   
            C2_lbl.setText("O");
        }
        
        if (C3transfer == 1){
            C3_lbl.setText("X");
        }else if (C3transfer_P2 == 2){   
            C3_lbl.setText("O");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Player2Return_button = new javax.swing.JButton();
        B1_lbl = new javax.swing.JLabel();
        C1_lbl = new javax.swing.JLabel();
        A1_lbl = new javax.swing.JLabel();
        A2_lbl = new javax.swing.JLabel();
        A3_lbl = new javax.swing.JLabel();
        C3_lbl = new javax.swing.JLabel();
        C2_lbl = new javax.swing.JLabel();
        B3_lbl = new javax.swing.JLabel();
        B2_lbl = new javax.swing.JLabel();
        Player1Return_button = new javax.swing.JButton();
        Exit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        Player2Return_button.setText("Continue to Player 2");
        Player2Return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player2Return_buttonActionPerformed(evt);
            }
        });

        B1_lbl.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        B1_lbl.setText("B1");

        C1_lbl.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        C1_lbl.setText("C1");

        A1_lbl.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        A1_lbl.setText("A1");

        A2_lbl.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        A2_lbl.setText("A2");

        A3_lbl.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        A3_lbl.setText("A3");

        C3_lbl.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        C3_lbl.setText("C3");

        C2_lbl.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        C2_lbl.setText("C2");

        B3_lbl.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        B3_lbl.setText("B3");

        B2_lbl.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        B2_lbl.setText("B2");

        Player1Return_button.setText("Continue to Player 1");
        Player1Return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1Return_buttonActionPerformed(evt);
            }
        });

        Exit_button.setText("Click to exit");
        Exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A3_lbl)
                    .addComponent(A2_lbl)
                    .addComponent(A1_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B3_lbl)
                    .addComponent(B1_lbl)
                    .addComponent(B2_lbl))
                .addGap(165, 165, 165)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C2_lbl)
                    .addComponent(C3_lbl)
                    .addComponent(C1_lbl))
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Player1Return_button)
                    .addComponent(Player2Return_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(Exit_button)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1_lbl)
                    .addComponent(C1_lbl)
                    .addComponent(A1_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B2_lbl)
                    .addComponent(A2_lbl)
                    .addComponent(C2_lbl))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3_lbl)
                    .addComponent(B3_lbl)
                    .addComponent(C3_lbl))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player2Return_button)
                    .addComponent(Exit_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player1Return_button)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     */ 
    
    private void Player2Return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player2Return_buttonActionPerformed
        this.setVisible(false);
        new Player2().setVisible(true);
    }//GEN-LAST:event_Player2Return_buttonActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        //Creates lines for board
        Graphics g = jPanel1.getGraphics();
        //Vertical lines
        g.drawLine((int) 200, 400, (int) 200, 0);
        g.drawLine((int) 400, 400, (int) 400, 0);
        //Horizontal lines
        g.drawLine(647, (int) 286.6, 0, (int) 286.6);
        g.drawLine(650, (int) 143.3, 0, (int) 143.3);
        CheckWinner();
        
        //Button removal system
//        if (buttonRemoval1 = 1){
//            Player1Return_button.setVisible(false);
////            buttonRemoval2 = false;
//            System.out.println(buttonRemoval1);
//        }else{
//            Player1Return_button.setVisible(true);
//        }
//            
//        if (buttonRemoval2 == true){
//            Player2Return_button.setVisible(false);
////            buttonRemoval1 = false;
//            System.out.println(buttonRemoval2);
//        }else{
//            Player2Return_button.setVisible(true);
//        }
        
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
        //gets text from squares and assigns a string variable to it
        check1 = A1_lbl.getText();
        check2 = A2_lbl.getText();
        check3 = A3_lbl.getText();
        check4 = B1_lbl.getText();
        check5 = B2_lbl.getText();
        check6 = B3_lbl.getText();
        check7 = C1_lbl.getText();
        check8 = C2_lbl.getText();
        check9 = C3_lbl.getText();
        
        //if statements that verify winner
        /* uses if statement to check 3 squares in a row to see if they match. 
        *  If game is not done then it will print a please continue screen
        */
        if(check1.equals("X") && check2.equals("X") && check3.equals("X")){
            JOptionPane.showMessageDialog(this, "Player 1 wins");
        }else if(check4.equals("X") && check5.equals("X") && check6.equals("X")){
            JOptionPane.showMessageDialog(this, "Player 1 wins");
        }else if(check7.equals("X") && check8.equals("X") && check9.equals("X")){
            JOptionPane.showMessageDialog(this, "Player 1 wins");
        }else if(check1.equals("X") && check4.equals("X") && check7.equals("X")){
            JOptionPane.showMessageDialog(this, "Player 1 wins");
        }else if(check2.equals("X") && check5.equals("X") && check8.equals("X")){
            JOptionPane.showMessageDialog(this, "Player 1 wins");
        }else if(check3.equals("X") && check6.equals("X") && check9.equals("X")){
            JOptionPane.showMessageDialog(this, "Player 1 wins");
        }else if(check1.equals("X") && check5.equals("X") && check9.equals("X")){
            JOptionPane.showMessageDialog(this, "Player 1 wins");
        }else if(check3.equals("X") && check5.equals("X") && check7.equals("X")){
            JOptionPane.showMessageDialog(this, "Player 1 wins");
        }else if(check1.equals("O") && check2.equals("O") && check3.equals("O")){
            JOptionPane.showMessageDialog(this, "Player 2 wins");
        }else if(check4.equals("O") && check5.equals("O") && check6.equals("O")){
            JOptionPane.showMessageDialog(this, "Player 2 wins");
        }else if(check7.equals("O") && check8.equals("O") && check9.equals("O")){
            JOptionPane.showMessageDialog(this, "Player 2 wins");
        }else if(check1.equals("O") && check4.equals("O") && check7.equals("O")){
            JOptionPane.showMessageDialog(this, "Player 2 wins");
        }else if(check2.equals("O") && check5.equals("O") && check8.equals("O")){
            JOptionPane.showMessageDialog(this, "Player 2 wins");
        }else if(check3.equals("O") && check6.equals("O") && check9.equals("O")){
            JOptionPane.showMessageDialog(this, "Player 2 wins");
        }else if(check1.equals("O") && check5.equals("O") && check9.equals("O")){
            JOptionPane.showMessageDialog(this, "Player 2 wins");
        }else if(check3.equals("O") && check5.equals("O") && check7.equals("O")){
            JOptionPane.showMessageDialog(this, "Player 2 wins");
        }else{
            JOptionPane.showMessageDialog(this, "Undetermined or tie press ok to continue game.");
        }        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void Player1Return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1Return_buttonActionPerformed
       //Hides board and shows player one choosing screen
       this.setVisible(false);
       new Player1().setVisible(true);
       
       pieceTransfer1 = A1_lbl.getText();
       pieceTransfer2 = A2_lbl.getText();
       pieceTransfer3 = A3_lbl.getText();
       pieceTransfer4 = B1_lbl.getText();
       pieceTransfer5 = B2_lbl.getText();
       pieceTransfer6 = B3_lbl.getText();
       pieceTransfer7 = C1_lbl.getText();
       pieceTransfer8 = C2_lbl.getText();
       pieceTransfer9 = C3_lbl.getText();
       
    }//GEN-LAST:event_Player1Return_buttonActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        
    }//GEN-LAST:event_jPanel1KeyPressed

    private void Exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_buttonActionPerformed
        //Terminates program if button is pressed
        System.exit(0);
    }//GEN-LAST:event_Exit_buttonActionPerformed

         
    
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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1_lbl;
    private javax.swing.JLabel A2_lbl;
    private javax.swing.JLabel A3_lbl;
    private javax.swing.JLabel B1_lbl;
    private javax.swing.JLabel B2_lbl;
    private javax.swing.JLabel B3_lbl;
    private javax.swing.JLabel C1_lbl;
    private javax.swing.JLabel C2_lbl;
    private javax.swing.JLabel C3_lbl;
    private javax.swing.JButton Exit_button;
    private javax.swing.JButton Player1Return_button;
    private javax.swing.JButton Player2Return_button;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
