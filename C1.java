package A1;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		int i;
		for(i = 1; i <= 3 ; i++) {
			
			
		System.out.println("�п�J�Ʀr?");
		String a = s.next();
		int num = Integer.parseInt(a);
		
		if(num > 0) {
			System.out.printf("%d �j�� 0\n",num);
		} else if (num < 0) {
			System.out.printf("%d �p��0\n",num);
		} else {
			System.out.printf("%d ���� 0\n",num);
		}
		}
		
     }
}

	