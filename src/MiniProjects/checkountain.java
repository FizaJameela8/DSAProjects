package MiniProjects;

public class checkountain {
	public static void main(String args[]) {
		
		
		int a[] = { 1, 2,7,2,3,4 };
		
		boolean i=check(a);
		if(i) {
			System.out.println("it is mountain array");
			
		}else {
			System.out.println("not mountain");
		}
			
		
	}

private static  boolean check(int[] a) {


	int n=a.length-1;
	if(n<3) {
		return false;
	}
	int i=0;
    while(i<n&&a[i]<a[i+1]) {
    	i++;
    }
    if(i+1<n||i==n-1) {
    	return false;
    }
    while(i+1<n&&a[i]>a[i+1]) {
    	i++;
    }
    

return i==n-1;
}
}