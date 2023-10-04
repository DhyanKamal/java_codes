class Room
{
	double length,breadth;
	
     Room(double l,double b)
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
}

public class RoomAreaPerimeterConstructor{
	public static void main(String[] args) {
		    Room r1= new Room(10,20);
		    Room r2= new Room(15,20);
		    Room r3= new Room(20,30);
		    Room r4= new Room(25,30);
		    System.out.println("The area of room r1 is : " + r1.getArea());
		     System.out.println("The Perimeter  of room r1 is : " + r1.getPerimeter());
		    System.out.println("The area of room r2 is : " + r2.getArea());
		    System.out.println("The Perimeter of room r2 is : " + r2.getPerimeter());
		     System.out.println("The area of room r3 is : " + r3.getArea());
		        System.out.println("The Perimeter of room r3 is : " + r3.getPerimeter());
		     System.out.println("The area of room r4 is : " + r4.getArea());
		        System.out.println("The Perimeter of room r4 is : " + r4.getPerimeter());
		        
	}
}