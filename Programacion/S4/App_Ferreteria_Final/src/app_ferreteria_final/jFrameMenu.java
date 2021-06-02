package app_ferreteria_final;

import java.awt.Image;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahdeijack
 */
public class jFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form jFrameMenu
     */
    public jFrameMenu() {
        initComponents();
    }
    
            @Override
    public Image getIconImage() {
         Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("IMG/icons8_skull_24px.png"));
        return retValue;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButTree = new javax.swing.JButton();
        jButSerial = new javax.swing.JButton();
        jButHash = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Almacenes");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo_frame.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButTree.setBackground(new java.awt.Color(0, 0, 0));
        jButTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_genealogy_24px.png"))); // NOI18N
        jButTree.setToolTipText("Proyeto en Arbol Binario");
        jButTree.setBorder(null);
        jButTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButTreeActionPerformed(evt);
            }
        });
        getContentPane().add(jButTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 11, 101, 98));

        jButSerial.setBackground(new java.awt.Color(0, 0, 0));
        jButSerial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_barcode_24px.png"))); // NOI18N
        jButSerial.setToolTipText("Proyecto Serialización");
        jButSerial.setBorder(null);
        jButSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSerialActionPerformed(evt);
            }
        });
        getContentPane().add(jButSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 11, 101, 98));

        jButHash.setBackground(new java.awt.Color(0, 0, 0));
        jButHash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_hash_24px.png"))); // NOI18N
        jButHash.setToolTipText("Proyecto en Hash");
        jButHash.setBorder(null);
        jButHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButHashActionPerformed(evt);
            }
        });
        getContentPane().add(jButHash, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 11, 101, 98));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 330, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButTreeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BusquedaBinario binario = new BusquedaBinario(this);
        binario.setVisible(true);
    }//GEN-LAST:event_jButTreeActionPerformed

    private void jButHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButHashActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BusquedaHash hash = new BusquedaHash(this);
        hash.setVisible(true);
    }//GEN-LAST:event_jButHashActionPerformed

    private void jButSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSerialActionPerformed
        // TODO add your handling code here:t
        this.setVisible(false);
        Serializar ser = new Serializar(this);
        ser.setVisible(true);
        
    }//GEN-LAST:event_jButSerialActionPerformed

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
            java.util.logging.Logger.getLogger(jFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButHash;
    private javax.swing.JButton jButSerial;
    private javax.swing.JButton jButTree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
