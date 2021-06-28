/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_2019_03_27_aplicacionnominaempleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author alope
 */
public class JFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenu
     */
    private Empleado [] nomina;
    private int empleadosRegistrados;
    private File archivo = new File("datos.txt");
    
    public JFrameMenu() {
        initComponents();
        
        if(archivo.exists())
        {
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                
                empleadosRegistrados = Integer.parseInt(br.readLine());
                nomina = new Empleado[empleadosRegistrados+15];
                
                int emp = 0;
                
                String tipo = br.readLine();
                
                while(tipo != null)
                {
                    switch(tipo)
                    {
                        case "E":
                            nomina[emp] = new Empleado(Integer.parseInt(br.readLine()),
                                                       br.readLine());
                            break;
                            
                        case "T":
                            nomina[emp] = new Taller(Integer.parseInt(br.readLine()),
                                                      br.readLine(),
                                                      Integer.parseInt(br.readLine()),
                                                      Double.parseDouble(br.readLine()));
                            break;
                            
                        case "A":
                            nomina[emp] = new Administrativo(Integer.parseInt(br.readLine()),
                                                      br.readLine(),
                                                      Integer.parseInt(br.readLine()),
                                                      Double.parseDouble(br.readLine()));
                            break;
                            
                        case "EJ":
                            nomina[emp] = new Ejecutivo(Integer.parseInt(br.readLine()),
                                                      br.readLine(),
                                                      Integer.parseInt(br.readLine()),
                                                      Double.parseDouble(br.readLine()),
                                                      Double.parseDouble(br.readLine()));
                            break;
                            
                        case "V":
                            nomina[emp] = new Ventas(Integer.parseInt(br.readLine()),
                                                      br.readLine(),
                                                      Double.parseDouble(br.readLine()),
                                                      Double.parseDouble(br.readLine()));
                            break;
                    }
                    
                    emp++;
                    tipo = br.readLine();
                }
                
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                try {
                    if (br != null)
                        br.close();
                    
                    if (fr != null)
                        fr.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        else
        {
            empleadosRegistrados = 0;
            nomina = new Empleado[15];
        }
    
        jLabEmpReg.setText(empleadosRegistrados+"");
    }

    public void ampliarArreglo()
    {
        if ((double)empleadosRegistrados/nomina.length>0.90)
        {
            Empleado[] copia = new Empleado[(int)(nomina.length*1.10)];
            
            for(int i=0; i < empleadosRegistrados; i++)
                copia[i] = nomina[i];
            
            nomina = copia;
        }
    }
    
    public File getArchivo()
    {
        return archivo;
    }
    
    public int getTamaño()
    {
        return nomina.length;
    }
    
    public int getEmpleadosRegistrados()
    {
        return empleadosRegistrados;
    }
    
    public boolean agregarEmpleado(Empleado emp)
    {
        if (empleadosRegistrados == nomina.length)
            return false;
        
        nomina[empleadosRegistrados] = emp;
        empleadosRegistrados++;
        jLabEmpReg.setText(empleadosRegistrados+"");
        
        return true;
    }
    public void setEmpleado(Empleado emp, int posicion)
    {
        if (posicion >=0 && posicion <nomina.length)
            nomina[posicion] = emp;
    }
    
    public Empleado getEmpleado(int posicion)
    {
        if (posicion >=0 && posicion <nomina.length)
            return nomina[posicion];
        else
            return null;
    }
    
    public JLabel getEtiqueta()
    {
        return jLabEmpReg;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButConsulta = new javax.swing.JButton();
        jButReporte = new javax.swing.JButton();
        jButRegistro = new javax.swing.JButton();
        jButSalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabEmpReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButConsulta.setText("Consulta");
        jButConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButConsultaActionPerformed(evt);
            }
        });

        jButReporte.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButReporte.setText("Reporte");
        jButReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButReporteActionPerformed(evt);
            }
        });

        jButRegistro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButRegistro.setText("Registro");
        jButRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegistroActionPerformed(evt);
            }
        });

        jButSalida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButSalida.setText("Salida");
        jButSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalidaActionPerformed(evt);
            }
        });

        jLabel1.setText("Empleados registrados");

        jLabEmpReg.setBackground(new java.awt.Color(255, 255, 0));
        jLabEmpReg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabEmpReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabEmpReg.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jButConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabEmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jLabEmpReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegistroActionPerformed
        // TODO add your handling code here:
        setVisible(false);

        JFrameRegistro jfRegistro = new JFrameRegistro(this);
        jfRegistro.setVisible(true);
    }//GEN-LAST:event_jButRegistroActionPerformed

    private void jButReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButReporteActionPerformed
        // TODO add your handling code here:
        setVisible(false);

        JFrameReporte jfReporte = new JFrameReporte(this);
        jfReporte.setVisible(true);
    }//GEN-LAST:event_jButReporteActionPerformed

    private void jButSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalidaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButSalidaActionPerformed

    private void jButConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButConsultaActionPerformed
        // TODO add your handling code here:
        setVisible(false);

        JFrameConsulta jfConsulta = new JFrameConsulta(this);
        jfConsulta.setVisible(true);
    }//GEN-LAST:event_jButConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButConsulta;
    private javax.swing.JButton jButRegistro;
    private javax.swing.JButton jButReporte;
    private javax.swing.JButton jButSalida;
    private javax.swing.JLabel jLabEmpReg;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
