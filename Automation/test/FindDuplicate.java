package test;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {3,5,4,3,2,2,1,3};
		System.out.println("Duplicate Elements are: ");
				
		Set<Integer> s=new HashSet<>();
		for(int no:arr)
		{
			boolean b=s.add(no);
			if (b==false)
			{
				System.out.println(no+"");
			}
		}

	}

}
