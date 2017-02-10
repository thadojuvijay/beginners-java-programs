package basicprograms;
import java.util.Scanner;
public class IfElse {


	public static void main(String[] args) {
	
		System.out.println("Enter the obtained marks");
		Scanner in =new Scanner(System.in);
		int passmarks=40;
		int ObtainedMarks=in.nextInt();
	if(ObtainedMarks>=passmarks)
	{
		System.out.print("you are pass");
	}
	else
	{
		System.out.print("you are fail");
	}
	}

}
