
/*
Universidad Estatal a Distancia
Cátedra de Ingeniería de Software
Programación Intermedia
Código: 00824 Créditos: 4
Grado académico: Diplomado
Encargado de cátedra: Yenori Carballo Valverde
Estudiante Andrés Cano Barboza
Proyecto
SEGUNDO CUATRIMESTRE
2021
*/
package Ventanas;

import Datos.csDatos;
import Logica.*;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;



public class Calculadora_Anuncios extends javax.swing.JFrame {
    
    private csAnuncio anun;
    private csTradicional tradi;
    private csImagen image;
    private csClienteFrecuente clienteF;
    
    public Calculadora_Anuncios() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btns_tipo_anun = new javax.swing.ButtonGroup();
        ComB_seccion = new javax.swing.JPanel();
        label_info = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JFormattedTextField();
        javax.swing.JLabel label_seccion = new javax.swing.JLabel();
        comB_seccion = new javax.swing.JComboBox<>();
        label_titulo = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        label_anuncio = new javax.swing.JLabel();
        bn_cotizar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        label_costofinal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_tradicional = new javax.swing.JRadioButton();
        btn_imagen = new javax.swing.JRadioButton();
        btn_frecuente = new javax.swing.JRadioButton();
        bn_repetir = new javax.swing.JButton();
        bn_salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jp_mm = new javax.swing.JPanel();
        jl_mm = new javax.swing.JLabel();
        txt_mm = new javax.swing.JTextField();
        jp_porcentaje = new javax.swing.JPanel();
        jl_porcentaje = new javax.swing.JLabel();
        txt_porcentaje = new javax.swing.JTextField();
        bn_comprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ComB_seccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ComB_seccion.setAutoscrolls(true);

        label_info.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_info.setText("Información para calcular costo del anuncio solicitado");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Fecha Publicación:");

        label_seccion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label_seccion.setText("Sección:");

        comB_seccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacionales", "Internacionales", "Deportes", "Culturales", "Económicos" }));

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label_titulo.setText("Título de anuncio:");

        label_anuncio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label_anuncio.setText("Anuncio:");

        bn_cotizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bn_cotizar.setText("Cotizar");
        bn_cotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_cotizarActionPerformed(evt);
            }
        });

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane2.setViewportView(txt_descripcion);

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        label_costofinal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        label_costofinal.setText("Costo del Anuncio:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Tipo de Anuncio:");

        btns_tipo_anun.add(btn_tradicional);
        btn_tradicional.setText("Tradicional");

        btns_tipo_anun.add(btn_imagen);
        btn_imagen.setText("Con_imagen");
        btn_imagen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btn_imagenItemStateChanged(evt);
            }
        });

        btns_tipo_anun.add(btn_frecuente);
        btn_frecuente.setText("Cliente_frecuente");
        btn_frecuente.setToolTipText("");
        btn_frecuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btn_frecuenteItemStateChanged(evt);
            }
        });

        bn_repetir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bn_repetir.setText("Nuevo Anuncio");
        bn_repetir.setToolTipText("");
        bn_repetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_repetirActionPerformed(evt);
            }
        });

        bn_salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bn_salir.setText("Volver");
        bn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_salirActionPerformed(evt);
            }
        });

        jl_mm.setText("mm 2:");

        javax.swing.GroupLayout jp_mmLayout = new javax.swing.GroupLayout(jp_mm);
        jp_mm.setLayout(jp_mmLayout);
        jp_mmLayout.setHorizontalGroup(
            jp_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_mm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(txt_mm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_mmLayout.setVerticalGroup(
            jp_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_mm, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jl_porcentaje.setText("Porcentaje:");

        javax.swing.GroupLayout jp_porcentajeLayout = new javax.swing.GroupLayout(jp_porcentaje);
        jp_porcentaje.setLayout(jp_porcentajeLayout);
        jp_porcentajeLayout.setHorizontalGroup(
            jp_porcentajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_porcentajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_porcentaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_porcentajeLayout.setVerticalGroup(
            jp_porcentajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_porcentajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_porcentajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bn_comprar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bn_comprar.setText("Guardar");
        bn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn_comprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ComB_seccionLayout = new javax.swing.GroupLayout(ComB_seccion);
        ComB_seccion.setLayout(ComB_seccionLayout);
        ComB_seccionLayout.setHorizontalGroup(
            ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComB_seccionLayout.createSequentialGroup()
                .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComB_seccionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
                    .addGroup(ComB_seccionLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ComB_seccionLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_seccion)
                                .addGap(18, 18, 18)
                                .addComponent(comB_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ComB_seccionLayout.createSequentialGroup()
                                .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(label_titulo)
                                    .addComponent(label_anuncio)
                                    .addGroup(ComB_seccionLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ComB_seccionLayout.createSequentialGroup()
                                                .addComponent(btn_tradicional)
                                                .addGap(19, 19, 19)
                                                .addComponent(btn_imagen)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_frecuente)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(12, 12, 12))
            .addGroup(ComB_seccionLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ComB_seccionLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(label_costofinal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComB_seccionLayout.createSequentialGroup()
                        .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ComB_seccionLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bn_cotizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bn_repetir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bn_comprar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bn_salir))
                            .addComponent(jScrollPane2))
                        .addGap(1, 1, 1)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComB_seccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_info)
                .addGap(38, 38, 38))
        );
        ComB_seccionLayout.setVerticalGroup(
            ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComB_seccionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_info)
                .addGap(48, 48, 48)
                .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_seccion)
                    .addComponent(comB_seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_titulo)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_tradicional)
                    .addComponent(btn_imagen)
                    .addComponent(btn_frecuente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(label_anuncio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bn_comprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ComB_seccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bn_cotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bn_repetir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_costofinal)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        txt_titulo.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ComB_seccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ComB_seccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jp_mm.setVisible(false);
        jp_porcentaje.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_frecuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btn_frecuenteItemStateChanged
        if (btn_frecuente.isSelected()) {
            jp_porcentaje.setVisible(true);
        } else {
            jp_porcentaje.setVisible(false);
        }
    }//GEN-LAST:event_btn_frecuenteItemStateChanged

    private void btn_imagenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btn_imagenItemStateChanged
        if(btn_imagen.isSelected()) {
            jp_mm.setVisible(true);
        }else{
            jp_mm.setVisible(false); }
    }//GEN-LAST:event_btn_imagenItemStateChanged

    private void bn_cotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_cotizarActionPerformed

        /* En esta sección trabaja el anuncio regular, sin llevar a cabo la marca
        de los botones Tradicional, imagen o cliente frecuente.
        */
        do {
            anun = new csAnuncio(); //creción de objeto

            try { //validación de cantidad de caracteres de título

                anun.setTitulo(txt_titulo.getText());
                int txt_title = txt_titulo.getText().length();
                if ( txt_title > 15 || txt_titulo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe digitar un título igual o inferior a 15 caracteres");
                    return;}
            } catch (HeadlessException e) { 
            }

            try {
                if (txt_fecha.getText().isEmpty() || txt_descripcion.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Error no se pueden dejar espacios vacíos");
                    return;
                }
                
                
                anun.setFecha(txt_fecha.getText()); // Enviado de fecha

                anun.setDescripcion(txt_descripcion.getText()); //Enviado de descripción

                anun.total_caracteres(); // Llamado de función para contar caracteres título y descripción

                String seccion_ventana=(String)comB_seccion.getSelectedItem(); // Códigos para enviar el string y calcular costo según caracteres contados anteriormente
                //resultado.setText(String.valueOf("El costo de su publicidad es: "+(anun.costo(seccion_ventana)+anun.IVA()))); //basado en Ejemplo JComboBox Java Netbeans de: https://www.youtube.com/watch?v=SjxbnYO1IRg
                anun.costo(seccion_ventana);
                resultado.setText(String.valueOf("El costo del anuncio es: " + anun.Total())); // Nueva impresion de resultado

            }catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Error debe digitar números");
            }
            // Fin de empleo de anuncio regular.

            // Condicionales para trabajar según el botón elegido por el usuario

            // Anuncio tradicional

            if (btn_tradicional.isSelected()) {
                tradi = new csTradicional();
                try {    //Validación tamaño de título

                    tradi.setTitulo(txt_titulo.getText());
                    int txt_title = txt_titulo.getText().length(); // Conocer cantidad de título para validar

                    if ( txt_title > 15 || txt_titulo.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe digitar un título igual o inferior a 15 caracteres");
                        return;}
                } catch (Exception e) {
                }
                try { // validación de no vacío para las demás casillas que se solicitan a usuario

                    if (txt_fecha.getText().isEmpty() || txt_descripcion.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error no se pueden dejar espacios vacíos");
                        return; }
                    tradi.setFecha(txt_fecha.getText()); // Enviado de fecha
                    tradi.setDescripcion(txt_descripcion.getText()); //Enviado de descripción
                    tradi.total_caracteres();
                    String seccion_ventana=(String)comB_seccion.getSelectedItem();
                    tradi.setSeccion(seccion_ventana);
                    resultado.setText(String.valueOf("El costo del anuncio solicitado es: " + tradi.desc_f()));
                } catch (Exception t){
                }
               /* int compra = JOptionPane.showConfirmDialog(null, "¿Desea comprar el Anuncio cotizado?");
                if (compra == 0) {
                csDatos.AddAnuncio(tradi);
                }*/
                

            }
            else if (btn_imagen.isSelected()) {
                image = new csImagen();
                try {
                    image.setTitulo(txt_titulo.getText());
                    int txt_title = txt_titulo.getText().length(); // Conocer cantidad de título para validar
                    if ( txt_title > 15 || txt_descripcion.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe digitar un título igual o inferior a 15 caracteres");
                        return; }
                } catch (Exception it) {
                }
                try {
                    if (txt_fecha.getText().isEmpty() || txt_descripcion.getText().isEmpty() || txt_mm.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error no se pueden dejar espacios vacíos: mm2 o porcentaje");
                        return; }
                    image.setFecha(txt_fecha.getText()); // Enviado de fecha
                    image.setDescripcion(txt_descripcion.getText()); //Enviado de descripción
                    image.total_caracteres();
                    String seccion_ventana=(String)comB_seccion.getSelectedItem();
                    image.setSeccion(seccion_ventana);
                    image.setMm(Integer.parseInt(txt_mm.getText()));
                    resultado.setText(String.valueOf("El costo del anuncio solicitado es: " + image.imagen()));

                }catch (NumberFormatException ifd) {
                    JOptionPane.showMessageDialog(null, "Debe digitar números en el espacio 'mm2'.");
                }

            } else if (btn_frecuente.isSelected()) {
                clienteF = new csClienteFrecuente();
                try {
                    clienteF.setTitulo(txt_titulo.getText());
                    int txt_title = txt_titulo.getText().length(); // Conocer cantidad de título para validar
                    if ( txt_title > 15 || txt_descripcion.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe digitar un título igual o inferior a 15 caracteres");
                        return; }
                } catch (Exception ct) {
                }
                try {
                    if (txt_fecha.getText().isEmpty() || txt_descripcion.getText().isEmpty() || txt_porcentaje.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Error no se pueden dejar espacios vacíos");
                        return; }
                    clienteF.setFecha(txt_fecha.getText()); // Enviado de fecha
                    clienteF.setDescripcion(txt_descripcion.getText()); //Enviado de descripción
                    clienteF.total_caracteres();
                    String seccion_ventana=(String)comB_seccion.getSelectedItem();
                    clienteF.setSeccion(seccion_ventana);
                    clienteF.setDesc_f(Integer.parseInt(txt_porcentaje.getText()));
                    resultado.setText(String.valueOf("El costo del anuncio solicitado es: " + clienteF.descuento_cf()));
                } catch (NumberFormatException cfd) {
                    JOptionPane.showMessageDialog(null, "Debe digitar números en el espacio 'porcentaje'.");
                }
                
            }

        } while (bn_cotizar.isSelected() == true);

        //Fin clase
    }//GEN-LAST:event_bn_cotizarActionPerformed
    // Botón para dar por terminada la aplciación
    
    private void bn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_salirActionPerformed
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_bn_salirActionPerformed

    // Botón para limpiar pantalla e introducir nuevo anunico
    
    private void bn_repetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_repetirActionPerformed
        txt_fecha.setText("");
        txt_titulo.setText("");
        txt_descripcion.setText("");
        txt_mm.setText("");
        txt_porcentaje.setText("");
        resultado.setText("");
        btns_tipo_anun.clearSelection();
    }//GEN-LAST:event_bn_repetirActionPerformed

    private void bn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn_comprarActionPerformed
       
        try{
            if (resultado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error debe cotizar primero el anuncio deseado");
                return; }

            
            
            if (!btn_tradicional.isSelected() && !btn_imagen.isSelected() && !btn_frecuente.isSelected()) {
                
                csDatos.AddAnuncio(anun);
            } else if (btn_tradicional.isSelected()) {
                
                csDatos.AddAnuncio(tradi);
            } else if (btn_imagen.isSelected()) {
                
                csDatos.AddAnuncio(image);
            } else if (btn_frecuente.isSelected()) {
                
                csDatos.AddAnuncio(clienteF);
            } else if (csDatos.EncontrarAnuncio(txt_titulo.getText())) {
                JOptionPane.showMessageDialog(null, "Error, el anuncio" + txt_titulo.getText() + "ya existe."); }
                
            JOptionPane.showMessageDialog(null, "Información agregada.");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bn_comprarActionPerformed

       
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
            java.util.logging.Logger.getLogger(Calculadora_Anuncios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Anuncios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Anuncios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Anuncios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                new Calculadora_Anuncios().setVisible(true);
                          
            
            }
        });
    
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComB_seccion;
    private javax.swing.JButton bn_comprar;
    private javax.swing.JButton bn_cotizar;
    private javax.swing.JButton bn_repetir;
    private javax.swing.JButton bn_salir;
    private javax.swing.JRadioButton btn_frecuente;
    private javax.swing.JRadioButton btn_imagen;
    private javax.swing.JRadioButton btn_tradicional;
    private javax.swing.ButtonGroup btns_tipo_anun;
    private javax.swing.JComboBox<String> comB_seccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jl_mm;
    private javax.swing.JLabel jl_porcentaje;
    private javax.swing.JPanel jp_mm;
    private javax.swing.JPanel jp_porcentaje;
    private javax.swing.JLabel label_anuncio;
    private javax.swing.JLabel label_costofinal;
    private javax.swing.JLabel label_info;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JFormattedTextField txt_fecha;
    private javax.swing.JTextField txt_mm;
    private javax.swing.JTextField txt_porcentaje;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}

/*
Referencias
Cervigón C. (s.f). Interfaces Gráficas de Usuario. https://www.fdi.ucm.es/profesor/jpavon/poo/tema6resumido.pdf

https://www.youtube.com/watch?v=tBQujSyJKB4

https://www.youtube.com/watch?v=w_fRwYv5T2Y

https://laingenieria.info/questions/581/el-uso-de-los-bloques-anidados-try-catch-es-un-anti-patron

https://docs.oracle.com/javase/7/docs/api/

https://www.youtube.com/watch?v=G0hy_HtjCwM

https://www.youtube.com/watch?v=7SzQrBVXXRU

https://www.youtube.com/watch?v=N7f51HsrHWc

https://www.youtube.com/watch?v=DYmTpUfcyT8

https://www.youtube.com/watch?v=YYd4XB17bIc

https://www.youtube.com/watch?v=yXy7WzgUaSA

https://alvinalexander.com/blog/post/jfc-swing/how-center-jframe-java-swing/

https://www.youtube.com/watch?v=pbDbnmlFTS0

https://stackoverflow.com/questions/9543320/how-to-position-the-form-in-the-center-screen/9543339

https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java

https://www.youtube.com/watch?v=Mw3II878roE

https://sites.google.com/site/fernandoagomezf/programacion-en-c/tips-de-programador-c/algoritmos/ordenacion-de-arrays-metodo-de-la-burbuja

https://www.youtube.com/watch?v=hf-_c7DFb3U

https://www.youtube.com/watch?v=IiqbrAxzo0A

http://javax-peru.blogspot.com/2012/08/array-de-botones.html

https://www.javamexico.org/foros/java_standard_edition/agregar_eventos_array_de_jbutton

https://pereiratechtalks.com/analisis-de-algoritmos-de-ordenamiento/

http://lineadecodigo.com/java/convertir-un-array-en-un-string-con-java/


*/