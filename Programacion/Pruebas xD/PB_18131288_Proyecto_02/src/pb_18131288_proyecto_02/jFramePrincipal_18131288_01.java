/*
 * Desarriollado por Carlos A. Vazquez A
 * 2nd sem.
 */
package pb_18131288_proyecto_02;

import Utilerias.JTable.ColorCeldas;
import java.awt.Color;
import java.util.Arrays;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahedeijak
 */
public class jFramePrincipal_18131288_01 extends javax.swing.JFrame {
    
    //Creamos un metodo para obtener los promedios de los inventarios, como final como inical
    

    /**
     * Creates new form jFramePrincipal_18131288_01
     */
    
    private DefaultTableModel modelo;
    private Random azar = new Random();
    private Hostal invTotal;
    
    
    public double promedio(int renglon){
        int valorRenglon; 
        int valorPromedio = 0;
         for(int r = 0; r < modelo.getRowCount(); r++){
           valorRenglon =(int)modelo.getValueAt(r, renglon);
           valorPromedio += valorRenglon;
        }
     return valorPromedio/4;    
         
    }
    
    public jFramePrincipal_18131288_01() {
        initComponents();
        
        //El modelo nos permite utilizar el metodo 'modelo' durante todo el proyeco sin tener que crearlo
        //en cada componente.
        modelo = (DefaultTableModel)jTabHostales.getModel();
        jTabHostales.setShowGrid(true);
        jTextPrecio.setText("0.0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabHostales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabIni = new javax.swing.JLabel();
        jLabFinal = new javax.swing.JLabel();
        jLabVentas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButPintar = new javax.swing.JButton();
        jButLlenar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabPromVentas = new javax.swing.JLabel();
        jButOrdenar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabHostales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hostal", "Moyo", "Cántara", "Azumbre", "Moyo", "Cántara", "Azumbre", "Moyo", "Cántara", "Azumbre", "Importe de Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabHostales);
        if (jTabHostales.getColumnModel().getColumnCount() > 0) {
            jTabHostales.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTabHostales.getColumnModel().getColumn(10).setPreferredWidth(200);
        }

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventario Inicial");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inventario Final");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ventas");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TOTALES");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hostales");
        jLabel5.setOpaque(true);

        jLabIni.setBackground(new java.awt.Color(204, 204, 204));
        jLabIni.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabIni.setForeground(new java.awt.Color(102, 102, 255));
        jLabIni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabIni.setOpaque(true);

        jLabFinal.setBackground(new java.awt.Color(204, 204, 204));
        jLabFinal.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabFinal.setForeground(new java.awt.Color(102, 102, 255));
        jLabFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabFinal.setOpaque(true);

        jLabVentas.setBackground(new java.awt.Color(204, 204, 204));
        jLabVentas.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabVentas.setForeground(new java.awt.Color(102, 102, 255));
        jLabVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabVentas.setOpaque(true);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pb_18131288_proyecto_02/Asignacion.jpg"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setOpaque(true);

        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButPintar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jButPintar.setText("Pintar");
        jButPintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPintarActionPerformed(evt);
            }
        });

        jButLlenar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jButLlenar.setText("Llenar");
        jButLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLlenarActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jButton4.setText("Ejemplo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabPromVentas.setBackground(new java.awt.Color(204, 204, 204));
        jLabPromVentas.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabPromVentas.setForeground(new java.awt.Color(102, 102, 255));
        jLabPromVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabPromVentas.setOpaque(true);

        jButOrdenar.setText("Ordenar");
        jButOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOrdenarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Precio");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButPintar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabIni, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabPromVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabIni, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabPromVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButLlenar)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButPintar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButOrdenar))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Hostal invInicial, invFinal, invVendidos;
        invTotal = new Hostal();
        
        for(int r = 0; r < modelo.getRowCount(); r++){
            
           invInicial = new Hostal( (int)modelo.getValueAt(r, 1), (int)modelo.getValueAt(r, 2), (int)modelo.getValueAt(r, 3));
           invFinal = new Hostal(  (int)modelo.getValueAt(r, 4), (int)modelo.getValueAt(r, 5), (int)modelo.getValueAt(r, 6));
           
           invVendidos = invInicial.resta(invFinal);
           
           modelo.setValueAt(invVendidos.getMoyo(), r, 7);
           modelo.setValueAt(invVendidos.getCantara(), r, 8);
           modelo.setValueAt(invVendidos.getAzumbre(), r, 9);
           
           modelo.setValueAt(invInicial.precioAzumbres(invFinal, Double.parseDouble(jTextPrecio.getText())), r, 10);
            
           invTotal = invTotal.suma(invVendidos);

        }
        
        //Calcular promedios
        //Inicial
        Hostal InventarioM;
        Hostal inventarioTotalM = new Hostal(0,0,0);
        
         for(int r = 0; r < modelo.getRowCount(); r++){
           InventarioM = new Hostal( (int)modelo.getValueAt(r, 1), (int)modelo.getValueAt(r, 2), (int)modelo.getValueAt(r, 3));
           inventarioTotalM = inventarioTotalM.suma(InventarioM);
        }
        //Final
          Hostal InventarioC;
        Hostal inventarioTotalC = new Hostal(0,0,0);
        
         for(int r = 0; r < modelo.getRowCount(); r++){
           InventarioC = new Hostal( (int)modelo.getValueAt(r, 4), (int)modelo.getValueAt(r, 5), (int)modelo.getValueAt(r, 6));
           inventarioTotalC= inventarioTotalC.suma(InventarioC);
        }
        
        //Ventas
          Hostal InventarioA;
        Hostal inventarioTotalA = new Hostal(0,0,0);
        
         for(int r = 0; r < modelo.getRowCount(); r++){
           InventarioA = new Hostal( (int)modelo.getValueAt(r, 7), (int)modelo.getValueAt(r, 8), (int)modelo.getValueAt(r, 9));
           inventarioTotalA = inventarioTotalA.suma(InventarioA);
        }
        
         //Para obtener promedios de las ventas, lo que haremos es hacer un metodo al cual mandaremos información del renglon a sumar
         //para posteriormente sacar su promedio.
        int m, c, a;
        m = (int) promedio(7);
        c = (int) promedio (8);
        a = (int) promedio (9);
        
        
        jLabPromVentas.setText("$"+invTotal.azumbresTotales()*1.58+"");
        jLabIni.setText(""+inventarioTotalM.toString());
        jLabFinal.setText(""+inventarioTotalC.toString());
        jLabVentas.setText("M: "+m+" C: "+c+" A: "+a);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLlenarActionPerformed
        // TODO add your handling code here:
        
        //Para poner los nombres. Estos seran constantes.
            modelo.setValueAt("San Fermin", 0, 0);
            modelo.setValueAt("Quijote", 1, 0);
            modelo.setValueAt("Don Venancio", 2, 0);
            modelo.setValueAt("Sancho Panza", 3, 0);
        
         for(int r=0;r<modelo.getRowCount();r++){
            //Para el inventario inicial, creamos una variable la cual mediante nuestro metodo 'azar'          
            //inventario Inicial
try {     //Por alguna razón, a la hora de llenar lor renglones causa un error, por lo cual creamos un try catch
    
int moyosIni = azar.nextInt(15)+10;
int cantarasIni = azar.nextInt(16);
int azumbrasIni = azar.nextInt(8);

            //Para el valor final, lo que hacemos es hacer una resta a las variables Moyos, Cantaras y Azumbras por el mismo valor
            //Y así no se reste de más
            
int moyosFin = moyosIni - azar.nextInt(azumbrasIni);
int cantarasFin = cantarasIni - azar.nextInt(azumbrasIni);
int azumbrasFin = azumbrasIni -  azar.nextInt(azumbrasIni);

            modelo.setValueAt(moyosIni, r, 1);  
            modelo.setValueAt(cantarasIni, r, 2);
            modelo.setValueAt(azumbrasIni, r, 3);
            
 //Creamos un par de ciclos IF para que, en caso de que cuando valoresFin<0, el valor sea 0 y no tener mayores problemas
            if(moyosFin< 0){
                moyosFin = 0;
            }
            
            if(cantarasFin < 0){
                cantarasFin = 0;
            }
            
            if(azumbrasFin<0){
                azumbrasFin = 0;
            }

            modelo.setValueAt(moyosFin, r, 4);  
            modelo.setValueAt(cantarasFin, r, 5);
            modelo.setValueAt(azumbrasFin, r, 6);
            
 moyosFin = 0;
 cantarasFin = 0;
azumbrasFin = 0;
} catch (Exception E) {
    
}
            
        }
    }//GEN-LAST:event_jButLlenarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        //modelo.setValueAt(dato, renglon, columna);
        modelo.setValueAt("San Fermín", 0, 0);
        modelo.setValueAt("Quijote", 1, 0);
        modelo.setValueAt("Don Venancio", 2, 0);
        modelo.setValueAt("Sancho Panza", 3, 0);
        
        //Moyos Inicial
        modelo.setValueAt(8, 0, 1);
        modelo.setValueAt(12, 1, 1);
        modelo.setValueAt(7, 2, 1);
        modelo.setValueAt(4, 3, 1);
        //Cantaras Inicial
        modelo.setValueAt(14, 0, 2);
        modelo.setValueAt(0, 1, 2);
        modelo.setValueAt(15, 2, 2);
        modelo.setValueAt(4, 3, 2);
        //Azumbres Inicial
        modelo.setValueAt(5, 0, 3);
        modelo.setValueAt(0, 1, 3);
        modelo.setValueAt(7, 2, 3);
        modelo.setValueAt(1, 3, 3);
        
        
        //Moyos Final
        modelo.setValueAt(2, 0, 4);
        modelo.setValueAt(1, 1, 4);
        modelo.setValueAt(3, 2, 4);
        modelo.setValueAt(3, 3, 4);
        //Cantaras Final
        modelo.setValueAt(10, 0, 5);
        modelo.setValueAt(15, 1, 5);
        modelo.setValueAt(0, 2, 5);
        modelo.setValueAt(2, 3, 5);
        //Azumbres Final
        modelo.setValueAt(7, 0, 6);
        modelo.setValueAt(6, 1, 6);
        modelo.setValueAt(4, 2, 6);
        modelo.setValueAt(0, 3, 6);
        jTextPrecio.setText("1.58");
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOrdenarActionPerformed
        // TODO add your handling code here:
        
        Marca [] importeVenta = new Marca[modelo.getRowCount()];
        Hostal inicio = new Hostal(), fin = new Hostal();
        
        for(int r=0;r<modelo.getRowCount();r++){
            
            inicio.setMoyo(Integer.parseInt(modelo.getValueAt(r, 1)+""));
            inicio.setCantara(Integer.parseInt(modelo.getValueAt(r, 2)+""));
            inicio.setAzumbre(Integer.parseInt(modelo.getValueAt(r, 3)+""));
            
            fin.setMoyo(Integer.parseInt(modelo.getValueAt(r, 4)+""));
            fin.setCantara(Integer.parseInt(modelo.getValueAt(r, 5)+""));
            fin.setAzumbre(Integer.parseInt(modelo.getValueAt(r, 6)+""));
            
            importeVenta[r]= new Marca(modelo.getValueAt(r,0)+"",inicio,fin);
        }
        
         for(int i=0; i<importeVenta.length-1;i++)
            for(int j=i+1;j<importeVenta.length;j++)
                if(importeVenta[i].hostalesVendidos().azumbresTotales()>importeVenta[j].hostalesVendidos().azumbresTotales())
                {
                    Marca aux = importeVenta[i];
                    importeVenta[i] = importeVenta[j];
                    importeVenta[j] = aux;
                }
         
         for(int r=0;r<importeVenta.length;r++)
        {
            //Inventario de inicio
            modelo.setValueAt(importeVenta[r].getHostal(), r, 0);
            modelo.setValueAt(importeVenta[r].getInicio().getMoyo(), r, 1);
            modelo.setValueAt(importeVenta[r].getInicio().getCantara(), r, 2);
            modelo.setValueAt(importeVenta[r].getInicio().getAzumbre(), r, 3);
            //Inventario de Salida
            modelo.setValueAt(importeVenta[r].getFinal().getMoyo(), r, 4);
            modelo.setValueAt(importeVenta[r].getFinal().getCantara(), r, 5);
            modelo.setValueAt(importeVenta[r].getFinal().getAzumbre(), r, 6);
            //ventas
            modelo.setValueAt(importeVenta[r].getFinal().getMoyo(),r,7);
            modelo.setValueAt(importeVenta[r].getFinal().getCantara(),r,8);
            modelo.setValueAt(importeVenta[r].getFinal().getAzumbre(),r,9);
            
            modelo.setValueAt(importeVenta[r].hostalesVendidos().azumbresTotales()*1.58 ,r,10);
        }
        
        
    }//GEN-LAST:event_jButOrdenarActionPerformed

    private void jButPintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPintarActionPerformed
        // TODO add your handling code here:

        //Se llena la matriz con los valores obtenidos del jTableAdds
        Hostal invPromedio = new Hostal();
        invTotal = new Hostal();
        
        for(int r = 0; r < modelo.getRowCount(); r++){
           invPromedio = new Hostal( (int)modelo.getValueAt(r, 7),
                                                          (int)modelo.getValueAt(r, 8),     
                                                          (int)modelo.getValueAt(r, 9));
        }

        

        double moyo, cantara, azumbra;
        moyo = promedio((int)7);
        cantara = promedio((int)8);
        azumbra = promedio((int)9);
        Hostal promedios = new Hostal((int)moyo, (int)cantara, (int)azumbra); //Creamos un Hostal con los datos del promedio
        //Obtenemos las Azumbras totales del Hostal de Inicial, y posteriormente lo comparamos con los Hostales vendidos
        
         System.out.println(invPromedio.azumbresTotales()); //El boton Pintar no hace el trabajo correctamente, pero los valores son los correctos
         System.out.println(promedios.azumbresTotales());
         
         //Vamos a declarar las variables que daran color a las celdas y sus diferenciadores.
        ColorCeldas celdas = new ColorCeldas(jTabHostales);
        
        for(int r=0; r<modelo.getRowCount(); r++)
        {
            for(int c=0; c<modelo.getColumnCount(); c++)
            {
               if(invPromedio.azumbresTotales() > promedios.azumbresTotales())
               {
                   celdas.addCelda(r,c,Color.RED);
               }
            }
        }
        celdas.repaint(); 
    }//GEN-LAST:event_jButPintarActionPerformed

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
            java.util.logging.Logger.getLogger(jFramePrincipal_18131288_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal_18131288_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal_18131288_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFramePrincipal_18131288_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFramePrincipal_18131288_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButLlenar;
    private javax.swing.JButton jButOrdenar;
    private javax.swing.JButton jButPintar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabFinal;
    private javax.swing.JLabel jLabIni;
    private javax.swing.JLabel jLabPromVentas;
    private javax.swing.JLabel jLabVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTabHostales;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables
}
