package MiniProjects;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String arg[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b=sc.nextInt();
		int sum;
		sum=a+b;
		System.out.println("Sum is: "+sum);
	}
}
