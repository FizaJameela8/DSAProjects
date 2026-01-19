package MiniProjects;

import java.util.Scanner;

public class Stringsearch {

	public static void main(String args[]) {
		while(true) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sring");
		String str=sc.next();
		System.out.println("Enter the search char");
		char c=sc.next().charAt(0);
		int i=findchar(str,c);
	if(i!=-1) {
		System.out.println("Character "+c+"is at position"+i);
	}
	else {
		System.out.println("Charcter not found");
	}
		}
	}
	
	
private static int findchar(String str,char c) {
		// TODO Auto-generated method stub
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==(c)){
		
			return  i+1;
		}
		
	}	
			return -1;
		
	
	}

}
