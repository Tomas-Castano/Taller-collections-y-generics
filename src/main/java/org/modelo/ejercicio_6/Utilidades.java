package org.modelo.ejercicio_6;

import java.util.List;

public class Utilidades {
    
    public static <T extends Comparable<T>> T maximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null; 
        }

        T max = lista.get(0);

        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }

        return max;
    }
}
