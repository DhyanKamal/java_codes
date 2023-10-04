import java.util.Scanner;
public class FindEvenOrOdd {
	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Enter the number to find whether it is even or odd: ");
		      int num= sc.nextInt();
		      if (num%2==0)
		      {
		      	System.out.println("\n The given number " + num + " is Even");
		      }
		      else
		      {
		      	System.out.println("The given number " + num + " is Odd");
		      }
	}
}