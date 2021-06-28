package pa_17130761_proyecto_04;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javier
 */
public class PA_17130761_Frame_04 extends javax.swing.JFrame {

    /**
     * Creates new form PA_17130761_Frame_04
     */
    DefaultTableModel modelo;
    Random azar = new Random();
    JColorChooser jcch = new JColorChooser();
    JFileChooser jfch = new JFileChooser();
    public PA_17130761_Frame_04() {
        initComponents();
        
        modelo = (DefaultTableModel) jTableDatos.getModel();
        jTableDatos.setShowGrid(true);
    }

    public void dibujar(Component c){
        
        Graphics e = c.getGraphics();
        
        e.setColor(Color.red);
        for (int i = 0; i < jTableDatos.getRowCount(); i++) {
        e.fillOval(Integer.parseInt(jTableDatos.getValueAt(i, 0)+""),
                   Integer.parseInt(jTableDatos.getValueAt(i, 1)+""), 
                   Integer.parseInt(jTableDatos.getValueAt(i, 2)+""), 
                   Integer.parseInt(jTableDatos.getValueAt(i, 3)+""));
    
        }
        for (int i = 0; i < jTableDatos.getRowCount(); i++) {
        e.setFont(new Font("Courier",Font.ITALIC,25));
        e.setColor(Color.WHITE);
        e.drawString(azar.nextInt(100)+"",Integer.parseInt(jTableDatos.getValueAt(i, 0)+"")+40,
                                          Integer.parseInt(jTableDatos.getValueAt(i, 1)+"")+70);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jButAleatorios = new javax.swing.JButton();
        jButDibujar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "X", "Y", "An", "Alt"
            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButDibujar.setText("Dibujar");
        jButDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDibujarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pa_17130761_proyecto_04/Asignacion.png"))); // NOI18N

        jLabel2.setText("Kevin Avila Ibañez");

        jLabel3.setText("17130761");

        jMenu1.setText("Archivo");

        jMenuItemNuevo.setText("Nuevo");
        jMenuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNuevo);

        jMenuItemGuardar.setText("Guardar");
        jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGuardar);

        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAbrir);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Color");

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButDibujar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButAleatorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButDibujar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(88, 88, 88))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        modelo.setRowCount((int)jSpinner1.getValue());
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
       
         for (int r=0; r<jTableDatos.getRowCount(); r++)
        {
            jTableDatos.setValueAt(200+azar.nextInt(300),r,0);
            jTableDatos.setValueAt(100+azar.nextInt(300),r,1);
            jTableDatos.setValueAt(50+azar.nextInt(200),r,2);
            jTableDatos.setValueAt(50+azar.nextInt(200),r,3);
        }
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDibujarActionPerformed
        
        Component c=this;
        dibujar(c);
    }//GEN-LAST:event_jButDibujarActionPerformed

    private void jMenuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoActionPerformed

        for (int i = 0; i < jTableDatos.getRowCount(); i++) {
            for (int j = 0; j < jTableDatos.getColumnCount(); j++) {
                jTableDatos.setValueAt("", i, j);
            }
        }
        jSpinner1.setValue(0);
        repaint();
        
    }//GEN-LAST:event_jMenuItemNuevoActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
        
        jfch.showSaveDialog(jMenu1);
        
        File archivo = jfch.getSelectedFile();
        
        if (archivo == null) // el usuario presionó Cancelar
            return;
        
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try
        {
            fos = new FileOutputStream(archivo);
            dos = new DataOutputStream(fos);
            
            // grabamos el número de alumnos
            dos.writeInt(jTableDatos.getRowCount());
            
            // grabamos los datos de cada alumno
            for (int r=0; r<modelo.getRowCount(); r++)
            {
                dos.writeUTF(modelo.getValueAt(r, 0)+"");
                
                for (int c=0; c<modelo.getColumnCount(); c++)
                    dos.writeInt(Integer.parseInt(modelo.getValueAt(r, c)+""));
            }
            
            JOptionPane.showMessageDialog(this, "Archivo binario grabado");
        }
        catch (IOException ex)
        {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                if (dos!=null)
                    dos.close();
                if (fos!=null)
                    fos.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        jfch.showOpenDialog(jMenu1);
        
        File archivo = jfch.getSelectedFile();
        
        if (archivo == null)
            return;

        FileInputStream fis = null;
        DataInputStream dis = null;

        try
        {
            fis = new FileInputStream(archivo);
            dis = new DataInputStream(fis);
            
            int n = dis.readInt();
            
            jSpinner1.setValue(n);
            
            for (int r=0; r<n; r++)
            {
                modelo.setValueAt(dis.readUTF(), r, 0);
                
                for (int c=0; c<modelo.getColumnCount(); c++)
                    modelo.setValueAt(dis.readInt(), r, c);
            }
            
            jButDibujar.doClick();
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex)
        {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                if (dis!=null)
                    dis.close();

                if (fis!=null)
                    fis.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(PA_17130761_Frame_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PA_17130761_Frame_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PA_17130761_Frame_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PA_17130761_Frame_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PA_17130761_Frame_04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButDibujar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}