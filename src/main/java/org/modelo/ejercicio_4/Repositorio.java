package org.modelo.ejercicio_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Clase genérica Repositorio<T> que almacena objetos en un List<T> interno.
 * Implementa Iterable<T> para permitir el recorrido con for-each (adelante)
 * y expone iteratorInverso() para recorrer de atrás hacia adelante.
 *
 * @param <T> Tipo de los elementos almacenados.
 */
public class Repositorio<T> implements Iterable<T> {
    private final List<T> elementos = new ArrayList<>();


    // ──────────────────────────────────────────
    // Métodos principales
    // ──────────────────────────────────────────

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException(
                "Índice " + indice + " fuera de rango [0, " + (elementos.size() - 1) + "]"
            );
        }
        return elementos.get(indice);
    }

    // Devuelve la cantidad de elementos en el repositorio
    public int tamaño() {
        return elementos.size();
    }

    // ──────────────────────────────────────────
    // Iterador hacia ADELANTE (for-each)
    // ──────────────────────────────────────────

    /**
     * Devuelve un iterador que recorre los elementos de adelante hacia atrás.
     * Es el iterador usado automáticamente por el bucle for-each.
     */
    @Override
    public Iterator<T> iterator() {
        return new IteradorAdelante();
    }

    // Implementación interna del iterador hacia adelante
    private class IteradorAdelante implements Iterator<T> {
        private int posicion = 0;

        @Override
        public boolean hasNext() {
            return posicion < elementos.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más elementos hacia adelante.");
            }
            return elementos.get(posicion++);
        }
    }

    // ──────────────────────────────────────────
    // Iterador INVERSO (de atrás hacia adelante)
    // ──────────────────────────────────────────

    /**
     * Devuelve un Iterable que recorre los elementos de atrás hacia adelante.
     * Al devolver un Iterable se puede usar directamente en un for-each
     */
    public Iterable<T> iteradorInverso() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new IteradorInverso();
            }
        };
    }

    // Implementación interna del iterador inverso
    private class IteradorInverso implements Iterator<T> {
        private int posicion = elementos.size() - 1;

        @Override
        public boolean hasNext() {
            return posicion >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más elementos hacia atrás.");
            }
            return elementos.get(posicion--);
        }
    }
}