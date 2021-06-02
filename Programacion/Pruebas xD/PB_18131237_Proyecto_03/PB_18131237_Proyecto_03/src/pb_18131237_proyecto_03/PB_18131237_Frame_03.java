/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131237_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lDestroyerl
 */
public class PB_18131237_Frame_03 extends javax.swing.JFrame {

    /**
     * Creates new form PB_18131237_Frame_03
     */
    
    private DefaultTableModel modelo;  //Aqui se declara la referencia a la Tabla 
    private GrupoMusical [] datos = new GrupoMusical[4];
    private IMostrar [] dibujos = new IMostrar [datos.length];
    private String [] lugar = new String[4];
    private int [] numAlbum = new int[4];
     
    private Zoe zoe = new Zoe ();
    private BandaMs banda = new BandaMs();
    private FooFighter foo = new FooFighter();
    private Nirvana nir = new Nirvana();
   
    private int gruposRegistrados;
    
    
    public PB_18131237_Frame_03() {
        initComponents();
        
        modelo = (DefaultTableModel)jTableDatos.getModel();
        jTableDatos.setShowGrid(true);
        
        gruposRegistrados = 0;
        
        jPanelMenuDibujo.setBackground(Color.gray);
        jPanelEncabezados.setBackground(Color.gray);
    }
    
    public int getTamaño()
    {
        return(datos.length); //Para obtener el tamaño del arreglo
    }      
    
    public int getGruposRegistrados()
    {
        return gruposRegistrados;
    }        
    
    public boolean agregarGrupoMusical(GrupoMusical gpo)
    {
        if(gruposRegistrados == datos.length)
            return false;
        
        datos[gruposRegistrados] = gpo;
        gruposRegistrados++;
        
        return true;
    }        
    
    //porque el arreglo  es privado, por eso declaramos metodos para poder modificar su información
    public void setGrupoMusical(GrupoMusical gpo, int posicion)
    {
        if(posicion >=0 && posicion < datos.length)
            datos[posicion] = gpo;
    }   
    
    public GrupoMusical getGrupoMusical(int posicion)
    {
        if(posicion >=0 && posicion < datos.length)
            return(datos[posicion]);
        
        else
            return (null);
    }  
    
    public void setDibujos(IMostrar dib, int x)
    {
        dibujos[x] = dib;
    }
    
    public IMostrar getDibujos(int x)
    {
        return dibujos[x];
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
        jTableDatos = new javax.swing.JTable();
        jButEjemplo = new javax.swing.JButton();
        jButGrabar = new javax.swing.JButton();
        jButMostrar = new javax.swing.JButton();
        jButDesfilar = new javax.swing.JButton();
        jButDiagrama = new javax.swing.JButton();
        jPanelMenuInformacion = new javax.swing.JPanel();
        jPanelMenuDibujo = new javax.swing.JPanel();
        jPanelEncabezados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GRUPOS MUSICALES");
        setFocusCycleRoot(false);

        jTableDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del Grupo", "Genero", "# Integrantes"
            }
        ));
        jScrollPane1.setViewportView(jTableDatos);
        if (jTableDatos.getColumnModel().getColumnCount() > 0) {
            jTableDatos.getColumnModel().getColumn(0).setMinWidth(140);
            jTableDatos.getColumnModel().getColumn(0).setPreferredWidth(140);
            jTableDatos.getColumnModel().getColumn(0).setMaxWidth(145);
            jTableDatos.getColumnModel().getColumn(1).setMinWidth(140);
            jTableDatos.getColumnModel().getColumn(1).setPreferredWidth(140);
            jTableDatos.getColumnModel().getColumn(1).setMaxWidth(145);
            jTableDatos.getColumnModel().getColumn(2).setMinWidth(80);
            jTableDatos.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTableDatos.getColumnModel().getColumn(2).setMaxWidth(85);
        }

        jButEjemplo.setBackground(new java.awt.Color(102, 102, 255));
        jButEjemplo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButEjemplo.setText("EJEMPLO");
        jButEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEjemploActionPerformed(evt);
            }
        });

        jButGrabar.setBackground(new java.awt.Color(102, 102, 255));
        jButGrabar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButGrabar.setText("GRABAR");
        jButGrabar.setMaximumSize(new java.awt.Dimension(87, 23));
        jButGrabar.setMinimumSize(new java.awt.Dimension(87, 23));
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });

        jButMostrar.setBackground(new java.awt.Color(255, 153, 51));
        jButMostrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButMostrar.setText("MOSTRAR");
        jButMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMostrarActionPerformed(evt);
            }
        });

        jButDesfilar.setBackground(new java.awt.Color(255, 153, 51));
        jButDesfilar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButDesfilar.setText("DESFILAR");
        jButDesfilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDesfilarActionPerformed(evt);
            }
        });

        jButDiagrama.setBackground(new java.awt.Color(255, 153, 51));
        jButDiagrama.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButDiagrama.setText("DIAGRAMA");
        jButDiagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDiagramaActionPerformed(evt);
            }
        });

        jPanelMenuInformacion.setBackground(new java.awt.Color(153, 153, 153));

        jPanelMenuDibujo.setBackground(new java.awt.Color(153, 153, 153));

        jPanelEncabezados.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE DEL GRUPO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("GÉNERO DEL GRUPO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("NUMERO DE INTEGRANTES:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("LUGAR DE ORIGEN:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("NUMERO DE ALBUMES:");

        javax.swing.GroupLayout jPanelEncabezadosLayout = new javax.swing.GroupLayout(jPanelEncabezados);
        jPanelEncabezados.setLayout(jPanelEncabezadosLayout);
        jPanelEncabezadosLayout.setHorizontalGroup(
            jPanelEncabezadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEncabezadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEncabezadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(505, 505, 505))
        );
        jPanelEncabezadosLayout.setVerticalGroup(
            jPanelEncabezadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadosLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addComponent(jLabel7))
        );

        javax.swing.GroupLayout jPanelMenuDibujoLayout = new javax.swing.GroupLayout(jPanelMenuDibujo);
        jPanelMenuDibujo.setLayout(jPanelMenuDibujoLayout);
        jPanelMenuDibujoLayout.setHorizontalGroup(
            jPanelMenuDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuDibujoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEncabezados, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanelMenuDibujoLayout.setVerticalGroup(
            jPanelMenuDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuDibujoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelEncabezados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelMenuInformacionLayout = new javax.swing.GroupLayout(jPanelMenuInformacion);
        jPanelMenuInformacion.setLayout(jPanelMenuInformacionLayout);
        jPanelMenuInformacionLayout.setHorizontalGroup(
            jPanelMenuInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenuDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuInformacionLayout.setVerticalGroup(
            jPanelMenuInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenuDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pb_18131237_proyecto_03/Datos Alumno 3.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pb_18131237_proyecto_03/Asignacion - Proyecto 03.png"))); // NOI18N

        jButSalir.setBackground(new java.awt.Color(255, 51, 51));
        jButSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButSalir.setText("SALIR");
        jButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenuInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButMostrar)
                                .addGap(46, 46, 46)
                                .addComponent(jButDesfilar)
                                .addGap(40, 40, 40)
                                .addComponent(jButDiagrama)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButSalir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButEjemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButGrabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(207, 207, 207)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButEjemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButDiagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButDesfilar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(jPanelMenuInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEjemploActionPerformed
      
        //Datos de la banda: Zoe 
        jTableDatos.setValueAt("Zoe", 0, 0);          //Nombre del Grupo
        jTableDatos.setValueAt("Pop Rock", 0, 1);     //Género Musical
        jTableDatos.setValueAt(5, 0, 2);              //Numero de Integrantes
        
        //Datos de la banda: Banda Ms
        jTableDatos.setValueAt("Banda MS", 1, 0);     //Nombre del Grupo
        jTableDatos.setValueAt("Banda", 1, 1);        //Género Musical
        jTableDatos.setValueAt(16, 1, 2);             //Numero de Integrantes
        
        //Datos de la banda: Foo Fighters
        jTableDatos.setValueAt("Foo Fighters", 2, 0); //Nombre del Grupo
        jTableDatos.setValueAt("Rock", 2, 1);         //Género Musical
        jTableDatos.setValueAt(4, 2, 2);              //Numero de Integrantes
        
        //Datos de la banda: Nirvana
        jTableDatos.setValueAt("Nirvana", 3, 0);      //Nombre del Grupo
        jTableDatos.setValueAt("Grunge", 3, 1);       //Género Musical
        jTableDatos.setValueAt(3, 3, 2);              //Numero de Integrantes
    }//GEN-LAST:event_jButEjemploActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        
        Zoe gpo1 = new Zoe(jTableDatos.getValueAt(0, 0)+"",
                           jTableDatos.getValueAt(0,1)+"",
                           Integer.parseInt(jTableDatos.getValueAt(0, 2)+""),
                           "",
                           0);
        
        BandaMs gpo2 = new BandaMs(jTableDatos.getValueAt(1, 0)+"",
                                   jTableDatos.getValueAt(1,1)+"",
                                   Integer.parseInt(jTableDatos.getValueAt(1, 2)+""),
                                   "",
                                   0);
        
        FooFighter gpo3 = new FooFighter(jTableDatos.getValueAt(2, 0)+"",
                                           jTableDatos.getValueAt(2,1)+"",
                                           Integer.parseInt(jTableDatos.getValueAt(2, 2)+""),
                                           "",
                                           0);
        
        Nirvana gpo4 = new Nirvana(jTableDatos.getValueAt(3, 0)+"",
                                   jTableDatos.getValueAt(3,1)+"",
                                   Integer.parseInt(jTableDatos.getValueAt(3, 2)+""),
                                   "",
                                   0);
        
        
        agregarGrupoMusical(gpo1);
        agregarGrupoMusical(gpo2);
        agregarGrupoMusical(gpo3);
        agregarGrupoMusical(gpo4);
        
        datos[0] = gpo1;
        datos[1] = gpo2;
        datos[2] = gpo3;
        datos[3] = gpo4;
        
        dibujos[0] = gpo1;
        dibujos[1] = gpo2;
        dibujos[2] = gpo3;
        dibujos[3] = gpo4;
        
        zoe.setEstado("Cuernavaca, MX");
        banda.setEstado("Sinaloa, MX");
        foo.setPais("Seattle, EEUU");
        nir.setPais("Aberdeen, EEUU");
        
        zoe.setNumAlbumes(5);
        banda.setNumAlbumes(4);
        foo.setNumAlbumes(9);
        nir.setNumAlbumes(3);
        
        lugar[0] = zoe.getEstado();
        lugar[1] = banda.getEstado();
        lugar[2] = foo.getPais();
        lugar[3] = nir.getPais();
        
        numAlbum[0] = zoe.getNumAlbumes();
        numAlbum[1] = banda.getNumAlbumes();
        numAlbum[2] = foo.getNumAlbumes();
        numAlbum[3] = nir.getNumAlbumes();
        
        for(int i=0; i<datos.length; i++)
        {    
            for(int j = i+1; j<datos.length; j++)
                if(datos[i].getNumIntegrantes() < datos[j].getNumIntegrantes())
                {
                    GrupoMusical aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] =  aux;
                    
                    String auxs = lugar[i];
                    lugar[i] = lugar[j];
                    lugar[j] = auxs;
                    
                    int auxi = numAlbum[i];
                    numAlbum[i] = numAlbum[j];
                    numAlbum[j] = auxi;
                    
                    IMostrar auxd = dibujos[i];
                    dibujos[i] =dibujos[j];
                    dibujos[j] = auxd;
                }
        }
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButSalirActionPerformed

    private void jButMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMostrarActionPerformed
        // TODO add your handling code here:
        
        for(int i=0; i<5; i++)
        {  
            for(int j=0; j<datos.length; j++)
            {      
                Component compDibujos;
                compDibujos = jPanelMenuDibujo;
                
                dibujos[j].dibujar(compDibujos,datos,lugar,numAlbum);
                
                try {
                Thread.sleep(1200);
                } catch (InterruptedException ex) {
                Logger.getLogger(PB_18131237_Frame_03.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }//GEN-LAST:event_jButMostrarActionPerformed

    private void jButDesfilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDesfilarActionPerformed
        // TODO add your handling code here:
        setVisible(false); //"Cierra" el Frame Principal
        
        PB_18131237_Frame_03a jFrameDesfile = new PB_18131237_Frame_03a(this);
        jFrameDesfile.setVisible(true); //Muestra el FrameDesfile
    }//GEN-LAST:event_jButDesfilarActionPerformed

    private void jButDiagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDiagramaActionPerformed
        setVisible(false); //"Cierra" el Frame Principal
        
        PB_18131237_Frame_03b jFrameDiagrama = new PB_18131237_Frame_03b(this);
        jFrameDiagrama.setVisible(true); //Muestra el FrameDiagrama
    }//GEN-LAST:event_jButDiagramaActionPerformed

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
            java.util.logging.Logger.getLogger(PB_18131237_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PB_18131237_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PB_18131237_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PB_18131237_Frame_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PB_18131237_Frame_03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDesfilar;
    private javax.swing.JButton jButDiagrama;
    private javax.swing.JButton jButEjemplo;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JButton jButMostrar;
    private javax.swing.JButton jButSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelEncabezados;
    private javax.swing.JPanel jPanelMenuDibujo;
    private javax.swing.JPanel jPanelMenuInformacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
