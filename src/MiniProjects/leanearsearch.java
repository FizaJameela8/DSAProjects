package MiniProjects;

import java.util.Scanner;

public class leanearsearch {

	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	int[] a= {12,33,56,789,12,89};
	System.out.println("Enter the search element: ");
	int search=sc.nextInt();
	int ans=ls(a,search);
	if(ans!=-1) {
		System.out.println("found at position "+ans);
	}
	else {
		System.out.println("Notfound");
	}
	}
	static int ls(int[] a,int search) {
		for(int i=0;i<=a.length-1;i++) {
		if(a[i]==search) {
				return i+1;
			}
			
		}
		return -1;
	}
}
