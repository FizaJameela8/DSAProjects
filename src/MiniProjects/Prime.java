package MiniProjects;

import java.util.Scanner;

public class Prime {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int flag=0;
	    for(int i=2;i<=n/2;i++) {
	    	if(n%i==0) {
	    		flag=1;
	    	}
	    }
		if(flag>0) {
			System.out.println("Not a Prime number");
		}
		else
		{
			System.out.println("Is a prime");
		}
	    	
	}
	}
}
