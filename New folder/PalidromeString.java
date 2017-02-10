package basicprograms;

import java.util.Scanner;

public class PalidromeString
{
	public static void main(String [] ar)
	{
String name;
String reverse="";
System.out.println("Enter  a string  ");
Scanner in=new Scanner(System.in);
name=in.nextLine();
int length=name.length();
for(int i=length-1;i>=0;i--)
{
	reverse=reverse+name.charAt(i);
}
if(name.equals(reverse))
{
	System.out.println("it is palindrome");
}
else
{
	System.out.println("it is not a palindrome");
}
}
}
