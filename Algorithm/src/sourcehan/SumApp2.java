package sourcehan;

// 합 구하기(재귀 호출)
public class SumApp2 {
  public int sum(int n) {
	return (n > 1) ? sum(n-1) + n : 1;
  }

  public static void main(String args[]) {
	  SumApp2 ob = new SumApp2();

	  int s = ob.sum(10);
	  System.out.println("결과 : " + s);
  }
}
