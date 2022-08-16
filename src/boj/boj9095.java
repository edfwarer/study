package boj;

import java.util.Scanner;

public class boj9095 {
    public static void main(String[] args) {
        /**
         * Dynamic Programming
         *
         * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
         * 1 < n < 11
         */

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[11];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
            }
            System.out.println(dp[n]);
        }
    }
}
