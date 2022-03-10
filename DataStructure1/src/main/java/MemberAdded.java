
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author zenta
 */
public class MemberAdded extends javax.swing.JFrame {

    /**
     * Creates new form MemberAdded
     */
    public MemberAdded() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        try {
            File myObj = new File("newMember.txt");
            Scanner scanner = new Scanner(myObj);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                lineSplit = line.split("___");
                lblID.setText(lineSplit[0]);
                lblRegisFee.setText(lineSplit[1]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
    
    private NewMember nm;
    private MemRecord mr;
    private String line;
    private String[] lineSplit;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMemAdded = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblIDHeader = new javax.swing.JLabel();
        lblRegisFeeHeader = new javax.swing.JLabel();
        lblFinish = new javax.swing.JButton();
        lblAddMore = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblRegisFee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMemAdded.setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHeader.setText("New member added");

        btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ryan's PC\\Desktop\\dataAsssss\\DataStrucAssignment\\DataStructure1\\src\\main\\java\\Icon\\BACK.png")); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblIDHeader.setText("Member ID          :");

        lblRegisFeeHeader.setText("Registration fee :");

        lblFinish.setBackground(new java.awt.Color(13, 109, 63));
        lblFinish.setText("Finish");
        lblFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblFinishActionPerformed(evt);
            }
        });

        lblAddMore.setForeground(java.awt.Color.red);
        lblAddMore.setText("Add another member");
        lblAddMore.setBorder(null);
        lblAddMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAddMoreActionPerformed(evt);
            }
        });

        lblID.setText("   ");

        lblRegisFee.setText("   ");

        javax.swing.GroupLayout pnlMemAddedLayout = new javax.swing.GroupLayout(pnlMemAdded);
        pnlMemAdded.setLayout(pnlMemAddedLayout);
        pnlMemAddedLayout.setHorizontalGroup(
            pnlMemAddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMemAddedLayout.createSequentialGroup()
                .addGroup(pnlMemAddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMemAddedLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(81, 81, 81)
                        .addComponent(lblHeader))
                    .addGroup(pnlMemAddedLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblFinish))
                    .addGroup(pnlMemAddedLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(pnlMemAddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDHeader)
                            .addComponent(lblRegisFeeHeader))
                        .addGap(33, 33, 33)
                        .addGroup(pnlMemAddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegisFee)
                            .addComponent(lblID)))
                    .addGroup(pnlMemAddedLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblAddMore, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        pnlMemAddedLayout.setVerticalGroup(
            pnlMemAddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMemAddedLayout.createSequentialGroup()
                .addGroup(pnlMemAddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMemAddedLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblHeader))
                    .addGroup(pnlMemAddedLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(36, 36, 36)
                .addGroup(pnlMemAddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDHeader)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(pnlMemAddedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisFeeHeader)
                    .addComponent(lblRegisFee))
                .addGap(32, 32, 32)
                .addComponent(lblFinish)
                .addGap(18, 18, 18)
                .addComponent(lblAddMore, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMemAdded, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMemAdded, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        
        nm = new NewMember();
        nm.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblFinishActionPerformed
        File myObj = new File("newMember.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
        
        dispose();
        mr = new MemRecord();
        mr.show();
    }//GEN-LAST:event_lblFinishActionPerformed

    private void lblAddMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAddMoreActionPerformed
        dispose();
        
        nm = new NewMember();
        nm.show();
    }//GEN-LAST:event_lblAddMoreActionPerformed

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
            java.util.logging.Logger.getLogger(MemberAdded.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberAdded.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberAdded.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberAdded.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberAdded().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton lblAddMore;
    private javax.swing.JButton lblFinish;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDHeader;
    private javax.swing.JLabel lblRegisFee;
    private javax.swing.JLabel lblRegisFeeHeader;
    private javax.swing.JPanel pnlMemAdded;
    // End of variables declaration//GEN-END:variables
}
