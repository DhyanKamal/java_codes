public class SquarePattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
