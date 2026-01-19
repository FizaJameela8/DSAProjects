package MiniProjects;

public class EvenOrOddNumOfdDigitInArray {

	public static void main(String arg[]) {
		int[] ar= {4,56,22,8,9,1232,7,4,7};
		int count=counting(ar);
		if(count%2==0) {
			System.out.println(count);
			System.out.println("Even number of digits");
		}
		else {
			System.out.println(count);
			System.out.println("oddnumber of digits");
		}
	}
	static public int counting(int[] ar) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			
			count++;
		}
		return count;
	}
}
