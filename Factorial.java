package Practice;

public class Factorial {
	public static void main(String args[]) {
		
		long fact=1;int num=6;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact+" ");
	}

}
