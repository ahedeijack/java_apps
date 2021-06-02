//Ahedeijack
//Carlos A. Vazquez 
//18131288


package PRACTICA_01_DOCS;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Frame extends javax.swing.JFrame {

    
    
    public Frame() {
        initComponents();
        
        
    }

    int tam = 0;
    double sumaProm;
    int numPedidos;
    int sumaFaltantes;
    
    public float getConstante(int Mes)
    {
        switch (Mes)
        {
            case 1: return (float) 1.2;
            case 2: return 1;
            case 3: return (float) 0.9;
            case 4: return (float) 0.8;
            case 5: return (float) 0.8;
            case 6: return (float) 0.7;
            case 7: return (float) 0.8;
            case 8: return (float) 0.9;
            case 9: return 1;
            case 10: return (float) 1.2;
            case 11: return (float) 1.3;
            case 12: return (float) 1.4;
            
            default: return 1;
        }
    }
    
    public int getTiempoMes(double aleatorio)
    {
        if (aleatorio >= 0.1 && aleatorio <= 0.3)
            return 1;
        else
            if (aleatorio >= 0.4 && aleatorio <= 0.7)
                return 2;
        else
                if (aleatorio >= 0.8 && aleatorio <= 1)
                    return 3;
        else
                    return 1;
    }
    
    public int getCantidad(double aleatorio)
    {
        int cant = 0;
        
        if (aleatorio >= 0.001 && aleatorio <= 0.01)
            cant = 35;
        else
            if (aleatorio >= 0.011 && aleatorio <= 0.025)
            cant = 36;
        else
            if (aleatorio >= 0.026 && aleatorio <= 0.045)
            cant = 37;
        else
            if (aleatorio >= 0.046 && aleatorio <= 0.065)
            cant = 38;
        else
            if (aleatorio >= 0.066 && aleatorio <= 0.087)
            cant = 39;
        else
            if (aleatorio >= 0.088 && aleatorio <= 0.11)
            cant = 40;
        else
            if (aleatorio >= 0.111 && aleatorio <= 0.135)
            cant = 41;
        else
            if (aleatorio >= 0.136 && aleatorio <= 0.162)
            cant = 42;
        else
            if (aleatorio >= 0.163 && aleatorio <= 0.19)
            cant = 43;
        else
            if (aleatorio >= 0.191 && aleatorio <= 0.219)
            cant = 44;
        else
            if (aleatorio >= 0.22 && aleatorio <= 0.254)
            cant = 45;
        else
            if (aleatorio >= 0.255 && aleatorio <= 0.299)
            cant = 46;
        else
            if (aleatorio >= 0.3 && aleatorio <= 0.359)
            cant = 47;
        else
            if (aleatorio >= 0.36 && aleatorio <= 0.424)
            cant = 48;
        else
            if (aleatorio >= 0.425 && aleatorio <= 0.494)
            cant = 49;
        else
            if (aleatorio >= 0.495 && aleatorio <= 0.574)
            cant = 50;
        else
            if (aleatorio >= 0.575 && aleatorio <= 0.649)
            cant = 51;
        else
            if (aleatorio >= 0.65 && aleatorio <= 0.719)
            cant = 52;
        else
            if (aleatorio >= 0.72 && aleatorio <= 0.784)
            cant = 53;
        else
            if (aleatorio >= 0.785 && aleatorio <= 0.844)
            cant = 54;
        else
            if (aleatorio >= 0.845 && aleatorio <= 0.894)
            cant = 55;
        else
            if (aleatorio >= 0.895 && aleatorio <= 0.934)
            cant = 56;
        else
            if (aleatorio >= 0.935 && aleatorio <= 0.964)
            cant = 57;
        else
            if (aleatorio >= 0.965 && aleatorio <= 0.98)
            cant = 58;
        else
            if (aleatorio >= 0.981 && aleatorio <= 0.995)
            cant = 59;
        else
            if (aleatorio >= 0.996 && aleatorio <= 1)
            cant = 60;
        
        return cant;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldQ = new javax.swing.JTextField();
        jTextFieldR = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButSimular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCosto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButSimular1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIMULACION 02 18131288");
        setResizable(false);

        jTable.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cantidad de Pedido", "Mes", "Inv. Inicial", "# Aleatorio", "Demanda Simulada", "Demanda Ajustada", "Inv. Final", "Faltante", "Orden", "Num. Aleatorio", "Tiempo Entrega", "Promedio Inv."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(4).setPreferredWidth(110);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(5).setPreferredWidth(110);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTable.getColumnModel().getColumn(7).setResizable(false);
            jTable.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTable.getColumnModel().getColumn(8).setResizable(false);
            jTable.getColumnModel().getColumn(8).setPreferredWidth(40);
            jTable.getColumnModel().getColumn(9).setResizable(false);
            jTable.getColumnModel().getColumn(9).setPreferredWidth(85);
            jTable.getColumnModel().getColumn(10).setResizable(false);
            jTable.getColumnModel().getColumn(10).setPreferredWidth(90);
            jTable.getColumnModel().getColumn(11).setResizable(false);
            jTable.getColumnModel().getColumn(11).setPreferredWidth(100);
        }

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel1.setText("SISTEMA DE INVENTARIOS. (Simulacion 01)");
        jLabel1.setOpaque(true);

        jTextFieldQ.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jTextFieldQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQActionPerformed(evt);
            }
        });

        jTextFieldR.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel2.setText("Q");

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel3.setText("R");

        jButSimular.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jButSimular.setText("SIMULAR");
        jButSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSimularActionPerformed(evt);
            }
        });

        jTableCosto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Q en Unidades", "R en Unidades", "Costo de Ordenar", "Costo de Almacen", "Costo de Faltante", "Costo Total"
            }
        ));
        jScrollPane2.setViewportView(jTableCosto);
        if (jTableCosto.getColumnModel().getColumnCount() > 0) {
            jTableCosto.getColumnModel().getColumn(0).setResizable(false);
            jTableCosto.getColumnModel().getColumn(1).setResizable(false);
            jTableCosto.getColumnModel().getColumn(2).setResizable(false);
            jTableCosto.getColumnModel().getColumn(3).setResizable(false);
            jTableCosto.getColumnModel().getColumn(4).setResizable(false);
            jTableCosto.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        jLabel5.setText("Carlos A Vazquez. 18131288");
        jLabel5.setOpaque(true);

        jButSimular1.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jButSimular1.setText("*Q & R Aleatorios");
        jButSimular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSimular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButSimular1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 815, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jButSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButSimular1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQActionPerformed

    private void jButSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSimularActionPerformed
        
        if (!jTextFieldQ.getText().equals("") && !jTextFieldR.getText().equals(""))
        {
        
        numPedidos = 0;
        sumaProm = 0;
        sumaFaltantes = 0;
        
        for (int i = 0; i < 12; i++) {
            jTable.setValueAt(null, i, 0);
            jTable.setValueAt(null, i, 1);
            jTable.setValueAt(null, i, 2);
            jTable.setValueAt(null, i, 3);
            jTable.setValueAt(null, i, 4);
            jTable.setValueAt(null, i, 5);
            jTable.setValueAt(null, i, 6);
            jTable.setValueAt(null, i, 7);
            jTable.setValueAt(null, i, 8);
            jTable.setValueAt(null, i, 9);
            jTable.setValueAt(null, i, 10);
            jTable.setValueAt(null, i, 11);
        }
        
        int Q = Integer.parseInt(jTextFieldQ.getText());
        int R = Integer.parseInt(jTextFieldR.getText());
        int mesReor = 0;
        boolean ordenactiva = false;
        
        
        Random azar = new Random();
        double aleatorio = azar.nextDouble();
        DecimalFormat df = new DecimalFormat("##,###,##0.000");
        DecimalFormat df2 = new DecimalFormat("##,###,##0.0");
        DecimalFormat df3 = new DecimalFormat("##,###,##0.00");
        
        Simulacion uno = new Simulacion(0, 1, 150, aleatorio, 46, 1, 150, 0, false, 0, 0, 0, 0, 0);
        jTable.setValueAt(uno.getCantPedido(), 0, 0);
        for (int r = 0; r < 12; r++) {
            df.format(uno.getNumAlea1());
             
            uno.setOrden(false);
            
            uno.setInvInic(uno.getInvFin());
            if (uno.getMes() == mesReor)
            {
                uno.setCantPedido(Q);
                uno.setInvInic(uno.getInvFin() + Q - uno.getFaltante());
                ordenactiva = false;
            }
                
                
            jTable.setValueAt(uno.getCantPedido(), r, 0);
            uno.setCantPedido(0);
            jTable.setValueAt(uno.getMes(), r, 1);
            jTable.setValueAt(uno.getInvInic(), r, 2);
            double aleatorio1 = azar.nextDouble();
            uno.setNumAlea1(aleatorio1);
            jTable.setValueAt(uno.getNumAlea1(), r, 3);
            uno.setDemSim(getCantidad(Double.parseDouble(df.format(uno.getNumAlea1()))));
            jTable.setValueAt(uno.getDemSim(), r, 4);
            float cons = getConstante(uno.getMes());
            uno.setDemAjus(Math.round(cons * uno.getDemSim()));
            jTable.setValueAt(uno.getDemAjus(), r, 5);
            if((uno.getInvInic() - uno.getDemAjus()) >= 0)
            {
                uno.setInvFin(uno.getInvInic() - uno.getDemAjus());
                uno.setFaltante(0);
            }
            else
            {
                uno.setInvFin(0);
                uno.setFaltante(-(uno.getInvInic() - uno.getDemAjus() -  uno.getFaltante()));
            }
                 
             
            jTable.setValueAt(uno.getInvFin(), r, 6);
            sumaFaltantes = sumaFaltantes + uno.getFaltante();
            jTable.setValueAt(uno.getFaltante(), r, 7);
            jTable.setValueAt(uno.getCantPedido(), r, 8);
             
            if(uno.getInvFin() <= R && ordenactiva == false)
                uno.setOrden(true);
             
            if(uno.getOrden() == true )
            {
                numPedidos++;
                double aleatorio2 = azar.nextDouble();
                uno.setNumAlea2(aleatorio2);
                
                jTable.setValueAt(1, r, 8);
                 
                uno.setTiempo(getTiempoMes(Double.parseDouble(df2.format(aleatorio2))));
                 
                jTable.setValueAt(uno.getNumAlea2(), r, 9);
                jTable.setValueAt(uno.getTiempo(), r, 10);
                 
                ordenactiva = true;
                uno.setOrden(false);
                
                mesReor = uno.getMes() + uno.getTiempo() + 1;
            }
             
            if (uno.getFaltante() > 0)
            {
                uno.setInvProm((Math.pow(uno.getInvInic(), 2))/(2*uno.getDemAjus()));
                jTable.setValueAt(uno.getInvProm(), r, 11);
                sumaProm = sumaProm + uno.getInvProm();
            }
            else
            {
                uno.setInvProm((uno.getInvInic() + uno.getInvFin())/2.0);
                jTable.setValueAt(uno.getInvProm(), r, 11);
                sumaProm = sumaProm + uno.getInvProm();
            }
                
            
            uno.setMes(uno.getMes() + 1);
        }
        
        tam = tam + 1;
        DefaultTableModel modelo = (DefaultTableModel) jTableCosto.getModel();
        
        double costoOrd = numPedidos * 100;
        double costoAlm = (sumaProm/12)*(20);
        double costoFal = sumaFaltantes * 50;
        
        modelo.setRowCount(tam);
        jTableCosto.setValueAt(Q, tam-1, 0);
        jTableCosto.setValueAt(R, tam-1, 1);
        jTableCosto.setValueAt(df3.format(costoOrd), tam-1, 2);
        jTableCosto.setValueAt(df3.format(costoAlm), tam-1, 3);
        jTableCosto.setValueAt(df3.format(costoFal), tam-1, 4);
        jTableCosto.setValueAt(df3.format(costoOrd + costoAlm + costoFal), tam-1, 5);
        
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ingrese valores en Q & R");
        }
    }//GEN-LAST:event_jButSimularActionPerformed

    private void jButSimular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSimular1ActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
        int randQR = rand.nextInt(300)+1;
        jTextFieldQ.setText(randQR+"");
        jTextFieldR.setText((randQR-rand.nextInt(200)+100)+"");
    }//GEN-LAST:event_jButSimular1ActionPerformed

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
    private javax.swing.JButton jButSimular;
    private javax.swing.JButton jButSimular1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTableCosto;
    private javax.swing.JTextField jTextFieldQ;
    private javax.swing.JTextField jTextFieldR;
    // End of variables declaration//GEN-END:variables
}
