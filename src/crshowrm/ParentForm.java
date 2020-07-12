package crshowrm;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;

public class ParentForm extends javax.swing.JFrame
{

    int i = 0;
    int j = 0;
    Timer timer;
    String icons[]
            =
            {
                "H:\\IP_Project---CarShowroom\\Extra\\logo\\ourpartners.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\logo\\bmw.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\logo\\chevrolet.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\logo\\honda.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\logo\\koenigsegg.png",
                "H:\\IP_Project---CarShowroom\\Extra\\logo\\lamborghini.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\logo\\tesla.png",
                "H:\\IP_Project---CarShowroom\\Extra\\logo\\PicsArt_08-28-02.10.55.jpg"
            };

    public ParentForm()
    {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crshowrm/PicsArt_08-28-02.10.55.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        if (i == 0)
        {
            i = 1;
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask()
            {
                @Override
                public void run()
                {
                    ImageIcon imageIcon = new ImageIcon(icons[j]);
                    jLabel1.setIcon(imageIcon);
                    jLabel1.setHorizontalAlignment(JLabel.CENTER);
                    jLabel1.setVerticalAlignment(JLabel.CENTER);
                    j++;

                    if (j == 8)
                    {
                        timer.cancel();
                        JDesktopPane desktop = new JDesktopPane();
                        setContentPane(desktop);
                        JLabel label = new JLabel();
                        label.setVerticalAlignment(JLabel.CENTER);
                        label.setHorizontalAlignment(JLabel.CENTER);
                        label.setSize(desktop.getHeight(), desktop.getWidth());
                        ImageIcon imageIcon2 = new ImageIcon(icons[7]);
                        label.setIcon(imageIcon2);
                        desktop.add(label);
                        Login l = new Login();
                        l.setVisible(true);
                        ParentForm.this.setVisible(false);
                    }
                }
            }, 0, 600);
        }
    }//GEN-LAST:event_jLabel1MouseClicked
    public static void main(String args[])
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ParentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ParentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ParentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ParentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new ParentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
