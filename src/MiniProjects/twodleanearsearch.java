package MiniProjects;

import java.util.Scanner;

public class twodleanearsearch {

	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	int[][] a= {
			{1,3,5},
			{6,8,9},
			{4,5,6}
	};
	System.out.println("Enter the search element: ");
	int search=sc.nextInt();
	int[] ans=ls(a,search);
	if(ans[0]!=-1) {
		System.out.println("found at position row "+ans[0]+" col:"+ans[1]);
	}
	else {
		System.out.println("Notfound");
	}
	}
	
	
	static int[]ls(int[][] a,int search) {
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(a[i][j]==search)
					return new int[] {i+1,j+1};
			}
		
		}
		return new int[] {-1,-1};
	}
}
