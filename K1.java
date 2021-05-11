package Test;

public class K1 {
	public static void main(String[] args) {
		int[] d = { 6, 7, 9, 44, 5, 11, 13, -5, 7, 5, 7, 7 };

		String[] name = { "Mary", "Taipei", "NY", "Japan", "Korea", "France", "Taipei", "HK" };
		String target = "3";
		int c = search1(name, target);
		System.out.printf("%d  ", c);

		int a = search2(name, target);
		System.out.printf("%d  ", a);
		
		boolean e = searchYesNo(name, target);
		System.out.println(e);
		
		//System.out.println( "Taipei".equals("NY") );
		// System.out.println( "Taipei".equals("Taipei") );
		// System.out.println( "NY".equals("NY") );
		// System.out.println( "Taipei".equals("taipei") );
		// System.out.println( "Taipei".equalsIgnoreCase("taipei") );
		//System.out.println("Taipei".compareTo("taipei"));

	}

	public static int search1(String[] xxx, String target) {
		int pos = -1;
		for (int i = 0; i < xxx.length; i++) {
			if (xxx[i].equals(target)) {
				pos = i;
				break;
			} // if
		}
		return pos;
	}

	public static int search2(String[] xxx, String target) {
		int pos = -1;
		for (int i = 0; i < xxx.length; i++) {
			if (xxx[i].compareTo(target) == 0) {
				pos = i;
				break;
			} // if
		}
		return pos;
	}
	
	public static boolean searchYesNo(String[] xxx, String target) {
		boolean pos= false;
		for (int i = 0; i < xxx.length; i++) {
			if (xxx[i].equals(target)) {
				pos = true;
				break;
			} // if
		}
		return pos;
		}//searchYesNo
}