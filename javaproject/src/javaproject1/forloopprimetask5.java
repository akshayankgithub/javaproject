package javaproject1;

public class forloopprimetask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, m=0, flag=0;
		int n=5;
		m=n/2;
		if(n==0||n==1){
		System.out.println(n+"not a prime number");
		}else {
		    for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+"not a prime number");
					flag=1;
					break;
					
				}
			}
			
			    if (flag==0) {System.out.println(n+" is prime number");}
			
			
		}

	}

}
