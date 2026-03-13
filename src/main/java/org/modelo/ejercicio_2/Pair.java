package org.modelo.ejercicio_2;

// Representa un par individual clave-valor
// K = tipo de la clave, V = tipo del valor
public class Pair<K, V> {
 
    private K clave;
    private V valor;
 
    public Pair(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }
 
    public K getClave() { return clave; }
    public V getValor() { return valor; }
 
    @Override
    public String toString() {
        return String.format("(%s → %s)", clave, valor);
    }
}