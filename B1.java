package A1;

import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
        System.out.println("�п�J�{�b���~?");
        String income = s.next();
        double Income = Double.parseDouble(income);
        double yearIncome = Income * 12;
        
        System.out.println("�ڲ{�b�����~�O"+ income +"��");
        System.out.println("�ڪ��~�~�O"+ yearIncome +"��");
		
	}

}
