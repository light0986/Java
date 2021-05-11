package TEST;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		int[] xx = {11,12,13,14,51,52,53,54,55,80,81,82};
		int[] xx2 = {33,44,55,66,77,88};
		
		for (int i = 0 ; i < 12 ; i=i+1 ) {
			System.out.println(xx[i]);
		}
		System.out.println("============");
		//for從11開始顯示到82
		
		for (int j = 0 ; j < 12 ; j=j+1 ) {
			System.out.print(xx[j]+" ");
		}
		System.out.println(" ");
		System.out.println("============");
		//for從11開始顯示到82
		
		for (int k = 0 ; k < 12 ; k=k+1 ) {
			System.out.printf("%d ",xx[k]);
		}
		System.out.println(" ");
		System.out.println("============");
		//for從11開始顯示到82
		
		for (int l = 0 ; l < 6 ; l=l+1 ) {
			System.out.printf("%d ",xx2[l]);
		}
		System.out.println(" ");
		System.out.println("============");
		//for從33開始顯示到88
		
		for (int m = 0 ; m <= xx.length-1 ; m = m+1  ) {
			System.out.println(xx[m]);
		}
		System.out.println(" ");
		System.out.println("============");
		//for從11開始顯示到82
		
		for (int z : xx) {
		System.out.printf("%d ", z );
		}
		System.out.println("end");
	}

}
