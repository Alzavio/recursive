import java.util.HashMap;

public class Main {
    static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    /***
     * 31 factorial
     *
     * @param n The counting parameter that's checked each time it increases
     * @return Returns 1 if it reaches 31, itself, if below 31, and 0 if above
     */
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

        // Store result in cache so it can be referenced if the same value is arrived at in the future
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        long millis1 = System.currentTimeMillis();

        int test = AttemptedFactorial(9000)+1;

        long millis2 = System.currentTimeMillis();
        long diff = millis2 - millis1;

        System.out.println(test+" "+millis1+" "+millis2+" "+diff);
    }
}
