package classes;

public class telaTriangulo extends javax.swing.JFrame {

    public telaTriangulo() {
        initComponents();
        panResultados.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSegmentoA = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSegmentoB = new javax.swing.JSlider();
        txtSegmentoC = new javax.swing.JSlider();
        lblSegmentoA = new javax.swing.JLabel();
        lblSegmentoB = new javax.swing.JLabel();
        lblSegmentoC = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        panResultados = new javax.swing.JPanel();
        lblFormaTriangulo = new javax.swing.JLabel();
        lblTipoTriangulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSegmentoA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSegmentoA.setMaximum(20);
        txtSegmentoA.setValue(0);
        txtSegmentoA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtSegmentoAStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Segmento A");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Segmento B");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Segmento C");

        txtSegmentoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSegmentoB.setMaximum(20);
        txtSegmentoB.setValue(0);
        txtSegmentoB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtSegmentoBStateChanged(evt);
            }
        });

        txtSegmentoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSegmentoC.setMaximum(20);
        txtSegmentoC.setValue(0);
        txtSegmentoC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtSegmentoCStateChanged(evt);
            }
        });

        lblSegmentoA.setText("0");

        lblSegmentoB.setText("0");

        lblSegmentoC.setText("0");

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblFormaTriangulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFormaTriangulo.setForeground(new java.awt.Color(0, 0, 102));
        lblFormaTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFormaTriangulo.setText("<vazio>");

        lblTipoTriangulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipoTriangulo.setForeground(new java.awt.Color(153, 0, 0));
        lblTipoTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoTriangulo.setText("<vazio>");

        javax.swing.GroupLayout panResultadosLayout = new javax.swing.GroupLayout(panResultados);
        panResultados.setLayout(panResultadosLayout);
        panResultadosLayout.setHorizontalGroup(
            panResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFormaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(lblTipoTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panResultadosLayout.setVerticalGroup(
            panResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblFormaTriangulo)
                .addGap(18, 18, 18)
                .addComponent(lblTipoTriangulo)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Triangulo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(txtSegmentoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lblSegmentoA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(45, 45, 45)
                                .addComponent(txtSegmentoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lblSegmentoB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)
                                .addComponent(txtSegmentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lblSegmentoC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(panResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(btnVerificar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtSegmentoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblSegmentoA)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtSegmentoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblSegmentoB)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtSegmentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblSegmentoC)))
                        .addGap(31, 31, 31)
                        .addComponent(btnVerificar)
                        .addGap(30, 30, 30)
                        .addComponent(panResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        int valorA = txtSegmentoA.getValue();
        int valorB = txtSegmentoB.getValue();
        int valorC = txtSegmentoC.getValue();
        
        if ((valorA + valorB > valorC) && (valorA + valorC > valorB) && (valorB + valorC > valorA)){
            lblFormaTriangulo.setText("Forma um Triângulo!");
            if ((valorA == valorB) && (valorB == valorC)){
                lblTipoTriangulo.setText("Equilátero");
            } else if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)){
                lblTipoTriangulo.setText("Isósceles");
            } else {
                lblTipoTriangulo.setText("Escaleno");
            }
        } else {
            lblFormaTriangulo.setText("Não forma um Triângulo!");
            lblTipoTriangulo.setText("-.-'");
        }
        
        
        
        panResultados.setVisible(true);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void txtSegmentoAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtSegmentoAStateChanged
        lblSegmentoA.setText(Integer.toString(txtSegmentoA.getValue()));
    }//GEN-LAST:event_txtSegmentoAStateChanged

    private void txtSegmentoBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtSegmentoBStateChanged
        lblSegmentoB.setText(Integer.toString(txtSegmentoB.getValue()));
    }//GEN-LAST:event_txtSegmentoBStateChanged

    private void txtSegmentoCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtSegmentoCStateChanged
        lblSegmentoC.setText(Integer.toString(txtSegmentoC.getValue()));
    }//GEN-LAST:event_txtSegmentoCStateChanged

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
            java.util.logging.Logger.getLogger(telaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFormaTriangulo;
    private javax.swing.JLabel lblSegmentoA;
    private javax.swing.JLabel lblSegmentoB;
    private javax.swing.JLabel lblSegmentoC;
    private javax.swing.JLabel lblTipoTriangulo;
    private javax.swing.JPanel panResultados;
    private javax.swing.JSlider txtSegmentoA;
    private javax.swing.JSlider txtSegmentoB;
    private javax.swing.JSlider txtSegmentoC;
    // End of variables declaration//GEN-END:variables
}
