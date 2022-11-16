package com.source.interview;

import java.util.Scanner;

public class UpperToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the any String");
		
		String input = sc.nextLine();
		
		char[] word = input.toCharArray();
		
		for(int a=0;a<word.length;a++ )
		{
			if(word[a]>='A'&& word[a]<='Z')
			{
				word[a] = (char)((int)word[a]+32);
			}
			
			
		}
		
		System.out.println("String in lower case is:");
		  for(int a=0;a<word.length;a++)
		  {
			  System.out.println(word[a]);
		  }
		
		   sc.close();
		
		   
			Scanner sc1 = new Scanner(System.in);
		   System.out.println("Enter the any String");
			
			String input1 = sc.nextLine();
			
			char[] word1 = input1.toCharArray();
			
			for(int a=0;a<word.length;a++ )
			{
				if(word1[a]<='a'&& word1[a]>='z')
				{
					word1[a] = (char)((int)word1[a]+32);
				}
				
				
			}
			
			System.out.println("String in lower case is:");
			  for(int a=0;a<word1.length;a++)
			  {
				  System.out.println(word[a]);
			  }
			
			   sc1.close();
	}

}
