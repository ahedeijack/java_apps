package clase;

import app.Login;
import app.PrincipalFrame;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MysqlDataTruncation;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Escuela
 */
public class Conexion {
   private static Connection conexion = null;
   
   
   public void  crear() throws SQLException{
       conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/?useSSL=false","root", "");
       String bor=("DROP DATABASE caivul ");
       PreparedStatement del = conexion.prepareStatement(bor);
       del.executeUpdate();
       del.close();
       //CREAR BASE DE DATOS
       String cad=("CREATE DATABASE caivul ");
       PreparedStatement ps = conexion.prepareStatement(cad);
       ps.executeUpdate();
       ps.close();
       conectar();
       //CREAR TABLA Jefe
       String cad2=("create table jefe(idJefe int primary key not null auto_increment,nomJefe varchar(255) not null,appJefe varchar(255) not null,apmJefe varchar(255) not null,telJefe varchar(10),correoJefe varchar(255))");
       PreparedStatement ps2 = conexion.prepareStatement(cad2);
       ps2.executeUpdate();
       ps2.close();
       //CREAR TABLA SUCURSAL
       String cad3=("create table sucursal(idSuc int primary key not null auto_increment,nomSuc varchar(255) not null,ubiSuc varchar(255) not null,pasillosSuc int not null,colabsSuc int not null,idJefe int not null,foreign key (idJefe) references jefe(idJefe))");
       PreparedStatement ps3 = conexion.prepareStatement(cad3);
       ps3.executeUpdate();
       ps3.close();
       //CREAR TABLA Empleado
       String cad4=("create table empleado(idEmpleado int primary key not null auto_increment,nomEmpleado varchar(255) not null,appEmpleado varchar(255) not null,apmEmpleado varchar(255) not null,telEmpleado varchar(10),idSuc int not null,foreign key (idSuc) references sucursal(idSuc))");
       PreparedStatement ps4 = conexion.prepareStatement(cad4);
       ps4.executeUpdate();
       ps4.close();
       //CREAR TABLA Cliente
       String cad5=("create table cliente(idCliente int primary key not null auto_increment,nomCliente varchar(255) not null,appCliente varchar(255) not null,apmCliente varchar(255) not null,telCliete varchar(255) not null,correoCliente varchar(255) not null,idSuc int not null,foreign key (idSuc) references sucursal(idSuc))");
       PreparedStatement ps5 = conexion.prepareStatement(cad5);
       ps5.executeUpdate();
       ps5.close();
       //CREAR TABLA Cliente
       String cad6=("create table pasillos(idPasillo int primary key not null auto_increment,nomPasillo varchar(255) not null,idEncargado int not null,foreign key (idEncargado) references empleado(idEmpleado),idSuc int not null,foreign key (idSuc) references sucursal(idSuc))");
       PreparedStatement ps6 = conexion.prepareStatement(cad6);
       ps6.executeUpdate();
       ps6.close();
       
       
       desconectar();
   }
   
   public static Connection conectar (){
   try {
       Class.forName("com.mysql.jdbc.Driver");
       conexion =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/caivul?autoReconnect=true&useSSL=false", "root", "");       
       //JOptionPane.showMessageDialog(null,"Conexión lograda");
       
   } catch (SQLException | ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Hubo un error en la conexión:\t "+ex.getMessage());
   }
    return conexion; 
   }  
   public void desconectar() throws SQLException{
       conexion.close();
       System.out.println("Desconexión Éxitosa"); 
   } 
   


   
public void mosrarDatosCliente(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"ID","Nombre","Ap Paterno","Ap Materno","Telefono","Correo","Sucursal"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[7];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("select * from cliente");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        datos[4]=resSet.getString(5);
        datos[5]=resSet.getString(6);
        datos[6]=resSet.getString(7);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void mosrarDatosSucursal(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"ID","Nombre Sucursal","Ubicacion","Pasillos","Colaboracion","Jefe"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[6];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("select * from sucursal");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        datos[4]=resSet.getString(5);
        datos[5]=resSet.getString(6);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void mosrarDatosJefe(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"ID","Nombre","Ap Paternos","Ap Materno","Tel","Correo"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[6];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    resSet=st.executeQuery("select * from jefe");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        datos[4]=resSet.getString(5);
        datos[5]=resSet.getString(6);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void mosrarDatosEmpleado(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"ID","Nombre","Ap Paternos","Ap Materno","Tel","Sucursal"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[6];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    resSet=st.executeQuery("select * from empleado");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        datos[4]=resSet.getString(5);
        datos[5]=resSet.getString(6);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void mosrarDatosPasillo(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"ID","Nombre","Encargado","Sucursal"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[4];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    resSet=st.executeQuery("select * from pasillos");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void obtenerJefe(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JComboBox combo) throws SQLException{
    conectar();
    String [] datos;
    datos= new String[6];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    String id=(String) combo.getSelectedItem();
    resSet=st.executeQuery("select * from jefe where idJefe = "+id);
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        datos[4]=resSet.getString(5);
        datos[5]=resSet.getString(6);
    }
    campo1.setText(datos[1]);
    campo2.setText(datos[2]);
    campo3.setText(datos[3]);
    campo4.setText(datos[4]);
    campo5.setText(datos[5]);
    
    desconectar();
}

public void obtenerSucursal(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JComboBox combo) throws SQLException{
    conectar();
    String [] datos;
    datos= new String[6];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    String id=(String) combo.getSelectedItem();
    resSet=st.executeQuery("select * from sucursal where idSuc = "+id);
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        datos[4]=resSet.getString(5);
        datos[5]=resSet.getString(6);
    }
    campo1.setText(datos[1]);
    campo2.setText(datos[2]);
    campo3.setText(datos[3]);
    campo4.setText(datos[4]);
    campo5.setText(datos[5]);
    
    desconectar();
    
}

public void obtenerPasillo(JTextField campo1,JTextField campo2,JTextField campo3,JComboBox combo) throws SQLException{
    conectar();
    String [] datos;
    datos= new String[5];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    String id=(String) combo.getSelectedItem();
    resSet=st.executeQuery("select * from pasillos where idPasillo = "+id);
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
    }
    campo1.setText(datos[1]);
    campo2.setText(datos[2]);
    campo3.setText(datos[3]);
    
    desconectar();
    
}

public void obtenerEmpleado(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JComboBox combo) throws SQLException{
    conectar();
    String [] datos;
    datos= new String[6];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    String id=(String) combo.getSelectedItem();
    resSet=st.executeQuery("select * from empleado where idEmpleado = "+id);
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        datos[4]=resSet.getString(5);
        datos[5]=resSet.getString(6);
    }
    campo1.setText(datos[1]);
    campo2.setText(datos[2]);
    campo3.setText(datos[3]);
    campo4.setText(datos[4]);
    campo5.setText(datos[5]);
    
    desconectar();
    
}

public void obtenerCliente(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JTextField campo6,JComboBox combo) throws SQLException{
    conectar();
    String [] datos;
    datos= new String[7];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    String id=(String) combo.getSelectedItem();
    resSet=st.executeQuery("select * from cliente where idCliente = "+id);
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        datos[4]=resSet.getString(5);
        datos[5]=resSet.getString(6);
        datos[6]=resSet.getString(7);
    }
    campo1.setText(datos[1]);
    campo2.setText(datos[2]);
    campo3.setText(datos[3]);
    campo4.setText(datos[4]);
    campo5.setText(datos[5]);
    campo6.setText(datos[6]);
    
    desconectar();
    
}

public void addCliente(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JTextField campo6) throws SQLException{
  conectar();
  String nombre = null,apMat = null,apPat = null,correo = null,tel=null,idsuc=null;
  String cad= "SET FOREIGN_KEY_CHECKS="+0;
  PreparedStatement PSSql = conexion.prepareStatement(cad);
  PSSql.executeUpdate();
   try {
       
       cad = "insert into cliente(nomCliente, appCliente, apmCliente, telCliete, correoCliente, idSuc) values(?,?,?,?,?,?)";
       PSSql = conexion.prepareStatement(cad);
       
        try{
            nombre = campo1.getText();
           
            apPat = campo2.getText();
          
            apMat = campo3.getText();

            tel = campo4.getText();
            
            correo=campo5.getText();
            
            idsuc=campo6.getText();

            } catch(InputMismatchException ex) {
           System.out.println("Ingresaste una letra en vez de un número.");
        }
       
        PSSql.setString(1, nombre);
        PSSql.setString(2, apPat);
        PSSql.setString(3, apMat);
        PSSql.setString(4, tel);
        PSSql.setString(5, correo);
        PSSql.setString(6, idsuc);
        
        PSSql.executeUpdate();
        
       } catch(MySQLIntegrityConstraintViolationException ex){
           System.out.println("Ese registro ya existe.");
       }
       
       cad = "SET FOREIGN_KEY_CHECKS="+1;
       PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
  desconectar();
}

public void addJefe(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5) throws SQLException{
       conectar();
       
       String nombre = "", apMat = "", apPat = "", tel = "",correo="";
       double d;
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
       
       try {
       
       cad = "insert into jefe (nomJefe, appJefe, apmJefe, telJefe, correoJefe) VALUES(?,?,?,?,?)";
       PSSql = conexion.prepareStatement(cad);
       
        try{
            nombre = campo1.getText();
           
            apPat = campo2.getText();
          
            apMat = campo3.getText();

            tel = campo4.getText();
            
            correo=campo5.getText();
            
            
            } catch(InputMismatchException ex) {
           System.out.println("Ingresaste una letra en vez de un número.");
        }
        PSSql.setString(1, nombre);
        PSSql.setString(2, apPat);
        PSSql.setString(3, apMat);
        PSSql.setString(4, tel);
        PSSql.setString(5, correo);
        
        PSSql.executeUpdate();
        
       } catch(MySQLIntegrityConstraintViolationException ex){
           System.out.println("Ese registro ya existe.");
       }
       
       cad = "SET FOREIGN_KEY_CHECKS="+1;
       PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
       
       desconectar();
       
      
       
   }

public void addSucursal(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5) throws SQLException{
       conectar();
       
       String nombre = "",ubiSuc="", pasillos = "",colabs ="",idjefe="";
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
       
       try {
      
       cad = "insert into sucursal(nomSuc, ubiSuc, pasillosSuc, colabsSuc, idJefe) VALUES(?,?,?,?,?)";
       PSSql = conexion.prepareStatement(cad);
       
        try{
            nombre = campo1.getText();
           
            ubiSuc = campo2.getText();
          
            pasillos = campo3.getText();

            colabs = campo4.getText();
            
            idjefe = campo5.getText();
            
            
            } catch(InputMismatchException ex) {
           System.out.println("Ingresaste una letra en vez de un número.");
        }
        
        PSSql.setString(1, nombre);
        PSSql.setString(2, ubiSuc);
        PSSql.setString(3, pasillos);
        PSSql.setString(4, colabs);
        PSSql.setString(5, idjefe);
        
        PSSql.executeUpdate();
        
       } catch(MySQLIntegrityConstraintViolationException ex){
           System.out.println("Ese registro ya existe.");
       }
       
       cad = "SET FOREIGN_KEY_CHECKS="+1;
       PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
       
       desconectar();  
   }


public void addEmpleado(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5) throws SQLException{
       conectar();
       String nombre = "",app="", appm= "",tel="",idSuc="";
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
       
       try {
       
       cad = "insert into empleado(nomEmpleado, appEmpleado, apmEmpleado, telEmpleado, idSuc) VALUES(?,?,?,?,?)";
       PSSql = conexion.prepareStatement(cad);
       
        try{
            nombre = campo1.getText();
           
            app = campo2.getText();
          
            appm = campo3.getText();
            
            tel = campo4.getText();
            
            idSuc=campo5.getText();
            
            } catch(InputMismatchException ex) {
           System.out.println("Ingresaste una letra en vez de un número.");
        }
        
        PSSql.setString(1, nombre);
        PSSql.setString(2, app);
        PSSql.setString(3, appm);
        PSSql.setString(4, tel);
        PSSql.setString(5, idSuc);
        
        PSSql.executeUpdate();
        
       } catch(MySQLIntegrityConstraintViolationException ex){
           System.out.println("Ese registro ya existe.");
       }
       
       cad = "SET FOREIGN_KEY_CHECKS="+1;
       PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
       
       desconectar();  
   }

public void addPasillo(JTextField campo1,JTextField campo2,JTextField campo3) throws SQLException{
       conectar();
       String nombre = "",idEncar="", idSuc= "";
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
       
       try {
       
       cad = "insert into pasillos(nomPasillo, idEncargado, idSuc) VALUES(?,?,?)";
       PSSql = conexion.prepareStatement(cad);
       
        try{
            nombre = campo1.getText();
           
            idEncar = campo2.getText();
          
            idSuc = campo3.getText();
            
            
            } catch(InputMismatchException ex) {
           System.out.println("Ingresaste una letra en vez de un número.");
        }
        
        PSSql.setString(1, nombre);
        PSSql.setString(2, idEncar);
        PSSql.setString(3, idSuc);
       
        PSSql.executeUpdate();
        
       } catch(MySQLIntegrityConstraintViolationException ex){
           System.out.println("Ese registro ya existe.");
       }
       
       cad = "SET FOREIGN_KEY_CHECKS="+1;
       PSSql = conexion.prepareStatement(cad);
       PSSql.executeUpdate();
       
       desconectar();  
   }

public void upCliente(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JComboBox combo) throws SQLException{
       conectar();

            
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
    
       try {
        
        String id = (String) combo.getSelectedItem();
        
           String nombre = campo1.getText();
           
            String apPat = campo2.getText();
          
            String apMat = campo3.getText();

            String tel = campo4.getText();
            
            String correo= campo5.getText();
           
           try{
               cad = "update cliente set nomCliente='"+nombre+"', appCliente='"+apPat+"', apmCliente='"+apMat+"', telCliete='"+tel+"', correoCliente='"+correo+"' where idCliente ='"+id+"'";
               PSSql = conexion.prepareStatement(cad);
               PSSql.executeUpdate();
           } catch(SQLException ex){
               System.out.println("Hubo un error");
           }
            
        }catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo"+ex);
        }
        
        
        cad = "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
    desconectar();
   }

public void upEmpleado(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JComboBox combo) throws SQLException{
       conectar();

            
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
    
       try {
        
        String id = (String) combo.getSelectedItem();
        
           String nombre = campo1.getText();
           
            String apPat = campo2.getText();
          
            String apMat = campo3.getText();

            String tel = campo4.getText();
            
            
           
           try{
               cad = "update empleado set nomEmpleado='"+nombre+"', appEmpleado='"+apPat+"', apmEmpleado='"+apMat+"', telEmpleado='"+tel+"' where idEmpleado ='"+id+"'";
               PSSql = conexion.prepareStatement(cad);
               PSSql.executeUpdate();
           } catch(SQLException ex){
               System.out.println("Hubo un error");
           }
            
        }catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo"+ex);
        }
        
        
        cad = "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
    desconectar();
   }

public void upSucursal(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JComboBox combo) throws SQLException{
       conectar();

            
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
    
       try {
        
        String id = (String) combo.getSelectedItem();
        
           String nombre = campo1.getText();
           
            String ubic = campo2.getText();
          
            String pasillos = campo3.getText();

            String colabs = campo4.getText();
            
            
           
           try{
               cad = "update sucursal set nomSuc='"+nombre+"', ubiSuc='"+ubic+"', pasillosSuc='"+pasillos+"', colabsSuc='"+colabs+"' where idSuc ='"+id+"'";
               PSSql = conexion.prepareStatement(cad);
               PSSql.executeUpdate();
           } catch(SQLException ex){
               System.out.println("Hubo un error");
           }
            
        }catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo"+ex);
        }
        
        
        cad = "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
    desconectar();
   }

public void upJefe(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JComboBox combo) throws SQLException{
       conectar();

            
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
    
       try {
        
        String id = (String) combo.getSelectedItem();
        
           String nombre = campo1.getText();
           
            String app = campo2.getText();
          
            String apm = campo3.getText();

            String tel= campo4.getText();
            
            String correo=campo5.getText();
            
            
           
           try{
               cad = "update jefe set nomJefe='"+nombre+"', appJefe='"+app+"', apmJefe='"+apm+"', telJefe='"+tel+"', correoJefe='"+correo+"' where idJefe ='"+id+"'";
               PSSql = conexion.prepareStatement(cad);
               PSSql.executeUpdate();
           } catch(SQLException ex){
               System.out.println("Hubo un error");
           }
            
        }catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo"+ex);
        }
        
        
        cad = "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
    desconectar();
   }



public void upPasillos(JTextField campo1,JComboBox combo) throws SQLException{
       conectar();
       
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
    
       try {
       String id = (String) combo.getSelectedItem();
        
            String nombre = campo1.getText();
           
           
           try{
               cad = "update pasillos set nomPasillo='"+nombre+"' where idPasillo ='"+id+"'";
               PSSql = conexion.prepareStatement(cad);
               PSSql.executeUpdate();
           } catch(SQLException ex){
               System.out.println("Hubo un error");
           }
            
        }catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo"+ex);
        }
        
        
        cad = "SET FOREIGN_KEY_CHECKS="+1;
        PSSql = conexion.prepareStatement(cad);
    desconectar();
   }

public void delJefe(String id) throws SQLException{
       conectar();

            try{
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
     
        try {                   
            cad = "delete from jefe where idJefe = "+"'"+id+"'";
        } catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo.");
        }
        
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        } catch(SQLIntegrityConstraintViolationException ex){
               JOptionPane.showMessageDialog(null, 
                       "No fue posible eliminar el registro ya que tiene registros asociados en otras tablas.", 
                       "Error", JOptionPane.ERROR_MESSAGE);
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error..."+ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        
        
    }

public void delSucursal(JComboBox combo) throws SQLException{
       conectar();

            try{
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
     
        try {
            String id = (String) combo.getSelectedItem();                    
            cad = "delete from cliente where idSuc = "+"'"+id+"'";
        } catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo.");
        }
        
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        try {
            String id = (String) combo.getSelectedItem();                    
            cad = "delete from pasillos where idSuc = "+"'"+id+"'";
        } catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo.");
        }
        
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        try {
            String id = (String) combo.getSelectedItem();                    
            cad = "delete from empleado where idSuc = "+"'"+id+"'";
        } catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo.");
        }
        
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        try {
            String id = (String) combo.getSelectedItem();                    
            cad = "delete from sucursal where idSuc = "+"'"+id+"'";
        } catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo.");
        }
        
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        } catch(SQLException ex){
               JOptionPane.showMessageDialog(null, "Hubo un error..."+ex, "Error", JOptionPane.ERROR_MESSAGE);
           }
        desconectar();
        
        
    }

public void delEmpleado(String id) throws SQLException{
       conectar();

            try{
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
     
        try {                    
            cad = "delete from empleado where idEmpleado = "+"'"+id+"'";
        } catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo.");
        }
        
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        } catch(SQLException ex){
               JOptionPane.showMessageDialog(null, "Hubo un error..."+ex, "Error", JOptionPane.ERROR_MESSAGE);
           }
        desconectar();
        
        
    }


public void delCliente(String id) throws SQLException{
       conectar();

            try{
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
     
        try {                   
            cad = "delete from cliente where idCliente = "+"'"+id+"'";
        } catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo.");
        }
        
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        } catch(SQLException ex){
               JOptionPane.showMessageDialog(null, "Hubo un error..."+ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }

public void delPasillo(String id) throws SQLException{
       conectar();

            try{
       String cad = "SET FOREIGN_KEY_CHECKS="+0;
       PreparedStatement PSSql = conexion.prepareStatement(cad);
     
        try {                 
            cad = "delete from pasillos where idPasillo = "+"'"+id+"'";
        } catch(InputMismatchException ex){
            System.out.println("Ingresaste un valor erroneo.");
        }
        
        PSSql = conexion.prepareStatement(cad);
        PSSql.executeUpdate();
        
        } catch(SQLException ex){
               JOptionPane.showMessageDialog(null, "Hubo un error..."+ex, "Error", JOptionPane.ERROR_MESSAGE);
           }
        desconectar();
        
        
    }
public void idJefe(ArrayList arreglo) throws SQLException{
    conectar();
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("select idJefe from jefe");
    while(resSet.next()){
        arreglo.add( resSet.getString(1));
    }
}
public void idSucursal(ArrayList arreglo) throws SQLException{
    conectar();
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("select idSuc from sucursal");
    while(resSet.next()){
        arreglo.add( resSet.getString(1));
    }
}
public void idEmpleado(ArrayList arreglo) throws SQLException{
    conectar();
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("select idEmpleado from empleado");
    while(resSet.next()){
        arreglo.add( resSet.getString(1));
    }
}
public void idCliente(ArrayList arreglo) throws SQLException{
    conectar();
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("select idCliente from cliente");
    while(resSet.next()){
        arreglo.add( resSet.getString(1));
    }
}
public void idPasillos(ArrayList arreglo) throws SQLException{
    conectar();
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("select idPasillo from pasillos");
    while(resSet.next()){
        arreglo.add( resSet.getString(1));
    }
}
public void rellenarComboID(JComboBox combo,ArrayList arreglo){
            //variable para tomar elid
            String id;
            //se limpia el combo
            combo.removeAllItems();//limpia el combobox
            //try por si fallara al momento de rellenar
            try{
                //Se recorre con un for la lista de conductores
                for(int i = 0; i<arreglo.size(); i++){
                    /**Se le da el valor sacado desde el Array listarConductores
                     */
                    id=(String) arreglo.get(i);
                    //Se arega un nuevo ítem al combobox
                    combo.addItem(id);
                }
            }catch(Exception e){ //capta el error y lo muestra
                JOptionPane.showMessageDialog(null,"Error al cargar ComboBox" + e);
            }
        }

public void EncargadosSinUbicacion(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"Empleado","Sucursal"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[2];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("SELECT * FROM EncargadosSinUbicacion");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void EncargadosGomez(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"Empleado","Sucursal"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[2];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("SELECT * FROM EncargadosGomez");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void EncargadosTorreon(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"Empleado","Sucursal"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[2];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("SELECT * FROM EncargadosTorreon");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void AtencioClientes(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"Hablar Con","En La Tienda","Contacto"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[3];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("SELECT * FROM AtencionClientes");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void JefesSucursal(JTable tabla) throws SQLException{
    conectar();
     String [] nombre={"Jefe","Encargado","Sucursal","Ubicacion"};
    DefaultTableModel modelo = new DefaultTableModel(null,nombre);
    String [] datos;
    datos= new String[4];
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet;
    resSet=st.executeQuery("SELECT * FROM jefes_sucursal");
    while(resSet.next()){
        datos[0]=resSet.getString(1);
        datos[1]=resSet.getString(2);
        datos[2]=resSet.getString(3);
        datos[3]=resSet.getString(4);
        modelo.addRow(datos);
    }
    tabla.setModel(modelo);
    desconectar();
}

public void buscarMiTienda(String id) throws SQLException{

    conectar();
    String tienda;
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    resSet=st.executeQuery("Call QuieroMiTienda('"+id+"');");
    while(resSet.next()){
        tienda = resSet.getString(1);
        if (tienda.compareTo("") != 0) {
            JOptionPane.showMessageDialog(null, "Estas registrado en la sucursal  "+tienda);
        } else {
            JOptionPane.showMessageDialog(null, "No estas registrado en ninguna tienda. ");
        }
    }    
    desconectar();
    
}
public void buscarAdministradorPasillo(String id) throws SQLException{
    try{
      conectar();
    String pasillo;
    Statement st;
    st=(Statement)conexion.createStatement();
    ResultSet resSet; 
    resSet=st.executeQuery("Call PasilloAdministrado('"+id+"');");
    while(resSet.next()){
        pasillo = resSet.getString(1);
        if (pasillo.compareTo("") != 0) {
            JOptionPane.showMessageDialog(null, "El empleado "+ id +" es el encargado del pasillo(s) "+pasillo);
        } else {
            JOptionPane.showMessageDialog(null, "No estas registrado en ninguna tienda. ");
        }
    }    
    desconectar();  
    } catch(MysqlDataTruncation ex){
       JOptionPane.showMessageDialog(null, "Ingresa un número.");
    }
    
    
}
public void crearBasedeDatos(int val){
        switch (val) {
            case 0:     
        try {
            crear();
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Conectado A La Base De Datos CAIVUL");
               break;
    }
}
}

