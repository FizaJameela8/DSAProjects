package MiniProjects;

import java.util.Scanner;

public class SearchInInfinateAray {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a[] = { 4, 5, 7, 8, 9, 73 };
		System.out.println("Enter the search element: ");
		int s = sc.nextInt();
		int start=0;
		int end=1;
		while(s>a[end]) {
			int temp=end+1;
			end=end*2;
			start=temp;
		}
		int i = bs(a, s,start,end);
		if (i > -1) {
			System.out.println(" position is =" + i);
		} else {
			System.out.println("not found");
		}

	}

private static int bs(int[] a,int s,int start,int end) {

	
	
	while(start<=end) {
		
		int mid=(start+end)/2;
		
		if(a[mid]==s) {
			return mid+1;
		}
		if(a[mid]<s ) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}
	}
      return -1;
}
}