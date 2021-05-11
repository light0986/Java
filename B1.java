package A1;

import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
        System.out.println("請輸入現在月薪?");
        String income = s.next();
        double Income = Double.parseDouble(income);
        double yearIncome = Income * 12;
        
        System.out.println("我現在的月薪是"+ income +"元");
        System.out.println("我的年薪是"+ yearIncome +"元");
		
	}

}
