package MiniProjects;

public class countRotation {
public static void main(String arg[]) {
	int[] a= {4,5,1,2,3};
	int i=count(a);
	System.out.println("count of rotation is: "+i);
}
public static int count(int[] a) {
	int start=0;
	int end=a.length-1;
	while(start<end) {
		int mid=(start+end)/2;
		if(a[mid]>a[mid+1]) {
			start=mid+1;
		}else {
			end=mid;
		}
	}
	return start;
}
}
