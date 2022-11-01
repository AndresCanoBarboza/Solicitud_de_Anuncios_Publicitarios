
package Ventanas;

import Datos.csDatos;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        csDatos.CargarCliente();
        csDatos.CargarAnuncio();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bn_agregar_cliente = new javax.swing.JButton();
        bn_agregar_anuncio = new javax.swing.JButton();
        bn_ver_anuncio = new javax.swing.JButton();
        bn_ver_cliente = new javax.swing.JButton();
        bn_salir = new javax.swing.JButton();
        bn_ventasAnuncios = new javax.swing.JButton();
        bn_verVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Seleccione una Opción");

        bn_agregar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bn_agregar_cliente.setText("Agregar Cliente");
        bn_agregar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_agregar_clienteActionPerformed(evt);
            }
        });

        bn_agregar_anuncio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bn_agregar_anuncio.setText("Agregar Anuncio");
        bn_agregar_anuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_agregar_anuncioActionPerformed(evt);
            }
        });

        bn_ver_anuncio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bn_ver_anuncio.setText("Ver Anuncios");
        bn_ver_anuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_ver_anuncioActionPerformed(evt);
            }
        });

        bn_ver_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bn_ver_cliente.setText("Ver Clientes");
        bn_ver_cliente.setPreferredSize(new java.awt.Dimension(123, 25));
        bn_ver_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_ver_clienteActionPerformed(evt);
            }
        });

        bn_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bn_salir.setText("Salir");
        bn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_salirActionPerformed(evt);
            }
        });

        bn_ventasAnuncios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bn_ventasAnuncios.setText("Comprar Anuncio");
        bn_ventasAnuncios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_ventasAnunciosActionPerformed(evt);
            }
        });

        bn_verVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bn_verVentas.setText("Ver Compras");
        bn_verVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_verVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bn_ver_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(bn_ver_anuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bn_agregar_anuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bn_agregar_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(bn_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bn_ventasAnuncios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bn_verVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bn_agregar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bn_agregar_anuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bn_ver_anuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bn_ver_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bn_ventasAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bn_verVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bn_agregar_anuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_agregar_anuncioActionPerformed
        //abre ventana de cotización y guaradado de anuncios
        
        new Calculadora_Anuncios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bn_agregar_anuncioActionPerformed

    private void bn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_salirActionPerformed
        // termina la aplicación
        
        System.exit(WIDTH);
    }//GEN-LAST:event_bn_salirActionPerformed

    private void bn_agregar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_agregar_clienteActionPerformed
       
        //abre ventana para agregar clientes
        
        new ventanaCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bn_agregar_clienteActionPerformed

    private void bn_ver_anuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_ver_anuncioActionPerformed
        // Muestra los anuncios guardados
        
        new VerAnuncios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bn_ver_anuncioActionPerformed

    private void bn_ver_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_ver_clienteActionPerformed
        
        //Muestra los clientes guardados
        
        new VerClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bn_ver_clienteActionPerformed

    private void bn_ventasAnunciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_ventasAnunciosActionPerformed
       
        // Abre ventana para hacer compra
        
        new Venta_Anuncios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bn_ventasAnunciosActionPerformed

    private void bn_verVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_verVentasActionPerformed
        
        // botón para realizar las compras de anuncios según cliente
        
        new VerVentas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bn_verVentasActionPerformed

  
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bn_agregar_anuncio;
    private javax.swing.JButton bn_agregar_cliente;
    private javax.swing.JButton bn_salir;
    private javax.swing.JButton bn_ventasAnuncios;
    private javax.swing.JButton bn_verVentas;
    private javax.swing.JButton bn_ver_anuncio;
    private javax.swing.JButton bn_ver_cliente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
