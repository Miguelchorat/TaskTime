/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga de recibir mensajes y mandarselos a sus escuchadores.
 * 
 * @author miguelportatil
 */
public class CRM {
    
    private static final CRM _singleton = new CRM();
    private Object _mensaje;
    private final List<ObservadorCambioCRM> _observadoresCRM;
    
    private CRM(){
        _mensaje="Bienvenido al gestor de tarea TaskTime";
        _observadoresCRM = new ArrayList<>();
    }
    
    public static void nuevoMensaje(Object mens){
        _singleton._mensaje=mens;
        _singleton.notificarObservadores();
    }
    
    public static Object obtenerMensaje(){
        return _singleton._mensaje;
    }
    
    private void notificarObservadores(){
        for (int i = 0; i < _observadoresCRM.size(); i++) {
            ObservadorCambioCRM observador = (ObservadorCambioCRM) _observadoresCRM.get(i);
            observador.CRMcambiado();
                    
        }
    }
    
    public static void registraObservadorCRM(ObservadorCambioCRM observador){
        _singleton._observadoresCRM.add(observador);
        observador.CRMcambiado();
    }
    
    public static void eliminaObservadorCRM(ObservadorCambioCRM observador){
        _singleton._observadoresCRM.remove(observador);
    }
}
