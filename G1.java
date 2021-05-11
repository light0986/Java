package TEST;
import java.util.Scanner;
public class G1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sa = new Scanner(System.in);
		 System.out.println("請輸入月份(阿拉伯數字)?");
         String season = sa.next();
      
         switch(season) {
         case "1":
        	 System.out.println("冬天");
             break;
         case "2":
        	 System.out.println("春天");
             break;
         case "3":
        	 System.out.println("春天");
             break;
         case "4":
        	 System.out.println("春天");
             break;
         case "5":
        	 System.out.println("夏天");
             break;
         case "6":
        	 System.out.println("夏天");
             break;
         case "7":
        	 System.out.println("夏天");
             break;
         case "8":
        	 System.out.println("秋天");
             break;
         case "9":
        	 System.out.println("秋天");
             break;
         case "10":
        	 System.out.println("秋天");
             break;
         case "11":
        	 System.out.println("冬天");
             break;
         case "12":
        	 System.out.println("冬天");
             break;
         default:
        	 System.out.println("打錯");
             break;
         }
         System.out.println("END");

	}//main

}
