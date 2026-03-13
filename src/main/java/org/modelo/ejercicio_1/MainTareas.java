package org.modelo.ejercicio_1;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
 
public class MainTareas {
 
    public static void main(String[] args) {
 
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║          📋 SISTEMA DE GESTIÓN DE TAREAS GENÉRICO           ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝\n");
 
        ListaDeTareas<String> lista = new ListaDeTareas<>();
 
        // Helper para crear fechas legibles
        lista.agregar(new Tarea<>("Entregar informe",    3, fecha(2025, 6, 15), "Carlos"));
        lista.agregar(new Tarea<>("Revisar presupuesto", 1, fecha(2025, 5, 1),  "Ana"));
        lista.agregar(new Tarea<>("Reunión de equipo",   2, fecha(2025, 5, 20), "Luis"));
        lista.agregar(new Tarea<>("Actualizar sistema",  1, fecha(2025, 7, 10), "Ana"));
        lista.agregar(new Tarea<>("Backup de datos",     3, fecha(2025, 4, 30), "Carlos"));
 
        // Mostrar ordenadas por fecha
        lista.mostrarOrdenadoPorFecha();
 
        // Filtrar por prioridad
        System.out.println("\n🔍 TAREAS CON PRIORIDAD 1:");
        System.out.println("─".repeat(65));
        List<Tarea<String>> prio1 = lista.obtenerPorPrioridad(1);
        if (prio1.isEmpty()) {
            System.out.println("  (Ninguna)");
        } else {
            prio1.forEach(t -> System.out.println("  " + t));
        }
        System.out.println("─".repeat(65));
 
        System.out.println("\n🔍 TAREAS CON PRIORIDAD 3:");
        System.out.println("─".repeat(65));
        List<Tarea<String>> prio3 = lista.obtenerPorPrioridad(3);
        prio3.forEach(t -> System.out.println("  " + t));
        System.out.println("─".repeat(65));
 
        System.out.println("\nTotal de tareas registradas: " + lista.totalTareas());
    }
 
    // Método auxiliar para crear fechas
    private static Date fecha(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}