import java.util.Scanner;
public class CircleArea {
	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the Radius of Circle to find Area : ");
		   float radius= sc.nextFloat();
		   // area of circle= PI(π)* radius*radius;
		   double area= Math.PI * radius*radius;
		   System.out.println("\n Area of Circle of radius " + radius + " is " + area);
		   
		   
	}
}