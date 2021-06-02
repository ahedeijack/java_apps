/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_17131621_proyecto_03;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RicardoMtz
 */
public class PB_17131621_Frame_01 extends javax.swing.JFrame {

    /**
     * Creates new form PB_17131621_Frame_01
     */
    private Herramienta [] her = new Herramienta[4];
    DefaultTableModel modelo;
    Desarmador des = new Desarmador();
    Llave lla = new Llave();
    Martillo mar = new Martillo();
    Taladro tal = new Taladro();
    private Herramienta [] grupo = {lla,tal,mar,des};
    
    public PB_17131621_Frame_01() {
        initComponents();
        modelo = (DefaultTableModel)jTableHerramientas.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHerramientas = new javax.swing.JTable();
        jButEjemplo = new javax.swing.JButton();
        jButGrabar = new javax.swing.JButton();
        jButDibujar = new javax.swing.JButton();
        jButDesfilar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPDibujos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextReporte = new javax.swing.JTextArea();
        jButDesfilar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableHerramientas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave", "Descripcion", "Material/Corriente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableHerramientas);
        if (jTableHerramientas.getColumnModel().getColumnCount() > 0) {
            jTableHerramientas.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableHerramientas.getColumnModel().getColumn(1).setPreferredWidth(145);
            jTableHerramientas.getColumnModel().getColumn(2).setMinWidth(145);
            jTableHerramientas.getColumnModel().getColumn(2).setPreferredWidth(145);
            jTableHerramientas.getColumnModel().getColumn(2).setMaxWidth(145);
        }

        jButEjemplo.setText("Ejemplo");
        jButEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEjemploActionPerformed(evt);
            }
        });

        jButGrabar.setText("Grabar");
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });

        jButDibujar.setText("Dibujar");
        jButDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDibujarActionPerformed(evt);
            }
        });

        jButDesfilar.setText("Desfilar");
        jButDesfilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDesfilarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pb_17131621_proyecto_03/Proyecto.PNG"))); // NOI18N

        jPDibujos.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPDibujosLayout = new javax.swing.GroupLayout(jPDibujos);
        jPDibujos.setLayout(jPDibujosLayout);
        jPDibujosLayout.setHorizontalGroup(
            jPDibujosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPDibujosLayout.setVerticalGroup(
            jPDibujosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextReporte.setColumns(20);
        jTextReporte.setRows(5);
        jScrollPane2.setViewportView(jTextReporte);

        jButDesfilar1.setText("Diagrama");
        jButDesfilar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDesfilar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButEjemplo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButDesfilar)
                    .addComponent(jButDibujar)
                    .addComponent(jButDesfilar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDibujos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPDibujos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButGrabar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButEjemplo)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButDibujar)
                                .addGap(38, 38, 38)
                                .addComponent(jButDesfilar)
                                .addGap(48, 48, 48)
                                .addComponent(jButDesfilar1)
                                .addGap(143, 143, 143))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addContainerGap())))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEjemploActionPerformed
        // TODO add your handling code here:
        jTableHerramientas.setValueAt("1002", 0, 0);
        jTableHerramientas.setValueAt("Llave", 0, 1);
        jTableHerramientas.setValueAt("Fierro", 0, 2);

        jTableHerramientas.setValueAt("1004", 1, 0);
        jTableHerramientas.setValueAt("Taladro", 1, 1);
        jTableHerramientas.setValueAt("Alterna", 1, 2);
        
        jTableHerramientas.setValueAt("1003", 2, 0);
        jTableHerramientas.setValueAt("Martillo", 2, 1);
        jTableHerramientas.setValueAt("Madera", 2, 2);
        
        jTableHerramientas.setValueAt("1001", 3, 0);
        jTableHerramientas.setValueAt("Desarmador", 3, 1);
        jTableHerramientas.setValueAt("Fierro", 3, 2);
    }//GEN-LAST:event_jButEjemploActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        // TODO add your handling code here:
        int llaClav = Integer.parseInt(jTableHerramientas.getValueAt(0, 0)+"");
        String llaDesc = jTableHerramientas.getValueAt(0,1).toString();
        String llaMaCo = jTableHerramientas.getValueAt(0,2).toString();
        lla.setClave(llaClav);
        lla.setDescripcion(llaDesc);
        lla.setMaterial(llaMaCo);
        
        
        int talClav = Integer.parseInt(jTableHerramientas.getValueAt(1, 0)+"");
        String talDesc = jTableHerramientas.getValueAt(1,1).toString();
        String talMaCo = jTableHerramientas.getValueAt(1,2).toString();
        tal.setClave(talClav);
        tal.setDescripcion(talDesc);
        tal.setCorriente(talMaCo);
        
        int marClav = Integer.parseInt(jTableHerramientas.getValueAt(2, 0)+"");
        String marDesc = jTableHerramientas.getValueAt(2,1).toString();
        String marMaCo = jTableHerramientas.getValueAt(2,2).toString();
        mar.setClave(marClav);
        mar.setDescripcion(marDesc);
        mar.setMaterial(marMaCo);
        
        int desClav = Integer.parseInt(jTableHerramientas.getValueAt(3, 0)+"");
        String desDesc = jTableHerramientas.getValueAt(3,1).toString();
        String desMaCo = jTableHerramientas.getValueAt(3,2).toString();
        des.setClave(desClav);
        des.setDescripcion(desDesc);
        des.setMaterial(desMaCo);
        
        jTextReporte.setText(lla.visualizar()+"\n\n "+tal.visualizar()+"\n\n "+mar.visualizar()+"\n\n "+des.visualizar());
        
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jButDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDibujarActionPerformed
        // TODO add your handling code here:
        Component comp;
        comp = jPDibujos;
        int i=0;
        
        for ( i = 0; i < grupo.length; i++) 
        {
            grupo[i].dibujar(20, 5, comp);
            
            try 
          {
              Thread.sleep(1000);
          }
            catch (InterruptedException ex) {
              Logger.getLogger(PB_17131621_Frame_01.class.getName()).log(Level.SEVERE, null, ex);
          }
            comp.getGraphics().clearRect(0, 0, getWidth(), 250);
        }
      
      grupo[0].dibujar(20, 5, comp);
    }//GEN-LAST:event_jButDibujarActionPerformed

    private void jButDesfilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDesfilarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PB_17131621_Frame_02 abrir = new PB_17131621_Frame_02(this);
        abrir.setVisible(true);
    }//GEN-LAST:event_jButDesfilarActionPerformed

    private void jButDesfilar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDesfilar1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PB_17131621_Frame_03 abrir = new PB_17131621_Frame_03(this);
        abrir.setVisible(true);
    }//GEN-LAST:event_jButDesfilar1ActionPerformed

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
            java.util.logging.Logger.getLogger(PB_17131621_Frame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PB_17131621_Frame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PB_17131621_Frame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PB_17131621_Frame_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PB_17131621_Frame_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDesfilar;
    private javax.swing.JButton jButDesfilar1;
    private javax.swing.JButton jButDibujar;
    private javax.swing.JButton jButEjemplo;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPDibujos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableHerramientas;
    private javax.swing.JTextArea jTextReporte;
    // End of variables declaration//GEN-END:variables
}