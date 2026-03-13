package org.modelo.ejercicio_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
 
// ListaDeTareas también es genérica: T es el mismo T de Tarea<T>
public class ListaDeTareas<T> {
 
    private List<Tarea<T>> tareas;
 
    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }
 
    // Agregar tarea
    public void agregar(Tarea<T> tarea) {
        if (tarea == null) {
            System.out.println("❌ No se puede agregar una tarea nula");
            return;
        }
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea.getDescripcion());
    }
 
    // Obtener tareas por prioridad exacta
    public List<Tarea<T>> obtenerPorPrioridad(int prioridad) {
        List<Tarea<T>> resultado = new ArrayList<>();
        for (Tarea<T> tarea : tareas) {
            if (tarea.getPrioridad() == prioridad) {
                resultado.add(tarea);
            }
        }
        return resultado;
    }
 
    // Mostrar todas las tareas ordenadas por fecha de vencimiento
    public void mostrarOrdenadoPorFecha() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas");
            return;
        }
 
        // Copia la lista para no alterar el orden original
        List<Tarea<T>> ordenadas = new ArrayList<>(tareas);
        ordenadas.sort(Comparator.comparing(Tarea::getFechaVencimiento));
 
        System.out.println("\nTAREAS ORDENADAS POR FECHA DE VENCIMIENTO:");
        System.out.println("─".repeat(65));
        for (Tarea<T> tarea : ordenadas) {
            System.out.println("  " + tarea);
        }
        System.out.println("─".repeat(65));
    }
 
    public int totalTareas() {
        return tareas.size();
    }
}