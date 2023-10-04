import java.util.Scanner;
class MathFunctions2 {
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();

		// sqrt
		System.out.println("square root is  " + Math.sqrt(a));
		// Math.abs
		System.out.println("Absolute value is :" + Math.abs(a));
		//Math.ceil
		System.out.println("Ceil value is :" + Math.ceil(a));
		//Math.floor
		System.out.println("Floor value is :" + Math.floor(a));
		// Math.log
		System.out.println("Log value is :" + Math.log(a));




	}
}