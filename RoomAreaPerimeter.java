class room
{
	double length,breadth;
    void getData(double x,double y){
    	this.length=x;
    	this.breadth=y;
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

public class RoomAreaPerimeter {
	public static void main(String[] args) {
		    room r1= new room();
		    room r2= new room();
		    room r3= new room();
		    room r4= new room();
		    r1.getData(10,20);
		    r2.getData(15,20);
		    r3.getData(20,30);
		    r4.getData(25,30);
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