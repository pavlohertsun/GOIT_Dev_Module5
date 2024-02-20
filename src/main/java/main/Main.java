package main;

import fibonacci.DynamicProgrammingFibonacci;
import fibonacci.IterativeFibonacci;
import fibonacci.RecursiveFibonacci;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("N = " + n);
        System.out.println("Iterative fibonacci result: " + IterativeFibonacci.fibonacci(n));
        System.out.println("Recursive fibonacci result: " + RecursiveFibonacci.fibonacci(n));
        System.out.println("Dynamic programming fibonacci result: " + DynamicProgrammingFibonacci.fibonacci(n));
    }
}
