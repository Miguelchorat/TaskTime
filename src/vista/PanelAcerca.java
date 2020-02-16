/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import javax.swing.ImageIcon;

/** 
 * Panel que mostrara la información sobre la aplicación
 * @author miguelportatil
 */
public class PanelAcerca extends javax.swing.JPanel {

    /**
     * Creates new form PanelAcerca
     */
    public PanelAcerca() {
        initComponents();
        Image img= new ImageIcon(getClass().getResource("/imagen/reloj.png")).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(200,200,Image.SCALE_SMOOTH));
        jLabelImagen.setIcon(img2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAcerca = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jLabelVersion = new javax.swing.JLabel();
        jLabelNombreApp = new javax.swing.JLabel();
        jLabelRealizado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(934, 449));
        setPreferredSize(new java.awt.Dimension(934, 449));

        jLabelAcerca.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabelAcerca.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAcerca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAcerca.setText("Acerca de");

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelVersion.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabelVersion.setForeground(new java.awt.Color(0, 0, 0));
        jLabelVersion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVersion.setText("  Versión             :    1.0               ");

        jLabelNombreApp.setBackground(new java.awt.Color(46, 96, 140));
        jLabelNombreApp.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabelNombreApp.setForeground(new java.awt.Color(98, 191, 236));
        jLabelNombreApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreApp.setText("TaskTime");

        jLabelRealizado.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabelRealizado.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRealizado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRealizado.setText("  Realizado por :    Miguel Ángel Chorat Delgado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAcerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelVersion, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jLabelNombreApp, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelRealizado, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAcerca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabelVersion)
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(336, Short.MAX_VALUE)
                    .addComponent(jLabelRealizado)
                    .addGap(78, 78, 78)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAcerca;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombreApp;
    private javax.swing.JLabel jLabelRealizado;
    private javax.swing.JLabel jLabelVersion;
    // End of variables declaration//GEN-END:variables
}