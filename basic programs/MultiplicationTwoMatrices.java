package basicprograms;
import java.util.*;
public class MultiplicationTwoMatrices {

	public static void main(String[] args) {
	int m,n,p,q,c,d;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the rows and columns of first matrix");
	m=in.nextInt();
	n=in.nextInt();
	int first[][]=new int[m][n];
	System.out.print("Enter the elements of first MAtrix");
	for(c=0;c<m;c++)
	{
		
		for(d=0;d<n;d++)
		{
			first[c][d]=in.nextInt();
			System.out.print(first[c][d]);
		}
	}
	System.out.print("Enter the rows and columns of first matrix");
	p=in.nextInt();
	q=in.nextInt();
	 if ( n != p )
         System.out.println("Matrices with entered orders can't be multiplied with each other.");
	 else
     {
        int second[][] = new int[p][q];
	}

}
