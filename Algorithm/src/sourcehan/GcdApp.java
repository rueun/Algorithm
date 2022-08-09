package sourcehan;

// 두수를 입력받아 최대 공약수 구하기
import java.util.Scanner;

public class GcdApp {
	public int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a%b);
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		GcdTest ob = new GcdTest();

		int a, b, c;

		System.out.print("첫번째 수  ? ");
		a = sc.nextInt();

		System.out.print("두번째 수  ? ");
		b = sc.nextInt();

		c = ob.gcd(a, b);
	    System.out.println("결과 : " + c);
  }
}
