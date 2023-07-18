// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.\

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            String str = bf.readLine();
            int num = Integer.parseInt(bf.readLine());

            System.out.println(str);
            System.out.println(num);
    }
}
