public class SumDivisible7{
	public static void main(String[] args) {
		    int sum=0;
		    for (int i=100;i<=200;i++)
		    {
		    	if (i%7==0)
		    	{
		    		sum+=i;
		    	}
		    }
		    System.out.println("The sum of numbers divisible by 7 between 100-200 is :" + sum);
	}
}