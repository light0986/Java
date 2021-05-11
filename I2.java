package TEST;

public class I2 {

	public static void main(String[] args) {
		int[] d = { 6, 7, 9, 44, 5 ,11, 13,-5 , 7, 5, 7, 7};
		int target = 7;
		int c = e8(d, target);
		System.out.printf("%d ",c );
	}

	public static int e8(int[] xxx, int target) {

		int count = 0;
		for (int i = 0; i < xxx.length ; i++) {
			if (xxx[i] == target) {
				count = count+1;
				} 
		}
		return count;
	}
}
