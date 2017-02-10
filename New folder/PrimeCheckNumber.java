package basicprograms;

public class PrimeCheckNumber 
{
	public static void main(String[] ar)
	{
		
		int j,temp = 0,count=19;
	
			temp=0;
			for(j=1;j<=count;j++)
			{
				if(count%j==0)
				{
					temp++;
				}
		}
		if(temp==2)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not prime number");
		}
		
		
	}
}

	