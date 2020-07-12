package crshowrm;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;

    public Login() {
        initComponents();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ip_project_carshowroom", "root", "root");
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        txtPasswordField = new javax.swing.JPasswordField();
        labDisplayUsernameAvailability = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("PASSWORD");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("USERNAME");

        txtUsername.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtUsernameKeyReleased(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelActionPerformed(evt);
            }
        });

        btnSignUp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnSignUp.setText("Connect to AM");
        btnSignUp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignUpActionPerformed(evt);
            }
        });

        labDisplayUsernameAvailability.setOpaque(true);
        labDisplayUsernameAvailability.setPreferredSize(new java.awt.Dimension(20, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnLogin))
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancel)
                            .addComponent(txtPasswordField)
                            .addComponent(txtUsername)
                            .addComponent(labDisplayUsernameAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addComponent(btnSignUp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(labDisplayUsernameAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnLogin))
                .addGap(27, 27, 27)
                .addComponent(btnSignUp)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUsernameKeyReleased
    {//GEN-HEADEREND:event_txtUsernameKeyReleased
        String user = "";
        int j = 0;
        try {
            String q = "select * from users;";
            rs = stmt.executeQuery(q);
            rs.first();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            rs.last();
            j = rs.getRow();
            rs.first();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        for (int q = 0; q < j; q++) {
            try {
                user = rs.getString("username");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            if (user.equals(txtUsername.getText().trim())) {
                labDisplayUsernameAvailability.setText("");
                break;
            } else {
                labDisplayUsernameAvailability.setForeground(Color.red);
                labDisplayUsernameAvailability.setText("Username not available");
            }
            if (txtUsername.getText().equals("")) {
                labDisplayUsernameAvailability.setText("");
            }
            try {
                rs.next();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLoginActionPerformed
    {//GEN-HEADEREND:event_btnLoginActionPerformed
        try {
            String s = "select * from users where username = '" + txtUsername.getText() + "';";
            String pwd = "";
            rs = stmt.executeQuery(s);

            char[] p = txtPasswordField.getPassword();
            for (int t = 0; t < p.length; t++) {
                pwd = pwd + p[t];
            }
            rs.first();

            if (pwd.equals(rs.getString("password"))) {

                int input = JOptionPane.showOptionDialog(null, "Welcome " + rs.getString("FirstName") + " " + rs.getString("LastName"), "connet to AM", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                if (input == JOptionPane.OK_OPTION) {

                    HomePage frm1 = new HomePage();
                    frm1.setVisible(true);
                    
                }
                if (input == JOptionPane.NO_OPTION) {

                    Login frm1 = new Login();
                    frm1.setVisible(true);
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Password, Please try again");
                txtPasswordField.requestFocus();
                txtPasswordField.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong username, Please try again");
            txtUsername.requestFocus();
            txtUsername.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSignUpActionPerformed
    {//GEN-HEADEREND:event_btnSignUpActionPerformed
        ConnecttoAm su = new ConnecttoAm();
        su.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSignUpActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labDisplayUsernameAvailability;
    private javax.swing.JPasswordField txtPasswordField;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
