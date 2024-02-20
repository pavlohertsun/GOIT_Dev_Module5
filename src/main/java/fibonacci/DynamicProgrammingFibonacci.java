package fibonacci;

public class DynamicProgrammingFibonacci {
    /**
     * Просторова та часоваскладність:
     * Буде O(n) через мемоізацію, оскільки не треба кожен раз
     * перераховувати попередні значення, а вони зберігаються
     * в масиві, що економніше по памяті.
     */
    public static long fibonacci(int n) {
        if (n <= 1) return n;

        long[] fibonacciArray = new long[n + 1];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i <= n; ++i) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        return fibonacciArray[n];
    }
}
