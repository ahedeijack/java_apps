/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion_5_Vector_Primos;

import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

/**
 *
 * @author ahdeijack
 */
public class jPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jPrincipal
     */
    DefaultListModel modeloLista;
    
    public jPrincipal() {
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

        panel1 = new java.awt.Panel();
        jText1 = new javax.swing.JTextField();
        jText2 = new javax.swing.JTextField();
        jButSuma = new javax.swing.JButton();
        jButResta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButEuler = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButPrimo = new javax.swing.JButton();
        jButVerPrimos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 0, 0));

        jText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText1ActionPerformed(evt);
            }
        });

        jText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText2ActionPerformed(evt);
            }
        });

        jButSuma.setText("+");
        jButSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSumaActionPerformed(evt);
            }
        });

        jButResta.setText("-");
        jButResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRestaActionPerformed(evt);
            }
        });

        jButton3.setText("/");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButEuler.setText("e");
        jButEuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEulerActionPerformed(evt);
            }
        });

        jButton5.setText("e^x");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("π");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("^");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButPrimo.setText("Primo");
        jButPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPrimoActionPerformed(evt);
            }
        });

        jButVerPrimos.setText("Primos");
        jButVerPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButVerPrimosActionPerformed(evt);
            }
        });

        jList.setBackground(new java.awt.Color(1, 1, 1));
        jList.setForeground(new java.awt.Color(125, 127, 160));
        jList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "0" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator1)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButSuma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(jButResta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButVerPrimos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButEuler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButSuma)
                            .addComponent(jButPrimo))
                        .addGap(4, 4, 4)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButResta)
                            .addComponent(jButVerPrimos)))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton6))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButEuler))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSumaActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(""+jText1.getText());
        int b = Integer.parseInt(""+jText2.getText());
        
        modeloLista = new DefaultListModel();
        
        
        int result = a+b;
        modeloLista.addElement(result);
        jList.setModel(modeloLista);
    }//GEN-LAST:event_jButSumaActionPerformed

    private void jText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText2ActionPerformed

    private void jText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jText1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(jText1.getText()+"");
        int b = Integer.parseInt(jText2.getText()+"");
        modeloLista = new DefaultListModel();
        if (b < 0){
            modeloLista.addElement("El numero no puede ser divisible entre 0");
            jList.setModel(modeloLista);
        } else {
            double result = a/b;
            modeloLista.addElement(result);
            jList.setModel(modeloLista);
            
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButEulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEulerActionPerformed
        // TODO add your handling code here:
        double e = Matematicas.Euler();
        modeloLista.addElement(e);
        jList.setModel(modeloLista);
    }//GEN-LAST:event_jButEulerActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        double e = Matematicas.Euler();
        jText2.setText(e+"");
        int a = Integer.parseInt(jText1.getText()+"");
        if (a <= 0){
            a = 1;
        }
        double res = Matematicas.potenciaEuler(a);
        
        modeloLista.addElement(res);
        jList.setModel(modeloLista);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRestaActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(""+jText1.getText());
        int b = Integer.parseInt(""+jText2.getText());

        int result = a-b;
        modeloLista = new DefaultListModel();
        modeloLista.addElement(result);
        jList.setModel(modeloLista);

       
    }//GEN-LAST:event_jButRestaActionPerformed

    private void jButPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPrimoActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(""+jText1.getText());
        
        modeloLista = new DefaultListModel();
        
        
        boolean result = Matematicas.Primos(a);
       if (result == true){
         modeloLista.addElement((result+". Tu numero es primo."));
         jList.setModel(modeloLista);
       } else {
         modeloLista.addElement((result+". Tu numero no es primo."));
         jList.setModel(modeloLista);
       }
       
               

    }//GEN-LAST:event_jButPrimoActionPerformed

    private void jButVerPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButVerPrimosActionPerformed
        // TODO add your handling code here:
        int limI = Integer.parseInt(jText1.getText()+"");
        int limS = Integer.parseInt(""+jText2.getText());
        int aux;
        if(limI >= limS){
          aux = limI;
          limI = limS;
          limS = aux;
        }
        
        modeloLista = new DefaultListModel();
        
        //Obtenemos el tamaño del arreglo.
        int c = 0;
        for(int i = limI; i <= limS; i++){
            if(Matematicas.Primos(i)){
             c++;   
            }
        }
        
        
        int arreglo [] = new int[c];
        int dato = 0;
        for(int x = limI; x<=limS; x++){
           if(Matematicas.Primos(x)){
               arreglo[dato++] = x;
               
           }
       }
        
        for(int x = 0; x<arreglo.length; x++){
         modeloLista.addElement(arreglo[x]);  
       }
    
    jList.setModel(modeloLista);

        
    }//GEN-LAST:event_jButVerPrimosActionPerformed

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
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButEuler;
    private javax.swing.JButton jButPrimo;
    private javax.swing.JButton jButResta;
    private javax.swing.JButton jButSuma;
    private javax.swing.JButton jButVerPrimos;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JList jList;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jText1;
    private javax.swing.JTextField jText2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
