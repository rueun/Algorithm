package sourcehan;
public class  ForGugudan {
	public static void main(String[] args) {
		int a, b;

		for(a=2; a<=9; a++) { // 단
			System.out.println(a + "단");
			for(b=1; b<=9; b++) { // 곱셈
				System.out.printf("%d * %d = %d%n", a, b, a*b);
			} // for(b=1; b<=9; b++)_end
			System.out.println();
		} // for(a=2; a<=9; a++)_end
	} // main_end
}
