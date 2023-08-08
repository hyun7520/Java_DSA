package 참고; //답안 다른 하구
import java.util.Scanner;
public class Main4 { //후위연산자
	static int postcalc(String expr) {
        int data[] = new int[100];
        int top = -1;
        char c;
        for(int i=0; i<expr.length(); i++) {
            c = expr.charAt(i);
            if(c=='+') {
                int ans = data[top-1]+ data[top--];
                data[--top] = ans; //우선순위 문제로 -- 붙여야함
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
