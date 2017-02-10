package basicprograms;

public class SwapTwoNumbers {


	public static void main(String[] args)
	{
	int x=10;
	int y=15;
	System.out.println("Before swapping two number");
	System.out.println( "x= "+x);
	System.out.println("y= "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After swaping two numbers");
	System.out.println("x= "+x);
	System.out.println("y= "+y);
	}

}
