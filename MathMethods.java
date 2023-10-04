import java.util.Scanner;

class MathMethods
{
  public static void main(String args[])
{
  int a= Integer.parseInt(args[0]);
  
// math abs() method
  System.out.println("Absolute value of " + a + " is " + Math.abs(a));
     
// math max and min  method
  System.out.println("Enter the first number : ");
  Scanner sc= new Scanner(System.in);
  int x= sc.nextInt();
  System.out.println(" Enter the second number : ");
  int y= sc.nextInt();  
  System.out.println(" max value is : " + Math.max(x,y) + " and  min value is : " + Math.min(x,y));

// math round method 
  System.out.println(" Enter the value to round it: "); 
  float f= sc.nextFloat();
  System.out.println(" Round of " + f + " is " + Math.round(f));

// math Square root  and cube root methods( it uses only double data type)
  System.out.println(" Enter the value to find square and Cube root : ");
  double d= sc.nextDouble();
 System.out.println(" Square root of " + d + " is " + Math.sqrt(d));
 System.out.println(" Cube root of " + d + " is " + Math.cbrt(d));

// math power and ceil method( it uses only double data type)
  System.out.println( x + " power " + y + " is : " + Math.pow(x,y));
   System.out.println(" the ceil value is : " + Math.ceil(45.58));
 
// math signum method( it takes float and double as data type)
  System.out.println(" Signum method gives value of " + d + " : " + Math.signum(d));

// Math Random method( it uses only double data type)
  System.out.println(" Random number is : " + Math.random());
  System.out.println(" Random number is : " + Math.random());

  
  
     
}
}
  