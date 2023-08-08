package 참고; //보범답안 학우
import java.util.Scanner;
public class Main3 { //후위연산자
	static int postCalc(String expr) {
        int[] stack = new int[20];
        int top = -1;
        for(int i = 0; i<expr.length(); i++) {
            stack[i] = 0; //0으로 모두 초기화 필요 x
        }
        for(int i=0; i<expr.length(); i++) {
            char c = expr.charAt(i);
            if(c == '+') {
                int num1 = stack[top];
                int num2 = stack[--top];
                stack[top] = num2 + num1;
            }else if(c == '-') {
                int num1 = stack[top];
                int num2 = stack[--top];
                stack[top] = num2 - num1;
            }else if(c == '*') {
                int num1 = stack[top];
                int num2 = stack[--top];
                stack[top] = num2 * num1;
            }else if(c == '/') {
                int num1 = stack[top];
                int num2 = stack[--top];
                stack[top] = num2 / num1;
            }else {
                stack[++top] = c - '0'; //설명다시 듣기
            }
        }
        if(top==0) {
            return stack[top];
        }
        return -100;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		int r =postCalc(expr);
		System.out.println(expr + "=" + r);
		
	}

}
