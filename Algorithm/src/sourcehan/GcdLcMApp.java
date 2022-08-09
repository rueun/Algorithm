package sourcehan;

import java.util.Scanner;

// 최대 공약수와 최소공배수 구하기
public class GcdLcMApp {
	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);

			int num1, num2, a, b, lcm;
			System.out.print("두수 ? ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			a=num1;
			b=num2;
			int mod = a % b;
		    while(mod > 0) {
		    	a = b;
		    	b = mod;
		        mod = a % b;
		    }
			System.out.println("GCD(최대공약수) : "+b);
			
			lcm = (num1*num2)/b;
			System.out.println("LCM(최소공배수) : "+lcm);
	}
}
