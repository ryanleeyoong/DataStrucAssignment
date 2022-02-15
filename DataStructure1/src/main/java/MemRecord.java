
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ryan's PC
 */
public class MemRecord extends javax.swing.JFrame {

    /**
     * Creates new form MemRecord
     */
    public MemRecord() {
        initComponents();
        setLocationRelativeTo(null);//set the page location 
        setResizable(false);//disable the resizable function
        
        dtm = (DefaultTableModel) MemRecordTable.getModel();
        
        try {
            br = new BufferedReader(new FileReader("memberRecord.txt"));
            // FileReader myObj = new FileReader("memberRecord.txt");
            lineArr = br.lines().toArray();
            memRec = new LinkedList<MemRecord>();
            for(int i = 0; i < lineArr.length; i++) {
                line = lineArr[i].toString();
                lineSplit = line.split("___");
                dtm.addRow(lineSplit);
                
                memRec.add(new MemRecord(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], lineSplit[4], lineSplit[5], lineSplit[6], lineSplit[7], lineSplit[8], lineSplit[9], lineSplit[10]));
            }
            
        } catch (FileNotFoundException e) {
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        RefreshBtn = new javax.swing.JButton();
        Gender = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        GenderCombo = new javax.swing.JComboBox<>();
        LevelCombo = new javax.swing.JComboBox<>();
        StatusCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemRecordTable = new javax.swing.JTable();
        NewBtn = new javax.swing.JButton();
        RenewBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        lblRenewDeny = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LogOutBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        LogOutMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel1.setText("Member Record");

        Search.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        RefreshBtn.setBackground(new java.awt.Color(78, 173, 227));
        RefreshBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        RefreshBtn.setText("Refresh");

        Gender.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        Gender.setText("Gender :");

        Level.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        Level.setText("Level :");

        Status.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        Status.setText("Status :");

        GenderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));

        LevelCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold", "Platinum", "Diamond" }));

        StatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        MemRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date Of Birth", "Age", "Gender", "Contact", "Address", "Membership Level", "Date Of Joining", "Status", "Expiry Date"
            }
        ));
        MemRecordTable.setShowGrid(true);
        jScrollPane1.setViewportView(MemRecordTable);

        NewBtn.setBackground(new java.awt.Color(78, 173, 227));
        NewBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        NewBtn.setText("New");

        RenewBtn.setBackground(new java.awt.Color(78, 173, 227));
        RenewBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        RenewBtn.setText("Renew");
        RenewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(78, 173, 227));
        EditBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        EditBtn.setText("Edit");

        DeleteBtn.setBackground(new java.awt.Color(78, 173, 227));
        DeleteBtn.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        DeleteBtn.setText("Delete");

        lblRenewDeny.setForeground(java.awt.Color.red);
        lblRenewDeny.setText("   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Gender)
                                .addGap(44, 44, 44)
                                .addComponent(Level)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(Status))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(RefreshBtn)
                                .addGap(221, 221, 221)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(GenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LevelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StatusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewBtn)
                        .addGap(18, 18, 18)
                        .addComponent(RenewBtn)
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRenewDeny)
                .addGap(317, 317, 317))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Search)
                            .addComponent(RefreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(Level)
                    .addComponent(Status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LevelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewBtn)
                    .addComponent(RenewBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRenewDeny)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel4.setText("Log Out");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 499, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 60, 60));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel2.setText("Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 47, 83, -1));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        jMenuItem1.setText("Add New Member");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Renew Member");
        jMenu1.add(jMenuItem2);

        LogOutMenu.setText("Log Out");
        LogOutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutMenuActionPerformed(evt);
            }
        });
        jMenu1.add(LogOutMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N

        jMenuItem4.setText("Edit Member");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed
    public void setColor(JPanel p) {
        p.setBackground(new Color(255, 255, 255));
    }

    public void resetColor(JPanel p1) {
        p1.setBackground(new Color(255, 255, 255));
    }
    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        setColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        resetColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseExited

    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked
        String name = "LOG OUT ?";
        int result = JOptionPane.showConfirmDialog(null,
                "Are you sure you wish to log out ?", name, JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            Login lg = new Login();
            lg.show();
            dispose();
        }
    }//GEN-LAST:event_LogOutBtnMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        About ab = new About();
        ab.show();
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void LogOutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutMenuActionPerformed
        String name = "LOG OUT ?";
        int result = JOptionPane.showConfirmDialog(null,
                "Are you sure you wish to log out ?", name, JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            Login lg = new Login();
            lg.show();
            dispose();
        }
    }//GEN-LAST:event_LogOutMenuActionPerformed

    private void RenewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenewBtnActionPerformed
        if (MemRecordTable.getSelectedRowCount() == 1) {
        dtm = (DefaultTableModel) MemRecordTable.getModel();
        
        row = MemRecordTable.getSelectedRow();
        selectedExpDate = dtm.getValueAt(row, 10).toString();
        selectedID = dtm.getValueAt(row, 0).toString();
        int i = 0;
        for (MemRecord mr: memRec) {
            System.out.println(mr.expDate);
            i += 1;
            if (mr.id.equals((selectedID))) {
                now = LocalDate.now();
                dayNow = now.getDayOfMonth();
                monthNow = now.getMonthValue();
                yearNow = now.getYear();
                System.out.println(selectedExpDate);
                expDateYMD = DMYtoYMD(selectedExpDate);
                System.out.println(expDateYMD);
                
                expDateLD = LocalDate.parse(expDateYMD);
                expDateDay = expDateLD.getDayOfMonth();
                expDateMonth = expDateLD.getMonthValue();
                expDateYear = expDateLD.getYear();
                dayDiff = expDateDay - dayNow;
                monthDiff = expDateMonth - monthNow;
                yearDiff = expDateYear - yearNow;
                System.out.println(expDateLD);
                System.out.println(now);
                dueIn = Period.between(now, expDateLD);
                dueInYear = dueIn.getYears();
                if (((yearDiff == 0) && (monthDiff < 7 && monthDiff > -7)) || ((yearDiff == 1 && (((12 - monthNow) + expDateMonth) < 7))) || (yearDiff ==  -1 && ((12 - expDateMonth) + monthNow) < 7)) {
                    expDateP1YLD = expDateLD.plusYears(1);
                    expDateP1YDay = expDateP1YLD.getDayOfMonth();
                    expDateP1YMonth = expDateP1YLD.getMonthValue();
                    expDateP1YYear = expDateP1YLD.getYear();
                    expDateP1Y = dateDMY(expDateP1YDay, expDateP1YMonth, expDateP1YYear);
                    dtm.setValueAt(expDateP1Y, row, 10);
                    
                    //mr.expDate = expDateP1Y;
                    //memRec.add(new MemRecord(mr.id, mr.name, mr.dob, mr.age, mr.gender, mr.contactNum, mr.address, mr.memLvl, mr.doj, mr.status, expDateP1Y));
                    mr.expDate = expDateP1Y;
                    
                    lblRenewDeny.setText("   ");
                } else if ((yearDiff == 0 && ((expDateMonth - monthNow) > 6)) || ((yearDiff == 1) && (((12 - monthNow) + expDateMonth) > 6))) {  
                    lblRenewDeny.setText("Renewal is allowed only when the expiry date is due in less than 6 months.");
                } else {
                    
                }
                
                
                //System.out.println(expDateP1Y);
            }
        
        }
        
        File deleteFile = new File("memberRecord.txt");
            if (deleteFile.delete()) {
                System.out.print("Deleted");
            } else {}
        
        
        try {
            
            File create = new File("memberRecord.txt");
            if (create.createNewFile()) {}
                    FileWriter myWriter = new FileWriter("memberRecord.txt");
                    myWriter.write("");
                    myWriter.close();
                    FileWriter myWriter2 = new FileWriter("memberRecord.txt", true);
                    FileReader myObj = new FileReader("memberRecord.txt");
                    Scanner scanner = new Scanner(myObj);
                    for (MemRecord mr: memRec) {
                        System.out.println(mr);
                        if (!scanner.hasNextLine()) {
                            myWriter2.write(mr.toString() + "\n");
                        }
                        } 
                    scanner.close();
                    myWriter2.close();
                } catch (Exception e) {
                        
                        }
        }
    }//GEN-LAST:event_RenewBtnActionPerformed

    public MemRecord(String id, String name, String dob, String age, String gender, String contactNum, String address, String memLvl, String doj, String status, String expDate) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.contactNum = contactNum;
        this.address = address;
        this.memLvl = memLvl;
        this.doj = doj;
        this.status = status;
        this.expDate = expDate;
    }

    private String id, selectedID, name, dob, dateDMY, dateYMD, age, gender, contactNum, address, memLvl, doj, status, expDate, expDateString, expDateYMD, expDateP1Y, selectedExpDate, line;
    private int dueInMonth, dayNow, dayP1Y, expDateDay, dayDiff, monthNow, monthP1Y, expDateMonth, monthDiff, yearNow, yearP1Y, expDateYear, dueInYear, yearDiff, expDateP1YDay, expDateP1YMonth, expDateP1YYear, row, column;
    private NewMember nm;
    private String[] lineSplit;
    private Object[] lineArr, focus;
    private LinkedList<MemRecord> memRec;
    private MemRecord mr;
    private DefaultTableModel dtm;
    private BufferedReader br;
    private LocalDate now, expDateLD, expDateP1YLD;
    private Period dueIn;
    private Object expDateObj;
    
    public String toString() {
        return id + "___" + name + "___" + dob + "___" + age + "___" + gender + "___" + contactNum + "___" + address + "___" + memLvl + "___" + doj + "___" + status + "___" + expDate;
    }
    
    private String DMYtoYMD(String dateDMY) {
        dateYMD = String.valueOf(dateDMY.charAt(6)) + String.valueOf(dateDMY.charAt(7)) + String.valueOf(dateDMY.charAt(8)) + String.valueOf(dateDMY.charAt(9)) + String.valueOf(dateDMY.charAt(2)) + String.valueOf(dateDMY.charAt(3)) + String.valueOf(dateDMY.charAt(4)) + String.valueOf(dateDMY.charAt(2)) + String.valueOf(dateDMY.charAt(0)) + String.valueOf(dateDMY.charAt(1));
        return dateYMD;
    }
    
    private String dateDMY(int day, int month, int year) {
        
        if (day < 10 || month < 10) {
            if (day < 10 && month < 10) {
                dateDMY = "0" + day + "-0" + month + "-" + year;
            } else if (day < 10) {
                dateDMY = "0" + day + "-" + month + "-" + year;
            } else if (month < 10) {
                dateDMY = day + "-0" + month + "-" + year;
            }
        } else {
            dateDMY = day + "-" + month + "-" + year;
        }
        
        return dateDMY;
    }
    
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
            java.util.logging.Logger.getLogger(MemRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel Gender;
    private javax.swing.JComboBox<String> GenderCombo;
    private javax.swing.JLabel Level;
    private javax.swing.JComboBox<String> LevelCombo;
    private javax.swing.JLabel LogOutBtn;
    private javax.swing.JMenuItem LogOutMenu;
    private javax.swing.JTable MemRecordTable;
    private javax.swing.JButton NewBtn;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton RenewBtn;
    private javax.swing.JTextField Search;
    private javax.swing.JLabel Status;
    private javax.swing.JComboBox<String> StatusCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRenewDeny;
    // End of variables declaration//GEN-END:variables
}
