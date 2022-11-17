package com.source.interview;

public class SwappingNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Avinash",str2 = "Mullur";
		
		System.out.println("Before Swapping:"+str1+""+str2);
		
		
		str1 = str1 + str2;
		
		
		str2 = str1.substring(0,(str1.length()-str2.length()));
		
		str1 = str1.substring(str2.length());
		
		System.out.println(System.lineSeparator());
		
		
		System.out.println("After swapping the String:"+str1+""+str2);
		
		
		
		
		
		
	}

}
