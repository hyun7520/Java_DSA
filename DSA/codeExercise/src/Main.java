// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.\

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String s = bf.readLine();
        int i = Integer.parseInt(s);
        int k = Integer.parseInt(st.nextToken());
        String str2 = st.nextToken();

        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        int j = sc.nextInt();
        String str = sc.nextLine();
        double d = sc.nextDouble();
    }
}
