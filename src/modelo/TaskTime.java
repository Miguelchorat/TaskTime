package modelo;

import data.GestionDatos;
import java.util.ArrayList;
import java.util.List;
import modelo.Proyecto;

/**
 * Modelo que se encargara de realizar las altas y bajas de las tareas y proyecto , 
 * y se encargara de contactar con la gestion de datos para guardar y cargar los datos.
 * 
 * @author miguelportatil
 */
public class TaskTime {
    
    private List<Proyecto> proyectos;
    private GestionDatos gestionDatos;
    private int proyectoActivo;
    
    public TaskTime(){
        gestionDatos = new GestionDatos();
        proyectos = gestionDatos.cargarProyectos();
        //for(Proyecto p : proyectos)
          //  System.out.println(p.getNombre() + " " +p.getDescripcion());
        if(proyectos==null){
            proyectos = new ArrayList<>();
        }   
        proyectoActivo = 0;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public GestionDatos getGestionDatos() {
        return gestionDatos;
    }

    public void setGestionDatos(GestionDatos gestionDatos) {
        this.gestionDatos = gestionDatos;
    }
    
    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    
    public int getProyectoActivo() {
        return proyectoActivo;
    }

    public void setProyectoActivo(int proyectoActivo) {
        this.proyectoActivo = proyectoActivo;
    }
    
    public boolean addProyecto(Proyecto proyecto){
        if(comprobarNombreProyecto(proyecto.getNombre())){
            proyectos.add(proyecto);
        }else{
            return false;
        }
        return true;
    }

    public boolean comprobarNombreProyecto(String proyecto){
        for(Proyecto p : proyectos){
            if(p.getNombre().equalsIgnoreCase(proyecto))
                return false;
        }
        return true;
    }
}
