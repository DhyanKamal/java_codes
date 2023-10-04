import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		   System.out.print("Enter the value to print the table upto that value starting from 2: ");
		   Scanner sc= new Scanner(System.in);
		   int value= sc.nextInt();
	int x=1;
	   for (int i=1; i<=10;i++)
	   {  
	       
	   	for (int j=2; j<=value;j++)
	   	{   
	   	    
	   		System.out.print( "  " + x*j + "  ");
	   	}
	        x++;
	     System.out.print("\n");
	   }
	}
}