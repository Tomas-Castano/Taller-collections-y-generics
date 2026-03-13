package org.modelo.ejercicio_2;

public class MainPairList {
 
    public static void main(String[] args) {
 
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║              📦 DEMO DE PAIRLIST GENÉRICA               ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
 
        // DEMO 1: K = String, V = Integer  (nombre de producto → stock)
        System.out.println("DEMO 1: PairList<String, Integer> — Producto → Stock");
        System.out.println("═".repeat(60));
 
        PairList<String, Integer> inventario = new PairList<>();
 
        inventario.agregar("Televisor Samsung", 15);
        inventario.agregar("Refrigerador LG",   8);
        inventario.agregar("Lavadora Whirlpool", 5);
        inventario.agregar("Microondas Mabe",   20);
 
        inventario.mostrarTodos();
 
        // Obtener valor por clave
        System.out.println("\n🔍 Stock de 'Refrigerador LG': " + inventario.obtener("Refrigerador LG"));
        System.out.println("🔍 Stock de 'Aire Acondicionado': " + inventario.obtener("Aire Acondicionado"));
 
        // Eliminar
        System.out.println();
        inventario.eliminar("Lavadora Whirlpool");
        inventario.eliminar("Dron");  // clave inexistente
 
        inventario.mostrarTodos();
 
        // DEMO 2: K = Integer, V = String  (código de error → descripción)
        System.out.println("\n\nDEMO 2: PairList<Integer, String> — Código → Descripción");
        System.out.println("═".repeat(60));
 
        PairList<Integer, String> errores = new PairList<>();
 
        errores.agregar(404, "Recurso no encontrado");
        errores.agregar(500, "Error interno del servidor");
        errores.agregar(403, "Acceso denegado");
        errores.agregar(200, "OK");
 
        errores.mostrarTodos();
 
        System.out.println("\nDescripción del error 500: " + errores.obtener(500));
 
        errores.eliminar(403);
        errores.mostrarTodos();
    }
}