import java.util.HashMap;

public class Main {
    static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    private static int AttemptedFactorial(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n <= 1) {
            result = 0;
        } else {
            result = AttemptedFactorial(n-1) + AttemptedFactorial(n-2)+1;
        }

        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int test = AttemptedFactorial(31)+1;
        System.out.println(test);
    }
}
