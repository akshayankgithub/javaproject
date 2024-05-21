package javaproject1;

import java.util.Scanner;

public class nestedifprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
	int weight=sc.nextInt();
	if (age>=18) 
	{
		if (weight>50) 
			
		{
			System.out.println("you are eligible for blood donation");
		}
		else
		{
			System.out.println("you are not eligible because of your weight");
		}
			
	}
	else
	{
		System.out.println("you are not eligible");
	}
	
	
	
		
		

	}

}
