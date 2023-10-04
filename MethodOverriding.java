class Parent
{
	int a;
	void Display(){
		System.out.println("I am a Parent Class");
		System.out.println("the value of a is " + a);
	}
	Parent(int x){
		this.a=x;
	}
}
class Child extends Parent
{
	int b;
	void Display(){
		System.out.println("I am a Child Class");
		System.out.println("the value of a is " + a);
		System.out.println("the value of b is " + b);
	}
	Child(int x,int y){
		super(x);
		this.b=y;
	}
		
	}	


public class MethodOverriding{
	public static void main(String[] args) {
		    Parent pa= new Parent(10);
		    Child ch= new Child(20,30);
		    pa.Display();
		    ch.Display();
	}
}