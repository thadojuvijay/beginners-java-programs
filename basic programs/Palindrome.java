package basicprograms;

public class Palindrome 
{
	public static void main(String[] ar)
	{
	int temp,sum=0;
 int n=545;
 temp=n;
 while(n>0)
 {
	 
	 int r=n%10;
	 sum=(sum*10)+r;   // (0*10)+45.4
	 n=n/10;            // 454/10=45.4
 }
if(temp==sum)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}
}
}

















/* Palindrome Program in Java

Palindrome number in java: A palindrome number is a number that is same after reverse. 
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.

Palindrome number algorithm

Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number"*/