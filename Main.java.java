import java.util.*;
class Game
{
	public int num,userNumber;
	public int count=0;
	
	public Game()
	{
		Random r= new Random();
		 num= r.nextInt(100);
		
	}
	public void  takeUserInput()
	{
		System.out.println("Guess the number:");
		
		Scanner sc= new Scanner(System.in);
		  userNumber = sc.nextInt();
		  
	}
	public boolean isCorrectNumber()
	{
		count++;
		
		
		if (userNumber == num)
		{
			System.out.format("You guess the right number %d \n You guess in %d attempts ",num,count);
			return true;
		}
		else if ( userNumber>num)
		{
			System.out.println("Number is too high....");
		}
		else if (userNumber<num)
		{
			System.out.println("Number is too low...");
		}
		return false;
	}			
}

public class game {
	public static void main(String[] args) {
		  Game g= new Game();
		  boolean b=false;
	while(!b)
	{
		  	  g.takeUserInput();
		  b= g.isCorrectNumber();
	}
		  if ( g.count== 1)
		  {
		  	System.out.println("You are Genius .....");
		  }
		  
		  
	}
}