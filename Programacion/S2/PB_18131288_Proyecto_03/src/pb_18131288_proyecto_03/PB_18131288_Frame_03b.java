/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131288_proyecto_03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahedeijak
 */
public class PB_18131288_Frame_03b extends javax.swing.JFrame {

    /**
     * Creates new form PB_18131288_Frame_03b
     */
    
    PB_18131288_Frame_03a jFPrincipal;
    GrupoMusical [] copia;
    
    
    public PB_18131288_Frame_03b(PB_18131288_Frame_03a jfp) {
        initComponents();
        jFPrincipal = jfp;
        copia = new GrupoMusical[jFPrincipal.getBandasRegistradas()];
        
        for(int i = 0; i < copia.length; i++){
            copia[i] = jFPrincipal.getBanda(i);
        }
        
        
        
        //Hacemos un ciclo for para pode mandar la informacion a la clase super y poder compararlo con el metodo <compareTo>
        //El ciclo for, hara que se obtenga el numero de integrantes y los ordenara para asi, poder hacer el dibujo.
        
        
    }
    
    public void dibujar(){
        GrupoMusical [] copiaDibujos = jFPrincipal.dibujos;
        GrupoMusical [] copiaBanditas = jFPrincipal.banditas;
        
        
        for(int  i = 0; i <copiaBanditas.length; i++){
    for(int j = i+1; j<copiaBanditas.length; j++){
        if(copiaBanditas[i].getGenero().compareTo(copiaBanditas[j].getGenero())>0){
            
            GrupoMusical aux = copiaBanditas[i];
            copiaBanditas[i] = copiaBanditas[j];
            copiaBanditas[j] = aux;
            
            GrupoMusical auxD = copiaDibujos[i];
            copiaDibujos[i] = copiaDibujos[j];
            copiaDibujos[j] = aux;
            
        }
        
    }
}
        
        
        
         for(int i = 0; i < 1; i++){
            for(int j = 0; j<copiaDibujos.length; j++){
                
                copiaDibujos[j].mover(this, copiaDibujos);
                
                try {
                Thread.sleep(90);
                } catch (InterruptedException ex) {
                Logger.getLogger(PB_18131288_Frame_03b.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabMostrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabMostrar.setBackground(new java.awt.Color(0, 0, 0));
        jLabMostrar.setOpaque(true);
        jLabMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabMostrarMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deslisa el puntero sobre el rectangulo negro.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         dispose(); //Elimina el objeto de memoria
         jFPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabMostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabMostrarMouseEntered
        // TODO add your handling code here:
        dibujar();
    }//GEN-LAST:event_jLabMostrarMouseEntered

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
            java.util.logging.Logger.getLogger(PB_18131288_Frame_03b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PB_18131288_Frame_03b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PB_18131288_Frame_03b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PB_18131288_Frame_03b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PB_18131288_Frame_03b(new PB_18131288_Frame_03a()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabMostrar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
