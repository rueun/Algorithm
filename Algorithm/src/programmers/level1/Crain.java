package programmers.level1;

import java.util.Stack;

public class Crain {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board, moves));
	}
	
	public static int solution(int[][] board, int[] moves) {
		Stack<Integer> mystack = new Stack<Integer>();
        int answer = 0;
		for(int move:moves) {
			int i = 0;
			while(i <= board.length-1) {
				if (board[i][move-1] != 0) { // 뽑으려는 값이 0이 아니라면
					if(mystack.empty()) { // 스택이 비어 있다면
						mystack.push(board[i][move-1]);
						board[i][move-1] = 0;
						break;
					}
					if(mystack.peek() == board[i][move-1]) { // 스택 맨 위의 값과 넣으려는 값이 같으면
						mystack.pop();
						answer = answer + 2;
					} else {
						mystack.push(board[i][move-1]);
					}
					board[i][move-1] = 0;
					break;
				}
				i++;
			}
		}

        return answer;
    }
}
