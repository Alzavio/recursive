// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int count = 0;
    public static void Test(int n) {
        if (n < 31) {
            Test(n + 1);
            Test(n + 2);
            Test(n + 3);
        } else if (n == 31) {
            count++;
        }
    }


    public static void main(String[] args) {
        Test(1);
        System.out.println(count);
    }
}