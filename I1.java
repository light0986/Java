package TEST;

public class I1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//同時為3與7的倍數
		
		e3();
		System.out.println( );
		e7();
		}

	public static void e3( ) {
		for (int i = 3  ; i <= 100   ; i=i+3   ) {
			if (i %7 == 0) {
				System.out.printf("%d  ",i  );
			}
		}
	}
	public static void e7( ) {
		for (int i =1  ; i <= 100  ; i++   ) {
			if (i %3 == 0  &&  i %7 == 0   ) {
				System.out.printf("%d  ",i  );
			}
		}
	}
}
