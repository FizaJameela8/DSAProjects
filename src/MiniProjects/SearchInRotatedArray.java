package MiniProjects;

import java.util.Scanner;

public class SearchInRotatedArray {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a[] = { 4, 5, 1,2,3 };
		System.out.println("Enter the search element: ");
		int s = sc.nextInt();
		int i = bs(a, s);
		if (i !=-1) {
			System.out.println(" position is =" + i);
		} else {
			System.out.println("not found");
		}

	}

private static int bs(int[] a,int s) {

	int start=0;
	int end=a.length-1;
	while(start<=end) {
		int mid=(start+end)/2;
		if(a[mid]==s) {
			return mid+1;
		}
		if(a[start]<a[mid]) {
			if(s>=a[start]&&s<=a[mid]) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		else {
			if(s>=a[mid]&&s<=a[end]) {
				start=mid+1;
						}
			else {
				end=mid-1;
			}
			}
	}
      return -1;
}
}