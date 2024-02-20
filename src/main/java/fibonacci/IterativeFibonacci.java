package fibonacci;

public class IterativeFibonacci {
    /**
     * Просторова та часова складність:
     * O(n) - оскільки маємо цикл,
     * який виконує н операцій. У циклі прості операції
     * які не впливають на загальну складність. Використовується
     * звичайний масив замість колекцій, тому економимо память.
     */
    public static long fibonacci(int n){
        if (n <= 1) return n;

        long[] fibonacciArray = new long[n + 1];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for(int i = 2; i <= n; ++i) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        return fibonacciArray[n];
    }
}
