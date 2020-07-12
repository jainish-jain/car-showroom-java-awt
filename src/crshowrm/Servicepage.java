package crshowrm;

import java.sql.*;
import javax.swing.JOptionPane;

public class Servicepage extends javax.swing.JFrame
{

    Connection con;
    ResultSet rs;
    Statement stmt;

    public Servicepage()
    {
        this.setExtendedState(MAXIMIZED_BOTH);
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

        cmbselector = new javax.swing.JComboBox();
        lblheadquarters = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblsno = new javax.swing.JLabel();
        lbldno = new javax.swing.JLabel();
        txtheadquarters = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtsno = new javax.swing.JTextField();
        txtdno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Find Service for your Car");

        cmbselector.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cmbselector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PARTNERS", "BMW", "CHEVROLET", "HONDA", "KOENIGSEGG", "LAMBORGHINI", "TESLA" }));
        cmbselector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbselectorActionPerformed(evt);
            }
        });

        lblheadquarters.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblheadquarters.setText("Headquarters");

        lbladdress.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbladdress.setText("Address");

        lblsno.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblsno.setText("Service Number");

        lbldno.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbldno.setText("Delivery Number");

        txtheadquarters.setEditable(false);
        txtheadquarters.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        txtaddress.setEditable(false);
        txtaddress.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        txtsno.setEditable(false);
        txtsno.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        txtdno.setEditable(false);
        txtdno.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtdno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdnoActionPerformed(evt);
            }
        });

        jButton1.setText("THANK YOU FOR VISITING");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cmbselector, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbladdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblheadquarters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdno)
                    .addComponent(txtsno)
                    .addComponent(txtaddress)
                    .addComponent(txtheadquarters, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbselector, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblheadquarters, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(lblsno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbldno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(txtheadquarters, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtsno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        cmbselector.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbselectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbselectorActionPerformed
        txtheadquarters.setText("");
        txtaddress.setText("");
        txtsno.setText("");
        txtdno.setText("");
        String s = cmbselector.getSelectedItem().toString();
        if (s == "PARTNERS")
        {
            txtheadquarters.setText("");
            txtaddress.setText("");
            txtsno.setText("");
            txtdno.setText("");
        }
        if (s == "BMW")
        {
            try
            {
                String s1 = "Select * from servicepage where companies = '" + "bmw" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                String s2 = rs.getString("country");
                txtheadquarters.setText(s2);
                String s3 = rs.getString("address");
                txtaddress.setText(s3);
                String s4 = rs.getString("service_no");
                txtdno.setText(s4);
                String s5 = rs.getString("delivery_no");
                txtsno.setText(s5);
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (s == "HONDA")
        {
            try
            {
                String s1 = "Select * from servicepage where companies = '" + "HONDA" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                String s2 = rs.getString("country");
                txtheadquarters.setText(s2);
                String s3 = rs.getString("address");
                txtaddress.setText(s3);
                String s4 = rs.getString("service_no");
                txtdno.setText(s4);
                String s5 = rs.getString("delivery_no");
                txtsno.setText(s5);
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        if (s == "CHEVROLET")
        {
            try
            {
                String s1 = "Select * from servicepage where companies = '" + "CHEVROLET" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                String s2 = rs.getString("country");
                txtheadquarters.setText(s2);
                String s3 = rs.getString("address");
                txtaddress.setText(s3);
                String s4 = rs.getString("service_no");
                txtdno.setText(s4);
                String s5 = rs.getString("delivery_no");
                txtsno.setText(s5);
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (s == "KOENIGSEGG")
        {
            try
            {
                String s1 = "Select * from servicepage where companies = '" + "KOENIGSEGG" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                String s2 = rs.getString("country");
                txtheadquarters.setText(s2);
                String s3 = rs.getString("address");
                txtaddress.setText(s3);
                String s4 = rs.getString("service_no");
                txtdno.setText(s4);
                String s5 = rs.getString("delivery_no");
                txtsno.setText(s5);
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (s == "LAMBORGHINI")
        {
            try
            {
                String s1 = "Select * from servicepage where companies = '" + "LAMBORGHINI" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                String s2 = rs.getString("country");
                txtheadquarters.setText(s2);
                String s3 = rs.getString("address");
                txtaddress.setText(s3);
                String s4 = rs.getString("service_no");
                txtdno.setText(s4);
                String s5 = rs.getString("delivery_no");
                txtsno.setText(s5);
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (s == "TESLA")
        {
            try
            {
                String s1 = "Select * from servicepage where companies = '" + "TESLA" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                String s2 = rs.getString("country");
                txtheadquarters.setText(s2);
                String s3 = rs.getString("address");
                txtaddress.setText(s3);
                String s4 = rs.getString("service_no");
                txtdno.setText(s4);
                String s5 = rs.getString("delivery_no");
                txtsno.setText(s5);
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_cmbselectorActionPerformed

    private void txtdnoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtdnoActionPerformed
    {//GEN-HEADEREND:event_txtdnoActionPerformed
    }//GEN-LAST:event_txtdnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    System.exit(0 );
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Servicepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbselector;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lbldno;
    private javax.swing.JLabel lblheadquarters;
    private javax.swing.JLabel lblsno;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtdno;
    private javax.swing.JTextField txtheadquarters;
    private javax.swing.JTextField txtsno;
    // End of variables declaration//GEN-END:variables
}
