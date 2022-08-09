package sourcehan;

public class  WhileOdd {
	public static void main(String[] args) {
		int n, s;

		s=0;
		n=1;

		while(n<=100) {
			s+=n;
			n+=2;
		}
		System.out.println("결과 : " + s);
	}
}
