/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fatiq
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }
    
    int xx, xy;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_bg = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        pp = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        pp1 = new javax.swing.JPasswordField();
        watermark = new javax.swing.JLabel();
        log = new javax.swing.JPanel();
        in = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        pn_bg.setBackground(new java.awt.Color(255, 255, 255));
        pn_bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        pn_bg.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        pp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pp.png"))); // NOI18N
        pn_bg.add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        user1.setForeground(new java.awt.Color(0, 0, 102));
        user1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user1.setAutoscrolls(false);
        user1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        user1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                user1FocusLost(evt);
            }
        });
        pn_bg.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 200, 40));

        pp1.setForeground(new java.awt.Color(0, 0, 102));
        pp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pp1.setAutoscrolls(false);
        pp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        pp1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pp1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pp1FocusLost(evt);
            }
        });
        pp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp1ActionPerformed(evt);
            }
        });
        pn_bg.add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 200, 40));

        watermark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NumberNexus_watermark.png"))); // NOI18N
        pn_bg.add(watermark, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        log.setBackground(new java.awt.Color(51, 51, 255));
        log.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        log.setToolTipText("");
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
        });
        log.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        in.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        in.setForeground(new java.awt.Color(255, 255, 255));
        in.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in.setText("Login");
        log.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        pn_bg.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 200, 40));

        x.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        x.setForeground(new java.awt.Color(0, 0, 102));
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("X");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        pn_bg.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 20, 20));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NumberNexus.png"))); // NOI18N
        pn_bg.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NumberNexusB_login.png"))); // NOI18N
        pn_bg.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        dispose();
    }//GEN-LAST:event_xMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseReleased

    private void user1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user1FocusGained
//        String user1 = user.getText();
//        if(user1.equalsIgnoreCase("username")){
//            user.setText("");
//        }
    }//GEN-LAST:event_user1FocusGained

    private void user1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user1FocusLost
//        String user1 = user.getText();
//        if(user1.equalsIgnoreCase("username")||user1.equals("")){
//            user.setText("username");
//        }
    }//GEN-LAST:event_user1FocusLost

    private void pp1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pp1FocusGained
//        String pasword = pp.getText();
//        if(pasword.equalsIgnoreCase("password")){
//            pp.setText("");
//        }
    }//GEN-LAST:event_pp1FocusGained

    private void pp1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pp1FocusLost
//        String pasword = pp.getText();
//        if(pasword.equalsIgnoreCase("password")||pasword.equals("")){
//            pp.setText("password");
//        }
    }//GEN-LAST:event_pp1FocusLost

    private void pp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp1ActionPerformed

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
        String User = user1.getText();
        String Pasword = pp1.getText();
        if(User.equals("admin")&&Pasword.equals("admin")){
            new MenuUtama().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel in;
    private javax.swing.JPanel log;
    private javax.swing.JPanel pn_bg;
    private javax.swing.JLabel pp;
    private javax.swing.JPasswordField pp1;
    private javax.swing.JLabel user;
    private javax.swing.JTextField user1;
    private javax.swing.JLabel watermark;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}