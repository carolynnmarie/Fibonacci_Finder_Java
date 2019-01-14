package io.carolynn.fibonacci;

import java.util.*;

public class FibonacciFinder {

    public ArrayList<Long> fibonacciSequence(long upperLimit){
        ArrayList<Long> sequence = new ArrayList<>();
        long first = 0;
        long second = 1;
        long nextFib = 0;
        while(second<upperLimit){
            sequence.add(first);
            nextFib = first + second;
            first = second;
            second = nextFib;
        }
        return sequence;
    }

    public ArrayList<Long> fibonacciNumbers(int listSize){
        ArrayList<Long> sequence = new ArrayList<>();
        long first = 0;
        long second = 1;
        long nextFib = 0;
        for(int i = 0; i<listSize; i++){
            sequence.add(first);
            nextFib = first + second;
            first = second;
            second = nextFib;
        }
        return sequence;
    }

    public Long findNextFibonacci(long input){
        long first = 1;
        long second = 1;
        long nextF = 0;
        while(second<input){
            nextF = first + second;
            first = second;
            second = nextF;
        }
        return second;
    }
}

//I refuse to write a recursive method for finding fibonacci sequences.  Recursion is inefficient, lazy, error-prone,
// and not clean code.  That is what while loops and for loops are for.
