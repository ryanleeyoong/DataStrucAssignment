
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author zenta
 */
public class NewMember extends javax.swing.JFrame {

    /**
     * Creates new form NewMember
     */
    public NewMember() {
        initComponents();
        setLocationRelativeTo(null);
        //setResizable(false);
        
        memRec = new LinkedList<NewMember>();
        
        try {
            File myObj = new File("memberRecord.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        
        try {
            File myObj = new File("memberRecord.txt");
            Scanner scanner = new Scanner(myObj);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                lineSplit = line.split("___");
                memRec.add(new NewMember(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], lineSplit[4], lineSplit[5], lineSplit[6], lineSplit[7], lineSplit[8], lineSplit[9], lineSplit[10]));
            }
        } catch (FileNotFoundException e) {
        
        }
        
    }
    
    public NewMember(String id, String name, String dob, String age, String gender, String contactNum, String address, String memLvl, String doj, String status, String expDate) {
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
    
    public NewMember(String name, String day, String month, String year, String dob, Period ageP, LocalDate now, String gender, String contactNum, String address, String memLvl, String regisFee) {
        
        switch(memLvl) {
            case "GOLD":
                fileLvl = "Gold";
                idLvl = "G-";
                break;
            case "PLATINUM":
                fileLvl = "Platinum";
                idLvl = "P-";
                break;
            default:
                fileLvl = "Diamond";
                idLvl = "D-";
        }
        
        try {
            File myObj = new File("next" + fileLvl + "ID.txt");
            Scanner scanner = new Scanner(myObj);
            while(scanner.hasNextLine()) {
            id = scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        idInt = Integer.parseInt(id);
        
        if (idInt < 10) {
            id = idLvl + "000" + id;
        } else if (idInt < 100) {
            id = idLvl + "00" + id;
        } else if (idInt < 1000) {
            id = idLvl + "0" + id;
        } else {
            id = idLvl + id;
        }
        
        this.regisFee = regisFee;
        
        try {
                File file = new File("newMember.txt");
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occured.");
                e.printStackTrace();
            }
            
            try {
                FileWriter myWriter = new FileWriter("newMember.txt");
                myWriter.write(id + "___" + regisFee);
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occured.");
                e.printStackTrace();
            }
        
        idInt += 1;
        nextID = String.valueOf(idInt);
        
        try {
            FileWriter myWriter = new FileWriter("next" + fileLvl + "ID.txt");
            myWriter.write(nextID);
            myWriter.close();
        } catch (IOException e) {
        
        }
        
        this.name = name;
        this.dob = dob;
        
        age = String.valueOf(ageP.getYears());
        
        this.gender = gender;
        this.contactNum = contactNum;
        this.address = address;
        this.memLvl = memLvl;
        
        dayNow = now.getDayOfMonth();
        monthNow = now.getMonthValue();
        yearNow = now.getYear();
        doj = dateDMY(dayNow, monthNow, yearNow);
        
        status = "ACTIVE";
        
        oneYearFromNow = LocalDate.now().plusYears(1);
        dayOYFM = oneYearFromNow.getDayOfMonth();
        monthOYFM = oneYearFromNow.getMonthValue();
        yearOYFM = oneYearFromNow.getYear();
        expDate = dateDMY(dayOYFM, monthOYFM, yearOYFM);
        
    }
    
    private String id, idLvl, fileLvl, nextID, name, day, month, year, dateDMY, dateYMD, dob, dobLDFormatString, age, gender, contactNum, address, memLvl, regisFee, doj, status, expDate, line;
    private int idInt, dayInt, maxDay, dayNow, dayOYFM, monthInt, monthNow, monthOYFM, yearInt, yearNow, yearOYFM;
    private String[] lineSplit;
    private LocalDate dobLDFormat, now, oneYearFromNow;
    private Period ageP;
    private boolean complete, completeDate;
    private LinkedList<NewMember> memRec;
    private NewMember newMem;
    private Object[] memRecArr;
    private MemRecord mr;
    private MemberAdded ma;
    
    public String toString() {
        return id + "___" + name + "___" + dob + "___" + age + "___" + gender + "___" + contactNum + "___" + address + "___" + memLvl + "___" + doj + "___" + status + "___" + expDate;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNewMem = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfDay = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        comboxGender = new javax.swing.JComboBox<>();
        tfContactNum = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        comboxMemLvl = new javax.swing.JComboBox<>();
        lblRegisFee = new javax.swing.JLabel();
        lblRenewFee = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblInvalidID = new javax.swing.JLabel();
        lblInvalidContactNum = new javax.swing.JLabel();
        lblInvalidDate = new javax.swing.JLabel();
        comboxMonth = new javax.swing.JComboBox<>();
        lblRegisFeeAMT = new javax.swing.JLabel();
        lblRenewFeeAMT = new javax.swing.JLabel();
        lblInvalidGender = new javax.swing.JLabel();
        lblInvalidAddress = new javax.swing.JLabel();
        lblInvalidMemLvl = new javax.swing.JLabel();
        lblInvalidName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlNewMem.setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("sfsddddd");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHeader.setText("New Member");

        tfName.setForeground(java.awt.Color.gray);
        tfName.setText("NAME");
        tfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNameFocusLost(evt);
            }
        });

        tfDay.setForeground(java.awt.Color.gray);
        tfDay.setText("DAY");
        tfDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDayFocusLost(evt);
            }
        });
        tfDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDayActionPerformed(evt);
            }
        });
        tfDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDayKeyPressed(evt);
            }
        });

        tfYear.setForeground(java.awt.Color.gray);
        tfYear.setText("YEAR");
        tfYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfYearFocusLost(evt);
            }
        });
        tfYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfYearKeyPressed(evt);
            }
        });

        comboxGender.setForeground(java.awt.Color.gray);
        comboxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENDER", "MALE", "FEMALE" }));
        comboxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxGenderActionPerformed(evt);
            }
        });

        tfContactNum.setForeground(java.awt.Color.gray);
        tfContactNum.setText("CONTACT NUMBER");
        tfContactNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfContactNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfContactNumFocusLost(evt);
            }
        });
        tfContactNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContactNumActionPerformed(evt);
            }
        });
        tfContactNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfContactNumKeyPressed(evt);
            }
        });

        tfAddress.setForeground(java.awt.Color.gray);
        tfAddress.setText("ADDRESS");
        tfAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAddressFocusLost(evt);
            }
        });
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        comboxMemLvl.setForeground(java.awt.Color.gray);
        comboxMemLvl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEMBERSHIP LEVEL", "GOLD", "PLATINUM", "DIAMOND" }));
        comboxMemLvl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxMemLvlActionPerformed(evt);
            }
        });

        lblRegisFee.setText("REGISTRATION FEE :");

        lblRenewFee.setText("RENEWAL FEE          :");

        btnCancel.setBackground(new java.awt.Color(182, 52, 52));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(13, 109, 63));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblInvalidID.setForeground(new java.awt.Color(255, 0, 0));
        lblInvalidID.setText("   ");
        lblInvalidID.setMinimumSize(new java.awt.Dimension(0, 0));

        lblInvalidContactNum.setForeground(new java.awt.Color(255, 0, 0));
        lblInvalidContactNum.setText("   ");

        lblInvalidDate.setForeground(new java.awt.Color(255, 0, 0));
        lblInvalidDate.setText("   ");

        comboxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONTH", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));
        comboxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxMonthActionPerformed(evt);
            }
        });

        lblRegisFeeAMT.setText("   ");

        lblRenewFeeAMT.setText("   ");

        lblInvalidGender.setForeground(java.awt.Color.red);
        lblInvalidGender.setText("   ");

        lblInvalidAddress.setForeground(java.awt.Color.red);
        lblInvalidAddress.setText("   ");

        lblInvalidMemLvl.setForeground(java.awt.Color.red);
        lblInvalidMemLvl.setText("   ");

        lblInvalidName.setForeground(java.awt.Color.red);
        lblInvalidName.setText("   ");

        javax.swing.GroupLayout pnlNewMemLayout = new javax.swing.GroupLayout(pnlNewMem);
        pnlNewMem.setLayout(pnlNewMemLayout);
        pnlNewMemLayout.setHorizontalGroup(
            pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewMemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(143, 143, 143))
            .addGroup(pnlNewMemLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNewMemLayout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(132, 132, 132)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblInvalidContactNum)
                        .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboxGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlNewMemLayout.createSequentialGroup()
                                .addComponent(tfDay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfContactNum)
                            .addComponent(tfAddress)
                            .addComponent(comboxMemLvl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlNewMemLayout.createSequentialGroup()
                                .addComponent(lblInvalidName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInvalidID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblInvalidDate)
                            .addGroup(pnlNewMemLayout.createSequentialGroup()
                                .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRegisFee)
                                    .addComponent(lblRenewFee)
                                    .addComponent(lblInvalidMemLvl))
                                .addGap(18, 18, 18)
                                .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRegisFeeAMT)
                                    .addComponent(lblRenewFeeAMT)))
                            .addComponent(tfName))
                        .addComponent(lblInvalidGender)
                        .addComponent(lblInvalidAddress)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlNewMemLayout.setVerticalGroup(
            pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewMemLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblHeader)
                .addGap(36, 36, 36)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInvalidID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInvalidName))
                .addGap(1, 1, 1)
                .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblInvalidDate)
                .addGap(1, 1, 1)
                .addComponent(comboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblInvalidGender)
                .addGap(1, 1, 1)
                .addComponent(tfContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblInvalidContactNum)
                .addGap(1, 1, 1)
                .addComponent(tfAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblInvalidAddress)
                .addGap(1, 1, 1)
                .addComponent(comboxMemLvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblInvalidMemLvl)
                .addGap(1, 1, 1)
                .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegisFee, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRegisFeeAMT))
                .addGap(18, 18, 18)
                .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenewFee)
                    .addComponent(lblRenewFeeAMT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnlNewMemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNewMem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNewMem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        
        mr = new MemRecord();
        mr.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDayActionPerformed

    private void tfNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusGained
        if (tfName.getText().equals("NAME")) {
            tfName.setText("");
            tfName.setForeground(Color.black);
        }
    }//GEN-LAST:event_tfNameFocusGained

    private void tfNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusLost
        if (tfName.getText().equals("")) {
            tfName.setText("NAME");
            tfName.setForeground(Color.gray);
        } 
    }//GEN-LAST:event_tfNameFocusLost

    private void tfContactNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContactNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContactNumActionPerformed

    private void tfDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDayFocusGained
        if (tfDay.getText().equals("DAY")) {
            tfDay.setText("");
            tfDay.setForeground(Color.black);
        }
    }//GEN-LAST:event_tfDayFocusGained

    private void tfDayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDayFocusLost
        if (tfDay.getText().equals("")) {
            tfDay.setText("DAY");
            tfDay.setForeground(Color.gray);
        } 
    }//GEN-LAST:event_tfDayFocusLost

    private void tfYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfYearFocusGained
        if (tfYear.getText().equals("YEAR")) {
            tfYear.setText("");
            tfYear.setForeground(Color.black);
        }
    }//GEN-LAST:event_tfYearFocusGained

    private void tfYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfYearFocusLost
        if (tfYear.getText().equals("")) {
            tfYear.setText("YEAR");
            tfYear.setForeground(Color.gray);
        } 
    }//GEN-LAST:event_tfYearFocusLost

    private void comboxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxGenderActionPerformed
        if (!comboxGender.getSelectedItem().equals("GENDER")) {
            comboxGender.removeItem("GENDER");
        }
    }//GEN-LAST:event_comboxGenderActionPerformed

    private void tfContactNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfContactNumFocusGained
        if (tfContactNum.getText().equals("CONTACT NUMBER")) {
            tfContactNum.setText("");
            tfContactNum.setForeground(Color.black);
        }
    }//GEN-LAST:event_tfContactNumFocusGained

    private void tfContactNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfContactNumFocusLost
        if (tfContactNum.getText().equals("")) {
            tfContactNum.setText("CONTACT NUMBER");
            tfContactNum.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfContactNumFocusLost

    private void tfAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAddressFocusGained
        if (tfAddress.getText().equals("ADDRESS")) {
            tfAddress.setText("");
            tfAddress.setForeground(Color.black);
        }
    }//GEN-LAST:event_tfAddressFocusGained

    private void tfAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAddressFocusLost
        if (tfAddress.getText().equals("")) {
            tfAddress.setText("ADDRESS");
            tfAddress.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfAddressFocusLost

    private void comboxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxMonthActionPerformed
        if (!comboxMonth.getSelectedItem().equals("MONTH")) {
            comboxMonth.removeItem("MONTH");
        }
    }//GEN-LAST:event_comboxMonthActionPerformed

    private void tfDayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDayKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_BACK_SPACE || (Character.isDigit(evt.getKeyCode()) && tfDay.getText().length() < 2)) {
            tfDay.setEditable(true);
        } else {
            tfDay.setEditable(false);
        }
    }//GEN-LAST:event_tfDayKeyPressed

    private void tfYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfYearKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || (Character.isDigit(evt.getKeyCode()) && tfYear.getText().length() < 4)) {
            tfYear.setEditable(true);
        } else {
            tfYear.setEditable(false);
        }
    }//GEN-LAST:event_tfYearKeyPressed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void comboxMemLvlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxMemLvlActionPerformed
        if (!comboxMemLvl.getSelectedItem().equals("MEMBERSHIP LEVEL")) {
            comboxMemLvl.removeItem("MEMBERSHIP LEVEL");
            
            switch(comboxMemLvl.getSelectedItem().toString()) {
                case "GOLD":
                    lblRegisFeeAMT.setText("RM 120");
                    lblRenewFeeAMT.setText("RM 80");
                    break;
                case "PLATINUM":
                    lblRegisFeeAMT.setText("RM 180");
                    lblRenewFeeAMT.setText("RM 150");
                    break;
                case "DIAMOND":
                    lblRegisFeeAMT.setText("RM 250");
                    lblRenewFeeAMT.setText("RM 200");
            }
        }
    }//GEN-LAST:event_comboxMemLvlActionPerformed

    private String monthNameToNum(String monthName) {
        
        switch(monthName) {
            case "JANUARY":
                month = "1";
                break;
            case "FEBRUARY":
                month = "2";
                break;
            case "MARCH":
                month = "3";
                break;
            case "APRIL":
                month = "4";
                break;
            case "MAY":
                month = "5";
                break;
            case "JUNE":
                month = "6";
                break;
            case "JULY":
                month = "7";
                break;
            case "AUGUST":
                month = "8";
                break;
            case "SEPTEMBER":
                month = "9";
                break;
            case "OCTOBER":
                month = "10";
                break;
            case "NOVEMBER":
                month = "11";
                break;
            case "DECEMBER":
                month = "12";
        }
        
        return month;
        
    }
    
    private int maxDayOfMonth(String month, int year) {
    
        int maxDay = 31;
        
        switch(month) {
            case "2":
                if (year % 4 == 0) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
            case "4":
                maxDay = 30;
                break;
            case "6":
                maxDay = 30;
                break;
            case "9":
                maxDay = 30;
                break;
            case "11":
                maxDay = 30;
        }
        
        return maxDay;
        
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
    
    private String dateYMD(int year, int month, int day) {
        if (day < 10 || month < 10) {
            if (day < 10 && month < 10) {
                dateYMD = year + "-0" + month + "-0" + day;
            } else if (day < 10) {
                dateYMD = year + "-" + month + "-0" + day;
            } else if (month < 10) {
                dateYMD = year + "-0" + month + "-" + day;
            }
        } else {
            dateYMD = year + "-" + month + "-" + day;
        }
        
        return dateYMD;
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        name = tfName.getText();
        day = tfDay.getText();
        month = comboxMonth.getSelectedItem().toString();
        month = monthNameToNum(month);
        year = tfYear.getText();
        gender = comboxGender.getSelectedItem().toString();
        contactNum = tfContactNum.getText();
        address = tfAddress.getText();
        memLvl = comboxMemLvl.getSelectedItem().toString();
        regisFee = lblRegisFeeAMT.getText();
        complete = true;
        completeDate = true;
        
        if (name.equals("NAME")) {
            complete = false;
            lblInvalidName.setText("Please fill in your name");
        }
        
        if (day.equals("DAY") || month.equals("MONTH") || year.equals("YEAR")) {
            complete = false;
            completeDate = false;
            lblInvalidDate.setText("Please fill in a complete date of birth");
        }
        
        if (completeDate) {
            dayInt = Integer.parseInt(day);
            monthInt = Integer.parseInt(month);
            yearInt = Integer.parseInt(year);
            maxDay = maxDayOfMonth(month, yearInt);
            if (dayInt == 0 || dayInt > 31 || yearInt < 1000) {
                complete = false;
                lblInvalidDate.setText("Please enter a valid date");
            } else {
                
                if (dayInt > maxDay) {
                    complete = false;
                    lblInvalidDate.setText("Are you sure that you entered the right birthday?");
                } else {
                    dob = dateDMY(dayInt, monthInt, yearInt);
                    dobLDFormatString = dateYMD(yearInt, monthInt, dayInt);
                    dobLDFormat = LocalDate.parse(dobLDFormatString);
                    now = LocalDate.now();
                    ageP = Period.between(dobLDFormat, now);
                    
                    if (ageP.getDays() < 0 || ageP.getYears() > 130) {
                        complete = false;
                        lblInvalidDate.setText("Are you sure that you entered the right birthday?");
                    } else {
                        lblInvalidDate.setText("   ");
                    }
                }
            }
        }
        
        if (gender.equals("GENDER")) {
            complete = false;
            lblInvalidGender.setText("Please select your gender");
        } else {
            lblInvalidGender.setText("   ");
        }
        
        if (contactNum.equals("CONTACT NUMBER")) {
            complete = false;
            lblInvalidContactNum.setText("Please fill in your phone number");
        } else if (contactNum.length() < 9 || contactNum.length() > 11) {
            complete = false;
            lblInvalidContactNum.setText("This phone number format is not recognised");
        } else {
            lblInvalidContactNum.setText("   ");
        }
        
        if (address.equals("ADDRESS")) {
            complete = false;
            lblInvalidAddress.setText("Please fill in your address");
        } else {
            lblInvalidAddress.setText("   ");
        }
        
        if (memLvl.equals("MEMBERSHIP LEVEL")) {
            complete = false;
            lblInvalidMemLvl.setText("Please select you membership level");
        } else {
            lblInvalidMemLvl.setText("   ");
        }
        
        if (complete) {
            memRec.add(new NewMember(name, day, month, year, dob, ageP, now, gender, contactNum, address, memLvl, regisFee));
            File myObj = new File("memberRecord.txt");
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
            try {
                File file = new File("memberRecord.txt");
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occured.");
                e.printStackTrace();
            }
            try {
                FileWriter myWriter = new FileWriter("memberRecord.txt");
                for (NewMember nm: memRec) {
                    myWriter.write(nm.toString() + "\n");
                }
                myWriter.close();
            } catch (IOException e) {
            
            }
            
            dispose();
            
            ma = new MemberAdded();
            ma.show();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tfContactNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContactNumKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || (tfContactNum.getText().length() < 11 && Character.isDigit(evt.getKeyCode()))) {
            tfContactNum.setEditable(true);
        } else {
            tfContactNum.setEditable(false);
        }
    }//GEN-LAST:event_tfContactNumKeyPressed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
        
        mr = new MemRecord();
        mr.show();
    }//GEN-LAST:event_btnCancelActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboxGender;
    private javax.swing.JComboBox<String> comboxMemLvl;
    private javax.swing.JComboBox<String> comboxMonth;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblInvalidAddress;
    private javax.swing.JLabel lblInvalidContactNum;
    private javax.swing.JLabel lblInvalidDate;
    private javax.swing.JLabel lblInvalidGender;
    private javax.swing.JLabel lblInvalidID;
    private javax.swing.JLabel lblInvalidMemLvl;
    private javax.swing.JLabel lblInvalidName;
    private javax.swing.JLabel lblRegisFee;
    private javax.swing.JLabel lblRegisFeeAMT;
    private javax.swing.JLabel lblRenewFee;
    private javax.swing.JLabel lblRenewFeeAMT;
    private javax.swing.JPanel pnlNewMem;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfContactNum;
    private javax.swing.JTextField tfDay;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
}
