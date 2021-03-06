package com.github.TeamRocketBalleBalle.Ricktionary.Client;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static java.awt.Font.BOLD;

/** @author Yash */
public class MatchmakingScreen extends javax.swing.JPanel {

    public MatchmakingScreen() {
        initComponents();
    }

    /** @param args the command line arguments */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchmakingScreen.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(() -> new MatchmakingScreen().setVisible(true));
    }

    /** Creates new form NewJFrame */
    public String image() {
        ArrayList<String> images = new ArrayList<>();
        images.add("ms1.gif");
        images.add("ms2.gif");
        images.add("ms3.gif");
        Random random = new Random();
        return images.get(random.nextInt(3));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        JLabel Message = new JLabel();
        // Variables declaration - do not modify
        JLabel BackGround = new JLabel();

        //        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1077, 767));
        //        setResizable(false);

        Message.setBackground(new java.awt.Color(51, 51, 51));
        Message.setFont(new java.awt.Font("Viner Hand ITC", BOLD, 24)); // NOI18N
        Message.setForeground(Color.BLACK);
        Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message.setText("Please Be Patient...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(
                                                Message,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                1053,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))
                //                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                // layout.createSequentialGroup()
                //                                .addContainerGap()
                //                                .addComponent(BackGround,
                // javax.swing.GroupLayout.PREFERRED_SIZE, 1058,
                // javax.swing.GroupLayout.PREFERRED_SIZE)
                //                                .addContainerGap())
                );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(
                                                Message,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                117,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                //                        .addGroup(layout.createSequentialGroup()
                //                                .addGap(10, 10, 10)
                //                                .addComponent(BackGround,
                // javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                // Short.MAX_VALUE)
                //                                .addContainerGap())
                );
        Rectangle rectangle = new Rectangle(1077, 767);
        ImageIcon i1;
        i1 = new ImageIcon(MatchmakingScreen.class.getResource("/" + image()));
        Image i2;
        i2 = i1.getImage().getScaledInstance(1077, 767, Image.SCALE_DEFAULT);
        ImageIcon resizedImage = new ImageIcon(i2);
        BackGround.setIcon(resizedImage);
        BackGround.setBounds(rectangle);
        add(BackGround);

        //        pack();
    } // </editor-fold>
    // End of variables declaration
}
