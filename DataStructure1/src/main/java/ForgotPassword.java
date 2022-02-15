
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ryan's PC
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        setLocationRelativeTo(null);//set the page location 
        setResizable(false);//disable the resizable function
        addPlaceholderStyle(ANSWER);
        addPlaceholderStyle(NEWPASS);
        addPlaceholderStyle(CONPASS);
    }

    public void create() {

        //create a text file if the file is not exists
        try {
            File Librarian = new File("ans.txt");
            if (Librarian.createNewFile()) {
                System.out.println("File created: " + Librarian.getName());
                RandomAccessFile raf = new RandomAccessFile("ans.txt", "rw");//read the file

                for (int i = 0; i < 100; i++) {
                    raf.readLine();

                }

                raf.writeBytes("MISS TAN");//write the user input into the text file
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    public void create1() {

        //create a text file if the file is not exists
        try {
            File Librarian = new File("Admin.txt");
            if (Librarian.createNewFile()) {
                System.out.println("File created: " + Librarian.getName());
                RandomAccessFile raf = new RandomAccessFile("Admin.txt", "rw");//read the file

                for (int i = 0; i < 100; i++) {
                    raf.readLine();

                }

            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    public void readFile() {

        try {
            FileReader fr = new FileReader("Admin.txt");//read the file
            System.err.println("File exists");//if the file is exists print the statement 
        } catch (FileNotFoundException ex) {//try statement need to end with a catch statement
            //if the file is not exists
            try {
                FileWriter fw = new FileWriter("Admin.txt");//create a new text file 
                System.err.println("File created");//after the text file is created, print the statement

            } catch (IOException ex1) {//try statement need to end with a catch statement
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }

    public void addPlaceholderStyle(JTextField textField) {
        //addPlaceholder function
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }

    public void removePlaceholderStyle(JTextField textField) {
        //removePlaceholder function
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        SearchBtn = new javax.swing.JButton();
        eyeIcon = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        CancelBtn = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        CONPASS = new javax.swing.JPasswordField();
        NEWPASS = new javax.swing.JPasswordField();
        ForgotTitle = new javax.swing.JLabel();
        ForogotTitle2 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        ANSWER = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Backbtn = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        PoseidonIcon = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchBtn.setBorderPainted(false);
        SearchBtn.setContentAreaFilled(false);
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel3.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 40, 10));
        jPanel3.add(eyeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 30, -1));
        jPanel3.add(Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        CancelBtn.setBackground(new java.awt.Color(182, 52, 52));
        CancelBtn.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel3.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        CONPASS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CONPASS.setText("CONFIRM NEW PASSWORD");
        CONPASS.setEchoChar('\u0000');
        CONPASS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CONPASSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CONPASSFocusLost(evt);
            }
        });
        CONPASS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CONPASSKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CONPASSKeyReleased(evt);
            }
        });
        jPanel3.add(CONPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 260, 30));

        NEWPASS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        NEWPASS.setText("NEW PASSWORD");
        NEWPASS.setEchoChar('\u0000');
        NEWPASS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NEWPASSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NEWPASSFocusLost(evt);
            }
        });
        NEWPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWPASSActionPerformed(evt);
            }
        });
        NEWPASS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NEWPASSKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NEWPASSKeyReleased(evt);
            }
        });
        jPanel3.add(NEWPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 260, 30));

        ForgotTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ForgotTitle.setText("Answer question to set new password");
        jPanel3.add(ForgotTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 290, -1));

        ForogotTitle2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ForogotTitle2.setForeground(new java.awt.Color(19, 92, 202));
        ForogotTitle2.setText("WHO IS THE BEST CS LECTURER");
        jPanel3.add(ForogotTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 390, -1));

        SaveBtn.setBackground(new java.awt.Color(13, 109, 63));
        SaveBtn.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 70, -1));

        ANSWER.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ANSWER.setText("ANSWER");
        ANSWER.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ANSWERFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ANSWERFocusLost(evt);
            }
        });
        ANSWER.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ANSWERKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ANSWERKeyReleased(evt);
            }
        });
        jPanel3.add(ANSWER, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 260, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbtnMouseClicked(evt);
            }
        });
        jPanel1.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));
        jPanel1.add(PoseidonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Title.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        Title.setText("Poseidon System");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void search() throws IOException {
        create();

        String ans = ANSWER.getText();
        int val = 0;

        Scanner input = new Scanner(ANSWER.getText());
        String ans1 = input.next();
        String line;
        Scanner file = new Scanner(new File("ans.txt"));//scanner will scan the text file 
        if (ans.equals("ANSWER")) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please fill up the answer", null, JOptionPane.ERROR_MESSAGE);
            ANSWER.setText("ANSWER");
            ANSWER.setForeground(Color.gray);

        } else {
            while (file.hasNextLine()) {
                line = file.nextLine();
                if (line.indexOf(ans) != -1) {//if the text file consists of user input
                    JOptionPane.showMessageDialog(null, "The answer is matched", null, JOptionPane.INFORMATION_MESSAGE);
                    val = 1;
                    break;
                } else {
                    val = 0;
                    continue;
                }
            }
            if (val == 0) {
                JOptionPane.showMessageDialog(null, "The answer is unmatched", null, JOptionPane.ERROR_MESSAGE);//if the text file did not consist the user input set the text field as "NO RECORD"

            }
        }
        ans1 = input.next();

    }


    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        try {
            search();
        } catch (IOException ex) {
            ANSWER.setText("ANSWER");
            ANSWER.setForeground(Color.gray);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        Login lg = new Login();
        lg.show();

        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void BackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseClicked
        ChangePass cp = new ChangePass();
        cp.show();

        dispose();
    }//GEN-LAST:event_BackbtnMouseClicked

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {//if the showPassword button is selected

            NEWPASS.setEchoChar((char) 0);//set the text to digit
            CONPASS.setEchoChar((char) 0);//set the text to digit

        } else {

            NEWPASS.setEchoChar('*');//set the text to digit
            CONPASS.setEchoChar('*');//if the showPassword is deselected, set the text to character
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void CONPASSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CONPASSFocusGained
        if (CONPASS.getText().equals("CONFIRM NEW PASSWORD")) {
            //if there are input, the removeplaceholder function will be set and the text will be set as null.And it will force the user input set as character
            CONPASS.setText(null);
            CONPASS.requestFocus();
            //set Password Charcter
            CONPASS.setEchoChar('*');
            //remove placeholder style

            removePlaceholderStyle(CONPASS);
        }
    }//GEN-LAST:event_CONPASSFocusGained

    private void CONPASSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CONPASSFocusLost
        if (CONPASS.getText().length() == 0) {
            //if there are no input, the addplaceholder function will be set and the text will be set as Password.If the user press the text field the text field will be set into character
            addPlaceholderStyle(CONPASS);
            CONPASS.setText("CONFIRM NEW PASSWORD");
            CONPASS.setEchoChar('*');
        }
    }//GEN-LAST:event_CONPASSFocusLost

    private void CONPASSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CONPASSKeyPressed
        if (CONPASS.getText().length() <= 5) {
            CONPASS.setEditable(true);
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                CONPASS.setEditable(true);
            } else {
                CONPASS.setEditable(false);
            }

        }
    }//GEN-LAST:event_CONPASSKeyPressed

    private void CONPASSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CONPASSKeyReleased
        //it force the user input into uppercase
        int position = CONPASS.getCaretPosition();
        CONPASS.setText(CONPASS.getText().toUpperCase());
        CONPASS.setCaretPosition(position);
    }//GEN-LAST:event_CONPASSKeyReleased

    private void NEWPASSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NEWPASSFocusGained
        if (NEWPASS.getText().equals("NEW PASSWORD")) {
            //if there are input, the removeplaceholder function will be set and the text will be set as null.And it will force the user input set as character
            NEWPASS.setText(null);
            NEWPASS.requestFocus();
            //set Password Charcter
            NEWPASS.setEchoChar('*');
            //remove placeholder style

            removePlaceholderStyle(NEWPASS);
        }
    }//GEN-LAST:event_NEWPASSFocusGained

    private void NEWPASSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NEWPASSFocusLost
        if (NEWPASS.getText().length() == 0) {
            //if there are no input, the addplaceholder function will be set and the text will be set as Password.If the user press the text field the text field will be set into character
            addPlaceholderStyle(NEWPASS);
            NEWPASS.setText("NEW PASSWORD");
            NEWPASS.setEchoChar('*');
        }
    }//GEN-LAST:event_NEWPASSFocusLost

    private void NEWPASSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NEWPASSKeyPressed
        if (NEWPASS.getText().length() <= 5) {
            NEWPASS.setEditable(true);
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                NEWPASS.setEditable(true);
            } else {
                NEWPASS.setEditable(false);
            }

        }
    }//GEN-LAST:event_NEWPASSKeyPressed

    private void NEWPASSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NEWPASSKeyReleased
        int position = NEWPASS.getCaretPosition();
        NEWPASS.setText(NEWPASS.getText().toUpperCase());
        NEWPASS.setCaretPosition(position);
    }//GEN-LAST:event_NEWPASSKeyReleased

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        //function that declare before
        create1();
        readFile();

        //force the user to fill all fields, or else pop message
        if (NEWPASS.getText().equals("NEW PASSWORD") || CONPASS.getText().equals("CONFIRM NEW PASSWORD")) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Fill all fields", null, JOptionPane.ERROR_MESSAGE);

            NEWPASS.setText("NEW PASSWORD");
            CONPASS.setText("CONFIRM NEW PASSWORD");
            NEWPASS.setForeground(Color.gray);
            CONPASS.setForeground(Color.gray);

            //check if the password and confirm password is match, or else pop message
        } else if (!(Arrays.equals(NEWPASS.getPassword(), CONPASS.getPassword()))) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Your password does not match", null, JOptionPane.ERROR_MESSAGE);
            showPassword.setSelected(false);//deslected the show password function
            NEWPASS.setText("NEW PASSWORD");
            CONPASS.setText("CONFIRM NEW PASSWORD");
            NEWPASS.setForeground(Color.gray);
            CONPASS.setForeground(Color.gray);
        } else {
            try {
                //if the user input meet all conditions it allow user to write data
                change();
            } catch (IOException ex) {
                Logger.getLogger(ForgotPass.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ANSWERFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ANSWERFocusGained
        if (ANSWER.getText().equals("ANSWER")) {
            //if there are input, the removeplaceholder function will be set and the text will be set as null.And it will force the user input set as character
            ANSWER.setText(null);
            ANSWER.requestFocus();
            //set Password Charcter

            //remove placeholder style
            removePlaceholderStyle(ANSWER);
        }
    }//GEN-LAST:event_ANSWERFocusGained

    private void ANSWERFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ANSWERFocusLost
        if (ANSWER.getText().length() == 0) {
            //if there are no input, the addplaceholder function will be set and the text will be set as Password.If the user press the text field the text field will be set into character
            addPlaceholderStyle(ANSWER);
            ANSWER.setText("ANSWER");

        }
    }//GEN-LAST:event_ANSWERFocusLost

    private void ANSWERKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANSWERKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                search();
            } catch (IOException ex) {
                ANSWER.setText("ANSWER");
                ANSWER.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_ANSWERKeyPressed

    private void ANSWERKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ANSWERKeyReleased
        int position = ANSWER.getCaretPosition();
        ANSWER.setText(ANSWER.getText().toUpperCase());
        ANSWER.setCaretPosition(position);
    }//GEN-LAST:event_ANSWERKeyReleased

    private void NEWPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NEWPASSActionPerformed
    public void change() throws IOException {
        ArrayList<String> tempArray = new ArrayList<String>();
        boolean passAvailable = true;
        String i = CONPASS.getText();
        int ln = 0;
        String line;
        String[] lineArr = null;

        if (passAvailable) {

            try (FileReader fr = new FileReader("Admin.txt"))//read the text file
            {
                Scanner reader = new Scanner(fr);//scan the text file

                while ((line = reader.nextLine()) != null) {

                    if (!lineArr[0].equals(i)) //replace the text file with null value
                    {
                        tempArray.add(
                                lineArr[0] + " "
                        );
                    }
                }
                fr.close();
            } catch (Exception e) {

            }

            try {
                try (PrintWriter pr = new PrintWriter("Admin.txt")) {
                    for (String str : tempArray) {
                        pr.println(str);
                    }
                    pr.close();
                } catch (Exception e) {

                }
            } catch (Exception e) {

            }
            try {
                RandomAccessFile raf = new RandomAccessFile("Admin.txt", "rw");//read the file

                for (int p = 0; p < ln; p++) {
                    raf.readLine();

                }
                raf.writeBytes(CONPASS.getText() + "");

                JOptionPane.showMessageDialog(null, "New Password has been created.", null, JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ForgotPass.class.getName()).log(Level.SEVERE, null, ex);
            }

            // store all the info from the temparary text file to a temparary array
            try {
                try (FileReader fr = new FileReader("tempAdmin.txt")) {
                    Scanner reader = new Scanner(fr);
                    while ((line = reader.nextLine()) != null) {

                        tempArray.add(line);
                    }
                    fr.close();
                } catch (Exception e) {

                }
            } catch (Exception e) {

            }

            // delete all the temparary text files
            File Password = new File("Admin.txt");

            if (Password.delete()) {
                System.out.println("Deleted the file: " + Password.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ANSWER;
    private javax.swing.JLabel Backbtn;
    private javax.swing.JPasswordField CONPASS;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel ForgotTitle;
    private javax.swing.JLabel ForogotTitle2;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JPasswordField NEWPASS;
    private javax.swing.JLabel PoseidonIcon;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel eyeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox showPassword;
    // End of variables declaration//GEN-END:variables
}
