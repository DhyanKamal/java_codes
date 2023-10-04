class Room2
{
	double length,breadth;
	static double height= 12;
	
     Room2(double l,double b)
     {
     	this.length= l;
     	this.breadth=b;
     }
    double getArea()
    {
    	  return length*breadth;
    }
    double getPerimeter()
    {
    	return 2*(length+breadth);
    }
    double  getVolume()
    {
    	return length*breadth*height;
    }
}

public class RoomAreaPerimeterVolume{
	public static void main(String[] args) {
		    Room2 r1= new Room2(10,20);
		    Room2 r2= new Room2(15,20);
		    Room2 r3= new Room2(20,30);
		    Room2 r4= new Room2(25,30);
		    System.out.println("The area of room r1 is : " + r1.getArea());
		     System.out.println("The Perimeter  of room r1 is : " + r1.getPerimeter());
		     System.out.println("The Volume of room r1 is : " + r1.getVolume());
		    System.out.println("The area of room r2 is : " + r2.getArea());
		    System.out.println("The Perimeter of room r2 is : " + r2.getPerimeter());
		    System.out.println("The Volume of room r2 is : " + r2.getVolume());
		     System.out.println("The area of room r3 is : " + r3.getArea());
		        System.out.println("The Perimeter of room r3 is : " + r3.getPerimeter());
		        System.out.println("The Volume of room r3 is : " + r3.getVolume());
		     System.out.println("The area of room r4 is : " + r4.getArea());
		        System.out.println("The Perimeter of room r4 is : " + r4.getPerimeter());
		        System.out.println("The Volume of room r4 is : " + r4.getVolume());
	}
}