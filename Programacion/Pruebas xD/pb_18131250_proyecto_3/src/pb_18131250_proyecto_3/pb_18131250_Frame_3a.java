package pb_18131250_proyecto_3;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Valentin_PC
 */
public class pb_18131250_Frame_3a extends javax.swing.JFrame {

    /**
     * Creates new form pb_18131250_Frame_3a
     */
    
    //Atributos que tiene el frame
    DefaultTableModel modelo;
    private int bandasReg;
    GrupoMusical[] bandas = new GrupoMusical[4];
    GrupoMusical [] dibujos = new GrupoMusical[bandas.length];
    Nacional bandaNa;
    Internacional bandaIn;
    
    public pb_18131250_Frame_3a() {
        initComponents();
        bandasReg = 4;
        modelo=(DefaultTableModel)jTabRegistro.getModel();
        jTabRegistro.setShowGrid(true);
        sRen.setValue(1);
        
    }
    //Arreglo para poder ordenar la info de la tabla
    public int getTamano(){
        return(bandas.length);
    }
    
    public int getRegistroBandas(){
        return bandasReg;    
    }
    
    public boolean agregarGrupoMusical(GrupoMusical grupo){
        
        if(bandasReg == bandas.length)
            return false;
        
        bandas[bandasReg] = grupo;
        bandasReg++; //Incrementa el contador

        return true;
        
    }
    
       public void setGrupoMusical(GrupoMusical grupo, int posicion){
        if(posicion >=0 && posicion < bandas.length)
            bandas[posicion] = grupo;
    } 
       
       public GrupoMusical getBanda(int posicion)
    {
        if(posicion >=0 && posicion < bandas.length)
            return(bandas[posicion]);
        
        else
            return (null);
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCool = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabRegistro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextGenero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextIntegrantes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButGrabar = new javax.swing.JButton();
        jButEjemplo = new javax.swing.JButton();
        jButGuardar = new javax.swing.JButton();
        jButDiagrama = new javax.swing.JButton();
        jButDesfile = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sRen = new javax.swing.JSpinner();
        jButMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCool.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelCoolLayout = new javax.swing.GroupLayout(jPanelCool);
        jPanelCool.setLayout(jPanelCoolLayout);
        jPanelCoolLayout.setHorizontalGroup(
            jPanelCoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        jPanelCoolLayout.setVerticalGroup(
            jPanelCoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "BANDAS", "GENEROS", "INTEGRANTES"
            }
        ));
        jScrollPane1.setViewportView(jTabRegistro);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pb_18131250_proyecto_3/asignacion.png"))); // NOI18N
        jLabel1.setOpaque(true);

        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");

        jTextGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Genero");

        jTextIntegrantes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Integrante");

        jButGrabar.setText("Grabar");
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });

        jButEjemplo.setText("Ejemplo");
        jButEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEjemploActionPerformed(evt);
            }
        });

        jButGuardar.setText("Modificar");
        jButGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGuardarActionPerformed(evt);
            }
        });

        jButDiagrama.setText("Diagrama");
        jButDiagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDiagramaActionPerformed(evt);
            }
        });

        jButDesfile.setText("Desfile");
        jButDesfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDesfileActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Renglon");

        jButMostrar.setText("Mostrar");
        jButMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextIntegrantes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sRen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButEjemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButDesfile, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButDiagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jPanelCool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sRen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButEjemplo)
                        .addComponent(jButGuardar)
                        .addComponent(jButDesfile)
                        .addComponent(jButDiagrama))
                    .addComponent(jButGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEjemploActionPerformed
        // TODO add your handling code here:
        
         modelo.setValueAt("sabino", 0, 0);
        modelo.setValueAt("SABHOP", 0, 1);
        modelo.setValueAt(1, 0, 2);
        
        modelo.setValueAt("aerosmith", 1, 0);
        modelo.setValueAt("ROCK", 1, 1);
        modelo.setValueAt(5, 1, 2);
        
        modelo.setValueAt("the wookies", 2, 0);
        modelo.setValueAt("TECNO", 2, 1);
        modelo.setValueAt(2, 2, 2);

        modelo.setValueAt("my chemical romance", 3, 0);
        modelo.setValueAt("PUNK", 3, 1);
        modelo.setValueAt(5, 3, 2);
        
    }//GEN-LAST:event_jButEjemploActionPerformed

    private void jButGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGuardarActionPerformed
        // TODO add your handling code here:
        
        int renglon = (int)sRen.getValue(); //Lo utilizamos para pode modificar los renglones 
        String banda = jTextNombre.getText();
        String genero = jTextGenero.getText();
        int integrantes = Integer.parseInt(jTextIntegrantes.getText()+"");
        
        
        modelo.setValueAt(banda, renglon-1, 0);
        modelo.setValueAt(genero, renglon-1, 1);
        modelo.setValueAt(integrantes, renglon-1, 2);
        
    }//GEN-LAST:event_jButGuardarActionPerformed

    private void jButDiagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDiagramaActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        pb_18131250_Frame_3c jDiag = new pb_18131250_Frame_3c(this);
        jDiag.setVisible(true);
        
    }//GEN-LAST:event_jButDiagramaActionPerformed

    private void jButDesfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDesfileActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        pb_18131250_Frame_3b jDes  = new pb_18131250_Frame_3b(this);
        jDes.setVisible(true);
        
    }//GEN-LAST:event_jButDesfileActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        // TODO add your handling code here:
        
        BandaNacional1 grupoa = new BandaNacional1( 
                        (String)modelo.getValueAt(0, 0),
                        (String)modelo.getValueAt(0, 1),
                        (int)modelo.getValueAt(0, 2),
                        "Gadalajara.", 2);
            
                BandaInternacional1 grupob = new BandaInternacional1( 
                        (String)modelo.getValueAt(1, 0),
                        (String)modelo.getValueAt(1, 1),
                        (int)modelo.getValueAt(1, 2),
                        "Boston EU.", 15);
                                   
                BandaNacional2 grupoc = new BandaNacional2( 
                        (String)modelo.getValueAt(2, 0),
                        (String)modelo.getValueAt(2, 1),
                        (int)modelo.getValueAt(2, 2),
                        "Ciudad de Mexico", 1);
                                   
                BandaInternacional2 grupod = new BandaInternacional2( 
                        (String)modelo.getValueAt(3, 0),
                        (String)modelo.getValueAt(3, 1),
                        (int)modelo.getValueAt(3, 2),
                        "NewJersey EU.", 4);
                
bandas[0] = grupoa;
bandas[1] = grupob;
bandas[2] = grupoc;
bandas[3] = grupod;

dibujos[0] = grupoa;
dibujos[1] = grupob;
dibujos[2] = grupoc;
dibujos[3] = grupod;

//Ordenamiento para dibujar ordenadamente
for(int  i = 0; i <bandas.length; i++){
    for(int j = i+1; j<bandas.length; j++){
        if(bandas[i].getIntegrantes() < bandas[j].getIntegrantes()){
            
            GrupoMusical aux = bandas[i];
            bandas[i] = bandas[j];
            bandas[j] = aux;
            
            GrupoMusical auxD = dibujos[i];
            dibujos[i] = dibujos[j];
            dibujos[j] = aux;
            
        }
        
    }
}
        
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jButMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMostrarActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < 1; i++){
            for(int j = 0; j<bandas.length; j++){
                
                dibujos[j].mover(jPanelCool, bandas);
                
                try {
                Thread.sleep(90);
                } catch (InterruptedException ex) {
                Logger.getLogger(pb_18131250_Frame_3a.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
    }//GEN-LAST:event_jButMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(pb_18131250_Frame_3a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pb_18131250_Frame_3a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pb_18131250_Frame_3a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pb_18131250_Frame_3a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pb_18131250_Frame_3a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDesfile;
    private javax.swing.JButton jButDiagrama;
    private javax.swing.JButton jButEjemplo;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JButton jButGuardar;
    private javax.swing.JButton jButMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelCool;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabRegistro;
    private javax.swing.JTextField jTextGenero;
    private javax.swing.JTextField jTextIntegrantes;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JSpinner sRen;
    // End of variables declaration//GEN-END:variables
}
