package org.modelo.ejercicio_5;

import java.util.Stack;

public class SpliceStack {
    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j) {
 
        // Validacion de índices
        if (i < 0 || j > s.size() || i >= j) {
            throw new IllegalArgumentException(
                "Invalid range [" + i + ", " + j + ") for stack of size " + s.size()
            );
        }
 
        int size = s.size();
 
        // ── Step 1: unload the entire stack into a temporary array
        // Index 0 will represent the BOTTOM of the stack.
        int[] temp = new int[size];
        for (int k = size - 1; k >= 0; k--) {
            temp[k] = s.pop();
        }
        // Now temp[0] == original bottom, temp[size-1] == original top.
 
        // ── Step 2: collect the splice segment [i, j)
        Stack<Integer> spliced = new Stack<>();
        for (int k = i; k < j; k++) {
            spliced.push(temp[k]);
        }
 
        // ── Step 3: rebuild the original stack without [i, j)
        for (int k = 0; k < size; k++) {
            if (k < i || k >= j) {
                s.push(temp[k]);
            }
        }

        return spliced;
    }
}