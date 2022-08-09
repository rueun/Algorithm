package sourcehan;

import java.util.Scanner;
// 최대공약수
public class  WhileGcd {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

		int num1, num2;
		System.out.print("두수 ? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

	    while(num1 != num2) {
			if(num1>num2)
				num1=num1-num2;
			else
				num2=num2-num1;
		}
		System.out.println("최대공약수 : "+num1);
	}
}
