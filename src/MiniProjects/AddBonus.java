package MiniProjects;

import java.util.Scanner;

public class AddBonus {

	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the salary:");
		int sal=sc.nextInt();
		if(sal>10000) {
			sal+=2000;
		}
		else {
			sal+=1000;
		}
		System.out.println("Salary with bonus included is:"+sal);
	    	
	}
	}
} 
