package sourcehan;

public class  WhileSum {
	public static void main(String[] args) {
		int s, n;

		s=0;
		n=0;

		while(n<100) {
			n++;
			s+=n;
		}
		System.out.println("결과 : " + s);
	}
}
