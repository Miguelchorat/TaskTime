/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import modelo.Importancia;
import modelo.Tarea;
import util.CRM;

/**
 * Ventana emergente que te mostrara un formulario de un tarea para guardar tareas.
 * @author miguelportatil
 */
public class VentanaAddTarea extends javax.swing.JDialog {

    /**
     * Creates new form VentanaAddTarea
     */
    VistaPrincipal jFramePadre;
    public VentanaAddTarea(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        jFramePadre = (VistaPrincipal)parent;
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        jButtonAñadir.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPrioridad = new javax.swing.ButtonGroup();
        jLabelAñadirTarea = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelFechaInicio = new javax.swing.JLabel();
        dateChooserComboFechaInicio = new datechooser.beans.DateChooserCombo();
        jLabelFechaFin = new javax.swing.JLabel();
        jLabelPrioridad = new javax.swing.JLabel();
        jRadioButtonAlta = new javax.swing.JRadioButton();
        jRadioButtonMedia = new javax.swing.JRadioButton();
        jRadioButtonBaja = new javax.swing.JRadioButton();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPaneTextArea = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAñadir = new javax.swing.JButton();
        jSpinnerNumDias = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir tarea");
        setMinimumSize(new java.awt.Dimension(370, 540));
        setModal(true);
        setResizable(false);

        jLabelAñadirTarea.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabelAñadirTarea.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAñadirTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAñadirTarea.setText("Añadir tarea");

        jLabelNombre.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre");

        jTextFieldNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabelFechaInicio.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabelFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaInicio.setText("Fecha inicio");

        dateChooserComboFechaInicio.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserComboFechaInicio.setAutoScroll(false);
    dateChooserComboFechaInicio.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dateChooserComboFechaInicio.setCalendarPreferredSize(new java.awt.Dimension(300, 250));
    dateChooserComboFechaInicio.setNothingAllowed(false);
    dateChooserComboFechaInicio.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
        public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
            dateChooserComboFechaInicioOnSelectionChange(evt);
        }
    });

    jLabelFechaFin.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
    jLabelFechaFin.setForeground(new java.awt.Color(0, 0, 0));
    jLabelFechaFin.setText("Numero dias");

    jLabelPrioridad.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
    jLabelPrioridad.setForeground(new java.awt.Color(0, 0, 0));
    jLabelPrioridad.setText("Prioridad");

    buttonGroupPrioridad.add(jRadioButtonAlta);
    jRadioButtonAlta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
    jRadioButtonAlta.setForeground(new java.awt.Color(0, 0, 0));
    jRadioButtonAlta.setText("Alta");
    jRadioButtonAlta.setActionCommand("ALTA");
    jRadioButtonAlta.setText(modelo.Importancia.ALTA.name());
    jRadioButtonAlta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButtonAltaActionPerformed(evt);
        }
    });

    buttonGroupPrioridad.add(jRadioButtonMedia);
    jRadioButtonMedia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
    jRadioButtonMedia.setForeground(new java.awt.Color(0, 0, 0));
    jRadioButtonMedia.setText("Media");
    jRadioButtonMedia.setActionCommand("MEDIA");
    jRadioButtonMedia.setText(modelo.Importancia.MEDIA.name());
    jRadioButtonMedia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButtonMediaActionPerformed(evt);
        }
    });

    buttonGroupPrioridad.add(jRadioButtonBaja);
    jRadioButtonBaja.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
    jRadioButtonBaja.setForeground(new java.awt.Color(0, 0, 0));
    jRadioButtonBaja.setSelected(true);
    jRadioButtonBaja.setText("Baja");
    jRadioButtonBaja.setActionCommand("BAJA");
    jRadioButtonBaja.setText(modelo.Importancia.BAJA.name());
    jRadioButtonBaja.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButtonBajaActionPerformed(evt);
        }
    });

    jLabelDescripcion.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
    jLabelDescripcion.setForeground(new java.awt.Color(0, 0, 0));
    jLabelDescripcion.setText("Descripcion");

    jTextAreaDescripcion.setColumns(20);
    jTextAreaDescripcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jTextAreaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
    jTextAreaDescripcion.setRows(5);
    jTextAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            jTextAreaDescripcionKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextAreaDescripcionKeyReleased(evt);
        }
    });
    jScrollPaneTextArea.setViewportView(jTextAreaDescripcion);

    jButtonCancelar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
    jButtonCancelar.setText("Cancelar");
    jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCancelarActionPerformed(evt);
        }
    });

    jButtonAñadir.setBackground(new java.awt.Color(46, 96, 140));
    jButtonAñadir.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
    jButtonAñadir.setForeground(new java.awt.Color(255, 255, 255));
    jButtonAñadir.setText("Añadir");
    jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAñadirActionPerformed(evt);
        }
    });

    jSpinnerNumDias.setModel(new javax.swing.SpinnerNumberModel(1, 1, 365, 1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneTextArea)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jLabelNombre)
                    .addComponent(jSeparator1)
                    .addComponent(jTextFieldNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPrioridad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonAlta))
                            .addComponent(jLabelFechaInicio)
                            .addComponent(dateChooserComboFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFechaFin)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonMedia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonBaja))
                            .addComponent(jSpinnerNumDias)))))
            .addGap(19, 19, 19))
        .addComponent(jLabelAñadirTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(jLabelAñadirTarea)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelNombre)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFechaInicio)
                        .addComponent(jLabelFechaFin))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dateChooserComboFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSpinnerNumDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelPrioridad)
                .addComponent(jRadioButtonAlta)
                .addComponent(jRadioButtonMedia)
                .addComponent(jRadioButtonBaja))
            .addGap(18, 18, 18)
            .addComponent(jLabelDescripcion)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(22, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
        // TODO add your handling code here:
        comprobarCampos();
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        // TODO add your handling code here:
        comprobarCampos();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextAreaDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionKeyPressed
        // TODO add your handling code here:
        comprobarCampos();
    }//GEN-LAST:event_jTextAreaDescripcionKeyPressed

    private void jTextAreaDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionKeyReleased
        // TODO add your handling code here:
        comprobarCampos();
    }//GEN-LAST:event_jTextAreaDescripcionKeyReleased

    private void jRadioButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAltaActionPerformed
        // TODO add your handling code here:
        comprobarCampos();
    }//GEN-LAST:event_jRadioButtonAltaActionPerformed

    private void jRadioButtonMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMediaActionPerformed
        // TODO add your handling code here:
        comprobarCampos();
    }//GEN-LAST:event_jRadioButtonMediaActionPerformed

    private void jRadioButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBajaActionPerformed
        // TODO add your handling code here:
        comprobarCampos();
    }//GEN-LAST:event_jRadioButtonBajaActionPerformed

    private void dateChooserComboFechaInicioOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserComboFechaInicioOnSelectionChange
        // TODO add your handling code here:
        comprobarCampos();
    }//GEN-LAST:event_dateChooserComboFechaInicioOnSelectionChange

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        // TODO add your handling code here:
        Calendar calendarInicio = dateChooserComboFechaInicio.getCurrent();
        LocalDate inicio = LocalDateTime.ofInstant(calendarInicio.toInstant(), calendarInicio.getTimeZone().toZoneId()).toLocalDate();
        
        Tarea t = new Tarea(jTextFieldNombre.getText(),jTextAreaDescripcion.getText(),inicio,Integer.parseInt(jSpinnerNumDias.getValue().toString()),Importancia.valueOf(buttonGroupPrioridad.getSelection().getActionCommand()));
        int proyectoActual = jFramePadre.getTaskTime().getProyectoActivo();
        jFramePadre.getTaskTime().getProyectos().get(proyectoActual).addTarea(t);
        jFramePadre.getPanelProyecto().setTareas(jFramePadre.getTaskTime().getProyectos().get(jFramePadre.getTaskTime().getProyectoActivo()).getTareas().size());
        jFramePadre.getPanelProyecto().setjTextFieldFechaInicio(jFramePadre.getTaskTime().getProyectos().get(jFramePadre.getTaskTime().getProyectoActivo()).getFechaInicio().toString());
        jFramePadre.getPanelProyecto().setjTextFieldFechaFin(jFramePadre.getTaskTime().getProyectos().get(jFramePadre.getTaskTime().getProyectoActivo()).getFechaFin().toString());
        jFramePadre.getPanelProyectos().refrescarProyectos();
        jFramePadre.getPanelTareas().limpiarTareas();
        jFramePadre.getPanelTareas().generarTareas();
        jFramePadre.setVisibilityAcerca(false);
        jFramePadre.setVisibilityProyectos(false);
        jFramePadre.setVisibilityTareas(true);
        CRM.nuevoMensaje("Tarea añadido al proyecto actual");
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        // TODO add your handling code here:
        
        //Limite de 10 caracter como maximo de nombre de tarea
        if(jTextFieldNombre.getText().length()==10){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaAddTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAddTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAddTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAddTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaAddTarea dialog = new VentanaAddTarea(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void comprobarCampos(){
        if(!jTextFieldNombre.getText().isEmpty() && !jTextAreaDescripcion.getText().isEmpty()){    
            jButtonAñadir.setEnabled(true);
        }else{
            jButtonAñadir.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPrioridad;
    private datechooser.beans.DateChooserCombo dateChooserComboFechaInicio;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelAñadirTarea;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFechaFin;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrioridad;
    private javax.swing.JRadioButton jRadioButtonAlta;
    private javax.swing.JRadioButton jRadioButtonBaja;
    private javax.swing.JRadioButton jRadioButtonMedia;
    private javax.swing.JScrollPane jScrollPaneTextArea;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerNumDias;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
