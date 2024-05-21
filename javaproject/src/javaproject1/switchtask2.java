package javaproject1;

import java.util.Scanner;

public class switchtask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int operations= sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(operations) {
		case 1:
			 int sum=a+b;
			System.out.println("sum ="+sum);
			break;
		case 2:
			int div=a/b;
			System.out.println("div ="+div);
			break;
		case 3:
			int sub=a-b;
			System.out.println("sub ="+sub);
			break;
		case 4:
			int mul=a*b;
			System.out.println("mul "+mul);
			break;
			default:
			System.out.println("invalid values");
			
		}
		
		
		
		
		

	}

}
