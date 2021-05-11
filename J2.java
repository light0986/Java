package Test;

public class J2 {
	public static void main(String[] args) {
		int[] d = { 6, 7, 9, 44, 5, 11, 13, -5, 7, 5, 7, 7 };

		String[] name = { "Mary", "Taipei", "NY", "Japan", "Korea", "France", "Taipei", "HK" };
		String target = "NY";
		int c = search1(name, target);
		System.out.printf("%d  ",c  );
		
		//System.out.println( "Taipei".equals("NY") );
		//System.out.println( "Taipei".equals("Taipei") );
		//System.out.println( "NY".equals("NY") );
		//System.out.println( "Taipei".equals("taipei") );
		//System.out.println( "Taipei".equalsIgnoreCase("taipei") );
	}

	public static int search1(String[] xxx, String target) {
		int pos = -1;
		for (int i =0  ; i < xxx.length  ; i++   ) {
			if ( xxx[i].equals(target)) {
				pos = i;
				break;
			}//if
		} //for  i
		return pos;

	}

}