/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnotacionpolaca;

import Clases.NotacionPolaca;
import Clases.Validación;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ahdeijack
 */
public class notacion_polaca extends javax.swing.JPanel {

    /**
     * Creates new form notacion_polaca
     */
    String entrada;
    Validación cadena;
    StringBuilder post;
    NotacionPolaca np;
    
    public notacion_polaca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextCopia = new javax.swing.JTextField();
        jButCop = new javax.swing.JButton();
        jCombo = new javax.swing.JComboBox<>();
        jButAdd = new javax.swing.JButton();
        jTextEntrada = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(420, 320));

        jTextCopia.setEditable(false);
        jTextCopia.setToolTipText("Notación post-fija.");

        jButCop.setText("Copiar");
        jButCop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCopActionPerformed(evt);
            }
        });

        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a+b+c", "a(b+c)/d", "1+2*3/4^5", "2(2*3/7)+10((2^30)/(9/(10*50)))" }));

        jButAdd.setText("Agregar");
        jButAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAddActionPerformed(evt);
            }
        });

        jTextEntrada.setToolTipText("Agrega una notacion infija.");
        jTextEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextEntradaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextEntrada)
                    .addComponent(jButAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo, 0, 0, Short.MAX_VALUE)
                    .addComponent(jButCop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jTextEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButAdd)
                .addGap(6, 6, 6)
                .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButCop)
                .addGap(6, 6, 6)
                .addComponent(jTextCopia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButCopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCopActionPerformed
        // TODO add your handling code here:
        entrada = jCombo.getSelectedItem()+"";

        cadena = new Validación();

        post = new StringBuilder(entrada);

        jTextCopia.setText(entrada);
        np = new NotacionPolaca();
        post = np.convertirANotacionPostFija(entrada);

        jTextCopia.setText(post+"");
    }//GEN-LAST:event_jButCopActionPerformed

    private void jButAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAddActionPerformed
        // TODO add your handling code here:
        if(jTextEntrada.getText() == ""){
            JOptionPane.showMessageDialog(this, "Ingresa un valor!");
        } else  {

            entrada =  jTextEntrada.getText();
            cadena = new Validación();

            if (cadena.Validar(entrada) == false) {
                JOptionPane.showMessageDialog(this, entrada+", tiene valores invalidos.");
            } else {
                jCombo.addItem(jTextEntrada.getText());
                jTextEntrada.setText("");
            }
        }

    }//GEN-LAST:event_jButAddActionPerformed

    private void jTextEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEntradaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButAdd.doClick();
        }
    }//GEN-LAST:event_jTextEntradaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAdd;
    private javax.swing.JButton jButCop;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JTextField jTextCopia;
    private javax.swing.JTextField jTextEntrada;
    // End of variables declaration//GEN-END:variables
}
