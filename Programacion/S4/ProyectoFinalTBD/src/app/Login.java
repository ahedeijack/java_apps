package app;

import javax.swing.JOptionPane;
import clase.Conexion;

/**
 *
 * @author Kobura Quiroz
 */
public class Login extends javax.swing.JFrame {

    private String user = "admin", pass = "admin";
    public boolean estado;
    Conexion obj = new Conexion();
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTextUser.requestFocus();
        int res=JOptionPane.showConfirmDialog(this,"Desea Crear La Bade De Datos CAIVUL");
        obj.crearBasedeDatos(res);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextPass = new javax.swing.JPasswordField();
        jButtonInvitado = new javax.swing.JButton();
        jButtonEntrar = new java.awt.Button();
        jTextUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ver como invitado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, 170));
        getContentPane().add(jTextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 140, -1));

        jButtonInvitado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ojo.png"))); // NOI18N
        jButtonInvitado.setContentAreaFilled(false);
        jButtonInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInvitadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        jButtonEntrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonEntrar.setLabel("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 70, 30));

        jTextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUserActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String usuario = jTextUser.getText();
        String password = jTextPass.getText();
        if (usuario.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor introduce los datos.");
        } else if (!user.equals(usuario) || !pass.equals(password)){
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos."); 
        } else {
            if (user.equals("admin") && pass.equals("admin")) {
                estado = true;
                PrincipalFrame principal = new PrincipalFrame (estado);
                principal.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInvitadoActionPerformed
        estado = false;
        PrincipalFrame principal = new PrincipalFrame (false);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonInvitadoActionPerformed
    
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
    private java.awt.Button jButtonEntrar;
    private javax.swing.JButton jButtonInvitado;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jTextPass;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
}
