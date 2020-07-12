package crshowrm;

import crshowrm.TestDrive;
import java.sql.*;
import customClasses.ArrayAddition;
import customClasses.ImageChange;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SearchCars extends javax.swing.JFrame {

    ResultSet rs;
    Connection con;
    Statement stmt;

    public SearchCars() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ip_project_carshowroom", "root", "root");
            stmt = con.createStatement();
        } catch (Exception e) {

        }
    }

    String[] bmwcars
            = {
                "BMW 1 Series", "BMW Z4", "BMW X3"
            };

    String[] chevroletcars
            = {
                "Chevrolet Corvette", "Chevrolet Cruze", "Chevrolet Bolt"
            };

    String[] hondacars
            = {
                "Honda Amaze", "Honda Avancier", "Honda Brio"
            };

    String[] koenigseggcars
            = {
                "Koenigsegg CCXR", "Koenigsegg One:1", "Koenigsegg Agera RS"
            };

    String[] lamborghinicars
            = {
                "Lamborghini Gallardo", "Lamborghini Murcielago", "Lamborghini Aventador"
            };

    String[] teslacars
            = {
                "Tesla Roadster", "Tesla Model X", "Tesla Model S"
            };

    String[] bmwoneseries
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwoneseries1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwoneseries2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwoneseries3.jpg"
            };

    String[] bmwxthree
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwxthree1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwxthree2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwxthree3.jpg"
            };

    String[] bmwzfour
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwzfour1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwzfour2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchbmwzfour3.jpg"
            };

    String[] chevroletbolt
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletbolt1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletbolt2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletbolt3.jpg"
            };
    String[] chevroletcorvette
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletcorvette1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletcorvette2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletcorvette3.jpg"
            };
    String[] chevroletcruze
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletcruze1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletcruze2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchchevroletcruze3.jpg"
            };

    String[] hondaamaze
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondaamaze1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondaamaze2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondaamaze3.jpg"
            };
    String[] hondaavancier
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondaavancier1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondaavancier2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondaavancier3.jpg"
            };
    String[] hondabrio
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondabrio1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondabrio2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchhondabrio3.jpg"
            };

    String[] koenigseggccxr
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggccxr1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggccxr2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggccxr3.jpg"
            };
    String[] koenigseggone
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggone1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggone2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggone3.jpg"
            };
    String[] koenigseggagerars
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggagerars1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggagerars2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchkoenigseggagerars3.jpg"
            };

    String[] lamborghinigallardo
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghinigallardo1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghinigallardo2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghinigallardo3.jpg"
            };
    String[] lamborghinimurcielago
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghinimurcielago1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghinimurcielago2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghinimurcielago3.jpg"
            };
    String[] lamborghiniaventador
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghiniaventador1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghiniaventador2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchlamborghiniaventador3.jpg"
            };

    String[] teslaroadster
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslaroadster1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslaroadster2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslaroadster3.jpg"
            };
    String[] teslamodelx
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslamodelx1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslamodelx2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslamodelx3.jpg"
            };
    String[] teslamodels
            = {
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslamodels1.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslamodels2.jpg",
                "H:\\IP_Project---CarShowroom\\Extra\\Cars_Images\\searchteslamodels3.jpg"
            };

    String listvalue = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkBMW = new javax.swing.JCheckBox();
        chkHonda = new javax.swing.JCheckBox();
        chkTesla = new javax.swing.JCheckBox();
        chkChevrolet = new javax.swing.JCheckBox();
        chkKoenigsegg = new javax.swing.JCheckBox();
        chkLamborghini = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAvalCars = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        carsimage = new javax.swing.JLabel();
        btnBookTestDrive = new javax.swing.JButton();
        lblclass = new javax.swing.JLabel();
        lbltopspeed = new javax.swing.JLabel();
        lblprice = new javax.swing.JLabel();
        lbllayout = new javax.swing.JLabel();
        lblengine = new javax.swing.JLabel();
        lbltransmission = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chkBMW.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chkBMW.setText("BMW");
        chkBMW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBMWActionPerformed(evt);
            }
        });

        chkHonda.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chkHonda.setText("HONDA");
        chkHonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHondaActionPerformed(evt);
            }
        });

        chkTesla.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chkTesla.setText("TESLA");
        chkTesla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTeslaActionPerformed(evt);
            }
        });

        chkChevrolet.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chkChevrolet.setText("CHEVROLET");
        chkChevrolet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChevroletActionPerformed(evt);
            }
        });

        chkKoenigsegg.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chkKoenigsegg.setText("KOENIGSEGG");
        chkKoenigsegg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKoenigseggActionPerformed(evt);
            }
        });

        chkLamborghini.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chkLamborghini.setText("LAMBORGHINI");
        chkLamborghini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLamborghiniActionPerformed(evt);
            }
        });

        lstAvalCars.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lstAvalCars.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Please select a Company" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstAvalCars.setEnabled(false);
        lstAvalCars.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAvalCarsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAvalCars);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Available Cars");

        carsimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carsimage.setText("WATCH YOUR CAR HERE");
        carsimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBookTestDrive.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBookTestDrive.setText("Book Test Drive");
        btnBookTestDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookTestDriveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkBMW)
                        .addGap(32, 32, 32)
                        .addComponent(chkChevrolet)
                        .addGap(18, 18, 18)
                        .addComponent(chkHonda)
                        .addGap(18, 18, 18)
                        .addComponent(chkKoenigsegg)
                        .addGap(18, 18, 18)
                        .addComponent(chkLamborghini)
                        .addGap(18, 18, 18)
                        .addComponent(chkTesla))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblclass, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltopspeed, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblengine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbllayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbltransmission, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBookTestDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(carsimage, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBMW)
                    .addComponent(chkChevrolet)
                    .addComponent(chkHonda)
                    .addComponent(chkLamborghini)
                    .addComponent(chkTesla)
                    .addComponent(chkKoenigsegg))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(carsimage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnBookTestDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblclass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lbltopspeed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbllayout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblengine, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltransmission, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookTestDriveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBookTestDriveActionPerformed
    {//GEN-HEADEREND:event_btnBookTestDriveActionPerformed
        TestDrive testdrive = new TestDrive();
        testdrive.setVisible(true);
    }//GEN-LAST:event_btnBookTestDriveActionPerformed

    private void chkBMWActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkBMWActionPerformed
    {//GEN-HEADEREND:event_chkBMWActionPerformed
        String[] z
                = {};
        lstAvalCars.setEnabled(true);
        if (chkBMW.isSelected() == true) {
            z = ArrayAddition.add(z, bmwcars);
            lstAvalCars.setListData(z);
        }
        if (chkChevrolet.isSelected() == true) {
            z = ArrayAddition.add(z, chevroletcars);
            lstAvalCars.setListData(z);
        }
        if (chkHonda.isSelected() == true) {
            z = ArrayAddition.add(z, hondacars);
            lstAvalCars.setListData(z);
        }
        if (chkKoenigsegg.isSelected() == true) {
            z = ArrayAddition.add(z, koenigseggcars);
            lstAvalCars.setListData(z);
        }
        if (chkLamborghini.isSelected() == true) {
            z = ArrayAddition.add(z, lamborghinicars);
            lstAvalCars.setListData(z);
        }
        if (chkTesla.isSelected() == true) {
            z = ArrayAddition.add(z, teslacars);
            lstAvalCars.setListData(z);
        }
        if (chkBMW.isSelected() == false
                && chkChevrolet.isSelected() == false
                && chkHonda.isSelected() == false
                && chkKoenigsegg.isSelected() == false
                && chkLamborghini.isSelected() == false
                && chkTesla.isSelected() == false) {
            String[] y
                    = {
                        "Please select a Company"
                    };
            lstAvalCars.setListData(y);
            lstAvalCars.setEnabled(false);
        }
    }//GEN-LAST:event_chkBMWActionPerformed

    private void chkChevroletActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkChevroletActionPerformed
    {//GEN-HEADEREND:event_chkChevroletActionPerformed
        String[] z
                = {};
        lstAvalCars.setEnabled(true);
        if (chkBMW.isSelected() == true) {
            z = ArrayAddition.add(z, bmwcars);
            lstAvalCars.setListData(z);
        }
        if (chkChevrolet.isSelected() == true) {
            z = ArrayAddition.add(z, chevroletcars);
            lstAvalCars.setListData(z);
        }
        if (chkHonda.isSelected() == true) {
            z = ArrayAddition.add(z, hondacars);
            lstAvalCars.setListData(z);
        }
        if (chkKoenigsegg.isSelected() == true) {
            z = ArrayAddition.add(z, koenigseggcars);
            lstAvalCars.setListData(z);
        }
        if (chkLamborghini.isSelected() == true) {
            z = ArrayAddition.add(z, lamborghinicars);
            lstAvalCars.setListData(z);
        }
        if (chkTesla.isSelected() == true) {
            z = ArrayAddition.add(z, teslacars);
            lstAvalCars.setListData(z);
        }
        if (chkBMW.isSelected() == false
                && chkChevrolet.isSelected() == false
                && chkHonda.isSelected() == false
                && chkKoenigsegg.isSelected() == false
                && chkLamborghini.isSelected() == false
                && chkTesla.isSelected() == false) {
            String[] y
                    = {
                        "Please select a Company"
                    };
            lstAvalCars.setListData(y);
            lstAvalCars.setEnabled(false);
        }
    }//GEN-LAST:event_chkChevroletActionPerformed

    private void chkHondaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkHondaActionPerformed
    {//GEN-HEADEREND:event_chkHondaActionPerformed
        String[] z
                = {};
        lstAvalCars.setEnabled(true);
        if (chkBMW.isSelected() == true) {
            z = ArrayAddition.add(z, bmwcars);
            lstAvalCars.setListData(z);
        }
        if (chkChevrolet.isSelected() == true) {
            z = ArrayAddition.add(z, chevroletcars);
            lstAvalCars.setListData(z);
        }
        if (chkHonda.isSelected() == true) {
            z = ArrayAddition.add(z, hondacars);
            lstAvalCars.setListData(z);
        }
        if (chkKoenigsegg.isSelected() == true) {
            z = ArrayAddition.add(z, koenigseggcars);
            lstAvalCars.setListData(z);
        }
        if (chkLamborghini.isSelected() == true) {
            z = ArrayAddition.add(z, lamborghinicars);
            lstAvalCars.setListData(z);
        }
        if (chkTesla.isSelected() == true) {
            z = ArrayAddition.add(z, teslacars);
            lstAvalCars.setListData(z);
        }
        if (chkBMW.isSelected() == false
                && chkChevrolet.isSelected() == false
                && chkHonda.isSelected() == false
                && chkKoenigsegg.isSelected() == false
                && chkLamborghini.isSelected() == false
                && chkTesla.isSelected() == false) {
            String[] y
                    = {
                        "Please select a Company"
                    };
            lstAvalCars.setListData(y);
            lstAvalCars.setEnabled(false);
        }

    }//GEN-LAST:event_chkHondaActionPerformed

    private void chkKoenigseggActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkKoenigseggActionPerformed
    {//GEN-HEADEREND:event_chkKoenigseggActionPerformed
        String[] z
                = {};
        lstAvalCars.setEnabled(true);
        if (chkBMW.isSelected() == true) {
            z = ArrayAddition.add(z, bmwcars);
            lstAvalCars.setListData(z);
        }
        if (chkChevrolet.isSelected() == true) {
            z = ArrayAddition.add(z, chevroletcars);
            lstAvalCars.setListData(z);
        }
        if (chkHonda.isSelected() == true) {
            z = ArrayAddition.add(z, hondacars);
            lstAvalCars.setListData(z);
        }
        if (chkKoenigsegg.isSelected() == true) {
            z = ArrayAddition.add(z, koenigseggcars);
            lstAvalCars.setListData(z);
        }
        if (chkLamborghini.isSelected() == true) {
            z = ArrayAddition.add(z, lamborghinicars);
            lstAvalCars.setListData(z);
        }
        if (chkTesla.isSelected() == true) {
            z = ArrayAddition.add(z, teslacars);
            lstAvalCars.setListData(z);
        }
        if (chkBMW.isSelected() == false
                && chkChevrolet.isSelected() == false
                && chkHonda.isSelected() == false
                && chkKoenigsegg.isSelected() == false
                && chkLamborghini.isSelected() == false
                && chkTesla.isSelected() == false) {
            String[] y
                    = {
                        "Please select a Company"
                    };
            lstAvalCars.setListData(y);
            lstAvalCars.setEnabled(false);
        }
    }//GEN-LAST:event_chkKoenigseggActionPerformed

    private void chkLamborghiniActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkLamborghiniActionPerformed
    {//GEN-HEADEREND:event_chkLamborghiniActionPerformed
        String[] z
                = {};
        lstAvalCars.setEnabled(true);
        if (chkBMW.isSelected() == true) {
            z = ArrayAddition.add(z, bmwcars);
            lstAvalCars.setListData(z);
        }
        if (chkChevrolet.isSelected() == true) {
            z = ArrayAddition.add(z, chevroletcars);
            lstAvalCars.setListData(z);
        }
        if (chkHonda.isSelected() == true) {
            z = ArrayAddition.add(z, hondacars);
            lstAvalCars.setListData(z);
        }
        if (chkKoenigsegg.isSelected() == true) {
            z = ArrayAddition.add(z, koenigseggcars);
            lstAvalCars.setListData(z);
        }
        if (chkLamborghini.isSelected() == true) {
            z = ArrayAddition.add(z, lamborghinicars);
            lstAvalCars.setListData(z);
        }
        if (chkTesla.isSelected() == true) {
            z = ArrayAddition.add(z, teslacars);
            lstAvalCars.setListData(z);
        }
        if (chkBMW.isSelected() == false
                && chkChevrolet.isSelected() == false
                && chkHonda.isSelected() == false
                && chkKoenigsegg.isSelected() == false
                && chkLamborghini.isSelected() == false
                && chkTesla.isSelected() == false) {
            String[] y
                    = {
                        "Please select a Company"
                    };
            lstAvalCars.setListData(y);
            lstAvalCars.setEnabled(false);
        }
    }//GEN-LAST:event_chkLamborghiniActionPerformed

    private void chkTeslaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkTeslaActionPerformed
    {//GEN-HEADEREND:event_chkTeslaActionPerformed
        String[] z
                = {};
        lstAvalCars.setEnabled(true);
        if (chkBMW.isSelected() == true) {
            z = ArrayAddition.add(z, bmwcars);
            lstAvalCars.setListData(z);
        }
        if (chkChevrolet.isSelected() == true) {
            z = ArrayAddition.add(z, chevroletcars);
            lstAvalCars.setListData(z);
        }
        if (chkHonda.isSelected() == true) {
            z = ArrayAddition.add(z, hondacars);
            lstAvalCars.setListData(z);
        }
        if (chkKoenigsegg.isSelected() == true) {
            z = ArrayAddition.add(z, koenigseggcars);
            lstAvalCars.setListData(z);
        }
        if (chkLamborghini.isSelected() == true) {
            z = ArrayAddition.add(z, lamborghinicars);
            lstAvalCars.setListData(z);
        }
        if (chkTesla.isSelected() == true) {
            z = ArrayAddition.add(z, teslacars);
            lstAvalCars.setListData(z);
        }
        if (chkBMW.isSelected() == false
                && chkChevrolet.isSelected() == false
                && chkHonda.isSelected() == false
                && chkKoenigsegg.isSelected() == false
                && chkLamborghini.isSelected() == false
                && chkTesla.isSelected() == false) {
            String[] y
                    = {
                        "Please select a Company"
                    };
            lstAvalCars.setListData(y);
            lstAvalCars.setEnabled(false);
        }
    }//GEN-LAST:event_chkTeslaActionPerformed

    private void lstAvalCarsValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_lstAvalCarsValueChanged
    {//GEN-HEADEREND:event_lstAvalCarsValueChanged
        carsimage.setText("");
        try {
            listvalue = lstAvalCars.getSelectedValue().toString();
        } catch (Exception e) {
            
        }
        if ("BMW 1 Series".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(bmwoneseries, carsimage);
            try {
                String s1 = "select * from bmw where car = '" + "1 series" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));
                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                

            }

        }

        if ("BMW Z4".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(bmwzfour, carsimage);
            try {
                String s1 = "select * from bmw where car = '" + "z4" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
               

            }

        }

        if ("BMW X3".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(bmwxthree, carsimage);
            try {
                String s1 = "select * from bmw where car = '" + "x3" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                

            }

        }

        if ("Chevrolet Corvette".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(chevroletcorvette, carsimage);
            try {
                String s1 = "select * from chevrolet where car = '" + "corvette" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Chevrolet Cruze".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(chevroletcruze, carsimage);
            try {
                String s1 = "select * from chevrolet where car = '" + "cruze" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
               

            }

        }

        if ("Chevrolet Bolt".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(chevroletbolt, carsimage);
            try {
                String s1 = "select * from chevrolet where car = '" + "bolt" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));
                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
            }

        }

        if ("Honda Amaze".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(hondaamaze, carsimage);
            try {
                String s1 = "select * from honda where car = '" + "amaze" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
               
            }

        }

        if ("Honda Avancier".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(hondaavancier, carsimage);
            try {
                String s1 = "select * from honda where car = '" + "avancier" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
               
            }

        }

        if ("Honda Brio".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(hondabrio, carsimage);
            try {
                String s1 = "select * from honda where car = '" + "brio" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Koenigsegg CCXR".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(koenigseggccxr, carsimage);
            try {
                String s1 = "select * from koenigsegg where car = '" + "ccxr" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Koenigsegg One:1".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(koenigseggone, carsimage);
            try {
                String s1 = "select * from koenigsegg where car = '" + "one:1" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Koenigsegg Agera RS".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(koenigseggagerars, carsimage);
            try {
                String s1 = "select * from koenigsegg where car = '" + "agera rs" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Lamborghini Gallardo".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(lamborghinigallardo, carsimage);
            try {
                String s1 = "select * from lamborghini where car = '" + "gallardo" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Lamborghini Murcielago".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(lamborghinimurcielago, carsimage);
            try {
                String s1 = "select * from lamborghini where car = '" + "murcielago" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Lamborghini Aventador".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(lamborghiniaventador, carsimage);
            try {
                String s1 = "select * from lamborghini where car = '" + "aventador" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Tesla Roadster".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(teslaroadster, carsimage);
            try {
                String s1 = "select * from tesla where car = '" + "roadster" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Tesla Model X".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(teslamodelx, carsimage);
            try {
                String s1 = "select * from tesla where car = '" + "model x" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }

        if ("Tesla Model S".equals(listvalue)) {
            ImageChange obj = new ImageChange();
            obj.change(teslamodels, carsimage);
            try {
                String s1 = "select * from tesla where car = '" + "model s" + "';";
                rs = stmt.executeQuery(s1);
                rs.first();
                lblclass.setText("class-" + rs.getString("car_class"));
                lblprice.setText("price-" + rs.getString("price"));
                lbltopspeed.setText("top speed-" + rs.getString("top_speed"));

                lbllayout.setText("layout-" + rs.getString("layout"));
                lblengine.setText("engine-" + rs.getString("engine"));
                lbltransmission.setText("transmission-" + rs.getString("transmission"));

            } catch (Exception e) {
                
            }

        }
    }//GEN-LAST:event_lstAvalCarsValueChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchCars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookTestDrive;
    private javax.swing.JLabel carsimage;
    private javax.swing.JCheckBox chkBMW;
    private javax.swing.JCheckBox chkChevrolet;
    private javax.swing.JCheckBox chkHonda;
    private javax.swing.JCheckBox chkKoenigsegg;
    private javax.swing.JCheckBox chkLamborghini;
    private javax.swing.JCheckBox chkTesla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblclass;
    private javax.swing.JLabel lblengine;
    private javax.swing.JLabel lbllayout;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lbltopspeed;
    private javax.swing.JLabel lbltransmission;
    private javax.swing.JList lstAvalCars;
    // End of variables declaration//GEN-END:variables
}
