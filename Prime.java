import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		   boolean flag= true;
		   System.out.print("Enter the number to check whether it is prime or not : ");
		   Scanner sc = new Scanner(System.in);
		   int num= sc.nextInt();
		   for(int i=2;i<(num/2);i++)
		   {
		   	if(num%i==0)
		   	{
		   		flag=false;
		   		break;
		   	}
		   }
		   if (flag)
		   {
		   	System.out.println("The given number " + num + " is prime number");
		   }
		   else
		   {
		   	System.out.println("The given number " + num + " is not a prime number");
		   }
	}
}