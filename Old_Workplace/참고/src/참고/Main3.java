package ����; //������� �п�
import java.util.Scanner;
public class Main3 { //����������
	static int postCalc(String expr) {
        int[] stack = new int[20];
        int top = -1;
        for(int i = 0; i<expr.length(); i++) {
            stack[i] = 0; //0���� ��� �ʱ�ȭ �ʿ� x
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
                stack[++top] = c - '0'; //����ٽ� ���
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
