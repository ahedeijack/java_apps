/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_082019_ArchivoVisual;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa623
 */
public class ArchivoVisual extends javax.swing.JFrame {

    /**
     * Creates new form ArchivoVisual
     */
    
    DefaultTableModel modelo;
    MiRandom azar = new MiRandom();
    
    public ArchivoVisual() {
        initComponents();
        
        modelo = (DefaultTableModel)jTableAlumnos.getModel();
        jTableAlumnos.setShowGrid(true);
        
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
        jTableAlumnos = new javax.swing.JTable();
        jSpinAlumnos = new javax.swing.JSpinner();
        jButAleatorios = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabPromGral = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButGrabar = new javax.swing.JButton();
        jButLeer = new javax.swing.JButton();
        jTextFieldNombreArchivo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alumno", "Fisica", "Quimica", "Matematicas", "POO", "Probabilidad", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(jTableAlumnos);
        if (jTableAlumnos.getColumnModel().getColumnCount() > 0) {
            jTableAlumnos.getColumnModel().getColumn(0).setMinWidth(150);
            jTableAlumnos.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableAlumnos.getColumnModel().getColumn(0).setMaxWidth(155);
        }

        jSpinAlumnos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinAlumnosStateChanged(evt);
            }
        });

        jButAleatorios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButAleatorios.setText("ALEATORIOS");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButCalcular.setText("CALCULAR");
        jButCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("PROMEGIO GRAL:");

        jLabPromGral.setBackground(new java.awt.Color(0, 153, 0));
        jLabPromGral.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabPromGral.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NUMERO DE ALUMNOS");

        jButGrabar.setText("GRABAR");
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });

        jButLeer.setText("LEER");
        jButLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLeerActionPerformed(evt);
            }
        });

        jLabel2.setText("DIRRECION DONDE SE VA A GUARDAR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jSpinAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jButAleatorios)
                .addGap(55, 55, 55)
                .addComponent(jButCalcular)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButGrabar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButLeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabPromGral, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButAleatorios)
                    .addComponent(jButCalcular)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabPromGral, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(9, 9, 9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButGrabar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButLeer))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinAlumnosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinAlumnosStateChanged
        // TODO add your handling code here:
        modelo.setRowCount((int)jSpinAlumnos.getValue());
    }//GEN-LAST:event_jSpinAlumnosStateChanged

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        for(int r=0; r<modelo.getRowCount(); r++)
        {
            modelo.setValueAt(azar.nextNombreCompleto(), r, 0);
            for(int c=1; c<modelo.getColumnCount()-1; c++)
            {
                modelo.setValueAt(azar.nextInt(40,100), r, c); 
            }    
        }    
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCalcularActionPerformed
        // TODO add your handling code here:
        double suma, promedio, sumaGral =0, promGral = 0;
        
        for(int r=0; r<modelo.getRowCount();r++)
        {
            suma = 0;
            for(int c=1; c<modelo.getColumnCount()-1;c++)
                suma += Double.parseDouble(modelo.getValueAt(r, c)+"");
            
            promedio = suma / (modelo.getColumnCount()-2);
            sumaGral += promedio;
            
            modelo.setValueAt(azar.nextInt(40,100), r, modelo.getColumnCount()-1);
        }  
        
        promGral = sumaGral / modelo.getRowCount();
        jLabPromGral.setText(promGral+"");
        
    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        try {
            // TODO add your handling code here:

            FileWriter fw = new FileWriter(jTextFieldNombreArchivo.getText());
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(modelo.getRowCount());
            
            for(int r=0; r<modelo.getRowCount(); r++){
                for(int c = 0; c<modelo.getColumnCount()-1; c++){
                    pw.println(modelo.getValueAt(r, c));
                }
            }
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ArchivoVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jButLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLeerActionPerformed
        try {
            // TODO add your handling code here:
            FileReader fr = new FileReader(jTextFieldNombreArchivo.getText());
            BufferedReader br = new BufferedReader(fr);
            
            int n =  Integer.parseInt( br.readLine());
            
            jSpinAlumnos.setValue(n);
            
            for(int r = 0; r < n; r++){
                for(int c = 0; c<modelo.getColumnCount()-1; c++){
                    modelo.setValueAt(br.readLine(), r, c);
                }
            }
            jButCalcular.doClick();
            
            br.close();
            fr.close();
            
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Archivo no encontrado");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas con el archivo.");
        }
        
        
    }//GEN-LAST:event_jButLeerActionPerformed

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
            java.util.logging.Logger.getLogger(ArchivoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArchivoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArchivoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArchivoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArchivoVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JButton jButLeer;
    private javax.swing.JLabel jLabPromGral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinAlumnos;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextFieldNombreArchivo;
    // End of variables declaration//GEN-END:variables
}
