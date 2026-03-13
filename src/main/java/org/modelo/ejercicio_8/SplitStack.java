package org.modelo.ejercicio_8;

import java.util.Stack;

public class SplitStack {
    
    public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i) {
        if (i < 0 || i > s.size()) {
            throw new IllegalArgumentException(
                "Posición " + i + " fuera de rango [0, " + s.size() + "]."
            );
        }

        int size = s.size();

        int[] temp = new int[size];
        for (int k = size - 1; k >= 0; k--) {
            temp[k] = s.pop();
        }

        Stack<Integer> primera = new Stack<>();
        Stack<Integer> segunda = new Stack<>();

        for (int k = 0; k < i; k++) {
            primera.push(temp[k]);
        }

        for (int k = i; k < size; k++) {
            segunda.push(temp[k]);
        }

        return new Pair<>(primera, segunda);
    }

}