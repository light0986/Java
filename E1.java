package Test;
import java.util.Scanner;
public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  Scanner s = new Scanner(System.in);
			
		  for (int a = 1 ; a <= 1 ; ) {

			System.out.println("請輸入開始值?");
			String mini = s.next();
			int miniint = Integer.parseInt(mini);
	        
			System.out.println("請輸入結束值?");
			String max = s.next();
			int maxint = Integer.parseInt(max);
			
			if(miniint > maxint) {
				 System.out.println("開始值，不能大於結束值");
				 System.out.println("請重新輸入:");
			}
			else {
			     a = a + 1 ;
			     System.out.println( add1(miniint, maxint) );
			     System.out.println("END");
			}
		  }
	}
	
	public static int  add1(int x ,int y ) {

		int w = y - x + 1;
		int z = (y + x) * w / 2 ;
		//梯形面積計算，上底加下底，乘以高，除以二
		
		return z;
		
		
		 }

}
