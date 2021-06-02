/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18131396_p2;

import Utilerias.JTable.ColorCeldas;
import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PB_18131396_jFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jFramePrincipal
     */
    
    Cliente [] cInicial = new Cliente[4];
    Cliente [] cUltimo = new Cliente[cInicial.length];
    Cliente [] dFinal = new Cliente[cUltimo.length];
    
    DefaultTableModel modeloI;
    
    Depositos depInicial [] = new Depositos[4];
    Depositos depFinal [] = new Depositos[depInicial.length];
    Depositos depDep [] = new Depositos[depInicial.length];
    
    
    String nombre;
    Depositos sIni;
    Depositos sFin;
    Depositos dFin;
    Random azar;
    
    public PB_18131396_jFPrincipal() {
        initComponents();
        modeloI = (DefaultTableModel) jTab1.getModel();
        
    }
    
    public void setTotales(DefaultTableModel models, JLabel labIni, JLabel labFin){
        
       Depositos total;
       Depositos totalDep = new Depositos();
               
        for (int i = 0; i < models.getRowCount(); i++) {
            total = new Depositos((int)models.getValueAt(i, 1),
                                                   (int)models.getValueAt(i, 2),
                                                   (int)models.getValueAt(i, 3),
                                                   (int)models.getValueAt(i, 4));
            totalDep = totalDep.suma(total);
        }
        
        labIni.setText(totalDep.toString());
        
        for (int i = 0; i < models.getRowCount(); i++) {
            total = new Depositos((int)models.getValueAt(i, 5),
                                                   (int)models.getValueAt(i, 6),
                                                   (int)models.getValueAt(i, 7),
                                                   (int)models.getValueAt(i, 8));
            totalDep = totalDep.suma(total);
        }
        
        labFin.setText(totalDep.toString());
        
    }
    
    public void OrdenAlfabetico(DefaultTableModel oInicial){
       
        //En el metodo, vamos a crear un PB_18131396_ClaseA, el cual sera nuestro auxiliar para poder
        //Ordenar las tablas sin perder el orden de los depositos.
        Cliente ordenadoAlfabetico;
       
        for (int i = 0; i < oInicial.getRowCount(); i++) {
            //sobre el contrsuctor del jFrame creamos un 
            //arreglo de clientes, el cual iremos llenando 
            //con dos arreglos del tipo Depositos, para así
            //poder registrarlos al respectivo cliente. 
            
            //El primer deposito se hará obteniendo los valores del 
            //primer table (tabla primer deposito)
            depInicial[i] = new Depositos((int)oInicial.getValueAt(i, 1),
                                                                (int)oInicial.getValueAt(i, 2),
                                                                (int)oInicial.getValueAt(i, 3),
                                                                 (int)oInicial.getValueAt(i, 4));
            
            //El segundo, se llenara a partir de los datos del segundo table o del segundo deposito
            depFinal[i] = new Depositos((int)oInicial.getValueAt(i, 5),
                                                                (int)oInicial.getValueAt(i, 6),
                                                                (int)oInicial.getValueAt(i, 7),
                                                                 (int)oInicial.getValueAt(i, 8));
            
            //Una vez teniendo los datos, el nombre se obtendra del renglon 0 y columna 0
            //además de que esto permitira hacer correctamente los ordenamientos mas adelante
             cInicial[i] = new Cliente((oInicial.getValueAt(i, 0)+""),depInicial[i], depFinal[i]);
             
        }
       
        
        
        for (int i = 0; i < oInicial.getRowCount(); i++) {
            for (int j = 0; j < oInicial.getColumnCount() && i != j;  j++) {
                
                //Vamos a recorrer la tabla inicial con un doble for, y ademas vamos a comparar
                //los nombres de los clientes con uso del CompareTo, y así, con el PB_18131396_ClaseA que creamos
                //al inicio del metodo "ordenadoAlfabetico", el cual nos hara de auxiliar
                //podremos ir acomodando los clientes correctamente.
                
                if(cInicial[i].getNombre().compareToIgnoreCase(cInicial[(j)].getNombre())<0){
                 ordenadoAlfabetico = cInicial[i];
                 cInicial[i] = cInicial[j];
                 cInicial[j] = ordenadoAlfabetico;
                }
             }
        }
        
        //Usaremos un deposito auxiliar, el cual nos servira para rellenar las tablas con la 
        //información ya ordenada.
        Depositos aux = null;
        
        for(int i= 0; i<oInicial.getRowCount(); i++){
            oInicial.setValueAt(cInicial[i].getNombre(), i, 0);
            oInicial.setValueAt(cInicial[i].getDep_inicial().getObolo(), i, 1);
            oInicial.setValueAt(cInicial[i].getDep_inicial().getDracma(), i, 2);
            oInicial.setValueAt(cInicial[i].getDep_inicial().getMina(), i, 3);
            oInicial.setValueAt(cInicial[i].getDep_inicial().getTalento(), i, 4);

            oInicial.setValueAt(cInicial[i].getDep_final().getObolo(), i, 5);
            oInicial.setValueAt(cInicial[i].getDep_final().getDracma(), i, 6);
            oInicial.setValueAt(cInicial[i].getDep_final().getMina(), i, 7);
            oInicial.setValueAt(cInicial[i].getDep_final().getTalento(), i, 8);
            
            aux = cInicial[i].depTotales();
            oInicial.setValueAt(aux.getObolo(), i, 9);
            oInicial.setValueAt(aux.getDracma(), i, 10);
            oInicial.setValueAt(aux.getMina(), i, 11);
            oInicial.setValueAt(aux.getTalento(), i, 12);
        }
        
    }
    
    public void OrdenDeposito(DefaultTableModel oInicial){
        
        //Aquí haremos el mismo procedimiento que en el ordenamiento alfabetico, al menos hasta llenar el
        //arreglo de los clientes.
        Cliente ordenadoAlfabetico;
       
        for (int i = 0; i < oInicial.getRowCount(); i++) {
            depInicial[i] = new Depositos((int)oInicial.getValueAt(i, 1),
                                                                (int)oInicial.getValueAt(i, 2),
                                                                (int)oInicial.getValueAt(i, 3),
                                                                 (int)oInicial.getValueAt(i, 4));
            
            depFinal[i] = new Depositos((int)oInicial.getValueAt(i, 5),
                                                                (int)oInicial.getValueAt(i, 6),
                                                                (int)oInicial.getValueAt(i, 7),
                                                                 (int)oInicial.getValueAt(i, 8));
            
             cInicial[i] = new Cliente((oInicial.getValueAt(i, 0)+""),depInicial[i], depFinal[i]);
             
        }
       
        
        
        for (int i = 0; i < oInicial.getRowCount(); i++) {
            for (int j = 0; j < oInicial.getColumnCount() && i != j;  j++) {
                //de igual forma que el alfabetico, vamos a recorrer toda la tabla y la vamos a 
                //reacomodar de modo que el de mayor deposito (convertidos los parametros en obolos)
                //sea el primero, o en pocas palabras, ascendente (mayor a menor)
                if(cInicial[i].getDep_final().oboloTotal()>cInicial[j].getDep_final().oboloTotal()){
                 ordenadoAlfabetico = cInicial[i];
                 cInicial[i] = cInicial[j];
                 cInicial[j] = ordenadoAlfabetico;
                }
             }
        }
        
        //Ahora aremos uso nuevamente del deposito auxiliar, que servira de igual forma
        //Para poder rellenar las tablas de manera correcta.
        Depositos aux = null;
        
        for(int i= 0; i<oInicial.getRowCount(); i++){
            oInicial.setValueAt(cInicial[i].getNombre(), i, 0);
            oInicial.setValueAt(cInicial[i].getDep_inicial().getObolo(), i, 1);
            oInicial.setValueAt(cInicial[i].getDep_inicial().getDracma(), i, 2);
            oInicial.setValueAt(cInicial[i].getDep_inicial().getMina(), i, 3);
            oInicial.setValueAt(cInicial[i].getDep_inicial().getTalento(), i, 4);

            oInicial.setValueAt(cInicial[i].getDep_final().getObolo(), i, 5);
            oInicial.setValueAt(cInicial[i].getDep_final().getDracma(), i, 6);
            oInicial.setValueAt(cInicial[i].getDep_final().getMina(), i, 7);
            oInicial.setValueAt(cInicial[i].getDep_final().getTalento(), i, 8);
            
            aux = cInicial[i].depTotales();
            oInicial.setValueAt(aux.getObolo(), i, 9);
            oInicial.setValueAt(aux.getDracma(), i, 10);
            oInicial.setValueAt(aux.getMina(), i, 11);
            oInicial.setValueAt(aux.getTalento(), i, 12);
        }
        
    }

    public void Pintar(JTable pintar){
        //Con este metodo, traeremos las 3 tablas para poder colorearlas
       //de manera simultanea.
        ColorCeldas celda1 = new ColorCeldas(pintar);
        //Vamos a creador un arreglo bidimensional el cual de tamaños
        //le daremos los valores de renglon y columna de la primera tabla.
        
       int Marcador [][] = new int [pintar.getRowCount()] [4];
       Depositos [] totales = new Depositos[pintar.getRowCount()];
       Depositos [] copia = new Depositos[pintar.getRowCount()];
       
        for (int i = 0; i < pintar.getRowCount(); i++) {
            totales[i] = new Depositos(
                                                            Integer.parseInt(pintar.getValueAt(i, 9)+""),
                                                            Integer.parseInt(pintar.getValueAt(i, 10)+""),
                                                            Integer.parseInt(pintar.getValueAt(i, 11)+""),
                                                            Integer.parseInt(pintar.getValueAt(i, 12)+""));
            copia[i] = totales[i];
        }
        

        //Creamos estas variables, las cuales tendran la funcion de
        //localizar la posicion del renglon con mayo o menor información
        int rma = 0, rme = 0;

        Depositos comparar = new Depositos();
        
        for (int r = 0; r < Marcador.length; r++) {
                if (comparar.oboloTotal()>totales[r].oboloTotal()) {
                    rma = 0;
                 } else {
                     comparar = totales[r];
                     rma = r;
                }
        }
        
 for (int r = 0; r < Marcador.length; r++) {
                if (comparar.oboloTotal()<totales[r].oboloTotal()) {
                    rme = 0;
                } else {
                    comparar = totales[r];
                    rme = r;
                }
        }
 
         System.out.println("Mayor: " + rma );   
         System.out.println("Menor: " + rme );   

 
        
                      
            //Finalmente lo que haremos sera recorrer las columnas de las tablas
            //Pero solo usaremos las columnas de la primera como indice, ya que tenemos 
            //el mismo valor en todas las tablas
            
      
                //Iremos agregando las celas a pintar, todas con las variables 
                //que anteriormente obtuvimos, y lo unico que cambiara
                //sera el recorrido de las columnas.
                for (int i = 0; i < pintar.getRowCount(); i++) {
                    for (int j = 0; j < pintar.getColumnCount(); j++) {
                        if (i == rma) {
                            celda1.addCelda(i, j, Color.GREEN);
                        }
                        
                        if (i == rme) {
                            celda1.addCelda(i, j, Color.RED);
                        }
                    }
                }
                celda1.repaint();
               
                
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab1 = new javax.swing.JTable();
        jButInicial = new javax.swing.JButton();
        jButDep = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabTotales = new javax.swing.JLabel();
        jLabTotalSegundo = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButLim = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabTotalInicial = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Talentos", "Dracmas", "Minas", "Talentos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(10);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Obolo", "Dracmas", "Minas", "Talentos", "Obolos", "Dracmas", "Minas", "Talentos", "Obolos", "Dracmas", "Minas", "Talentos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTab1);
        if (jTab1.getColumnModel().getColumnCount() > 0) {
            jTab1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTab1.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(4).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(5).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(6).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(7).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(8).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(9).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(10).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(11).setPreferredWidth(5);
            jTab1.getColumnModel().getColumn(12).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 935, 96));

        jButInicial.setText("Llenar saldos ");
        jButInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jButInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 250, -1));

        jButDep.setText("Deposito Total");
        jButDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDepActionPerformed(evt);
            }
        });
        getContentPane().add(jButDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 45, 121, -1));

        jButton4.setText("Ejemplo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 45, 100, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Primer Deposit");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 290, -1));

        jButton5.setText("Pintar + & -");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 95, 121, -1));

        jButton6.setText("Orden Alfabetico");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 121, -1));

        jLabTotales.setFont(new java.awt.Font("Sitka Subheading", 0, 8)); // NOI18N
        jLabTotales.setText(" $$");
        getContentPane().add(jLabTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 200, -1));

        jLabTotalSegundo.setFont(new java.awt.Font("Sitka Subheading", 0, 8)); // NOI18N
        jLabTotalSegundo.setText("$$");
        getContentPane().add(jLabTotalSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 250, 14));

        jButton7.setText("Orden Deposito");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 95, 121, -1));

        jButLim.setText("Limpiar");
        jButLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLimActionPerformed(evt);
            }
        });
        getContentPane().add(jButLim, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 95, 100, -1));

        jLabel15.setBackground(new java.awt.Color(51, 255, 51));
        jLabel15.setText("Mayor");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 55, 110, 14));

        jLabel16.setBackground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Menor");
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 75, 110, 14));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Segundo Deposito");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 136, 280, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Depositos Totales");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 261, -1));

        jLabel1.setText("Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 99, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 96, 60, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg18131396_p2/ASIGNACION.png"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 10, 290, 130));

        jLabel12.setText("TOTAL:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 90, -1));

        jLabTotalInicial.setFont(new java.awt.Font("Sitka Subheading", 0, 8)); // NOI18N
        jLabTotalInicial.setText("$$");
        getContentPane().add(jLabTotalInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInicialActionPerformed
        // TODO add your handling code here:
        //Llenamos la primera tabla con la información aleatoria y así poder trabajar de manera más rápida.
        String [] datos = {"Poncio", "Arquimedes", "Aristoteles", "Socrates", "Platon", "Juan","Pipila","Enrique","Deus"};
        jButLim.doClick();
        azar = new Random();
        Depositos inicial[] = new Depositos[modeloI.getRowCount()];
        for (int i = 0; i <= modeloI.getRowCount()-1; i++) {
            for (int j = 0; j <= modeloI.getColumnCount()-5; j++) {
                //
                modeloI.setValueAt(azar.nextInt(10), i, j);
                //
            }
            modeloI.setValueAt(datos[i], i, 0);
        }
        
         for (int i = 1; i <= modeloI.getRowCount()-1; i++) {
            for (int j = 0; j <= modeloI.getColumnCount()-9; j++) {
                //

                //
            }
            modeloI.setValueAt(datos[i], i, 0);
        }
        
        for (int i = 0; i < modeloI.getRowCount(); i++) {
            modeloI.setValueAt(datos[azar.nextInt(datos.length)], i,0);
        }
       
        setTotales(modeloI,jLabTotalInicial, jLabTotalSegundo);
        jButDep.doClick();
    }//GEN-LAST:event_jButInicialActionPerformed

    private void jButDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDepActionPerformed
        // TODO add your handling code here:
            Depositos dInicial, dFinal, dTotal;
            dFinal = new Depositos();
            
            for (int j = 0; j < modeloI.getRowCount(); j++) {
                
            dInicial= new Depositos( Integer.parseInt(""+modeloI.getValueAt(j, 1)),
                                                                Integer.parseInt(""+modeloI.getValueAt(j, 2)),
                                                                Integer.parseInt(""+modeloI.getValueAt(j, 3)),
                                                                Integer.parseInt(""+modeloI.getValueAt(j, 4)));
            
            dFinal = new Depositos( Integer.parseInt(""+modeloI.getValueAt(j, 5)),
                                                                Integer.parseInt(""+modeloI.getValueAt(j, 6)),
                                                                Integer.parseInt(""+modeloI.getValueAt(j, 7)),
                                                                Integer.parseInt(""+modeloI.getValueAt(j, 8)));
            
            dTotal = dFinal.resta(dInicial);
            
            modeloI.setValueAt(dTotal.getObolo(), j, 9);
            modeloI.setValueAt(dTotal.getDracma(), j, 10);
            modeloI.setValueAt(dTotal.getMina(), j, 11);
            modeloI.setValueAt(dTotal.getTalento(), j, 12);
            
            
           // dFin = dFin.suma(dTotal);
            }

    }//GEN-LAST:event_jButDepActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //Llenamos las tablas con los ejemplos dados en la asignación.
        modeloI.setRowCount(4);
        //Saldo Inicial
        modeloI.setValueAt("Sócrates", 0, 0);
        modeloI.setValueAt("Arquimedes", 1, 0);
        modeloI.setValueAt("Aristoteles", 2, 0);
        modeloI.setValueAt("Platón", 3, 0);
        
        modeloI.setValueAt(5, 0, 1);
        modeloI.setValueAt(1, 1, 1);
        modeloI.setValueAt(4, 2, 1);
        modeloI.setValueAt(3, 3, 1);
        
        modeloI.setValueAt(2, 0, 2);
        modeloI.setValueAt(98, 1, 2);
        modeloI.setValueAt(73, 2, 2);
        modeloI.setValueAt(29, 3, 2);
        
        modeloI.setValueAt(24, 0, 3);
        modeloI.setValueAt(57, 1, 3);
        modeloI.setValueAt(0, 2, 3);
        modeloI.setValueAt(46, 3, 3);
        
        modeloI.setValueAt(10, 0, 4);
        modeloI.setValueAt(25, 1, 4);
        modeloI.setValueAt(8, 2, 4);
        modeloI.setValueAt(18, 3, 4);
        
        //Saldo Final

        modeloI.setValueAt(3, 0, 5);
        modeloI.setValueAt(0, 1, 5);
        modeloI.setValueAt(5, 2, 5);
        modeloI.setValueAt(2, 3, 5);
        
        modeloI.setValueAt(68, 0, 6);
        modeloI.setValueAt(52, 1, 6);
        modeloI.setValueAt(99, 2, 6);
        modeloI.setValueAt(71, 3, 6);
        
        modeloI.setValueAt(33, 0, 7);
        modeloI.setValueAt(18, 1, 7);
        modeloI.setValueAt(26, 2, 7);
        modeloI.setValueAt(43, 3, 7);
        
        modeloI.setValueAt(14, 0, 8);
        modeloI.setValueAt(37, 1, 8);
        modeloI.setValueAt(16, 2, 8);
        modeloI.setValueAt(19, 3, 8);
       
         setTotales(modeloI,jLabTotalInicial, jLabTotalSegundo);
          
          jButDep.doClick();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     OrdenAlfabetico(modeloI);
     //Creamos un metodo el cual le mandaremos como parametros las tres tablas. 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        OrdenDeposito(modeloI);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Pintar(jTab1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLimActionPerformed
        // TODO add your handling code here:
        ColorCeldas celda1 = new ColorCeldas(jTab1);
        
        for (int i = 0; i < modeloI.getRowCount(); i++) {
            for (int j = 0; j < modeloI.getColumnCount(); j++) {
                modeloI.setValueAt("", i, j);
                celda1.addCelda(i, j, Color.white);
            }
        }
        jLabTotalSegundo.setText("");
        
        jTab1.repaint();
    }//GEN-LAST:event_jButLimActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        modeloI.setRowCount(Integer.parseInt(jSpinner1.getValue()+""));
    }//GEN-LAST:event_jSpinner1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimmbus look and feel */
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
            java.util.logging.Logger.getLogger(PB_18131396_jFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PB_18131396_jFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PB_18131396_jFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PB_18131396_jFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PB_18131396_jFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButDep;
    private javax.swing.JButton jButInicial;
    private javax.swing.JButton jButLim;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabTotalInicial;
    private javax.swing.JLabel jLabTotalSegundo;
    private javax.swing.JLabel jLabTotales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTab1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
