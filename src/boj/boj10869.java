package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int plus = a + b;
        int minus = a - b;
        int multiple = a * b;
        int divide = 0;
        int remainder = a % b;
        if (b > 0) {
            divide = a / b;
        }
        System.out.println(plus + "\n" + minus + "\n" + multiple + "\n" + divide + "\n"+ remainder + "\n");
    }
}
