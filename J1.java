package Test;

public class J1 {
	public static void main(String[] args) {
		int[] d = { 6, 7, 9, 44, 5 ,11, 13,-5 ,  7, 5, 7, 7};
		//e7() ;
		int target =7;
		int c = bSearch(d, target);
		System.out.printf("%d  ",c  );
		
		target =9;
		c = bSearch(d, target);
		System.out.printf("%d  ",c  );

		target = 55;
		c = bSearch(d, target);
		System.out.printf("%d  ",c  );
	}

  	//position:0,1,2; not found:-1
	public static int search(int[]  xxx , int  target) {
		int po = -1;
		for (int i =0  ; i < xxx.length  ; i++   ) {
			if ( xxx[i] == target) {
				po = i;
				break;
			}//if
		} //for  i
		return po;
	}//search     
	
	
  	//cack search position:2,1,0; not found:-1
	public static int bSearch(int[]  xxx , int  target) {
		int po = -1;
		for (int i =xxx.length-1 ; i >= 0  ; i--   ) {
			if ( xxx[i] == target) {
				po = i;
				break;
			}//if
		} //for  i
		return po;
	}//search    
}
