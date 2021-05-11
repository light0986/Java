package TEST;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in) ;
		boolean b1 ;
		b1 = true ;
		boolean b2 ;
		b2 = (2 >=3 ) ;
		boolean b3;
		b3 = (3 >= 3) ;
		
		boolean b4,b5,b6;
		b4= b2 && b3 && true && true ;
		b5 = b2 || b3 || false || false ;
		
		b6 = true ^ true ;
		System.out.println(b6) ;
		b6 = true ^ false ;
		System.out.println(b6) ;
		b6 = false ^ false ;
		System.out.println(b6) ;

		System.out.println("==================");
		boolean b7 ;
		b7 = true ;
		System.out.println(b7);
		b7 = !b7 ;
		System.out.println(b7);
		
		
		
	}
}
