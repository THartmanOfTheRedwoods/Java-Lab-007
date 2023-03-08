public class forSum {
    public static void printRow(int n, int cols) {
        for (n = 1; n <= cols; n = n + 1) {
            System.out.printf("%4d", n * n);
        }
        System.out.println(n);
    }
}
