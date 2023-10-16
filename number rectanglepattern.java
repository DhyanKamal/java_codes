public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4;    // Change this value to adjust the number of rows
        int columns = 6; // Change this value to adjust the number of columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
