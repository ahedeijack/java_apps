/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_ferreteria_final;

import Clases.ArchivosBinarios;
import Clases.Hash;
import Clases.Producto;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahdeijack
 */
public class BusquedaHash extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    Random R;
    String tipo [] ={"Clavos","Tubo","Tijeras","Martillo","Taladro"}; 
    String marca[] = {"Trupper","Trupper","Nacobre","Bosche","Iusa","Philips"};
    String tipoMedida [] = {"No. 1","No. 2","No. 3","No. 4","No. 5"};
    //Cantidad
    //Precio
    DecimalFormat df = new DecimalFormat("####.##");
    DefaultTableModel modelo;
    
    public BusquedaHash(jFrameMenu jfm) {
        initComponents();
        
        R = new Random();
        modelo =  (DefaultTableModel) jTable1.getModel();
    }


        @Override
    public Image getIconImage() {
         Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("IMG/Logo.png"));
        return retValue;
}
    public void rellenar(){
    int IdH = (R.nextInt(89999)+10000);
    String tipoH = tipo[R.nextInt(tipo.length)];
    
        if (tipoH == "Clavos" || tipoH == "Tubo") {
            tipoH = tipoH + ", "+tipoMedida[R.nextInt(tipoMedida.length)];
        }
    
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
          Producto prod[] = new Producto[modelo.getRowCount()];
          for (int i = 0; i < modelo.getRowCount(); i++) {      
          prod[i] = new Producto(Integer.parseInt(modelo.getValueAt(i, 0)+""),
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
        jLabel8 = new javax.swing.JLabel();
        jLabTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuHash = new javax.swing.JMenuItem();
        jMenuPlegamiento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bg.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Inventarios.");
        setIconImage(getIconImage());
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Marca", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_add_property_16px.png"))); // NOI18N
        jButAdd.setText("Agregar");
        jButAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Permanent Marker", 0, 42)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logoini.png"))); // NOI18N
        jLabel6.setText("Ferreterías Vázquez (Inventarios).");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Marca");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cantidad");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");
        jLabel5.setOpaque(true);

        jButRelleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_process_16px.png"))); // NOI18N
        jButRelleno.setText("Rellenar");
        jButRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRellenoActionPerformed(evt);
            }
        });

        jButDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_trash_16px.png"))); // NOI18N
        jButDel.setText("Eliminar por ID");
        jButDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDelActionPerformed(evt);
            }
        });

        jLabel8.setText("$$ TOTAL");

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_save_16px.png"))); // NOI18N
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_opened_folder_16px.png"))); // NOI18N
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_add_to_clipboard_16px.png"))); // NOI18N
        jMenuItem3.setText("Nuevo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Buscar");

        jMenuHash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_hash_24px.png"))); // NOI18N
        jMenuHash.setText("Hash");
        jMenuHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHashActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuHash);

        jMenuPlegamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_registry_editor_24px.png"))); // NOI18N
        jMenuPlegamiento.setText("Plegamiento");
        jMenuPlegamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPlegamientoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuPlegamiento);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Info");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButRelleno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButDel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jButAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jButRelleno))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel8))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(23, 23, 23)
                                                        .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(36, 36, 36))
                                            .addComponent(jButDel)))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
      Producto [] prod = new Producto[modelo.getRowCount()];
        for (int i = 0; i < modelo.getRowCount(); i++) {
            
           prod[i] = new Producto(Integer.parseInt(modelo.getValueAt(i, 0)+""),
                                                    (String)modelo.getValueAt(i, 1),
                                                    (String)modelo.getValueAt(i, 2),
                                                    Integer.parseInt(modelo.getValueAt(i, 3)+""),
                                                    Double.parseDouble(modelo.getValueAt(i, 4)+""));
            
        }

    ArchivosBinarios.guardar_archivo(prod, modelo.getRowCount(), jLabel6);
    sumaTotal();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRellenoActionPerformed
        // TODO add your handling code here:
        rellenar();
    }//GEN-LAST:event_jButRellenoActionPerformed

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

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Proyecto Final de Estructura de Datos, por Carlos A. Vázquez");

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ArchivosBinarios.leer_archivo(modelo, jTable1);
        sumaTotal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        modelo.setRowCount(0);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDelActionPerformed
        // TODO add your handling code here:
        String clave = JOptionPane.showInputDialog("Ingresa la clave a eliminar");
        System.out.println(clave);
        int del2;
        
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            del2 = Integer.parseInt(modelo.getValueAt(i, 0)+"");
            if (del2 == Integer.parseInt(clave)) {
            modelo.removeRow(i);
            JOptionPane.showMessageDialog(null, "El producto con clave |"+clave+"|, se elimino, se encontro en la fila "+(i+1));
            }
            
        }
        

        
        
    }//GEN-LAST:event_jButDelActionPerformed

    private void jMenuPlegamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPlegamientoActionPerformed
        // TODO add your handling code here:
        guardar(2);
        JOptionPane.showMessageDialog(null, "Este componente sigue en proceso. Estara en función en siguientes actualizaciones.");
        String clave = JOptionPane.showInputDialog("Ingresa la clave a buscar.");
        if (clave.equals("")) {
            JOptionPane.showMessageDialog(null, "Este ID es erroneo");
        } else {
         int pos = Hash.plegamiento(Integer.parseInt(clave+""), modelo.getRowCount());
        JOptionPane.showMessageDialog(null, "La clave"+clave+". se encuentra en la posición: "+pos);
        }

    }//GEN-LAST:event_jMenuPlegamientoActionPerformed

    private void jMenuHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHashActionPerformed
        // TODO add your handling code here:
        guardar(2);
        String clave = JOptionPane.showInputDialog("Ingresa la clave a buscar.");
        if (clave.equals("") || Integer.parseInt(clave+"")<1000) {
            JOptionPane.showMessageDialog(null, "Este id es erroneo.");
        } else {
        int [] vec = new int[modelo.getRowCount()];
        for (int i = 0; i < modelo.getRowCount(); i++) {
            vec[i] = Integer.parseInt(modelo.getValueAt(i, 0)+"");
            System.out.println(vec[i]);
        }
        
        
        int pos = Hash.Hash_Buscar(vec, Integer.parseInt(clave), vec.length);
        JOptionPane.showMessageDialog(null, "La clave: "+clave+". se encuentra en la posición: "+(pos+1));        
        }
    }//GEN-LAST:event_jMenuHashActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuHash;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuPlegamiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
