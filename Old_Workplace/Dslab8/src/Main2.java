import java.util.Scanner;
public class Main2 { //��ȣ�� �˻� �п� ����
	static boolean check(String str) {
        char[] stack = new char[100];
        int top = -1;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack[i] = c; // ���� ���� stack[++top]; ���� �ۼ��ؾ��Ѵ�
                top++;
            } else if(c == ')') {
                if(((int) stack[top] - (int) c) == -1) {//�ƽ�Ű �ڵ带 ����Ͽ� ���� �ڵ�
                    top--;
                }else {
                    return false;
                }
            } else if(c == '}' || c == ']') {
                if(((int) stack[top] - (int) c) == -2) {
                    top--;
                }else {
                    return false;
                }
              }
           }
        return true;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if(check(str)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}
