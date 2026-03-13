package org.modelo.ejercicio_11;

import java.util.LinkedList;
import java.util.Queue;

public class MergeQueues {
    public static <T> Queue<T> mergeQueues(Queue<T> q1, Queue<T> q2) {
        Queue<T> resultado = new LinkedList<>();

        while (!q1.isEmpty() || !q2.isEmpty()) {
            
            if (!q1.isEmpty()) {
                resultado.add(q1.poll()); // Saca de q1 y añade a resultado (Equivalente de .pop() con stacks)
            }
            
            if (!q2.isEmpty()) {
                resultado.add(q2.poll());
            }
        }

        return resultado;
    }
}
