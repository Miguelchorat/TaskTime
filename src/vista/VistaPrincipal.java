/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.TaskTime;

/**
 * Vista principal que contiene los demas paneles y se encarga de enseñarlos y mantener un orden
 * 
 * @author miguelportatil
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    private TaskTime taskTime; 
    
    public VistaPrincipal(TaskTime taskTime) {
        this.taskTime = taskTime;
        initComponents();
        Image iconoVentana = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagen/reloj.png"));
        setIconImage(iconoVentana);
        setVisibilityAcerca(false);
        setVisibilityTareas(false);
        this.getContentPane().setBackground(Color.gray);
        this.setLocationRelativeTo(null);
    }
    
    
    
    public TaskTime getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(TaskTime taskTime) {
        this.taskTime = taskTime;
    }
    
    public void visiblePanelProyectos(boolean visibility){
        panelProyectos.setVisible(visibility);
    }

    public PanelBotones getPanelBotones() {
        return panelBotones;
    }

    public void setPanelBotones(PanelBotones panelBotones) {
        this.panelBotones = panelBotones;
    }

    public PanelLogo getPanelLogo() {
        return panelLogo;
    }

    public void setPanelLogo(PanelLogo panelLogo) {
        this.panelLogo = panelLogo;
    }

    public PanelProyecto getPanelProyecto() {
        return panelProyecto;
    }

    public void setPanelProyecto(PanelProyecto panelProyecto) {
        this.panelProyecto = panelProyecto;
    }

    public PanelProyectos getPanelProyectos() {
        return panelProyectos;
    }

    public void setPanelProyectos(PanelProyectos panelProyectos) {
        this.panelProyectos = panelProyectos;
    }
    
    public void setVisibilityAcerca(boolean estado){
        panelAcerca.setVisible(estado);
    }
    
    public void setVisibilityProyectos(boolean estado){
        panelProyectos.setVisible(estado);
    }
    
    public void setVisibilityTareas(boolean estado){
        panelTareas.setVisible(estado);
    }

    public PanelTareas getPanelTareas() {
        return panelTareas;
    }

    public void setPanelTareas(PanelTareas panelTareas) {
        this.panelTareas = panelTareas;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProyecto = new vista.PanelProyecto();
        panelLogo = new vista.PanelLogo();
        panelBotones = new vista.PanelBotones();
        panelProyectos = new vista.PanelProyectos();
        panelAcerca = new vista.PanelAcerca();
        panelBarraEstado = new vista.PanelBarraEstado();
        panelTareas = new vista.PanelTareas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TaskTime");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 790));
        setPreferredSize(new java.awt.Dimension(1280, 790));
        setSize(new java.awt.Dimension(1280, 790));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelProyecto.setjFramePadre(this);

        panelLogo.setJFramePadre(this);

        panelBotones.setJFramePadre(this);

        panelProyectos.setjFramePadre(this);

        panelTareas.setjFramePadre(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(panelAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(panelProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(panelTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panelProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAcerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int salida = JOptionPane.showConfirmDialog(this,"¿Quieres guardar antes de salir?","Guardar",JOptionPane.OK_CANCEL_OPTION);
        if(salida == 0){
            taskTime.getGestionDatos().guardarProyectos(taskTime.getProyectos());
        }
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.PanelAcerca panelAcerca;
    private vista.PanelBarraEstado panelBarraEstado;
    private vista.PanelBotones panelBotones;
    private vista.PanelLogo panelLogo;
    private vista.PanelProyecto panelProyecto;
    private vista.PanelProyectos panelProyectos;
    private vista.PanelTareas panelTareas;
    // End of variables declaration//GEN-END:variables
}
