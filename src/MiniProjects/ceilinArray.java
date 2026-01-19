package MiniProjects;

import java.util.Scanner;

public class ceilinArray {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a[] = { 4, 5, 7, 8, 9, 73 };
		System.out.println("Enter the number  ");
		int t = sc.nextInt();
		int i = bs(a, t);
		if (i > -1) {
			System.out.println(" ciel is  =" + i);
		} else {
			System.out.println("not found");
		}

	}

private static int bs(int[] a,int s) {
int ans=-1;
	int start=0;
	int end=a.length-1;
	while(start<=end) {
		int mid=(start+end)/2;
		if(a[mid]==s) {
			return a[mid];
		}
		if(a[mid]>s) {
			ans=a[mid];
			end=mid-1;
		}
		else {
			
			start=mid+1;
		}
	}
      return ans;
}
}