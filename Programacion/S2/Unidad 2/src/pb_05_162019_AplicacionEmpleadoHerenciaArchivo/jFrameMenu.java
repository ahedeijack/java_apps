/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_05_162019_AplicacionEmpleadoHerenciaArchivo;

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
 * @author aa623
 */
public class jFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form jFrameMenu
     */
    private Empleado [] nomina; //DONDE SE GUARDAN LOS USUARIOS EN EL FRAME-MENU
    private int empleadosRegistrados;
    private File archivo = new File ("datos.txt");
    
    public jFrameMenu() {
        initComponents();
        if(archivo.exists()){
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                
               br.readLine();
               empleadosRegistrados = Integer.parseInt(br.readLine());
               nomina = new Empleado[empleadosRegistrados+15];
               
               String tipo = br.readLine();
               int emp = 0;
               while (tipo != null){
                   switch(tipo){
                       
                       case "EM":
                           nomina[emp] = new Empleado(Integer.parseInt(br.readLine()),
                                                      br.readLine());
                       break;
                       
                       
                       case "TA":
                           nomina[emp] = new Taller(Integer.parseInt(br.readLine()),
                                                        br.readLine(), 
                                                        Integer.parseInt(br.readLine()),
                                                        Double.parseDouble(br.readLine()));
                       break;
                       
                       
                       case "AD":
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
                       
                       case "VE":
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
                Logger.getLogger(jFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(jFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            finally {
                
                    try {
                        
                        if (br != null)
                        br.close();
                        
                        if (fr != null)
                        fr.close();
                        
                    } catch (IOException ex) {
                        Logger.getLogger(jFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            }
            
        } else {
            empleadosRegistrados = 0;
            nomina = new Empleado[15];
        }
        
        
        empleadosRegistrados = 0;
        jLabEmRe.setText(empleadosRegistrados+"");
    }
    public File getArchivo(){
        return archivo;
    }
    
    public int getTamaño(){
        return(nomina.length);
    }  
    
    public int getEmpleadosRegistrados(){
        return empleadosRegistrados;   
    }
    
    public boolean agregarEmpleado(Empleado emp){
        if(empleadosRegistrados == nomina.length)
            return false;
        
        nomina[empleadosRegistrados] = emp;
        empleadosRegistrados++; //Incrementa el contador
        
        jLabEmRe.setText(empleadosRegistrados+""); //actualizar la etiqueta del FrameMenu del numero de empleado
        
        return true;
    }        
    
    //porque el arreglo es privado, por eos declaramos metodos para poder modificar su informacion
    public void setEmpleado(Empleado emp, int posicion)
    {
        if(posicion >=0 && posicion < nomina.length)
            nomina[posicion] = emp;
    }   
    
    public Empleado getEmpleado(int posicion)
    {
        if(posicion >=0 && posicion < nomina.length)
            return(nomina[posicion]);
        
        else
            return (null);
    }  
    
    public JLabel getEtiqueta() //para poder modificarla 
    {
        return jLabEmRe;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButRegistro = new javax.swing.JButton();
        jButReporte = new javax.swing.JButton();
        jButConsulta = new javax.swing.JButton();
        jButSalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabEmRe = new javax.swing.JLabel();

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("REGISTRO");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButRegistro.setText("REGISTRO");
        jButRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegistroActionPerformed(evt);
            }
        });

        jButReporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButReporte.setText("REPORTE");
        jButReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButReporteActionPerformed(evt);
            }
        });

        jButConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButConsulta.setText("CONSULTA");
        jButConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButConsultaActionPerformed(evt);
            }
        });

        jButSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButSalida.setText("SALIDA");
        jButSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empleados registrados:");

        jLabEmRe.setBackground(new java.awt.Color(204, 153, 0));
        jLabEmRe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabEmRe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabEmRe.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabEmRe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabEmRe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegistroActionPerformed
        // TODO add your handling code here:
            setVisible(false); //No es necesario poner "this" porque estamos en el frame Menu //"cierra" el frame de menu
            
            jFrameRegistro jRegistro = new jFrameRegistro(this);
            jRegistro.setVisible(true);
    }//GEN-LAST:event_jButRegistroActionPerformed

    private void jButReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButReporteActionPerformed
        // TODO add your handling code here:
        setVisible(false); //No es necesario poner "this" porque estamos en el frame Menu //"cierra" el frame de menu
            
        jFrameReporte jfReporte = new jFrameReporte(this); //para terminar de conectar el frame
        jfReporte.setVisible(true);
    }//GEN-LAST:event_jButReporteActionPerformed

    private void jButSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalidaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButSalidaActionPerformed

    private void jButConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButConsultaActionPerformed
        // TODO add your handling code here:
        setVisible(false); //No es necesario poner "this" porque estamos en el frame Menu //"cierra" el frame de menu
            
        jFrameConsulta jfConsulta = new jFrameConsulta(this); //para terminar de conectar el frame
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
            java.util.logging.Logger.getLogger(jFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButConsulta;
    private javax.swing.JButton jButRegistro;
    private javax.swing.JButton jButReporte;
    private javax.swing.JButton jButSalida;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabEmRe;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
