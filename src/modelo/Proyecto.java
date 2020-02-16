/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Proyecto el que contiene las tareas , la fecha de inicio siendo esta la primera tarea ,
 * la fecha final siendo tambien la ultima tarea en finalizar. Un nombre , una descripción 
 * y una imagen.
 * 
 * @author miguelportatil
 */
public class Proyecto implements Serializable{
    
    private final String IMAGEN_DEFECTO="/imagen_proyecto/folder.png";
    
    private List<Tarea> tareas;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaCreacion;
    private String nombre;
    private String descripcion;
    private String imagen;
    
    public Proyecto() {
        
    }   
    
    public Proyecto(String nombre,String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
        fechaCreacion = LocalDate.now();
        imagen = IMAGEN_DEFECTO;
        tareas = new ArrayList<>();
        fechaInicio= LocalDate.now();
        fechaFin = LocalDate.now();
    }
    
    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    public void addTarea(Tarea t){
        tareas.add(t);
        comprobarFechaInicial(t);
        comprobarFechaFinal(t);
    }
    
    public void deleteTarea(int tareaId){
        tareas.remove(tareaId);
        this.fechaInicio = comprobarFechaInicial();
        this.fechaFin = comprobarFechaFin();
    }
    
    public LocalDate comprobarFechaInicial(){
        LocalDate fechaInicial = LocalDate.MAX;
        if(tareas.size()==0)
            return LocalDate.now();
        for(Tarea t : tareas){
            if(fechaInicial.isAfter(t.getFechaInicio())){
                fechaInicial = t.getFechaInicio();
            }
        }
        return fechaInicial;
    }
    
    public LocalDate comprobarFechaFin(){
        LocalDate fechaFin = LocalDate.MIN;
        if(tareas.size()==0)
            return LocalDate.now();
        for(Tarea t : tareas){
            if(fechaFin.isBefore(t.getFechaFin())){
                fechaFin = t.getFechaFin();
            }
        }
        return fechaFin;
    }
    
    private void comprobarFechaInicial(Tarea t){
        if(fechaInicio.isAfter(t.getFechaInicio()))
            fechaInicio = t.getFechaInicio();
    }
    
    private void comprobarFechaFinal(Tarea t){
        if(fechaFin.isBefore(t.getFechaFin()))
            fechaFin = t.getFechaFin();
    }
}

