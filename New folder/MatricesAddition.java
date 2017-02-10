package basicprograms;

import java.util.Scanner;


public class MatricesAddition {

	
	public static void main(String[] ar)
	{
		  Scanner in = new Scanner(System.in);
		  int rows ,col;
		  System.out.println("Enter the rows and column");
		  rows=in.nextInt();
		  col=in.nextInt();
		  
		  int first[][]=new int[rows][col];
		  int second[][]=new int[rows][col];
		  int third[][]=new int[rows][col];
		  System.out.print("Enter the elements of first matrix");
		  for(int i=0;i<rows;i++)
		  {
			  for(int j=0;j<col;j++)
			  {
				  first[i][j]=in.nextInt();
			  }
		  }
		  
		  System.out.println("Enter the elements of second matrix");
		  for(int i=0;i<rows;i++)
		  {
			  for(int j=0;j<col;j++)
			  {  
				  second[i][j]=in.nextInt();
			  }
		  }
		  System.out.println(" " +"sum of two matrices");
		  for(int i=0;i<rows;i++)
		  {
			  for(int j=0;j<col;j++)
			  {
				  third[i][j]=first[i][j]+second[i][j];
				
				  System.out.print ("  "+third[i][j]);
			  }
			  System.out.println( );
		  }
		  
	}
	
	}
		