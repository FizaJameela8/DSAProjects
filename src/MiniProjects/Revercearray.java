package MiniProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Revercearray {

	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of element: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("before Reversced array is: ");
		
			System.out.println(Arrays.toString(a));

		int start=0;
		int end=n-1;
		while(start<end) {
			rev(a,start,end);
			start++;
			end--;
		}
		System.out.println("Reversced array is: ");
		
			System.out.println(Arrays.toString(a));
	
	}
	static void rev(int[] arr,int start,int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
