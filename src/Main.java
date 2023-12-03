// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /***
     * 31 factorial
     *
     * @param n The counting parameter that's checked each time it increases
     * @return Returns 1 if it reaches 31, itself, if below 31, and 0 if above
     */
    public static int AttemptedFactorial(int n) {
        if (n == 31) {
            return 1;
        } else if (n < 31) {
            return AttemptedFactorial(n+1) + AttemptedFactorial(n+2) + AttemptedFactorial(n+3);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int test = AttemptedFactorial(1);
        System.out.println(test);
    }
}