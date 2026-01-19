package MiniProjects;

public class WealthyPerson {
	public static void main(String arg[]) {
		int[][] ar= {
				{4,0,0},
				{3,1,1},
				{5,1,1}
		};
	check(ar);
	}
	static public void check(int[][] ar) {
	
		int max=0;
		int wealthy=-1;
	for(int i=0;i<ar.length;i++) {
		int sum=0;
		for(int val:ar[i]) {
			sum+=val;
			
		}
		if(max<sum) {
			max=sum;
			wealthy=i+1;
		}
	}
System.out.println("The wealthy person is :"+wealthy+" with the max sum of : "+max);
	}
}

