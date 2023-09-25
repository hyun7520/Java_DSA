// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.\

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 00*00
        // 0***0
        // *****
        // 0***0
        // 00*00

        // 00 01 02 03 04  5/2 - 1 = 1
        // 10 11 12 13 14
        // 20 21 22 23 24

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i+j <= n/2 - 1) {
                    sb.append(" ");
                }
                else if(j-i >= n/2 + 1) {
                    sb.append(" ");
                } else {
                    sb.append('*');
                }
            }
            sb.append("\n");
        }

        String str = sb.toString();

        System.out.println(str);

    }
}
