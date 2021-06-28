
package practica2_simulacion_19130927;

import java.text.DecimalFormat;
import java.util.Random;


public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
    }

    public int getTiempoLlegada(double aleatorio) 
    {
        int num = 0;
        if (aleatorio >= 0.01 && aleatorio <= 0.25)
            return 5;
        else
            if (aleatorio >= 0.25 && aleatorio <= 0.75)
                return 10;
        else
                if (aleatorio >= 0.76 && aleatorio <= 1.0)
                    return 15;
        else
                    return 0; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNoCliEsp = new javax.swing.JLabel();
        jLabelTiemPromEsp = new javax.swing.JLabel();
        jLabelTiemTotEsp = new javax.swing.JLabel();
        jLabelTiemOcio = new javax.swing.JLabel();
        jLabelR1 = new javax.swing.JLabel();
        jLabelR2 = new javax.swing.JLabel();
        jLabelR3 = new javax.swing.JLabel();
        jLabelR4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Clte.", "Num. Aleatorio", "Tiempo Ind.", "Tiempo Acum.", "Entrada", "Salida", "Tiempo Esp.", "¿Espero?", "Tiempo Ocio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(7).setResizable(false);
            jTable.getColumnModel().getColumn(8).setResizable(false);
        }

        jBut.setBackground(new java.awt.Color(153, 255, 153));
        jBut.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jBut.setText("Simular");
        jBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Practica 2 Simulación");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Lydia Analy Ibarra Narvaez 19130927");
        jLabel2.setOpaque(true);

        jLabelNoCliEsp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelNoCliEsp.setText("No. Clientes Esperan");

        jLabelTiemPromEsp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelTiemPromEsp.setText("Tiempo Promedio Espera");

        jLabelTiemTotEsp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelTiemTotEsp.setText("Tiempo Total Espera");

        jLabelTiemOcio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelTiemOcio.setText("Tiempo de Ocio");

        jLabelR1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelR2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelR3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelR4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBut, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelNoCliEsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelR1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTiemPromEsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelR2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabelTiemTotEsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelR3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabelTiemOcio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelR4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jBut))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelR1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNoCliEsp)
                        .addComponent(jLabelTiemPromEsp)
                        .addComponent(jLabelTiemTotEsp))
                    .addComponent(jLabelR2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelR3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTiemOcio)
                    .addComponent(jLabelR4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButActionPerformed
        
        Random azar = new Random();
        DecimalFormat df = new DecimalFormat("##,###,##0.00");
        
        int noCliente = 1;
        double numAleatorio = 0;
        int tiempoInd = 0;
        int tiempoAcum = 0;  
        int entrada = 0;
        int salida = 0;
        int tiempoEsp = 0;
        boolean espero = false;
        int tiempoOseo = 0;
        
        int noClienteEsperan = 0;
        int acumTiempoEspera = 0;
        int acumTiempoOcio = 0;
        
        for (int i = 0; i < 16; i++) {
            jTable.setValueAt(null, i, 0);
            jTable.setValueAt(null, i, 1);
            jTable.setValueAt(null, i, 2);
            jTable.setValueAt(null, i, 3);
            jTable.setValueAt(null, i, 4);
            jTable.setValueAt(null, i, 5);
            jTable.setValueAt(null, i, 6);
            jTable.setValueAt(null, i, 7);
            jTable.setValueAt(null, i, 8);
        }
        
        for (int i = 0; i < 16; i++) {
            
            jTable.setValueAt(noCliente, i, 0);
            noCliente++;
            
            jTable.setValueAt(numAleatorio, i, 1);
            numAleatorio = Double.parseDouble(df.format(azar.nextDouble()));
            jTable.setValueAt(tiempoInd, i, 2);
            tiempoAcum = tiempoAcum + tiempoInd;
            tiempoInd = getTiempoLlegada(numAleatorio);
            jTable.setValueAt(tiempoAcum, i, 3);
            
            if (tiempoAcum > salida)
            {
                entrada = tiempoAcum;
                tiempoEsp = 0;
                tiempoOseo = tiempoAcum - salida;
                espero = false;
                acumTiempoOcio = acumTiempoOcio + tiempoOseo;
            } 
            else 
                if (tiempoAcum < salida)
                    {
                        entrada = salida;
                        tiempoEsp = salida - tiempoAcum;
                        tiempoOseo = 0;
                        espero = true;
                        acumTiempoEspera = tiempoEsp + acumTiempoEspera;
                    }
                else 
                {
                    entrada = tiempoAcum;
                    tiempoEsp = 0;
                    tiempoOseo = 0;
                    espero = false;
                }
                
            
                
            
            jTable.setValueAt(entrada, i, 4);
            salida = entrada + 8;
            jTable.setValueAt(salida, i, 5);
            jTable.setValueAt(tiempoEsp, i, 6);
            
            if (espero) 
            {
                jTable.setValueAt("Si", i, 7);
                noClienteEsperan++;
            }
            else
                jTable.setValueAt("No", i, 7);
            
            jTable.setValueAt(tiempoOseo, i, 8);
            
            
        }
        
        jLabelR1.setText(Integer.toString(noClienteEsperan));
        jLabelR2.setText(Double.toString(acumTiempoEspera/16.0));
        jLabelR3.setText(Integer.toString(acumTiempoEspera)); 
        jLabelR4.setText(Integer.toString(acumTiempoOcio));
        
    }//GEN-LAST:event_jButActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNoCliEsp;
    private javax.swing.JLabel jLabelR1;
    private javax.swing.JLabel jLabelR2;
    private javax.swing.JLabel jLabelR3;
    private javax.swing.JLabel jLabelR4;
    private javax.swing.JLabel jLabelTiemOcio;
    private javax.swing.JLabel jLabelTiemPromEsp;
    private javax.swing.JLabel jLabelTiemTotEsp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
