
package pa_19130520_proyecto_02;

import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PA_19130520_Frame_02_Principal extends javax.swing.JFrame {

    private DefaultTableModel modelo;

    public PA_19130520_Frame_02_Principal() {

        initComponents();

        modelo = (DefaultTableModel) jTableConsumo.getModel();
        jTableConsumo.setShowGrid(true);
        modelo.setValueAt("Edificio", 0, 0);
        modelo.setValueAt("Plaza", 1, 0);
        modelo.setValueAt("Escuela", 2, 0);
        modelo.setValueAt("Oficina", 3, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsumo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTotales = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButAlfabetico = new javax.swing.JButton();
        jButDecendente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButAleatorios = new javax.swing.JButton();
        jButEjemplo = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableConsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Obras", "Tonelada(s)", "Bulto(s)", "Kilogramo(s)", "Tonelada(s)", "Bulto(s)", "Kilogramo(s)", "Tonelada(s)", "Bulto(s)", "Kilogramo(s)", "Consumo total"
            }
        ));
        jScrollPane1.setViewportView(jTableConsumo);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("                       CONSUMO");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("                       INVENTARIO INICIAL");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("                       INVENTARIO FINAL");
        jLabel3.setOpaque(true);

        jTableTotales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane2.setViewportView(jTableTotales);

        jLabel4.setBackground(new java.awt.Color(255, 204, 255));
        jLabel4.setText("   TOTALES:     ");
        jLabel4.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(153, 153, 0));
        jLabel7.setOpaque(true);

        jLabel8.setText("MENOR CONSUMO");

        jLabel9.setText("MAYOR CONSUMO");

        jLabel10.setText("COLORES");

        jLabel11.setText("ORDENAR POR:");

        jButAlfabetico.setText("alfabetico por nombre de la obral");
        jButAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAlfabeticoActionPerformed(evt);
            }
        });

        jButDecendente.setText("desendente por por consumo de cemento");
        jButDecendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDecendenteActionPerformed(evt);
            }
        });

        jLabel13.setText("INSERTAR DATOS: ");

        jButAleatorios.setText("aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButEjemplo.setText("Ejemplo");
        jButEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEjemploActionPerformed(evt);
            }
        });

        jButCalcular.setText("calcular");
        jButCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCalcularActionPerformed(evt);
            }
        });

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pa_19130520_proyecto_02/Asignacion p2.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButAleatorios)
                                .addGap(11, 11, 11)
                                .addComponent(jButEjemplo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButAlfabetico)
                                    .addComponent(jButDecendente)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButCalcular)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 684, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jButAleatorios)))
                            .addComponent(jButEjemplo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButCalcular)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButAlfabetico)
                        .addGap(8, 8, 8)
                        .addComponent(jButDecendente))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButDecendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDecendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButDecendenteActionPerformed

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButCalcularActionPerformed
        // TODO add your handling code here:
        PA_19130520_Clase_02_Cemento invInicial = new PA_19130520_Clase_02_Cemento();

        PA_19130520_Clase_02_Cemento salida = new PA_19130520_Clase_02_Cemento();
        PA_19130520_Clase_02_Cemento invFinal;
        PA_19130520_Clase_02_Cemento ventas = new PA_19130520_Clase_02_Cemento();

        for (int r = 0; r < modelo.getRowCount(); r++) {
            invInicial.setTonelada(Integer.parseInt(modelo.getValueAt(r, 1) + ""));
            invInicial.setBulto(Integer.parseInt(modelo.getValueAt(r, 2) + ""));
            invInicial.setKilogramo(Integer.parseInt(modelo.getValueAt(r, 3) + ""));

            salida.setTonelada(Integer.parseInt(modelo.getValueAt(r, 4) + ""));
            salida.setBulto(Integer.parseInt(modelo.getValueAt(r, 5) + ""));
            salida.setKilogramo(Integer.parseInt(modelo.getValueAt(r, 6) + ""));

            invFinal = salida.resta(invInicial);

            ventas = ventas.suma(invFinal);

            modelo.setValueAt(invFinal, r, 7);

        }
        jTableTotales.setModel((TableModel) ventas);


    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();

        for (int r = 0; r < jTableConsumo.getRowCount(); r++) {

            jTableConsumo.setValueAt(azar.nextInt(1000), r, 1);  //min entrada
            jTableConsumo.setValueAt(azar.nextInt(20), r, 2);  //min entrada
            jTableConsumo.setValueAt(azar.nextInt(50), r, 3);  //seg entrada

            jTableConsumo.setValueAt(azar.nextInt(1000), r, 4);  //hor salida
            jTableConsumo.setValueAt(azar.nextInt(20), r, 5);  //min salida
            jTableConsumo.setValueAt(azar.nextInt(50), r, 6);  //seg salida
        }


    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAlfabeticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButAlfabeticoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEjemploActionPerformed
        jTableConsumo.setValueAt(15, 0, 1);
        jTableConsumo.setValueAt(248, 1, 1);
        jTableConsumo.setValueAt(38, 2, 1);
        jTableConsumo.setValueAt(8, 3, 1);

        jTableConsumo.setValueAt(18, 0, 2);
        jTableConsumo.setValueAt(9, 1, 2);
        jTableConsumo.setValueAt(1, 2, 2);
        jTableConsumo.setValueAt(14, 3, 2);

        jTableConsumo.setValueAt(6, 0, 3);
        jTableConsumo.setValueAt(2, 1, 3);
        jTableConsumo.setValueAt(11, 2, 3);
        jTableConsumo.setValueAt(3, 3, 3);

        jTableConsumo.setValueAt(2, 0, 4);
        jTableConsumo.setValueAt(170, 1, 4);
        jTableConsumo.setValueAt(3, 2, 4);
        jTableConsumo.setValueAt(1, 3, 4);

        jTableConsumo.setValueAt(7, 0, 5);
        jTableConsumo.setValueAt(19, 1, 5);
        jTableConsumo.setValueAt(2, 2, 5);
        jTableConsumo.setValueAt(16, 3, 5);

        jTableConsumo.setValueAt(10, 0, 6);
        jTableConsumo.setValueAt(49, 1, 6);
        jTableConsumo.setValueAt(2, 2, 6);
        jTableConsumo.setValueAt(4, 3, 6);


    }//GEN-LAST:event_jButEjemploActionPerformed

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
            java.util.logging.Logger.getLogger(PA_19130520_Frame_02_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PA_19130520_Frame_02_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PA_19130520_Frame_02_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PA_19130520_Frame_02_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PA_19130520_Frame_02_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButAlfabetico;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JButton jButDecendente;
    private javax.swing.JButton jButEjemplo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsumo;
    private javax.swing.JTable jTableTotales;
    // End of variables declaration//GEN-END:variables
}
