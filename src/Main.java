import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    /***
     * 31 factorial
     *
     * @param n The counting parameter that's checked each time it increases
     * @return Returns 1 if it reaches 31, itself, if below 31, and 0 if above
     */
    private static int AttemptedFactorial(int n) {
        // Check against cache for value
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n == 31) {
            result = 1;
        } else if (n < 31) {
            result = AttemptedFactorial(n+1) + AttemptedFactorial(n+2) + AttemptedFactorial(n+3);
        } else {
            result = 0;
        }
        
        // Store result in cache so it can be referenced if the same value is arrived at in the future
        cache.put(n, result);
        return result;

    }

    public static void main(String[] args) {
        int test = AttemptedFactorial(1);
        System.out.println(test);
    }
}
