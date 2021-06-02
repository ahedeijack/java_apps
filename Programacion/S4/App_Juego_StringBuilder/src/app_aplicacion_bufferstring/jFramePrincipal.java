/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_aplicacion_bufferstring;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ahedeijack
 */
public class jFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jFramePrincipal
     */
    
    Random rand;
    String [] imgs;
    StringBuilder img;
    int puntos;
    public jFramePrincipal() {
        initComponents();
        rand = new Random(11);
        imgs = new String[11];
        imgs[0] = "Hola";
        imgs[1] = "Atenderemos";
        imgs[2] = "Unicornio";
        imgs[3] = "Empecemos";
        imgs[4] = "Abecedario";
        imgs[5] = "Vocales";
        imgs[6] = "Caminantes";
        imgs[7] = "Viernes";
        imgs[8] = "Churrumaiz";
        imgs[9] = "Guapisimos";
        imgs[10] = "Chaparruras";
        
        jButEmpezar.doClick();
        jLabPuntos.setText(" ");
        puntos = 0;
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
        jLabPalabra = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jT1 = new javax.swing.JTextField();
        jButEmpezar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabPuntos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setName("Juego de vocales"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Encuentra cuantas son las vocales ");

        jLabPalabra.setBackground(new java.awt.Color(153, 204, 255));
        jLabPalabra.setFont(new java.awt.Font("Microsoft YaHei Light", 2, 24)); // NOI18N
        jLabPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabPalabra.setOpaque(true);

        jButton1.setText("Probar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jT1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButEmpezar.setText("Empezar");
        jButEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEmpezarActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PUNTOS");

        jLabPuntos.setBackground(new java.awt.Color(204, 204, 204));
        jLabPuntos.setOpaque(true);

        jLabel3.setText("Encuentra el número de ");

        jLabel4.setText("vocales que tiene la palabra.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButEmpezar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jT1))
                        .addGap(151, 151, 151))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButEmpezar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEmpezarActionPerformed
        // TODO add your handling code here:
        jLabPalabra.setText(imgs[rand.nextInt(imgs.length)]);
    }//GEN-LAST:event_jButEmpezarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String recibo = jLabPalabra.getText();
        
        char [] cadenaChars = recibo.toCharArray();
        StringBuilder cadena = new StringBuilder(new String(cadenaChars));
        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a'||
                    cadena.charAt(i) == 'e'||
                    cadena.charAt(i) == 'i'||
                    cadena.charAt(i) == 'o'||
                    cadena.charAt(i) == 'u'||
                    cadena.charAt(i) == 'A'||
                    cadena.charAt(i) == 'E'||
                    cadena.charAt(i) == 'I'||
                    cadena.charAt(i) == 'O'||
                    cadena.charAt(i) == 'U') {
                contador++;
            }    
        }
        
        int user = 0;
        
        try {
        user = Integer.parseInt(jT1.getText()+"");
        } catch (NumberFormatException r) {
          JOptionPane.showMessageDialog(this, "No es un número! Usaremos 1 por defecto.");
          user = 1;
        }
        
        if (user != contador) {
            JOptionPane.showMessageDialog(this, "La palabra no tiene "+user+" vocales!");
        } else {
            JOptionPane.showMessageDialog(this, "Excelente! La palabra ["+recibo+"] si tiene "+user+" vocales! uwu");
            jButEmpezar.doClick();
            puntos +=  1;
        }
        
        jLabPuntos.setText(puntos+"!");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButEmpezar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabPalabra;
    private javax.swing.JLabel jLabPuntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jT1;
    // End of variables declaration//GEN-END:variables
}
