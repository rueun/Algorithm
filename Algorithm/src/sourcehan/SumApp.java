package sourcehan;

public class SumApp {
	public static void main(String[] args) {
		int s = 0;
		for(int n=1; n<=100; n++) {
			s+=n;
		}
		System.out.println("결과 : " + s);

/*
		int s = 0;
		for(int n=2; n<=100; n+=2) { // 짝수합
			s+=n;
		}
		System.out.println("결과 : " + s);
*/

/*
		int s = 0;
		for(int n=1; n<=100; n+=2) { // 홀수합
			s+=n;
		}
		System.out.println("결과 : " + s);
*/
	}
}
