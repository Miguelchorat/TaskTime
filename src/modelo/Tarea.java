/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Tarea que contiene un nombre ,descripción , fecha de inicio , número de días de duración
 * , la fecha de fin que sera calculado con los dos datos anteriores y una importancia.
 * @author miguelportatil
 */
public class Tarea implements Serializable , Comparable<Tarea>{
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private int numDias;
    private LocalDate fechaFin;
    private Importancia importancia;
    
    
    public Tarea(String nombre,String descripcion,LocalDate fechaInicio,int numDias,Importancia importancia){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.fechaInicio=fechaInicio;
        this.numDias = numDias;
        this.importancia = importancia;
        calcularFechaFin();
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Importancia getImportancia() {
        return importancia;
    }

    public void setImportancia(Importancia importancia) {
        this.importancia = importancia;
    }
    
    private void calcularFechaFin(){
        fechaFin=fechaInicio.plusDays(numDias);
    }

    @Override
    public int compareTo(Tarea t) {
        if(this.fechaInicio.isBefore(t.fechaInicio))
            return -1;
        else if(this.fechaInicio.isAfter(t.fechaInicio))
            return 1;
        else
            return 0;
    }
}
