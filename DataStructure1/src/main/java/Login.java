
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author shapi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);//set the page location 
        setResizable(false);//disable the resizable function
        addPlaceholderStyle(txtPassword);
        loadPass();

    }

    private String password;
    private MemRecord mr;
    
    public void loadPass() {

        // read password from text file and store into a variable
        try {
            File passTxt = new File("password.txt");
            Scanner scanner = new Scanner(passTxt);
            password = scanner.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        PoseidonIcon = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlPos = new javax.swing.JPanel();
        eyeIcon = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        Logo1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon("poseidon system picture\\login trident.png")); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        PoseidonIcon.setIcon(new javax.swing.ImageIcon("poseidon system picture\\loading poseidon.png")); // NOI18N
        jPanel1.add(PoseidonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Title.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        Title.setText("Poseidon System");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("poseidon system picture\\gradient half.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pnlPos.setBackground(new java.awt.Color(255, 255, 255));
        pnlPos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eyeIcon.setIcon(new javax.swing.ImageIcon("poseidon system picture\\login eye.png")); // NOI18N
        pnlPos.add(eyeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 30, -1));

        loginBtn.setIcon(new javax.swing.ImageIcon("poseidon system picture\\Login right-arrow (1).png")); // NOI18N
        loginBtn.setBorderPainted(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        pnlPos.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 40, 10));

        Logo1.setIcon(new javax.swing.ImageIcon("poseidon system picture\\login trident.png")); // NOI18N
        pnlPos.add(Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        Title1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Title1.setText("Welcome, Admin!");
        pnlPos.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 270, -1));

        txtPassword.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        txtPassword.setText("PASSWORD");
        txtPassword.setEchoChar('\u0000');
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        pnlPos.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 260, 30));

        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        pnlPos.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Change Password?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlPos.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 150, 20));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        pnlPos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPos, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if (txtPassword.getText().equals(password)) {
            dispose();
            mr = new MemRecord();
            mr.show();
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect password");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {//if the showPassword button is selected
            txtPassword.setEchoChar((char) 0);//set the text to digit
        } else {
            txtPassword.setEchoChar('*');//if the showPassword is deselected, set the text to character
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().length() == 0) {
            //if there are no input, the addplaceholder function will be set and the text will be set as Password.If the user press the text field the text field will be set into character 
            addPlaceholderStyle(txtPassword);
            txtPassword.setText("PASSWORD");
            txtPassword.setEchoChar('*');
        }

    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getText().equals("PASSWORD")) {
            //if there are input, the removeplaceholder function will be set and the text will be set as null.And it will force the user input set as character    
            txtPassword.setText(null);
            txtPassword.requestFocus();
            //set Password Charcter
            txtPassword.setEchoChar('*');
            //remove placeholder style

            removePlaceholderStyle(txtPassword);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        //it force the user input into uppercase
        int position = txtPassword.getCaretPosition();
        txtPassword.setText(txtPassword.getText().toUpperCase());
        txtPassword.setCaretPosition(position);
    }//GEN-LAST:event_txtPasswordKeyReleased
    public void setColor(JPanel p) {
        p.setBackground(new Color(255, 105, 0));
    }

    public void resetColor(JPanel p1) {
        p1.setBackground(new Color(255, 255, 255));
    }

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        setColor(jPanel1);


    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        resetColor(jPanel1);

    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        ChangePass cp = new ChangePass();
        cp.show();
        dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtPassword.getText().equals(password)) {
            dispose();
            mr = new MemRecord();
            mr.show();
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect password");
        }
        }

    }//GEN-LAST:event_txtPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel PoseidonIcon;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel eyeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel pnlPos;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
