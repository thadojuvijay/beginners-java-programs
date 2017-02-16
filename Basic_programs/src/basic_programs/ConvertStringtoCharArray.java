package basic_programs;

public class ConvertStringtoCharArray {

	public static void main(String[] args) {
		String str="hello world";
		
		char[] ch;
		  ch = str.toCharArray();
		  
		  for(int i=0;i<ch.length;i++)
		  {
			  System.out.print(ch[i]);
			  
		  }
		  
		  

	}

	
}
