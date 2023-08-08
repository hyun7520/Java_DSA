package ����; //��� �ٸ� �ϱ�
import java.util.Scanner;
public class Main4 { //����������
	static int postcalc(String expr) {
        int data[] = new int[100];
        int top = -1;
        char c;
        for(int i=0; i<expr.length(); i++) {
            c = expr.charAt(i);
            if(c=='+') {
                int ans = data[top-1]+ data[top--];
                data[--top] = ans; //�켱���� ������ -- �ٿ�����
            }
            else if(c=='-') {
                int ans = data[top-1] - data[top--];
                data[top] = ans;
            }
            else if(c=='*') {
                int ans = data[top-1] * data[top--];
                data[top] = ans;
            }
            else if(c=='/') {
                int ans = data[top-1] / data[top--];
                data[top] = ans;
            }
            else {
                data[++top] = Character.getNumericValue(c);
            }
        }
        if(top!=0) return 0;
        return data[top];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		int r =postcalc(expr);
		System.out.println(expr + "=" + r);
		
	}

}
