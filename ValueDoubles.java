package com.source.interview;

import java.util.Scanner;

public class ValueDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		int[] x = new int[8];		
		
		for(int i=0;i<x.length;i++)
		{
			System.err.println("Input numbers to make it double");
			x[i] = sc.nextInt();
			
			if(x[i]!=0)
			{
				double twice=x[i]*2;
				System.out.println(twice);
			}
					
		}
		
	}

}
