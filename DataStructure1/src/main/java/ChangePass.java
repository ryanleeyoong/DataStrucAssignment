
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ryan's PC
 */
public class ChangePass extends javax.swing.JFrame {

    /**
     * Creates new form ChangePass
     */
    public ChangePass() {
        initComponents();
        setLocationRelativeTo(null);//set the page location 
        setResizable(false);//disable the resizable function
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
        Backbtn = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        PoseidonIcon = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        eyeIcon = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JTextField();
        PasswordTextField2 = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCurrentPassField = new javax.swing.JPasswordField();
        jCheckBoxShowPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

<<<<<<< HEAD
        Backbtn.setIcon(new javax.swing.ImageIcon("poseidon system picture\\BACK.png")); // NOI18N
=======
>>>>>>> 872824ae5d19ab93a4e797a5ad095f71b297f899
        Backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbtnMouseClicked(evt);
            }
        });
        jPanel1.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
<<<<<<< HEAD

        Logo.setIcon(new javax.swing.ImageIcon("poseidon system picture\\login trident.png")); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        PoseidonIcon.setIcon(new javax.swing.ImageIcon("poseidon system picture\\ChangePass poseidon.png")); // NOI18N
=======
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));
>>>>>>> 872824ae5d19ab93a4e797a5ad095f71b297f899
        jPanel1.add(PoseidonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Title.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        Title.setText("Poseidon System");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
<<<<<<< HEAD

        jLabel1.setIcon(new javax.swing.ImageIcon("poseidon system picture\\gradient half.png")); // NOI18N
=======
>>>>>>> 872824ae5d19ab93a4e797a5ad095f71b297f899
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

<<<<<<< HEAD
        jButton1.setIcon(new javax.swing.ImageIcon("poseidon system picture\\Login right-arrow (1).png")); // NOI18N
=======
>>>>>>> 872824ae5d19ab93a4e797a5ad095f71b297f899
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 40, -1));
<<<<<<< HEAD

        eyeIcon.setIcon(new javax.swing.ImageIcon("poseidon system picture\\login eye.png")); // NOI18N
        jPanel3.add(eyeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 30, -1));

        Logo1.setIcon(new javax.swing.ImageIcon("poseidon system picture\\login trident.png")); // NOI18N
=======
        jPanel3.add(eyeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 30, -1));
>>>>>>> 872824ae5d19ab93a4e797a5ad095f71b297f899
        jPanel3.add(Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        Title1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Title1.setText("Change Password");
        jPanel3.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, -1));

        PasswordTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PasswordTextField.setText("CONFIRM NEW PASSWORD");
        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 260, 30));

        PasswordTextField2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PasswordTextField2.setText("NEW PASSWORD");
        PasswordTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(PasswordTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 260, 30));

        SaveBtn.setBackground(new java.awt.Color(13, 109, 63));
        SaveBtn.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        jPanel3.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 60, -1));

        CancelBtn.setBackground(new java.awt.Color(182, 52, 52));
        CancelBtn.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel3.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

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
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Forgot Password ?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 200, 20));

        jCurrentPassField.setText("Current Password");
        jCurrentPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCurrentPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCurrentPassFieldFocusLost(evt);
            }
        });
        jCurrentPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCurrentPassFieldActionPerformed(evt);
            }
        });
        jCurrentPassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCurrentPassFieldKeyReleased(evt);
            }
        });
        jPanel3.add(jCurrentPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 260, 30));

        jCheckBoxShowPass.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxShowPass.setText("Show Password");
        jCheckBoxShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPassActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBoxShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void setColor(JPanel p) {
        p.setBackground(new Color(255, 105, 0));
    }

    public void resetColor(JPanel p1) {
        p1.setBackground(new Color(255, 255, 255));
    }
    
    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void PasswordTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            search();
        } catch (IOException ex) {
            Logger.getLogger(ForgotPass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseClicked
        Login lg = new Login();
        lg.show();

        dispose();

    }//GEN-LAST:event_BackbtnMouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        setColor(jPanel1);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        resetColor(jPanel1);
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        ForgotPassword fp = new ForgotPassword();
        fp.show();

        dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

<<<<<<< HEAD
    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        Login lg = new Login();
        lg.show();

        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

=======
    private void jCurrentPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCurrentPassFieldActionPerformed
        if(jCheckBoxShowPass.isSelected()){
           jCurrentPassField.setEchoChar((char)0);
       } else{
           jCurrentPassField.setEchoChar('*');
       }
    }//GEN-LAST:event_jCurrentPassFieldActionPerformed

    private void jCurrentPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCurrentPassFieldFocusGained
         if (jCurrentPassField.getText().equals("Current Password")) {
             //if there are no input, the removeplaceholder function will be set and the text will be set as null.
            jCurrentPassField.setText("");
            jCurrentPassField.setEchoChar('*');
            jCurrentPassField.setForeground(new Color(0,0,0));
        }      
    }//GEN-LAST:event_jCurrentPassFieldFocusGained

    private void jCurrentPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCurrentPassFieldFocusLost
        if (jCurrentPassField.getText().equals("")) {
             //if there are no input, the removeplaceholder function will be set and the text will be set as null.
            jCurrentPassField.setEchoChar((char)0);
            jCurrentPassField.setText("Current Password");
            jCurrentPassField.setForeground(new Color(153,153,153));
        }          
    }//GEN-LAST:event_jCurrentPassFieldFocusLost

    private void jCheckBoxShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPassActionPerformed
        if(jCheckBoxShowPass.isSelected()){
           jCurrentPassField.setEchoChar((char)0);
       } else{
           jCurrentPassField.setEchoChar('*');
       }
    }//GEN-LAST:event_jCheckBoxShowPassActionPerformed

    private void jCurrentPassFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCurrentPassFieldKeyReleased
        //force user input to uppercase
        int position = jCurrentPassField.getCaretPosition();
        jCurrentPassField.setText(jCurrentPassField.getText().toUpperCase());
        jCurrentPassField.setCaretPosition(position);
    }//GEN-LAST:event_jCurrentPassFieldKeyReleased
    
    public void search() throws IOException {

        String currentpass = jCurrentPassField.getText();//declare the username as txtUser.getText(),getText statement will get the text from user input
        int val = 0;

        Scanner input = new Scanner(jCurrentPassField.getText());
        currentpass = input.next();
        String line;
        Scanner file = new Scanner(new File("Admin.txt"));//scanner will scan the text file 
        if (currentpass.equals("CURRENT PASSWORD")) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Fill up password", null, JOptionPane.ERROR_MESSAGE);
            jCurrentPassField.setText("CURRENT PASSWORD");
            jCurrentPassField.setForeground(Color.gray);

        } else {
            while (file.hasNextLine()) {
                line = file.nextLine();
                if (line.indexOf(currentpass) != -1) {//if the text file consists of user input
                    JOptionPane.showMessageDialog(null, "Password Matched,please fill in the new password!");
                    val = 1;
                    break;
                } else {
                    val = 0;
                    continue;
                }
            }
            if (val == 0) {
                JOptionPane.showMessageDialog(null, "Password does not matched,please reenter the password", null, JOptionPane.ERROR_MESSAGE);
            }
        }

        currentpass = input.next();
    }
    
>>>>>>> 872824ae5d19ab93a4e797a5ad095f71b297f899
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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backbtn;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JTextField PasswordTextField2;
    private javax.swing.JLabel PoseidonIcon;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel eyeIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxShowPass;
    private javax.swing.JPasswordField jCurrentPassField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
