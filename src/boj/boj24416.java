package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj24416 {
    /**
     * Dynamic Programming
     *
     * 아래 의사 코드를 이용하여 n의 피보나치 수를 구할 경우 코드1 코드2 실행 횟수를 출력하자.
     *
     * 5 ≤ n ≤ 40
     */

    static int f_count = 0;
    static int fibonacci_count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (5 <= n && n <= 40) {
            fib(n);
            fibonacci(n);
            System.out.println(f_count + " " + fibonacci_count);
        }
    }

    private static int fib(int n) {
        int[] f = new int[41];
        if (n == 1 || n == 2) {
            f_count++;
            //code 1
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    private static int fibonacci(int n) {
        int[] f = new int[41];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= n; i++) {
            //code 2
            f[i] = f[i - 1] + f[i - 2];
            fibonacci_count++;
        }
        return f[n];
    }
}
