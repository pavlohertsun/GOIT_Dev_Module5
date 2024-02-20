package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgrammingFibonacci {
    /**
     * Просторова та часоваскладність:
     * Буде O(n) через мемоізацію, оскільки не треба кожен раз
     * перераховувати попередні значення, а вони зберігаються
     * в мапі і в наступних рівнях ми просто використовуємо
     * значення з мапи. Проте на мою думку ітеративний підхід є
     * ефективнішим, оскільки використовується звичайни масив, а тут мапа,
     * яка використовує більше памяті, хоч значення O є однаковим.
     */
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) return n;

        if (memo.containsKey(n)) return memo.get(n);

        long fibonacci = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fibonacci);
        return fibonacci;
    }
}
