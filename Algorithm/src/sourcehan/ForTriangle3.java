package sourcehan;
public class  ForTriangle3 {
	public static void main(String[] args) {
		int a, b;

		for(a=1; a<=5; a++) {
			for(b=1; b<=5-a; b++) {
				System.out.print(" ");
			}
			for(b=1; b<=a*2-1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(a=4; a>=1; a--) {
			for(b=1; b<=5-a; b++) {
				System.out.print(" ");
			}
			for(b=1; b<=a*2-1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} // main_end
}
