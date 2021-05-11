package Test;

public class H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {6,7,9,4,5};
		boolean b = find(a , 10) ;
		System.out.println(b);

	}

	public static boolean find(int[]xx, int y) {
		
		for (int i = 0; i < xx.length ; i=i+1) {
			if(xx[i] == y ) {
				return true ;
			}
		}
		return false ;
	}
}