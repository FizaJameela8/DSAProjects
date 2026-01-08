package MiniProjects;

import java.util.Scanner;

public class AlhpebetCheck {
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Check the Lower case or Upper Case of character:");
	System.out.println("Enterthe Character: ");
	char c=sc.next().trim().charAt(0);
	if((c>='A')&&(c<='Z')) {
		System.out.println("Upper case");
	}else if((c>='a'&&c<='z')) {
		System.out.println("Lower case");
	}
	else {
		System.out.println("Not a character");
	}
}
}
