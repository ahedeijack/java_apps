/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
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
 * @author suspe
 */
public class Conexion {
    
    //Atributo
    private Connection conexion = null;
    
    //Métodos
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?autoReconnect=true&useSSL=false",
                                                                                                                            "root","root");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
        }
        catch (ClassNotFoundException|SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion"+ex.getMessage());
        }
        return conexion;
    }
    
    public void desconectar(){
        try{
            conexion.close();
            JOptionPane.showMessageDialog(null,"Desconexion exitosa");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de desconexion"+ex.getMessage());
        }
    }
    
    public void guardarDatosAutor(String codigoA,String nombresA,String apPatA,String apMatA) throws SQLException{
        conectar();
        
        String cad = "INSERT INTO autores(codigoAu,nombresAu,apPatAu,apMatAu)VALUES(?,?,?,?)";
        PreparedStatement PSSql = conexion.prepareStatement(cad);
        
        PSSql.setString(1,codigoA);
        PSSql.setString(2,nombresA);
        PSSql.setString(3,apPatA);
        PSSql.setString(4,apMatA);
        
        PSSql.executeUpdate();
        
        desconectar();
    }
    
    public void eliminarDatosAutor(String codigoA){
        conectar();
        
        try{
            String cad = "DELETE FROM autores_libro WHERE codigoAu = '"+codigoA+"'";
            PreparedStatement PSSql = conexion.prepareStatement(cad);
            PSSql.executeUpdate();
        
            cad = "DELETE FROM autores WHERE codigoAu = '"+codigoA+"'";
            PSSql = conexion.prepareStatement(cad);
            PSSql.executeUpdate();
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al eliminar"+ex.getMessage());
        }
         
        desconectar();
    }
    
    public void modificarDatosAutor(String codigoA,String nombresA,String apPatA,String apMatA){
        conectar();
        
        try{
            String cad = "UPDATE autores SET nombresAu='"+nombresA+"',apPatAu='"+apPatA+"',apMatAu='"+apMatA+"' WHERE codigoAu= '"+codigoA+"'";
            PreparedStatement PSSql = conexion.prepareStatement(cad);
            PSSql.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Modificacion exitosa"+ex.getMessage());
        }
         
        desconectar();
    }
    
    public void mostrarDatosAutor(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        conectar();
        
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre(s)");
        modelo.addColumn("ApPat");
        modelo.addColumn("ApMat");
        tabla.setModel(modelo);
        
        String datos [] = new String[4];
        
        try{
            Statement st;
            st = (Statement)conexion.createStatement();
            
            ResultSet resSet;
            resSet = st.executeQuery("SELECT * FROM autores");
            
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
