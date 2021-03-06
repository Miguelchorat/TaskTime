/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import modelo.Proyecto;
import util.CRM;

/**
 * Ventana emergente que te mostrara un formulario de un proyecto para guardar proyectos.
 * @author miguelportatil
 */
public class VentanaAddProyecto extends javax.swing.JDialog {

    /**
     * Creates new form VentanaAddProyecto
     */
    VistaPrincipal jFramePadre;
    File imagen;
    
    public VentanaAddProyecto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jFramePadre = (VistaPrincipal)parent;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        setImagenBoton();
        jButtonAñadir.setEnabled(false);
        jLabelAdvertencia.setVisible(false);
    }

    private void setImagenBoton(){
        Image img= new ImageIcon(getClass().getResource("/imagen/save.png")).getImage();
        ImageIcon imgButton=new ImageIcon(img.getScaledInstance(15,15,Image.SCALE_SMOOTH));
        jButtonSubirImagen.setIcon(imgButton);
        this.jButtonSubirImagen.setHorizontalTextPosition(SwingConstants.LEFT);
    }
    
    private void comprobarFinalizacion(){
        String nombre = jTextFieldNombre.getText();
        
        Border borderAux = jTextAreaDescripcion.getBorder();
        if(!jFramePadre.getTaskTime().comprobarNombreProyecto(nombre)){
            jLabelAdvertencia.setVisible(true);
            Border line = BorderFactory.createLineBorder(Color.red);
            jButtonAñadir.setEnabled(false);
            jTextFieldNombre.setBorder(line);
        }else{
            jLabelAdvertencia.setVisible(false);
            jTextFieldNombre.setBorder(borderAux);
            if(!jTextFieldNombre.getText().isEmpty() && !jTextAreaDescripcion.getText().isEmpty())
                jButtonAñadir.setEnabled(true);
            else
                jButtonAñadir.setEnabled(false);
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

        jFileChooserImagen = new javax.swing.JFileChooser();
        jLabelAñadirProyecto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelImagen = new javax.swing.JLabel();
        jButtonSubirImagen = new javax.swing.JButton();
        jButtonAñadir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelSelecImagen = new javax.swing.JLabel();
        jLabelAdvertencia = new javax.swing.JLabel();

        jFileChooserImagen.setCurrentDirectory(new java.io.File("/home/miguelportatil/Escritorio"));
        jFileChooserImagen.setDialogTitle("Imagen");
        jFileChooserImagen.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir proyecto");
        setMinimumSize(new java.awt.Dimension(370, 470));
        setResizable(false);

        jLabelAñadirProyecto.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabelAñadirProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAñadirProyecto.setText("Añadir proyecto");

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
        });

        jLabelDescripcion.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescripcion.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaDescripcionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextAreaDescripcionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabelImagen.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabelImagen.setForeground(new java.awt.Color(0, 0, 0));
        jLabelImagen.setText("Imagen");

        jButtonSubirImagen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButtonSubirImagen.setText("Examinar  ");
        jButtonSubirImagen.setBorderPainted(false);
        jButtonSubirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubirImagenActionPerformed(evt);
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

        jButtonCancelar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelSelecImagen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabelSelecImagen.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSelecImagen.setText("Imagen no selec..");

        jLabelAdvertencia.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAdvertencia.setText("Nombre ya existente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAñadirProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonSubirImagen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelSelecImagen))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelAdvertencia))
                                    .addComponent(jSeparator1)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                                .addComponent(jLabelDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelAñadirProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelAdvertencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImagen)
                    .addComponent(jLabelSelecImagen))
                .addGap(29, 29, 29)
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubirImagenActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Selecciona una imagen");
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG y JPG","png","jpg");
        jfc.addChoosableFileFilter(filter);
        int returnValue = jfc.showOpenDialog(null);
        
        if(returnValue == JFileChooser.APPROVE_OPTION){
            imagen = jfc.getSelectedFile();
            if(imagen.getName().length()>15)
                jLabelSelecImagen.setText(imagen.getName().substring(0,15)+"...");
            else
                jLabelSelecImagen.setText(imagen.getName());
            jLabelSelecImagen.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButtonSubirImagenActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextAreaDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionKeyPressed
        // TODO add your handling code here:
        comprobarFinalizacion();
    }//GEN-LAST:event_jTextAreaDescripcionKeyPressed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
        // TODO add your handling code here:
        comprobarFinalizacion();
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        // TODO add your handling code here:
        comprobarFinalizacion();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextAreaDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionKeyReleased
        // TODO add your handling code here:
        comprobarFinalizacion();
    }//GEN-LAST:event_jTextAreaDescripcionKeyReleased

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        // TODO add your handling code here:
        Proyecto proyecto = new Proyecto(jTextFieldNombre.getText(),jTextAreaDescripcion.getText());
        jFramePadre.getTaskTime().addProyecto(proyecto);
        this.setVisible(false);
        jFramePadre.getPanelProyecto().addItemComboBox(proyecto.getNombre());            
        CRM.nuevoMensaje("Proyecto añadido satisfactoriamente.");
        jFramePadre.getPanelProyecto().seleccionarUltimoProyecto();
        copiarImagen(proyecto);
        //jFramePadre.getPanelProyecto().imagenProyecto();
        jFramePadre.getPanelProyectos().refrescarProyectos();
        this.dispose();
    }//GEN-LAST:event_jButtonAñadirActionPerformed
    
    public void copiarImagen(Proyecto proyecto){
        String destino = "./src/imagen_proyecto/";
        try {
            File ficheroDestino = new File(destino,imagen.getName());
            if(imagen.exists()){
                Files.copy(Paths.get(imagen.getAbsolutePath()),Paths.get(ficheroDestino.getAbsolutePath()),StandardCopyOption.REPLACE_EXISTING);
                jFramePadre.getTaskTime().getProyectos().get(jFramePadre.getTaskTime().getProyectoActivo()).setImagen("/imagen_proyecto/"+imagen.getName());
                proyecto.setImagen("/imagen_proyecto/"+imagen.getName());
            }
        } catch (IOException ex) {
            CRM.nuevoMensaje("Problemas al intentar subir la imagen del proyecto.");
        } catch (NullPointerException npe){
            CRM.nuevoMensaje("Proyecto guardado sin imagen.");
        }
    }
    
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
            java.util.logging.Logger.getLogger(VentanaAddProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAddProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAddProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAddProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaAddProyecto dialog = new VentanaAddProyecto(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSubirImagen;
    private javax.swing.JFileChooser jFileChooserImagen;
    private javax.swing.JLabel jLabelAdvertencia;
    private javax.swing.JLabel jLabelAñadirProyecto;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSelecImagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
