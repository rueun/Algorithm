package sourcehan;

// 다이아몬드
public class StarApp {
	public static void main(String args[]) {
		int size = 5; // 홀수만 가능
		int st = 0;

		st = size/2;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < (size - st); j++) {
				System.out.print((j >= st) ? "*" : " ");
			}
			st = i < (size / 2) ? st - 1 : st + 1;
			System.out.println();
		}
	}
}
