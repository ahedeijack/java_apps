annotation.processing.enabled=true
annotation.processing.enabled.in.editor=false
annotation.processing.processor.options=
annotation.processing.processors.list=
annotation.processing.run.all.processors=true
annotation.processing.source.output=${build.generated.sources.dir}/ap-source-output
build.classes.dir=${build.dir}/classes
build.classes.excludes=**/*.java,**/*.form
# This directory is removed when the project is cleaned:
build.dir=build
build.generated.dir=${build.dir}/generated
build.generated.sources.dir=${build.dir}/generated-sources
# Only compile against the classpath explicitly listed here:
build.sysclasspath=ignore
build.test.classes.dir=${build.dir}/test/classes
build.test.results.dir=${build.dir}/test/results
# Uncomment to specify the preferred debugger connection transport:
#debug.transport=dt_socket
debug.classpath=\
    ${run.classpath}
debug.test.classpath=\
    ${run.test.classpath}
# Files in build.classes.dir which should be excluded from distribution jar
dist.archive.excludes=
# This directory is removed when the project is cleaned:
dist.dir=dist
dist.jar=${dist.dir}/CarlosV_2.jar
dist.javadoc.dir=${dist.dir}/javadoc
excludes=
includes=**
jar.compress=false
javac.classpath=
# Space-separated list of extra javac options
javac.compilerargs=
javac.deprecation=false
javac.external.vm=true
javac.processorpath=\
    ${javac.classpath}
javac.source=1.8
javac.target=1.8
javac.test.classpath=\
    ${javac.classpath}:\
    ${build.classes.dir}
javac.test.processorpath=\
    ${javac.test.classpath}
javadoc.additionalparam=
javadoc.author=false
javadoc.encoding=${source.encoding}
javadoc.noindex=false
javadoc.nonavbar=false
javadoc.notree=false
javadoc.private=false
javadoc.splitindex=true
javadoc.use=true
javadoc.version=false
javadoc.windowtitle=
main.class=fl_carlosv.CarlosV
manifest.file=manifest.mf
meta.inf.dir=${src.dir}/META-INF
mkdist.disabled=false
platform.active=default_platform
run.classpath=\
    ${javac.classpath}:\
    ${build.classes.dir}
# Space-separated list of JVM arguments used when running the project.
# You may also define separate properties like run-sys-prop.name=value instead of -Dname=value.
# To set system properties for unit tests define test-sys-prop.name=value:
run.jvmargs=
run.test.classpath=\
    ${javac.test.classpath}:\
    ${build.test.classes.dir}
source.encoding=UTF-8
src.dir=src
test.src.dir=test
                                                                                                  (true);

        jLabel2.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 14)); // NOI18N
        jLabel2.setText("Matematicas");
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 14)); // NOI18N
        jLabel3.setText("Fisica");
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Plantagenet Cherokee", 0, 14)); // NOI18N
        jLabel4.setText("Ingresa tus calificaciones.");
        jLabel4.setOpaque(true);

        JButtSalir.setText("Salir");
        JButtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtSalirActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Promedio");
        jLabel5.setOpaque(true);

        jLabPromedio.setText("---");
        jLabPromedio.setOpaque(true);

        jButBorrar.setText("Borrar");
        jButBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JButtSalir))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtextQuimica)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JtextMatematicas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JtextFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabFis)
                    .addComponent(jLabel5)
                    .addComponent(jLabPromedio)
                    .addComponent(jLabMat)
                    .addComponent(jLabQuim))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JButtSalir))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JtextQuimica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButBorrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtextMatematicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtextFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabQuim)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabFis)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextQuimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextQuimicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextQuimicaActionPerformed

    private void JtextMatematicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextMatematicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextMatematicasActionPerformed

    private void JButtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JButtSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double mat, quim, fis, prom;
        
        mat = Double.parseDouble(JtextMatematicas.getText());
        if (mat<9.5){
            jLabMat.setText("Felicidades por tu calificación! Mat");
            jLabMat.setBackground(Color.green);
        }
        quim = Double.parseDouble(JtextQuimica.getText());
        if (quim<9.5){
            jLabMat.setText("Felicidades por tu calificación! Quim");
            jLabMat.setBackground(Color.green);
        }
        fis = Double.parseDouble(JtextFisica.getText());
        if (fis<9.5){
            jLabMat.setText("Felicidades por tu calificación! Fis");
            jLabMat.setBackground(Color.green);
        }
        
        //Calificación y promedio
        if ( mat>10 || mat<0 || quim<0 || quim >10 || fis<0 || fis>10){
            jLabPromedio.setText("Hay un error, ingresa un valor valido.");
            jLabPromedio.setBackground(Color.red);
        }
             
        else {
             //Promedio 
             prom = (mat+quim+fis)/3;
           
            if(prom==10){
            jLabPromedio.setText("Tu promedio fue de: "+prom+"! Excelente aprobación!");
            jLabPromedio.setBackground(Color.cyan);
        }
            if (prom<9.5){
               jLabPromedio.setText("Aprobaste! tu promedio fue de: "+prom+"! Excelente!");
               jLabPromedio.setBackground(Color.green); 
            }
            if(prom<5.9){
               jLabPromedio.setText("Tu promedio fue de: "+prom+"! Reprobado ¡no te rindas!");
               jLabPromedio.setBackground(Color.red); 
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButBorrarActionPerformed
        // TODO add your handling code here:
        jLabPromedio.setText("");
        JtextMatematicas.setText("");
        JtextFisica.setText("");
        JtextQuimica.setText("");
        jLabMat.setText("");
        jLabQuim.setText("");
        jLabFis.setText("");
    }//GEN-LAST:event_jButBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_04_CalificaciónAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_04_CalificaciónAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_04_CalificaciónAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_04_CalificaciónAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_04_CalificaciónAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtSalir;
    private javax.swing.JTextField JtextFisica;
    private javax.swing.JTextField JtextMatematicas;
    private javax.swing.JTextField JtextQuimica;
    private javax.swing.JButton jButBorrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabFis;
    private javax.swing.JLabel jLabMat;
    private javax.swing.JLabel jLabPromedio;
    private javax.swing.JLabel jLabQuim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
