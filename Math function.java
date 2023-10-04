import java.util.Scanner;
class MathFunctions{
	public static void main(String[] args) {
		    System.out.print("Enter the first number : ");
		    Scanner sc= new Scanner(System.in);
		    double a= sc.nextDouble();
		    System.out.print("Enter the second number : ");
		    double b= sc.nextDouble();
		    // Math.min
		    System.out.println("Minimum value is : " + Math.min(a,b));
	
		   // max
		   
		   System.out.println("Max value "+ Math.max(a,b));
		   // sqrt
		   
		   //power
		   System.out.println("power is "+ Math.pow(a,b));
		   
		    
		    
	}
}