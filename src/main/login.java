package main;


import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class login extends javax.swing.JFrame {
    int xx, xy;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    void bersih() {
        t_username.setText("Username");
        t_password.setText("Password");
        t_username.getText();
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
        bt_exit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        t_username = new javax.swing.JTextField();
        t_password = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(65, 74, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_60px.png"))); // NOI18N
        bt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exitMouseClicked(evt);
            }
        });
        jPanel1.add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        t_username.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        t_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_username.setText("Username");
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        t_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usernameActionPerformed(evt);
            }
        });

        t_password.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        t_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_password.setText("Password");
        t_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordFocusLost(evt);
            }
        });
        t_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_passwordActionPerformed(evt);
            }
        });

        bt_login.setBackground(new java.awt.Color(240, 154, 115));
        bt_login.setText("LOGIN");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("Burger Baong");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24))))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(t_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 600, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/burger.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void bt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exitMouseClicked
        dispose();
    }//GEN-LAST:event_bt_exitMouseClicked

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameActionPerformed

    private void t_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_passwordActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_burger?useSSL=false", "root", "");
            
            String username = t_username.getText();
            String pass = t_password.getText();
            
//            Statement stm;
//            stm = (Statement) con.createStatement();
//            String sql = con.prepareStatement("SELECT * FROM login WHERE username='"+username+"' AND password='"+pass+"'");
//            ResultSet rs = stm.executeQuery(sql);
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM login WHERE username=? AND password=?");
            pstmt.setString(1, username);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();

            
            if(rs.next()){
                dispose();
                Menu_Utama mu = new Menu_Utama();
                mu.show();
            }else{
                JOptionPane.showMessageDialog(this, "Username atau Password salah", "Message", JOptionPane.ERROR_MESSAGE);
            }
            
            con.close();     
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bt_loginActionPerformed

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
        String username=t_username.getText();
        if(username.equals("Username")){
            t_username.setText("");
        }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusGained
        String pass=t_password.getText();
        if(pass.equals("Password")){
            t_password.setText("");
        }
    }//GEN-LAST:event_t_passwordFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        String username=t_username.getText();
        if(username.equals("")||username.equals("Username")){
            t_username.setText("Username");
        }
    }//GEN-LAST:event_t_usernameFocusLost

    private void t_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusLost
        String pass=t_password.getText();
        if(pass.equals("")||pass.equals("Password")){
            t_password.setText("Password");
        }
    }//GEN-LAST:event_t_passwordFocusLost

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
    private javax.swing.JLabel bt_exit;
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField t_password;
    private javax.swing.JTextField t_username;
    // End of variables declaration//GEN-END:variables
}
