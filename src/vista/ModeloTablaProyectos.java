/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.AbstractTableModel;
import modelo.TaskTime;
import util.Util;

/**
 * Modelo que implementara la tabla de proyectos para facilitar su refresco e inserccion de datos. 
 * 
 * @author miguelportatil
 */
public class ModeloTablaProyectos extends AbstractTableModel{

    String[] columnNames = {"NOMBRE","DESCRIPCION",
    "FECHA INICIO",
    "FECHA FIN",
    "TAREAS"};

    private Object[][] data = {};


    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col) {
        if ((col>=0) && (col<columnNames.length)) {
            return columnNames[col];
        } else {
            return "";
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
      return false;
    } 
    
    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    } 
    
    public void refreshTableModel(TaskTime t) {
        if(t==null)
            return;
        if (!t.getProyectos().isEmpty()) {
            int numCol=columnNames.length+1;
            int numFilas=t.getProyectos().size();
            data = new Object[numFilas][numCol];
            for(int f=0; f<numFilas; f++)
            {   
                data[f][0]=t.getProyectos().get(f).getNombre();
                data[f][1]=t.getProyectos().get(f).getDescripcion();
                data[f][2]=Util.ft.format(t.getProyectos().get(f).getFechaInicio());
                data[f][3]=Util.ft.format(t.getProyectos().get(f).getFechaFin());
                data[f][4]=t.getProyectos().get(f).getTareas().size();
                data[f][5]=t.getProyectos().get(f);
            }
        }
        else{
            data = new Object[0][0];
        }
        // - Se notifica a Swing que el Table Model ha cambiado.
        fireTableDataChanged();
    }
    
}
