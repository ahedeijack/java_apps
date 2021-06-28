/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ahdeijack
 */
public class Conexion {

    //Atributo
    private Connection conexion = null;

    //Métodos
    public Connection conectar() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?autoReconnect=true&useSSL=false",
                                                                                                                            "root","root");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
        }
        catch (ClassNotFoundException|SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion"+ex);
        }
        return conexion;
    }

    public void desconectar(){
        try{
            conexion.close();
            JOptionPane.showMessageDialog(null,"Desconexion exitosa");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de desconexion"+ex);
        }
    }

    public void guardarDatosAutor(String codigoA,String nombresA,String apPatA,String apMatA) throws SQLException{
        conectar();

        String cad = "INSERT INTO autor(codigoA,nombresA,apPatA,apMatA)VALUES(?,?,?,?)";
        PreparedStatement PSSql = (PreparedStatement) conexion.prepareStatement(cad);

        PSSql.setString(1,codigoA);
        PSSql.setString(2,nombresA);
        PSSql.setString(3,apPatA);
        PSSql.setString(4,apMatA);

        PSSql.executeUpdate();

        desconectar();
    }
    
    public void eliminarDatosAutor(String codigoA) throws SQLException{
        conectar();
        
        try {
            String cad = "DELETE from autor_libro where codigoA=' "+codigoA+" ' ";
            PreparedStatement pSSql = (PreparedStatement) conexion.prepareStatement(cad);
            pSSql.executeUpdate();
            
            
            cad = "DELETE from autor where codigoA=' "+codigoA+" ' ";
            pSSql = (PreparedStatement) conexion.prepareStatement(cad);
            pSSql.executeUpdate();
            
        } catch (SQLException ex){
            
        }
        desconectar();
    }
    
    public void modificarDatosAutor(String codigoA,String nombresA,String apPatA,String apMatA) throws SQLException{
        conectar();
try{
        String cad = "UPDATE autor SET nombresA =' "+codigoA+" ', apPatA=' "+apPatA+" ', apMatA=' "+apMatA+" ' where codigoA = ' "+codigoA+" ' ";
        PreparedStatement PSSql = (PreparedStatement) conexion.prepareStatement(cad);
          PSSql.executeUpdate();
          JOptionPane.showMessageDialog(null, "Modificación exitosa! ");

} catch(SQLException ex){
JOptionPane.showMessageDialog(null, "Error en la modificación! "+ex.getMessage());
};


      

        desconectar();
    }
}
