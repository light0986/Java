package Test;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			double w = add2( 1.2 , 3.4 ); //�@�~
			System.out.println(w); //�@�~
	}
		public static double add2(double...  a) { //�@�~
			double total2 = 0; //�@�~
			for (double  b   : a ) { //�@�~
				total2=total2 +b; //�@�~
			} //�@�~
			return total2; //�@�~
		} //�@�~
	}
