package crshowrm;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnecttoAm extends javax.swing.JFrame
{

    Connection con;
    ResultSet rs;
    Statement stmt;

    public ConnecttoAm()
    {
        initComponents();
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ip_project_carshowroom", "root", "root");
            stmt = con.createStatement();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPasswordField = new javax.swing.JPasswordField();
        labDisplayUsernameAvailability = new javax.swing.JLabel();
        btnShowPWD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        btnConnect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setText("PASSWORD");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("USERNAME");

        txtUsername.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        txtPasswordField.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        labDisplayUsernameAvailability.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        labDisplayUsernameAvailability.setOpaque(true);
        labDisplayUsernameAvailability.setPreferredSize(new java.awt.Dimension(20, 10));

        btnShowPWD.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        btnShowPWD.setText("Show Password");
        btnShowPWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPWDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setText("LAST NAME");

        txtLName.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setText("FIRST NAME");

        txtFName.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        btnConnect.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnConnect.setText("Create ID");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConnect)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labDisplayUsernameAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnShowPWD)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labDisplayUsernameAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowPWD)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConnect)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUsernameKeyReleased
    {//GEN-HEADEREND:event_txtUsernameKeyReleased
        String user = "";
        int j = 0;
        try
        {
            String q = "select * from users;";
            rs = stmt.executeQuery(q);
            rs.first();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        try
        {
            rs.last();
            j = rs.getRow();
            rs.first();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        for (int q = 0; q < j; q++)
        {
            try
            {
                user = rs.getString("username");
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            if (user.equals(txtUsername.getText().trim()))
            {
                labDisplayUsernameAvailability.setForeground(Color.red);
                labDisplayUsernameAvailability.setText("Username not available");
                break;
            }
            else
            {
                labDisplayUsernameAvailability.setText("");
            }
            if (txtUsername.getText().equals(""))
            {
                labDisplayUsernameAvailability.setText("");
            }
            try
            {
                rs.next();
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void btnShowPWDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowPWDActionPerformed
    {//GEN-HEADEREND:event_btnShowPWDActionPerformed
        char[] p = txtPasswordField.getPassword();
        String pwdconfirm = "";
        for (int i = 0; i < p.length; i++)
        {
            pwdconfirm = pwdconfirm + p[i];
        }

        if ("".equals(pwdconfirm))
        {
            JOptionPane.showMessageDialog(null, "Please enter Password");
        } else
        {
            if ("Show Password".equals(btnShowPWD.getText()))
            {
                char c = 0;
                txtPasswordField.setEchoChar(c);
                btnShowPWD.setText("Hide Password");
            } else
            {
                if ("Hide Password".equals(btnShowPWD.getText()))
                {
                    char c = 42;
                    txtPasswordField.setEchoChar(c);
                    btnShowPWD.setText("Show Password");
                }
            }
        }
    }//GEN-LAST:event_btnShowPWDActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConnectActionPerformed
    {//GEN-HEADEREND:event_btnConnectActionPerformed
        try
        {
            String FName = txtFName.getText();
            String LName = txtLName.getText();
            String username = txtUsername.getText();
            char[] p = txtPasswordField.getPassword();
            String pwd = "";
            for (int i = 0; i < p.length; i++)
            {
                pwd = pwd + p[i];
            }
            String q = "insert into users values('"
            + username + "','"
            + pwd + "','"
            + FName + "','"
            + LName
            + "');";
            stmt.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Now you can Login with your username and password");
            Login login = new Login();
            login.setVisible(true);
            this.setVisible(false);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new ConnecttoAm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnShowPWD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labDisplayUsernameAvailability;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JPasswordField txtPasswordField;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
