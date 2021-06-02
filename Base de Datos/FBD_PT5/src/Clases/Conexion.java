/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahdeijack
 */
public class Conexion {
    //Metodos
private Connection conexion = null;
    
public Connection conectar(){
        try {    
                Class.forName("com.mysql.jdbc.Driver");
                conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/agencia2?autoReconnect=true&useSSL=false", "root", "root");
                //JOptionPane.showMessageDialog(null, "Conexión Exitosa! ");
                   
        }catch (ClassNotFoundException|SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error de conexion: "+ex.getMessage());
        }
        return conexion;
} 
public void desconectar(){     
        try{
            conexion.close();
            //JOptionPane.showMessageDialog(null,"Desconexion exitosa");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de desconexion"+ex.getMessage());
        }
    }
        
public void insertarAerolinea(String linea, String nombreAero) throws SQLException{
        conectar();
        // Primero a la base de datos. 
       
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
        try{
      
        cad = "insert into aerolinea(linea,nombreAero)VALUES(?,?)";
        // 
        PSSql = conexion.prepareStatement(cad);
        
        PSSql.setString(1,linea);
        PSSql.setString(2,nombreAero);
        PSSql.executeUpdate();

        } catch(MySQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null,"Estas insertando un dato ya existente: "+ ex);
        } 
        
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();

        desconectar();
    }
public void insertarAvion(String claveAvion, String tipoAvion, String numPasajeros, String nombreCia, String linea) throws SQLException{
        conectar();
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
        cad = "INSERT INTO avion(claveAvion,tipoAvion,numPasajeros,nombreCia,linea)VALUES(?,?,?,?,?)";
         PSSql = conexion.prepareStatement(cad);
        
        PSSql.setString(1,claveAvion);
        PSSql.setString(2,tipoAvion);
        PSSql.setString(3, numPasajeros);
        PSSql.setString(4, nombreCia);
        PSSql.setString(5, linea);
        PSSql.executeUpdate();
        
        
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        PSSql.executeUpdate();
        
        desconectar();
    }
public void insertarVuelo(String claveVue, String estadoV, String tipoV, String horaD, String diaD, String horaO, String diaO, String claveAvion) throws SQLException{
        conectar();
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        
        cad = "INSERT INTO vuelo(claveVue,estadoV,tipoV,horaD,diaD,horaO,diaO,claveAvion)VALUES(?,?,?,?,?,?,?,?)";
        PSSql = conexion.prepareStatement(cad);
        
        PSSql.setString(1,claveVue);
        PSSql.setString(2,estadoV);
        PSSql.setString(3, tipoV);
        PSSql.setString(4, horaD);
        PSSql.setString(5, diaD);
        PSSql.setString(6, horaO);
        PSSql.setString(7, diaO);
        PSSql.setString(8, claveAvion);
        PSSql.executeUpdate();
        
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        desconectar();
    }
public void insertarAeropuerto(String claveAero, String nombAero, String cdAero, String paisAero, String numAero, String colAero, String cpAero, String claveAvion) throws SQLException{
        conectar();
        
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        cad = "INSERT INTO aeropuerto(claveAero,nombAero,cdAero,paisAero,numAero,colAero,cpAero,claveAvion)VALUES(?,?,?,?,?,?,?,?)";
        PSSql = conexion.prepareStatement(cad);
        
        PSSql.setString(1,claveAero);
        PSSql.setString(2,nombAero);
        PSSql.setString(3, cdAero);
        PSSql.setString(4, paisAero);
        PSSql.setString(5, numAero+"");
        PSSql.setString(6, colAero);
        PSSql.setString(7, cpAero+"");
        PSSql.setString(8, claveAvion);
        PSSql.executeUpdate();
        
        
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();        
        desconectar();
    }  
public void insertarReservaciones(String claveRes, String horarioV, String fechaV, String costoRes,String claveVue) throws SQLException{
        conectar();
         String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        cad = "INSERT INTO reservaciones(claveRes,horarioV,fechaV,costoRes,claveVue)VALUES(?,?,?,?,?)";
        PSSql = conexion.prepareStatement(cad);
        
        PSSql.setString(1,claveRes);
        PSSql.setString(2,horarioV);
        PSSql.setString(3, fechaV);
        PSSql.setString(4, costoRes);
        PSSql.setString(5, claveVue);
        PSSql.executeUpdate();
        
        
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();        
        desconectar();
    }
public void insertarCliente(String emailCte, String contraseña, String nombreCte, String apPatCte, String apMatCte, String calleCte, String numCte, String colCte, String cpCte, String cdCte, String claveRes) throws SQLException{
        conectar();
        
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        cad = "INSERT INTO cliente(emailCte,contraseña,nombreCte,apPatCte,apMatCte,calleCte,numCte,colCte,cpCte,cdCte,claveRes)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        PSSql = conexion.prepareStatement(cad);
        
        PSSql.setString(1,emailCte);
        PSSql.setString(2,contraseña);
        PSSql.setString(3, nombreCte);
        PSSql.setString(4, apPatCte);
        PSSql.setString(5, apMatCte);
        PSSql.setString(6, calleCte);
        PSSql.setString(7, numCte+"");
        PSSql.setString(8, colCte);
        PSSql.setString(9, cpCte+"");
        PSSql.setString(10, cdCte);
        PSSql.setString(11, claveRes);
        
        PSSql.executeUpdate();
        
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        
        desconectar();
    }
public void insertarTarjeta(int numTarjeta, String tipoTarjeta, String fechaVenc, String añoIni, String nombTitular, String emailCte) throws SQLException{
        conectar();
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        cad = "INSERT INTO cliente(numTarjeta,tipoTarjeta,fechaVenc,añoIni,nombTitular,emailCte)VALUES(?,?,?,?,?,?)";
        PSSql = conexion.prepareStatement(cad);
        
        PSSql.setString(1,numTarjeta+"");
        PSSql.setString(2,tipoTarjeta);
        PSSql.setString(3, fechaVenc);
        PSSql.setString(4, añoIni);
        PSSql.setString(5, nombTitular);
        PSSql.setString(6, emailCte);

        
        PSSql.executeUpdate();
        
        cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        desconectar();
    }

public void eliminarAerolineas(String linea){
    conectar();
    
    try{
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete  from avion where linea ='"+linea+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
                  
         cad = "delete from aerolinea where linea='"+linea+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         
         cad =  "SET FOREIGN_KEY_CHECKS="+1;
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();

         
    }   catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar"+ex.getMessage());
        }
            desconectar();
}
public void eliminarAvion(String claveAvion){
    conectar();
    
    try{
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();

          cad = "delete  from avion where claveAvion ='"+claveAvion+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
        
         cad = "delete from vuelo where claveAvion='"+claveAvion+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete  from aeropuerto where claveAvion ='"+claveAvion+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete  from avion_vuelo where claveAvion ='"+claveAvion+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
        
         
         cad =  "SET FOREIGN_KEY_CHECKS="+1;
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();

         
    }   catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar"+ex.getMessage());
        }
            desconectar();
}
public void eliminarVuelo(String claveVue){
    conectar();
    
    try{
        
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();

         cad = "delete  from vuelo where claveVue ='"+claveVue+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete from reservaciones where claveVue='"+claveVue+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete  from asiento where claveVue ='"+claveVue+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete  from tarifa where claveVue ='"+claveVue+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete  from avion_vuelo where claveVue ="+claveVue+"";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete  from vuelo_reservacion where claveVue ="+claveVue+"";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad =  "SET FOREIGN_KEY_CHECKS="+1;
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
    }   catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar"+ex.getMessage());
        }
            desconectar();
}
public void eliminarAeropuerto(String claveAero){
    conectar();
    
    try{
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
         cad = "delete from aeropuerto where claveAero ='"+claveAero+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
    }   catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar"+ex.getMessage());
        }
            desconectar();
}
public void eliminarReservaciones(String claveRes){
    conectar();
    
    try{
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
         cad = "delete from cliente_reservacion where claveRes ='"+claveRes+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete from reservaciones where claveRes ='"+claveRes+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad="delete from vuelo_reservacion where claveRes='"+claveRes+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad="delete from cliente where claveRes='"+claveRes+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
    }   catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar"+ex.getMessage());
        }
            desconectar();
}
public void eliminarClientes(String emailCte){
    conectar();
    
    try{
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
         cad = "delete from tarjeta where emailCte = '"+emailCte+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad="delete from cliente_reservacion where emailCte='"+emailCte+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad="delete from cliente_telefono where emailCte='"+emailCte+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad = "delete from cliente where emailCte ='"+emailCte+"'";
         PSSql = conexion.prepareStatement(cad);
         PSSql.executeUpdate();
         
         cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
    }   catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar"+ex.getMessage());
        }
            desconectar();
}

public void modificarAerolinea(String linea, String nombreAero){
        conectar();
        System.out.println(linea+","+nombreAero);
        try{
            String cad = "UPDATE aerolinea SET nombreAero='"+nombreAero+"' WHERE linea='"+linea+"'";
            PreparedStatement PSSql = conexion.prepareStatement(cad);
            PSSql.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Modificacion exitosa"+ex.getMessage());
        }
         
        desconectar();
    }
public void modificarAvion(String claveAvion, String tipoAvion, String numPasajeros, String nombreCia, String linea) throws SQLException{
        conectar();
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        try{
             cad = "UPDATE avion SET tipoAvion='"+tipoAvion+"',numPasajeros='"+numPasajeros+"',nombreCia='"+nombreCia+"' WHERE claveAvion='"+claveAvion+"'";
             PSSql = conexion.prepareStatement(cad);
            PSSql.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Modificacion exitosa"+ex.getMessage());
        }
        
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
        desconectar();
    }
public void ModificarVuelo(String claveVue, String estadoV, String tipoV, String horaD, String diaD, String horaO, String diaO, String claveAvion) throws SQLException{
        conectar();
        System.out.println(claveVue);
        
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        try{
             cad = "UPDATE vuelo SET estadoV='"+estadoV+"',tipoV='"+tipoV+"',horaD='"+horaD+"',diaD='"+diaD+"',horaO='"+horaO+"',diaO='"+diaO+"',claveAvion='"+claveAvion+"' WHERE claveVue='"+claveVue+"'";
             PSSql = conexion.prepareStatement(cad);
            PSSql.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Modificacion exitosa"+ex.getMessage());
        }
        
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
        desconectar();
    }
public void modificarAeropuerto(String claveAero, String nombAero, String cdAero, String paisAero, String numAero, String colAero, String cpAero, String claveAvion) throws SQLException{
        conectar();
         String cad =  "SET FOREIGN_KEY_CHECKS="+0;
         PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        try{
             cad = "UPDATE aeropuerto SET nombAero='"+nombAero+"',cdAero='"+cdAero+"',paisAero='"+paisAero+"',numAero='"+numAero+"',colAero='"+colAero+"',claveAvion='"+claveAvion+"' WHERE claveAero= '"+claveAero+"'";
             PSSql = conexion.prepareStatement(cad);
             PSSql.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Modificacion exitosa"+ex.getMessage());
        }
        
         cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
        desconectar();
    }
public void modificarReservacion(String claveRes, String horarioV, String fechaV, String costoRes,String claveVue) throws SQLException{
        conectar();
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        try{
             cad = "UPDATE reservaciones SET horarioV='"+horarioV+"',fechaV='"+fechaV+"',costoRes='"+costoRes+"',claveVue='"+claveVue+"' WHERE claveRes= '"+claveRes+"'";
             PSSql = conexion.prepareStatement(cad);
            PSSql.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Modificacion exitosa"+ex.getMessage());
        }
         cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
        desconectar();
    }
public void modificarCliente(String emailCte, String contraseña, String nombreCte, String apPatCte, String apMatCte, String calleCte, String numCte, String colCte, String cpCte, String cdCte, String claveCte) throws SQLException{
        conectar();
        String cad =  "SET FOREIGN_KEY_CHECKS="+0;
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        try{
             cad = "UPDATE cliente SET nombreCte='"+nombreCte+"',apPatCte='"+apPatCte+"',apMatCte='"+apMatCte+"',calleCte='"+calleCte+"',colCte='"+colCte+"', cpCte='"+cpCte+"',cdCte='"+cdCte+"'  WHERE emailCte= '"+emailCte+"'";
             PSSql = conexion.prepareStatement(cad);
            PSSql.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Modificacion exitosa"+ex.getMessage());
        }
        cad =  "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
         
        desconectar();
    }

public void mostrarDatosCliente(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("eMail");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ap Paterno");
        modelo.addColumn("Ap Materno");
        modelo.addColumn("Calle");
        modelo.addColumn("Numero Cliente");
        modelo.addColumn("Colonia");
        modelo.addColumn("Codigo Postal");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Reservación");

        tabla.setModel(modelo);
        
        String datos [] = new String[11];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM cliente");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                datos[2] = resSet.getString(3);
                datos[3] = resSet.getString(4);
                datos[4] = resSet.getString(5);
                datos[5] = resSet.getString(6);
                datos[6] = resSet.getString(7);
                datos[7] = resSet.getString(8);
                datos[8] = resSet.getString(9);
                datos[9] = resSet.getString(10);
                datos[10] = resSet.getString(11);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }
public void mostrarDatosAerolinea(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Aerolinea");

        tabla.setModel(modelo);
        
        String datos [] = new String[2];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM aerolinea");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }
public void mostrarDatosAvion(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Tipo");
        modelo.addColumn("Pasajeros");
        modelo.addColumn("Agencia");
        modelo.addColumn("Clave Aerolinea");

        tabla.setModel(modelo);
        
        String datos [] = new String[5];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM avion");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                datos[2] = resSet.getString(3);
                datos[3] = resSet.getString(4);
                datos[4] = resSet.getString(5);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }
public void mostrarDatosVuelo(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Estado");
        modelo.addColumn("Tipo");
        modelo.addColumn("Hora Destino");
        modelo.addColumn("Dia Destino");
        modelo.addColumn("Hora Origen");
        modelo.addColumn("Dia Origen");
        modelo.addColumn("Clave Avion");


        tabla.setModel(modelo);
        
        String datos [] = new String[8];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM vuelo");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                datos[2] = resSet.getString(3);
                datos[3] = resSet.getString(4);
                datos[4] = resSet.getString(5);
                datos[5] = resSet.getString(6);
                datos[6] = resSet.getString(7);
                datos[7] = resSet.getString(8);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }    
public void mostrarDatosAeropuerto(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Clave Aeropuerto");
        modelo.addColumn("Aeropuerto");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Pais");
        modelo.addColumn("Numero Aeropuerto");
        modelo.addColumn("Colonia");
        modelo.addColumn("C:P Aeropuerto");
        modelo.addColumn("Clave Avion");
        tabla.setModel(modelo);
        
        String datos [] = new String[8];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM aeropuerto");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                datos[2] = resSet.getString(3);
                datos[3] = resSet.getString(4);
                datos[4] = resSet.getString(5);
                datos[5] = resSet.getString(6);
                datos[6] = resSet.getString(7);
                datos[7] = resSet.getString(8);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }
public void mostrarDatosReservaciones(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Reservacion");
        modelo.addColumn("Hora Vuelo");
        modelo.addColumn("Fecha Vuelo");
        modelo.addColumn("Costo");
        modelo.addColumn("Vuelo");
        tabla.setModel(modelo);
        
        String datos [] = new String[5];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM reservaciones");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                datos[2] = resSet.getString(3);
                datos[3] = resSet.getString(4);
                datos[4] = resSet.getString(5);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }

public void vuelo_reservacion(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Clave Vuelo");
        modelo.addColumn("Clave Reserva");


        tabla.setModel(modelo);
        
        String datos [] = new String[2];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM vuelo_reservacion");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }    
public void cliente_reservacion(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Email cliente");
        modelo.addColumn("Clave Reserva");


        tabla.setModel(modelo);
        
        String datos [] = new String[2];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM cliente_reservacion");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }    
public void pago_tarjeta(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Número Tarjeta");


        tabla.setModel(modelo);
        
        String datos [] = new String[1];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM pago_tarjeta");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }
public void cliente_telerfono(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Email cliente");
        modelo.addColumn("Telefono");


        tabla.setModel(modelo);
        
        String datos [] = new String[2];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM cliente_telefono");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }  
public void asiento(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Vuelo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Letra/Num");
        modelo.addColumn("Fila");


        tabla.setModel(modelo);
        
        String datos [] = new String[4];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM asiento");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                datos[2] = resSet.getString(3);
                datos[3] = resSet.getString(4);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }  
public void pago(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Reservacion");
        modelo.addColumn("Tipo de Pago");
        modelo.addColumn("Fecha de Pago.");
        modelo.addColumn("Cargo de costo");


        tabla.setModel(modelo);
        
        String datos [] = new String[4];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM pago");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                datos[2] = resSet.getString(3);
                datos[3] = resSet.getString(4);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }  
public void tarifa(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Clave de Vuelo");
        modelo.addColumn("Costo");
        modelo.addColumn("Tipo de Cliente");
        modelo.addColumn("Impuestos");


        tabla.setModel(modelo);
        
        String datos [] = new String[4];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM tarifa");
            
            while(resSet.next()){
                datos[0] = resSet.getString(1);
                datos[1] = resSet.getString(2);
                datos[2] = resSet.getString(3);
                datos[3] = resSet.getString(4);
                modelo.addRow(datos);
                
                tabla.setModel(modelo);
            }
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Mostrar"+ex.getMessage());
        }
        
        desconectar();
    }  

}
