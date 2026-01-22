	package MiniProjects;
	
	
	
	public class MountainArray {
		public static void main(String args[]) {
	
	
			int a[] = { 1, 2,7,2,3,0 };
			
			int i= search(a);
			
				System.out.println(" peak element is found at position  =" + i);
				System.out.println(" value  =" + a[i]);
			
		}
	
	private static int search(int[] a) {
	
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(a[mid]<a[mid+1]) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
	      return start;
	}
	}