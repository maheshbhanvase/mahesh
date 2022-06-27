package test;


public class Drive 
{

	public static void main(String[] args)
	{
		String str="test234";
		//for text
		String digits=str.replaceAll("[0-9]", "");
		
		//for digit
		String digit=str.replaceAll("[^0-9]", "");
		//System.out.println(digits);
		StringBuffer sb=new StringBuffer(String.valueOf(digit));
		System.out.println(sb.reverse());
		
		//System.out.println(digit);
	}
		
		
		

}
