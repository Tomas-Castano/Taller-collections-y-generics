package org.modelo.ejercicio_2;

import java.util.ArrayList;
import java.util.List;
 
public class PairList<K, V> {
 
    private List<Pair<K, V>> pares;
 
    public PairList() {
        this.pares = new ArrayList<>();
    }
 
    // Agregar un par clave-valor
    public void agregar(K clave, V valor) {
        if (clave == null) {
            System.out.println("La clave no puede ser nula");
            return;
        }
        pares.add(new Pair<>(clave, valor));
        System.out.println("Par agregado: (" + clave + " → " + valor + ")");
    }
 
    // Eliminar por clave
    public boolean eliminar(K clave) {
        for (int i = 0; i < pares.size(); i++) {
            if (pares.get(i).getClave().equals(clave)) {
                Pair<K, V> eliminado = pares.remove(i);
                System.out.println("Par eliminado: " + eliminado);
                return true;
            }
        }
        System.out.println("No se encontró ningún par con clave: " + clave);
        return false;
    }
 
    // Obtener el valor asociado a una clave
    public V obtener(K clave) {
        for (Pair<K, V> par : pares) {
            if (par.getClave().equals(clave)) {
                return par.getValor();
            }
        }
        System.out.println("No se encontró ningún par con clave: " + clave);
        return null;
    }
 
    // Mostrar todos los pares
    public void mostrarTodos() {
        System.out.println("\nLISTA DE PARES:");
        System.out.println("─".repeat(40));
        if (pares.isEmpty()) {
            System.out.println("  (Vacía)");
        } else {
            for (int i = 0; i < pares.size(); i++) {
                System.out.printf("  [%d] %s%n", i, pares.get(i));
            }
        }
        System.out.println("  Total: " + pares.size() + " pares");
        System.out.println("─".repeat(40));
    }
 
    public int tamaño() {
        return pares.size();
    }
}