package basicprograms;

public class Prime100 {
	
	public static void main(String[] args)
	{
		int i ,j,temp;
		for( i=1;i<100;i++)
		{  temp=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			if(temp==2)
			{
				System.out.println(i);
			}
		}
		
	}
}