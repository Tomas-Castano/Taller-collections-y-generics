package org.modelo.ejercicio_7;

public class ComparadorEntero implements Comparador<Integer> {

    @Override
    public int comparar(Integer a, Integer b) {
        if(a == null || b == null) {
            throw new IllegalArgumentException("Los enteros a comparar no pueden ser nulos.");
        }
        if(a>b) {
            return 1;
        } else if(a<b) {
            return -1;
        } else {
            return 0;
        }
    }
    
}

//Consideré usar en comparar(a,b) el método compareTo de Integer, pero decidí implementarlo manualmente para mostrar claramente la lógica de comparación.