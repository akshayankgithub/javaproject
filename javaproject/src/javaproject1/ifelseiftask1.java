package javaproject1;

import java.util.Scanner;

public class ifelseiftask1 {

	public static void main(String[] args) { 
		Scanner sc= new Scanner(System.in);
		int mark=sc.nextInt();
			if (100>=mark && 91<=mark) {
				System.out.println("A+");
				
		}
			else if (90>=mark && 81<=mark) {
				System.out.println("A");
			}
			else if(80>=mark && 71<=mark) {
				System.out.println("B+");
			}
			else if(70>=mark && 61<=mark) {
				System.out.println("B");
			}
			else if(60>=mark && 51<=mark) {
				System.out.println("C+");
			}
			else if (50>=mark && 41<=mark) {
				System.out.println("C");
			}
			else if(40>=mark && 31<=mark) {
				System.out.println("D+");
				
			} else if(30>=mark && 21<=mark) {
				System.out.println("D");
			}
			else if (20>=mark ) {
				System.out.println("E");
			}
			else
			{
				System.out.println("invalid");
			}
		
		// TODO Auto-generated method stub

	}

}
