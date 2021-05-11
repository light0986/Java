package Test;

public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] d = {6,7,9,4,5};
		int c = max(d);
		System.out.println(c);

	}
	public static int max(int[] x) {
		int maxV=x[0];
		for (int i = 0; i < x.length ; i=i+1) {
			System.out.printf("%d ",x[i]);
		}
		return 0 ;
	}

}
