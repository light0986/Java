package Test;

public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 5, f = 8;
		System.out.printf("%d %d\n", m, f);

		int temp;
		temp = m;
		m = f;
		f = temp;
		System.out.printf("%d %d\n", m, f);

		temp = f;
		f = m;
		m = temp;
		System.out.printf("%d %d\n", m, f);

	}

}
