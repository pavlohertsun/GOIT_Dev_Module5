package fibonacci;

public class IterativeFibonacci {
    /**
     * Просторова та часова складність:
     * O(n) - оскільки маємо цикл,
     * який виконує н операцій. У циклі прості операції
     * які не впливають на загальну складність. Використовується
     * звичайні примітиви для збереження значень, що доволі економно по памяті.
     */
    public static long fibonacci(int n){
        if (n <= 1) return n;

        long prev1 = 0;
        long prev2 = 1;
        long result = 0;

        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }
}
