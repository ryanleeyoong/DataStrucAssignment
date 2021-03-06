
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ryan's PC
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoadingBar = new javax.swing.JProgressBar();
        LoadingValue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoadingLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 760, 20));

        LoadingValue.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LoadingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadingValue.setText("0%");
        getContentPane().add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 447, 40, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("poseidon system picture\\loading trident.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 30, 30));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel3.setText("Poseidon System");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("poseidon system picture\\loading poseidon.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        LoadingLabel.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        LoadingLabel.setText("Loading.....");
        getContentPane().add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("poseidon system picture\\Rectangle 8.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Loading ld = new Loading();
        ld.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                ld.LoadingValue.setText(i + "%");

                if (i == 0) {
                    ld.LoadingLabel.setText("Turning On Modules.....");

                }
                if (i == 10) {
                    ld.LoadingLabel.setText("Loading Modules.....");

                }
                if (i == 50) {
                    ld.LoadingLabel.setText("Connecting To Database.....");

                }
                if (i == 70) {
                    ld.LoadingLabel.setText("Connection Successful!");

                }
                if (i == 80) {
                    ld.LoadingLabel.setText("Launching Application.....");

                }
                ld.LoadingBar.setValue(i);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        ld.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);

        ld.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
