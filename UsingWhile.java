import java.util.Scanner;
public class UsingWhile{
	public static void main(String[] args) {
		System.out.print("Enter the value of n to find sum of first n natural numbers: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1,sum=0;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("The sum of first " + n + " natural numbers is " + sum);
			
	}
}