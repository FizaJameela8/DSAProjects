package MiniProjects;

import java.util.Scanner;

public class LargestofTwo {
	public static void largest(int a,int b,int c) {
		if((a>b)&&(a>c)) {
			System.out.println(a+" is the largest");
		}else if(b>c) {
			System.out.println(b+" is the largest");
		}else {
			System.out.println(c+" is the largest");
		}
	}
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("LArgest of 3 numbers:");
	System.out.println("Enter 1st number: ");
	int a=sc.nextInt();
	System.out.println("Enter 2nd number: ");
	int b=sc.nextInt();
	System.out.println("Enter 3d number: ");
	int c=sc.nextInt();
	largest(a,b,c);
}
}
