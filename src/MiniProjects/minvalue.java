package MiniProjects;

import java.util.Scanner;

public class minvalue {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		int a[]= {4,5,7,8,9,73};
		int i=findmax(a);
if(i>-1) {
		System.out.println(" max="+i);
}else {
	System.out.println("empty array");
}
	
		}
	
	
	
private static int findmax(int[] a) {

	if(a.length==0) {
		return -1;
	}
		// TODO Auto-generated method stub
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		
		if(a[i]>max){
		
			max=a[i];
			
		}
		
		
	}	
	return max;
	
	}

}
