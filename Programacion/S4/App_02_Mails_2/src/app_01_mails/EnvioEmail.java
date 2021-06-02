/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_01_mails;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.AuthenticationFailedException;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ahdeijack
 */
public class EnvioEmail extends javax.swing.JFrame {

    /**
     * Creates new form EnvioEmail
     */
    String arch;
    String nom;
    String[] vect;
    String user, pass;
    public EnvioEmail(login log) {
        initComponents();
        user = log.getUser();
        pass = log.getPassword();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextSend = new javax.swing.JTextField();
        jButHelp = new javax.swing.JButton();
        jLabSend = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextAsunto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextCuerpo = new javax.swing.JTextArea();
        jButSend = new javax.swing.JButton();
        jButArchivo = new javax.swing.JButton();
        jTextRuta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enviar Correo.");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextSend.setToolTipText("Para mandar a mas de un destinatario, separar con \",\"");
        getContentPane().add(jTextSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, -1));

        jButHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_help_12px.png"))); // NOI18N
        jButHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButHelpActionPerformed(evt);
            }
        });
        getContentPane().add(jButHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 13, 30, 30));

        jLabSend.setBackground(new java.awt.Color(204, 204, 255));
        jLabSend.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N
        jLabSend.setText("Enviar a:");
        jLabSend.setOpaque(true);
        getContentPane().add(jLabSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, 380, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N
        jLabel2.setText("Asunto:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 380, -1));
        getContentPane().add(jTextAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, 380, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N
        jLabel3.setText("Cuerpo:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 380, -1));

        jTextCuerpo.setColumns(20);
        jTextCuerpo.setRows(5);
        jScrollPane1.setViewportView(jTextCuerpo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 380, -1));

        jButSend.setText("Enviar");
        jButSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSendActionPerformed(evt);
            }
        });
        getContentPane().add(jButSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 290, -1, -1));

        jButArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_link_12px.png"))); // NOI18N
        jButArchivo.setToolTipText("Adjuntar Archivo");
        jButArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(jButArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        getContentPane().add(jTextRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 290, 258, 23));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Escribir Mensaje.");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 380, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg-send.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSendActionPerformed
        // TODO add your handling code here:
        
       
        Properties  props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        
        
        //Quién recibe.
        Session sesion = Session.getDefaultInstance(props);
        String envia= user;
        String password=pass;
        String para=this.jTextSend.getText();
        String asunto=this.jTextAsunto.getText();
        String cuerpo=this.jTextCuerpo.getText();
        vect=para.split(",");
        String archivo = this.jTextRuta.getText();
        BodyPart texto = new MimeBodyPart();
        
         if (para.equals("")) {
            jLabSend.setText("Enviar a: (NECESITAS AGREGAR UN DESTINATARIO)");
            
        } else {
           String host = "relay.jangosmtp.net";
        
        if (archivo.equals("")) {
            //Si no hay archivo adjunto.
             try {
                for (int i = 0; i < vect.length; i++) {
                    //Cuerpo del correo
                    texto.setText(cuerpo);
  
                    MimeMultipart multiParte = new MimeMultipart();
                    multiParte.addBodyPart(texto);        
                    
                    MimeMessage message = new MimeMessage(sesion);
                    
                    //Enviado por
                    message.setFrom(new InternetAddress(envia));
                    //Destinatario(s)
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(vect[i]));
                    
                    //Asunto
                    message.setSubject(asunto);
                    message.setContent(multiParte);
                    
                    
                    Transport trans = null;
                    trans = sesion.getTransport("smtp");
                    
                    try {
                    trans.connect(envia, password);
                    } catch (AuthenticationFailedException ex){
                        JOptionPane.showMessageDialog(this, "Hubo un error en el iniciode sesión. ");
                           System.exit(0);
                    }
                    
                    trans.sendMessage(message, message.getAllRecipients());
                    trans.close();
                }
            JOptionPane.showMessageDialog(null,"Correo Enviado");
        } catch (MessagingException ex) {
            Logger.getLogger(EnvioEmail.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
            
        } else {
            //Si hay archivo adjunto.
             try {
                for (int i = 0; i < vect.length; i++) {
                    //Cuerpo del correo
                    texto.setText(cuerpo);
                    
                    BodyPart adjunto = new MimeBodyPart();
                    
                    //Archivo
                    adjunto.setDataHandler(new DataHandler(new FileDataSource(archivo)));
                    adjunto.setFileName(nom);
                    
                    MimeMultipart multiParte = new MimeMultipart();
                    multiParte.addBodyPart(texto);
                    multiParte.addBodyPart(adjunto);
                    
                    MimeMessage message = new MimeMessage(sesion);
                    
                    //Enviado por
                    message.setFrom(new InternetAddress(envia));
                    //Destinatario(s)
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(vect[i]));
                    
                    //Asunto
                    message.setSubject(asunto);
                    message.setContent(multiParte);
                    
                    
                    Transport trans = null;
                    trans = sesion.getTransport("smtp");
                    trans.connect(envia, password);
                    trans.sendMessage(message, message.getAllRecipients());
                    trans.close();
                }
            JOptionPane.showMessageDialog(null,"Correo Enviado");
        } catch (MessagingException ex) {
            Logger.getLogger(EnvioEmail.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
        }  
        }
        
        

        
    }//GEN-LAST:event_jButSendActionPerformed

    private void jButArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButArchivoActionPerformed
        // TODO add your handling code here:
       JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this);
        
        if (option == JFileChooser.APPROVE_OPTION) {
            arch = dlg.getSelectedFile().getPath();
            nom = dlg.getSelectedFile().getName();
            this.jTextRuta.setVisible(true);
            this.jTextRuta.setText(arch);
        }
    }//GEN-LAST:event_jButArchivoActionPerformed

    private void jButHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButHelpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Para mandar un correo, necesitas agregar minimo un destinatario. ");
        JOptionPane.showMessageDialog(this, "Para mandar un correo a mas de un destinatario, separa los correos con una ','. ");
        JOptionPane.showMessageDialog(this, "Puedes mandar correos con archivos adjuntos con el botón que esta debajo de la sección de cuerpo.");
        

    }//GEN-LAST:event_jButHelpActionPerformed

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
            java.util.logging.Logger.getLogger(EnvioEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnvioEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnvioEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnvioEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButArchivo;
    private javax.swing.JButton jButHelp;
    private javax.swing.JButton jButSend;
    private javax.swing.JLabel jLabSend;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAsunto;
    private javax.swing.JTextArea jTextCuerpo;
    private javax.swing.JLabel jTextRuta;
    private javax.swing.JTextField jTextSend;
    // End of variables declaration//GEN-END:variables
}
