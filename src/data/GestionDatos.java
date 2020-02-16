package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import modelo.Proyecto;
import util.CRM;

/**
 * Se encarga de guardar y cargar los datos de los proyectos y tareas
 * @author miguelportatil
 */
public class GestionDatos {
    static final String DATOS = "TaskTime.dat";
    public GestionDatos(){}
    
    public boolean guardarProyectos(List<Proyecto> proyectos){
        try(ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream(DATOS));){
            guardar.writeObject(proyectos);
            return true;
        } catch (FileNotFoundException ex) {
            CRM.nuevoMensaje("Archivo de guardado no encontrado");
        } catch (IOException ex) {
            CRM.nuevoMensaje("Error al intentar guardar los datos");
        }
        return false;
    }
    
    public List<Proyecto> cargarProyectos(){
        List<Proyecto> proyectos = new ArrayList<>();
        try(ObjectInputStream cargarObj = new ObjectInputStream(new FileInputStream(DATOS));){
            proyectos=(List<Proyecto>)cargarObj.readObject();
            return proyectos;
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            CRM.nuevoMensaje("Hubo un error en el rescate de los datos");
        } catch (ClassNotFoundException ex) {
            CRM.nuevoMensaje("Problema en obtener los datos");
        }
        return null;
    }
}
