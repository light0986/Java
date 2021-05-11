package A1;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int i;
		for(i = 1; i <= 3 ; i++) {
			
			
		System.out.println("請輸入數字?");
		String a = s.next();
		int num = Integer.parseInt(a);
		
		if(num > 0) {
			System.out.printf("%d 大於 0\n",num);
		} else if (num < 0) {
			System.out.printf("%d 小於0\n",num);
		} else {
			System.out.printf("%d 等於 0\n",num);
		}
		}
		
     }
}

	