package sourcehan;

// 피보나치 수열
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
/*        
    // 1+1+2+3+5+8+13+21 : 피보나치수열
        int a=1, b=1, c;
        int s=2;
        
        int n=2;
        while(n<8) {
            c=a+b;
            s=s+c;
            a=b;
            b=c;
            n++;
        }
        System.out.println("결과:"+s);
*/
        
/*        
        // 0+1+1+2+3+5+8+13+21 : 피보나치수열
        // a   b
        //      a  b=a+b
        
        int a, b, c, n;
        int s=0;
        
        n=0;
        a=0;
        b=1;
        
        while(n<9) {
            s+=a;
            c=a+b;
            a=b;
            b=c;
            n++;
        }
        System.out.println(s); // 54
*/

        // 0부터 입력 받은 개수만큼 피보나치수 출력
        Scanner sc=new Scanner(System.in);
        int a, b, c, n;
        int cnt;
        
        System.out.println("개수?");
        cnt = sc.nextInt();
        
        n=0;
        a=1;
        b=1;
        
        while(n<cnt) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            n++;
        }
        
        sc.close();
    } // main_end
}