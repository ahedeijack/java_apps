/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_practica;

import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ahdeijack
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Conexion objCox = new Conexion(); 
    int ver = 0;
    boolean sel = false;
    String D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11;
    public Principal() {
        initComponents();
        verConsulta(ver);
        ocultar();
    }
    
    public void verConsulta(int ver){
        switch(ver){
            case 0:
                objCox.mostrarDatosCliente(jTable1);
                break;
            case 1:
                objCox.mostrarDatosAerolinea(jTable1);
                break;
            case 2: 
                objCox.mostrarDatosAvion(jTable1);
                break;
            case 3:
                objCox.mostrarDatosVuelo(jTable1);
                break;
            case 4: 
                objCox.mostrarDatosAeropuerto(jTable1);
                break;
                  case 5:
                objCox.mostrarDatosReservaciones(jTable1);
                break;
            case 6:
                objCox.vuelo_reservacion(jTable1);
                break;
            case 7: 
                objCox.cliente_reservacion(jTable1);
                break;
            case 8:
                objCox.pago_tarjeta(jTable1);
                break;
            case 9: 
                objCox.cliente_telerfono(jTable1);
                break;
                 case 10: 
                objCox.asiento(jTable1);
                break;
            case 11:
                objCox.pago(jTable1);
                break;
            case 12: 
                objCox.tarifa(jTable1);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Hay un error con la consulta");
               break;
        }
        
        
    }
    public void mostrar(){
    J1.setVisible(true);
    J2.setVisible(true);
    J3.setVisible(true);
    J4.setVisible(true);
    J5.setVisible(true);
    J6.setVisible(true);
    
    B1.setVisible(true);
    B2.setVisible(true);
    B3.setVisible(true);
    B4.setVisible(true);
    B5.setVisible(true);
    B6.setVisible(true);
    
    L1.setVisible(true);
    L2.setVisible(true);
    L3.setVisible(true);
    L4.setVisible(true);
    L5.setVisible(true);
    L6.setVisible(true);
}
    public void ocultar(){
    J1.setVisible(false);
    J2.setVisible(false);
    J3.setVisible(false);
    J4.setVisible(false);
    J5.setVisible(false);
    J6.setVisible(false);
    J7.setVisible(false);
    J9.setVisible(false);
    J10.setVisible(false);
    J11.setVisible(false);
    J12.setVisible(false);
   
    
    B1.setVisible(false);
    B2.setVisible(false);
    B3.setVisible(false);
    B4.setVisible(false);
    B5.setVisible(false);
    B6.setVisible(false);
    
    L1.setVisible(false);
    L2.setVisible(false);
    L3.setVisible(false);
    L4.setVisible(false);
    L5.setVisible(false);
    L6.setVisible(false);
    L7.setVisible(false);
    L9.setVisible(false);
    L10.setVisible(false);
    L11.setVisible(false);
    L12.setVisible(false);

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBoton = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jR1 = new javax.swing.JRadioButton();
        jR2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        L1 = new javax.swing.JLabel();
        J1 = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        J2 = new javax.swing.JTextField();
        L2 = new javax.swing.JLabel();
        B3 = new javax.swing.JButton();
        J3 = new javax.swing.JTextField();
        L3 = new javax.swing.JLabel();
        B4 = new javax.swing.JButton();
        J4 = new javax.swing.JTextField();
        L4 = new javax.swing.JLabel();
        B5 = new javax.swing.JButton();
        J5 = new javax.swing.JTextField();
        L5 = new javax.swing.JLabel();
        J6 = new javax.swing.JTextField();
        L6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        J7 = new javax.swing.JTextField();
        L7 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        J9 = new javax.swing.JTextField();
        J10 = new javax.swing.JTextField();
        L10 = new javax.swing.JLabel();
        J11 = new javax.swing.JTextField();
        L11 = new javax.swing.JLabel();
        J12 = new javax.swing.JTextField();
        L12 = new javax.swing.JLabel();
        B6 = new javax.swing.JButton();
        Borrar = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 662, 180));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes", "Aerolineas", "Aviones", "Vuelos", "Aeropuerto", "Reservaciones", "Vuelo_reservacion", "Cliente_reservacion", "Pago_tarjeta", "Cliente_telefono", "Asiento", "Pago", "Tarifa", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 212, -1, -1));

        jLabel1.setText("Consulta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 192, 120, -1));

        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 238, 120, -1));

        grupoBoton.add(jR1);
        jR1.setText("Insertar");
        getContentPane().add(jR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 272, 120, -1));

        grupoBoton.add(jR2);
        jR2.setText("Modificar");
        getContentPane().add(jR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 297, 69, -1));

        jButton2.setText("Relizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 322, 120, -1));

        L1.setText("Titulo");
        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 212, 83, -1));
        getContentPane().add(J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 237, 83, -1));

        B1.setText("Agregar");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 83, -1));

        B2.setText("Agregar");
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 83, -1));
        getContentPane().add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 237, 83, -1));

        L2.setText("Titulo");
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 212, 83, -1));

        B3.setText("Agregar");
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 83, -1));
        getContentPane().add(J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 237, 83, -1));

        L3.setText("Titulo");
        getContentPane().add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 212, 83, -1));

        B4.setText("Agregar");
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 83, -1));
        getContentPane().add(J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 237, 83, -1));

        L4.setText("Titulo");
        getContentPane().add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 212, 83, -1));

        B5.setText("Agregar");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 83, -1));
        getContentPane().add(J5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 237, 83, -1));

        L5.setText("Titulo");
        getContentPane().add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 212, 83, -1));
        getContentPane().add(J6, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 237, 83, -1));

        L6.setText("Titulo");
        getContentPane().add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 212, 83, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 356, 120, -1));
        getContentPane().add(J7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 83, -1));

        L7.setText("Titulo");
        getContentPane().add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 83, -1));

        L9.setText("Titulo");
        getContentPane().add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 70, -1));
        getContentPane().add(J9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 83, -1));
        getContentPane().add(J10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 83, -1));

        L10.setText("Titulo");
        getContentPane().add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 83, -1));
        getContentPane().add(J11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 83, -1));

        L11.setText("Titulo");
        getContentPane().add(L11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 83, -1));
        getContentPane().add(J12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 83, -1));

        L12.setText("Titulo");
        getContentPane().add(L12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 83, -1));

        B6.setText("Agregar");
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 83, -1));
        getContentPane().add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ver = jComboBox1.getSelectedIndex();
        verConsulta(ver);
        int tabla = jComboBox1.getSelectedIndex();
         switch(tabla){
                case 0:
                    ocultar();
                    B1.setVisible(true);
                    B1.setText("Aleatorios");
                    L1.setVisible(true);
                    L1.setText("Correo Cliente");
                    L2.setVisible(true);
                    L2.setText("Contraseña");
                    L3.setVisible(true);
                    L3.setText("Nombre");
                    L4.setVisible(true);
                    L4.setText("Ap Patermo");
                    L5.setVisible(true);
                    L5.setText("Ap Materno");
                    L6.setVisible(true);
                    L6.setText("Calle");
                    L7.setVisible(true);
                    L7.setText("# Cte");
                    L9.setVisible(true);
                    L9.setText("Colonia");
                    L10.setVisible(true);
                    L10.setText("C:P");
                    L11.setVisible(true);
                    L11.setText("Ciudad");
                    L12.setVisible(true);
                    L12.setText("Clave");


                    J1.setVisible(true);
                    J2.setVisible(true);
                    J3.setVisible(true);
                    J4.setVisible(true);
                    J5.setVisible(true);
                    J6.setVisible(true);
                    J7.setVisible(true);
                    J9.setVisible(true);
                    J10.setVisible(true);
                    J11.setVisible(true);
                    J12.setVisible(true);
                    
                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();
                    D6 = J6.getText();
                    D7 = J7.getText();
                    D8 = J9.getText();
                    D9 = J10.getText();
                    D10 = J11.getText();
                    D11 = J12.getText();

                    objCox.mostrarDatosCliente(jTable1);
                    break;
                case 1: 
                    ocultar();
                    B2.setVisible(true);
                    B2.setText("Aleatorios");
                    J1.setVisible(true);
                    J2.setVisible(true);
                    L1.setVisible(true);
                    L1.setText("Id Aerolinea");
                    L2.setVisible(true);
                    L2.setText("# Aerolinea");
                    D1 = J1.getText();
                    D2 = J2.getText();
                    

                    objCox.mostrarDatosAerolinea(jTable1);
                    break;
                case 2:
                      ocultar();
                       B3.setVisible(true);
                      B3.setText("Aleatorios");
                    L1.setVisible(true);
                    L1.setText("Clave");
                    L2.setVisible(true);
                    L2.setText("Tipo");
                    L3.setVisible(true);
                    L3.setText("# Pasajeros");
                    L4.setVisible(true);
                    L4.setText("Agencia");
                    L5.setVisible(true);
                    L5.setText("Linea");

                    J1.setVisible(true);
                    J2.setVisible(true);
                    J3.setVisible(true);
                    J4.setVisible(true);
                    J5.setVisible(true);

                    
                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();


                    objCox.mostrarDatosAvion(jTable1);
                    break;
                case 3:
                    ocultar();
                     B4.setVisible(true);
                    B4.setText("Aleatorios");
                    L1.setVisible(true);
                    L1.setText("Clave Vuelo");
                    L2.setVisible(true);
                    L2.setText("Estado  ");
                    L3.setVisible(true);
                    L3.setText("Tipo");
                    L4.setVisible(true);
                    L4.setText("Hora Destino");
                    L5.setVisible(true);
                    L5.setText("Dia Destino");
                    L6.setVisible(true);
                    L6.setText("Hora Origen");
                    L7.setVisible(true);
                    L7.setText("Dia Origen");
                    L9.setVisible(true);
                    L9.setText("Clave Avion");



                    J1.setVisible(true);
                    J2.setVisible(true);
                    J3.setVisible(true);
                    J4.setVisible(true);
                    J5.setVisible(true);
                    J6.setVisible(true);
                    J7.setVisible(true);
                    J9.setVisible(true);


                    
                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();
                    D6 = J6.getText();
                    D7 = J7.getText();
                    D8 = J9.getText();

                    objCox.mostrarDatosVuelo(jTable1);
                    break;
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jR1.isSelected()) {
            // JR1 Modifica
            int tabla = jComboBox1.getSelectedIndex();
//Clientes 0
//Aerolineas 1
//Aviones 2
//Vuelos 3
//Aeropuerto 4
//Reservaciones 5
            
            switch(tabla){
                case 0:
                    ocultar();
                 
                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();
                    D6 = J6.getText();
                    D7 = J7.getText();
                    D8 = J9.getText();
                    D9 = J10.getText();
                    D10 = J11.getText();
                    D11 = J12.getText();

            {
                try {
                    objCox.insertarCliente(D1, D2,D3, D4, D5, D6,D7,D8,D9,D10,D11);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    objCox.mostrarDatosCliente(jTable1);
                    break;
                case 1: 
                    ocultar();
                  
                    D1 = J1.getText();
                    D2 = J2.getText();
                    
            {
                try {
                    objCox.insertarAerolinea(D1, D2);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    objCox.mostrarDatosAerolinea(jTable1);
                    break;
                case 2:
                  
                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();

            {
                try {
                    objCox.insertarAvion(D1, D2, D3, D4, D5);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    objCox.mostrarDatosAvion(jTable1);
                    break;
                case 3:
                 
                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();
                    D6 = J6.getText();
                    D7 = J7.getText();
                    D8 = J9.getText();


            {
                try {
                    objCox.insertarVuelo(D1, D2,D3, D4, D5, D6,D7,D8);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    objCox.mostrarDatosVuelo(jTable1);
                    break;
            }
            
            
        } else if(jR2.isSelected()) {
           // JR2 Agrega. 
            int tabla = jComboBox1.getSelectedIndex();
//Clientes 0
//Aerolineas 1
//Aviones 2
//Vuelos 3
//Aeropuerto 4
//Reservaciones 5
 switch(tabla){
                case 0:
                 
                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();
                    D6 = J6.getText();
                    D7 = J7.getText();
                    D8 = J9.getText();
                    D9 = J10.getText();
                    D10 = J11.getText();
                    D11 = J12.getText();

            {
                try {
                    objCox.modificarCliente(D1, D2,D3, D4, D5, D6,D7,D8,D9,D10,D11);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    objCox.mostrarDatosCliente(jTable1);
                    break;
                case 1: 
                  ;
                    D1 = J1.getText();
                    D2 = J2.getText();
                    
                    objCox.modificarAerolinea(D1, D2);
                    objCox.mostrarDatosAerolinea(jTable1);
                    break;
                case 2:

                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();

            {
                try {
                    objCox.modificarAvion(D1, D2, D3, D4, D5);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    objCox.mostrarDatosAvion(jTable1);
                    break;
                case 3:
                
                    D1 = J1.getText();
                    D2 = J2.getText();
                    D3 = J3.getText();
                    D4 = J4.getText();
                    D5 = J5.getText();
                    D6 = J6.getText();
                    D7 = J7.getText();
                    D8 = J9.getText();


            {
                try {
                    objCox.ModificarVuelo(D1, D2,D3, D4, D5, D6,D7,D8);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    objCox.mostrarDatosVuelo(jTable1);
                    break;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String clave = null;
        clave = Borrar.getText();
        System.out.println(clave);
        int tabla = jComboBox1.getSelectedIndex();
        switch(tabla){
        case 0:
                    ocultar();
                    objCox.eliminarClientes(clave);
                    objCox.mostrarDatosCliente(jTable1);
                    break;
               case 1:
                    ocultar();
                    objCox.eliminarAerolineas(clave);
                    objCox.mostrarDatosAerolinea(jTable1);
                    break;
               case 2:
                    ocultar();
                    objCox.eliminarAvion(clave);
                    objCox.mostrarDatosAvion(jTable1);
                    break;
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        
        String [] correos = {"betto@gmail.com","alfonsa@outlook.com","Karla@hotmail.com"};
        String [] contraseñas = {"syw&8eMj", "soUi8eMj","$^UGWmr%","U#boDl!D" };
        String [] nombres= {"Pedro", "Luis","Juan","Antonia","Perla"};
        String [] aps = {"Sanchez","Perez","Sosa","Vazquez","Murillo","Moreno","Enriquez"};
        String [] calles = {"5 Mayo","Ruleta","San Pedro","Campanario"};
        Random r = new Random();
        String []  colonia = {"La feria","Nuevo L.A","Viñedos","E Guerra"};
        String [] ciudades = {"Gomez","Lerdo","Torreon","Monterrey"};
        String [] rsv = {"RSV01","RSV19","RSV23"};
        
        J1.setText(correos[r.nextInt(correos.length)]+""); //Correo
        J2.setText(contraseñas[r.nextInt(contraseñas.length)]+""); //Constraseña
        J3.setText(nombres[r.nextInt(nombres.length)]+""); //Nombres
        J4.setText(aps[r.nextInt(aps.length)]+""); //AP PAT
        J5.setText(aps[r.nextInt(aps.length)]+""); // AP MAT
        J6.setText(calles[r.nextInt(calles.length)]+""); //Calles
        J7.setText(r.nextInt(8999)+1000+""); //# Cliente
        J9.setText(colonia[r.nextInt(colonia.length)]+"");
        J10.setText((r.nextInt(89)+10)+"0"+(r.nextInt(89)+10)); //CP
        J11.setText(ciudades[r.nextInt(ciudades.length)]); //Ciudad
        J12.setText(rsv[r.nextInt(rsv.length)]);
    }//GEN-LAST:event_B1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JTextField Borrar;
    private javax.swing.JTextField J1;
    private javax.swing.JTextField J10;
    private javax.swing.JTextField J11;
    private javax.swing.JTextField J12;
    private javax.swing.JTextField J2;
    private javax.swing.JTextField J3;
    private javax.swing.JTextField J4;
    private javax.swing.JTextField J5;
    private javax.swing.JTextField J6;
    private javax.swing.JTextField J7;
    private javax.swing.JTextField J9;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L9;
    private javax.swing.ButtonGroup grupoBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jR1;
    private javax.swing.JRadioButton jR2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
