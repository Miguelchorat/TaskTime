/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import util.CRM;
import util.ObservadorCambioCRM;

/**
 * La barra de estado que mostrara la información que vaya ocurriendo en la aplicación
 * 
 * @author miguelportatil
 */
public class PanelBarraEstado extends javax.swing.JPanel implements ObservadorCambioCRM{

    /**
     * Creates new form PanelBarraEstado
     */
    public PanelBarraEstado() {
        initComponents();
        CRM.registraObservadorCRM(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(32767, 35));
        setMinimumSize(new java.awt.Dimension(1280, 35));
        setPreferredSize(new java.awt.Dimension(1280, 35));

        jLabelMensaje.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMensaje.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabelMensaje.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMensaje.setText("Lore impsu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelMensaje;
    // End of variables declaration//GEN-END:variables

    @Override
    public void CRMcambiado() {
        jLabelMensaje.setText(CRM.obtenerMensaje().toString());
    }
}