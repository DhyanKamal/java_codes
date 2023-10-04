import java.util.Scanner;
public class PrimeR{
	public static void main(String[] args) {
		   boolean flag= true;
		   int b;
		   do{
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
		   System.out.print("Do you want to check another number (type 1 for Yes or 0 for No) ");
		   b = sc.nextInt();
		   }
		   while( b==1);
	}
}