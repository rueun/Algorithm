package sourcehan;

public class  WhileEven {
	public static void main(String[] args) {
		int n, s;

		s=0;
		n=0;

		while(n<100) {
			n+=2;
			s+=n;
		}
		System.out.println("결과 : " + s);
	}
}
