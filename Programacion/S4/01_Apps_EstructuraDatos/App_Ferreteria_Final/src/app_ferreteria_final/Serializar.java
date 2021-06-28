/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_ferreteria_final;

import Clases.ArchivosBinarios;
import Clases.Hash;
import Clases.ProductoSerial;
import Utilerias.JTable.ColorCeldas;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahdeijack
 */
public class Serializar extends javax.swing.JFrame {

    /**
     * Creates new form Serealizar
     * 
     */
    Random R;
    String tipo [] ={"Consola","Videojuego","Control","Audifonos","Suscripcion"}; 
    String marca[] = {"Sony","Nintendo","Ubisoft","Sega","Microsoft"};
    //Cantidad
    //Precio
    DecimalFormat df = new DecimalFormat("####.##");
    DefaultTableModel modelo;
    ColorCeldas celdas;
    public Serializar(jFrameMenu jfm) {
        initComponents();
        R = new Random();
        modelo =  (DefaultTableModel) jTable1.getModel();
        celdas = new ColorCeldas(jTable1);
        ocultar();
    }

        @Override
    public Image getIconImage() {
         Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("IMG/ahedegame.jpg"));
        return retValue;
}
    public void rellenar(){
    int IdH = (R.nextInt(8999)+1000);
    String tipoH = tipo[R.nextInt(tipo.length)];
    String marcaH = marca[R.nextInt(marca.length)];
    int cantidad = R.nextInt(100)+10;
    Double precio = R.nextInt(1000)+R.nextDouble();
   
    
    
    J1.setText(IdH+"");
    J2.setText(tipoH);
    J3.setText(marcaH);
    J4.setText(cantidad+"");
    J5.setText(df.format(precio)+"");
    }
    public void guardar(int sel){
                //Guardamos los elementos de la tabla
        
         if (modelo.getRowCount() == 0) {
         JOptionPane.showMessageDialog(this, "Necesitas agregar elementos.");
                } else{
          ProductoSerial prod[] = new ProductoSerial[modelo.getRowCount()];
          for (int i = 0; i < modelo.getRowCount(); i++) {      
          prod[i] = new ProductoSerial(Integer.parseInt(modelo.getValueAt(i, 0)+""),
                                                    (String)modelo.getValueAt(i, 1),
                                                    (String)modelo.getValueAt(i, 2),
                                                    Integer.parseInt(modelo.getValueAt(i, 3)+""),
                                                    Double.parseDouble(modelo.getValueAt(i, 4)+""));
          }
        
        
        //Ordenamos
             if (sel == 0) {
                ArchivosBinarios.ordQS_A_ID(prod, 0, prod.length-1);
             } else if (sel == 1){
                 ArchivosBinarios.ord_QS_Dsc_Asc(prod, 0, prod.length-1);
             } else if (sel == 2) {
                 JOptionPane.showMessageDialog(null, "La informacipón se guardo.");
             } else if (sel == 3) {
                 ArchivosBinarios.ordQS_A_Desc(prod);
             }

        
        for (int i = 0; i < prod.length; i++) {
            modelo.setValueAt(prod[i].getId(), i, 0);
            modelo.setValueAt(prod[i].getTipo(), i, 1);
            modelo.setValueAt(prod[i].getMarca(), i, 2);
            modelo.setValueAt(prod[i].getCantidad(), i, 3);
            modelo.setValueAt(prod[i].getPrecio(), i, 4);
        }
        }
    }
    public boolean idIgual(int id){
       
        boolean igual = true;
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (id == Integer.parseInt(modelo.getValueAt(i, 0)+"")) {
                igual = true;
            } else{
                igual = false;
            }
        }
        
       return igual;
        
    }
    public void ocultar(){
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        
        J1.setVisible(false);
        J2.setVisible(false);
        J3.setVisible(false);
        J4.setVisible(false);
        J5.setVisible(false);
        
        jButAdd.setVisible(false);
        jButRelleno.setVisible(false);
        jButDel.setVisible(false);
        jButOrdId.setVisible(false);
        jButOrdDesc.setVisible(false);
    }
    public void mostrar(){
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        
        J1.setVisible(true);
        J2.setVisible(true);
        J3.setVisible(true);
        J4.setVisible(true);
        J5.setVisible(true);
        
        jButAdd.setVisible(true);
        jButRelleno.setVisible(true);
        jButDel.setVisible(true);
        jButOrdId.setVisible(true);
        jButOrdDesc.setVisible(true);
    }
    public void mostrarDatos(int pos, int clave){
        String  tipo = (String) modelo.getValueAt(pos, 1);
        ImageIcon image = new ImageIcon("img_prod/noimg.png");

   switch(tipo){
//Consola 
             case "Consola":
             image = new ImageIcon(ClassLoader.getSystemResource("img_prod/Consola.png"));
            break;

       //Tuvos
             case "Videojuego":
             image = new ImageIcon(ClassLoader.getSystemResource("img_prod/Videojuego.png"));
            break;

       case "Control":
           image = new ImageIcon(ClassLoader.getSystemResource("img_prod/Control.png"));
           break;
      case "Audifonos":
           image = new ImageIcon(ClassLoader.getSystemResource("img_prod/Audifonos.png"));
           break;
      case "Suscripcion":
           image = new ImageIcon(ClassLoader.getSystemResource("img_prod/Suscripcion.png"));
           break;
        }
   
        ProductoSerial mostrar = new ProductoSerial(Integer.parseInt(modelo.getValueAt(pos, 0)+""),
                                                                                            modelo.getValueAt(pos, 1)+"",
                                                                                            modelo.getValueAt(pos, 2)+"",
                                                                                            Integer.parseInt(modelo.getValueAt(pos, 3)+""),
                                                                                            Double.parseDouble(modelo.getValueAt(pos, 4)+""));
        
        JOptionPane.showMessageDialog(this,
                "El producto "+mostrar.getTipo()+", con ID "+clave+", esta en la posición: "+(pos+1)+" de la lista.\n."+mostrar.toString(),
                "Localizar producto.",
                JOptionPane.INFORMATION_MESSAGE, 
                image);
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            celdas.addCelda(pos, i, Color.RED);
        }
        celdas.repaint();

    }
    public void sumaTotal(){
        double sum = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            sum = sum+Double.parseDouble(modelo.getValueAt(i, 4)+"");
        }
        
        jLabTotal.setText("$"+df.format(sum));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        J1 = new javax.swing.JTextField();
        J2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        J3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        J4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        J5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButRelleno = new javax.swing.JButton();
        jButDel = new javax.swing.JButton();
        jButOrdId = new javax.swing.JButton();
        jButOrdDesc = new javax.swing.JButton();
        jLabTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bg.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Inventarios. (Serializado)");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Marca", "Cantidad", "Precio"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 66, 670, 240));

        jButAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_new_copy_16px.png"))); // NOI18N
        jButAdd.setToolTipText("Agregar");
        jButAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 30, -1));

        jLabel6.setFont(new java.awt.Font("Permanent Marker", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ahedegames");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 750, 41));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        J1.setBackground(new java.awt.Color(255, 51, 51));
        J1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        J1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        J1.setOpaque(false);
        J1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                J1KeyTyped(evt);
            }
        });
        getContentPane().add(J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        J2.setBackground(new java.awt.Color(255, 51, 51));
        J2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        J2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        J2.setOpaque(false);
        getContentPane().add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 20));

        J3.setBackground(new java.awt.Color(255, 51, 51));
        J3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        J3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        J3.setOpaque(false);
        getContentPane().add(J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Marca");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 20));

        J4.setBackground(new java.awt.Color(255, 51, 51));
        J4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        J4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        J4.setOpaque(false);
        J4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                J4KeyTyped(evt);
            }
        });
        getContentPane().add(J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cantidad");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, 20));

        J5.setBackground(new java.awt.Color(255, 51, 51));
        J5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        J5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        J5.setOpaque(false);
        J5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                J5KeyTyped(evt);
            }
        });
        getContentPane().add(J5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 20));

        jButRelleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_reboot_16px.png"))); // NOI18N
        jButRelleno.setToolTipText("Rellenar");
        jButRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRellenoActionPerformed(evt);
            }
        });
        getContentPane().add(jButRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 30, -1));

        jButDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_delete_16px.png"))); // NOI18N
        jButDel.setToolTipText("Eliminar por ID");
        jButDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelActionPerformed(evt);
            }
        });
        getContentPane().add(jButDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 30, -1));

        jButOrdId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_touch_id_16px.png"))); // NOI18N
        jButOrdId.setToolTipText("Ordenar por ID");
        jButOrdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOrdIdActionPerformed(evt);
            }
        });
        getContentPane().add(jButOrdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 30, -1));

        jButOrdDesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_add_tag_16px.png"))); // NOI18N
        jButOrdDesc.setToolTipText("Ordenar por Tipo");
        jButOrdDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOrdDescActionPerformed(evt);
            }
        });
        getContentPane().add(jButOrdDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 30, -1));

        jLabTotal.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        getContentPane().add(jLabTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 130, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 370));

        jLabel9.setBackground(new java.awt.Color(255, 0, 51));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 670, 370));

        jMenu1.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_opened_folder_16px.png"))); // NOI18N
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_save_16px.png"))); // NOI18N
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_new_copy_16px.png"))); // NOI18N
        jMenuItem3.setText("Nuevo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_add_tag_16px.png"))); // NOI18N
        jMenuItem4.setText("Agregar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_edit_file_16px.png"))); // NOI18N
        jMenuItem5.setText("Modificar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_final/icons8_search_16px_1.png"))); // NOI18N
        jMenuItem6.setText("Buscar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
      ProductoSerial [] prod = new ProductoSerial[modelo.getRowCount()];
        for (int i = 0; i < modelo.getRowCount(); i++) {
            
           prod[i] = new ProductoSerial(Integer.parseInt(modelo.getValueAt(i, 0)+""),
                                                    (String)modelo.getValueAt(i, 1),
                                                    (String)modelo.getValueAt(i, 2),
                                                    Integer.parseInt(modelo.getValueAt(i, 3)+""),
                                                    Double.parseDouble(modelo.getValueAt(i, 4)+""));
            
        }
        
        try {
            
            String nombre = JOptionPane.showInputDialog("Ingresa el nombre del archivo a guardar.");
            ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ahdeijack\\Desktop\\"+nombre+".dat"));
            write.writeObject(prod);
            write.close();
            JOptionPane.showMessageDialog(this, "El archivo se ha guardado! ");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }
        sumaTotal();
        

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRellenoActionPerformed
        // TODO add your handling code here:
        rellenar();
    }//GEN-LAST:event_jButRellenoActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
         ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("img_final/icons8_cute_skull_24px.png"));
                 JOptionPane.showMessageDialog(this,
                "El archivo se guardara por defecto en el escritorio\nLa contraseña para mostrar los componentes es  'admn', se cuidadoso ",
                "Información adicional.",
                JOptionPane.INFORMATION_MESSAGE, 
                image);
                 
                 image = new ImageIcon(ClassLoader.getSystemResource("IMG/logo_min.png"));
                  JOptionPane.showMessageDialog(this,
                "Este programa fue creado como proyecto final de Estructura de Datos por Carlos A. Vázquez Aguirre.\nInstituto Tecnologico de la Laguna. 2020. ",
                "Información adicional.",
                JOptionPane.INFORMATION_MESSAGE, 
                image);
                 
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
       
            String nombre = JOptionPane.showInputDialog("Ingresa el nombre del archivo para abrir.");
            try {
            ObjectInputStream read = new ObjectInputStream(new FileInputStream("C:\\Users\\ahdeijack\\Desktop\\"+nombre+".dat"));
            ProductoSerial[] prod = (ProductoSerial[]) read.readObject();
            read.close();
            jButDel.setVisible(true);
            modelo.setRowCount(prod.length);
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    modelo.setValueAt(prod[i].getId(), i, 0);
                    modelo.setValueAt(prod[i].getTipo(), i, 1);
                    modelo.setValueAt(prod[i].getMarca(), i, 2);
                    modelo.setValueAt(prod[i].getCantidad(), i, 3);
                    modelo.setValueAt(prod[i].getPrecio(), i, 4);
                }
            
            
            
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "El archivo no existe.");
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }
            
sumaTotal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        modelo.setRowCount(0);
        for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celdas.addCelda(i, j, Color.white);
            }
        }
       celdas.repaint();
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButOrdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOrdIdActionPerformed
        // TODO add your handling code here:
        //Guardar 0 es para guardar por id
        guardar(0);
    }//GEN-LAST:event_jButOrdIdActionPerformed

    private void jButOrdDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOrdDescActionPerformed
        // TODO add your handling code here:
        //Guardar 1 es para guardar por descripción
        //El 3 es para ordenar usando compareTo
        guardar(3);
    }//GEN-LAST:event_jButOrdDescActionPerformed

    private void jButDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelActionPerformed
        // TODO add your handling code here:
        String clave = "";
        clave = JOptionPane.showInputDialog("Ingresa la clave a eliminar");
        if (clave.equals("") || Integer.parseInt(clave+"")<999 || Integer.parseInt(clave+"")>9999 || clave.equals(null)) {
            JOptionPane.showMessageDialog(null, "El ID es incorrecto.");
        } else {
        int del2;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            del2 = Integer.parseInt(modelo.getValueAt(i, 0)+"");
            if (del2 == Integer.parseInt(clave)) {
            modelo.removeRow(i);
            JOptionPane.showMessageDialog(null, "El producto con clave |"+clave+"|, se elimino, se encontro en la fila "+(i+1));
            } 
            }
        }
    }//GEN-LAST:event_jButDelActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        String clave = JOptionPane.showInputDialog(this, "Ingresa la clave para poder agregar registros.");
        if ("admn".equals(clave)) {
        ocultar();
        String id = JOptionPane.showInputDialog("Ingrese el id a Modificar.");
              
        ProductoSerial [] prod = new ProductoSerial[modelo.getRowCount()];
        for (int i = 0; i < modelo.getRowCount(); i++) {
            
           prod[i] = new ProductoSerial(Integer.parseInt(modelo.getValueAt(i, 0)+""),
                                                    (String)modelo.getValueAt(i, 1),
                                                    (String)modelo.getValueAt(i, 2),
                                                    Integer.parseInt(modelo.getValueAt(i, 3)+""),
                                                    Double.parseDouble(modelo.getValueAt(i, 4)+""));
            
        }
       
        String idM = "", tipoM = "", marcaM = "", cantidadM = "", precioM = "";
        
        for (int i = 0; i < prod.length; i++) {
            if (Integer.parseInt(id+"")==prod[i].getId()) {
                JOptionPane.showMessageDialog(this, "Si se encontro el producto.");
                
                do{ 
                 idM = JOptionPane.showInputDialog("Ingresa el ID para cambiar "+id);
                } while(idM == "");
                do{
                 tipoM =JOptionPane.showInputDialog("Ingresa el tipo de producto.");
                } while(tipoM == "");
                do{
                marcaM = JOptionPane.showInputDialog("Ingresa la marca para cambiar.");
                } while(marcaM == "");
                do{
                 cantidadM = JOptionPane.showInputDialog("Ingresa la cantidad para cambiar.");
                } while(cantidadM == "");
                do{
                 precioM = JOptionPane.showInputDialog("Ingresa el precio a cambiar.");
                } while(precioM == "");  
             
                prod[i].setId(Integer.parseInt(idM+""));
                prod[i].setTipo(tipoM);
                prod[i].setMarca(marcaM);
                prod[i].setCantidad(Integer.parseInt(cantidadM));
                prod[i].setPrecio(Double.parseDouble(precioM));
                
                JOptionPane.showMessageDialog(this, "El producto con id "+id+", fue modificado.");
                JOptionPane.showMessageDialog(this,prod[i].toString());
            } else {
 
            }
        }

        for (int i = 0; i < prod.length; i++) {
            modelo.setValueAt(prod[i].getId(), i, 0);
            modelo.setValueAt(prod[i].getTipo(), i, 1);
            modelo.setValueAt(prod[i].getMarca(), i, 2);
            modelo.setValueAt(prod[i].getCantidad(), i, 3);
            modelo.setValueAt(prod[i].getPrecio(), i, 4);
        }
        
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña es incorrecta");
        }
        sumaTotal();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        String clave = JOptionPane.showInputDialog(this, "Ingresa la clave para poder agregar registros.");
        if ("admn".equals(clave)) {
            mostrar();
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña es incorrecta");
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAddActionPerformed
        // TODO add your handling code here:

        Object [] o = new Object[5];
        o[0] = J1.getText();
        o[1] = J2.getText();
        o[2] = J3.getText();
        o[3] = J4.getText();
        o[4] = J5.getText();

        if ("".equals(J1.getText()) || "".equals(J2.getText()) || "".equals(J3.getText()) || "".equals(J4.getText()) || "".equals(J5.getText())) {
            JOptionPane.showMessageDialog(jMenu1, "Falta un atributo.");
        } else {
            modelo.addRow(o);
        }

        J1.setText("");
        J2.setText("");
        J3.setText("");
        J4.setText("");
        J5.setText("");
sumaTotal();
    }//GEN-LAST:event_jButAddActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
            for (int i = 0; i < modelo.getRowCount(); i++) {
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                celdas.addCelda(i, j, Color.white);
            }
            }
       celdas.repaint();
        
        guardar(2);
        String clave = JOptionPane.showInputDialog("Ingresa la clave a buscar.");
        if (clave.equals("") || Integer.parseInt(clave+"") <1000 || Integer.parseInt(clave+"")>9999) {
            
            JOptionPane.showMessageDialog(this, "Ingresa un código valido");
       
        } else {
        
        int [] vec = new int[modelo.getRowCount()];
        for (int i = 0; i < modelo.getRowCount(); i++) {
            vec[i] = Integer.parseInt(modelo.getValueAt(i, 0)+"");
            System.out.println(vec[i]);
        }
        
        int pos = Hash.Hash_Buscar(vec, Integer.parseInt(clave), vec.length);
        mostrarDatos(pos, Integer.parseInt(clave+""));
        
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void J1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J1KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_J1KeyTyped

    private void J4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J4KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_J4KeyTyped

    private void J5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J5KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_J5KeyTyped

    
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
            java.util.logging.Logger.getLogger(Serializar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Serializar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Serializar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Serializar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField J1;
    private javax.swing.JTextField J2;
    private javax.swing.JTextField J3;
    private javax.swing.JTextField J4;
    private javax.swing.JTextField J5;
    private javax.swing.JButton jButAdd;
    private javax.swing.JButton jButDel;
    private javax.swing.JButton jButOrdDesc;
    private javax.swing.JButton jButOrdId;
    private javax.swing.JButton jButRelleno;
    private javax.swing.JLabel jLabTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
