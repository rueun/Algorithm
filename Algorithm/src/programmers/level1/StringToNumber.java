package programmers.level1;

public class StringToNumber {
	public static void main(String[] args) {
		String s = "2three45sixseven";
		String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for(int i=0; i<10; i++) {
			s = s.replace(numbers[i], Integer.toString(i));
		}
		
		System.out.println(Integer.parseInt(s));
	}
}
