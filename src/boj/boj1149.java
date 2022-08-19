package boj;

import java.util.Scanner;

public class boj1149 {
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] dp;
    static int[][] cost;

    public static void main(String[] args) {
        /**
         * Dynamic Programming
         *
         * 1번 집의 색은 2번 집의 색과 같지 않아야 한다.
         * N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
         * i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
         *
         * 2 ≤ N ≤ 1,000
         */

        /**
         * Top - Down 방식(재귀)
         */
        Scanner sc = new Scanner(System.in);
        //n개 (집)
        int n = sc.nextInt();
        //집 좌표
        dp = new int[n][3];
        //페인트 가격
        cost = new int[n][3];

        for (int i = 0; i < n; i++) {
            //입력받은 페인트 가격
            cost[i][Red] = sc.nextInt();
            cost[i][Green] = sc.nextInt();
            cost[i][Blue] = sc.nextInt();
        }

        dp[0][Red] = cost[0][Red];
        dp[0][Green] = cost[0][Green];
        dp[0][Blue] = cost[0][Blue];

        System.out.println(Math.min(costCalculator(n - 1, Red), Math.min(costCalculator(n - 1, Green), costCalculator(n - 1, Blue))));

    }

    public static int costCalculator(int n, int color) {
        //탐색 시작 x
        if (dp[n][color] == 0) {
            //color의 색깔에 따라 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 dp에 저장한다
            if (color == Red) {
                dp[n][Red] = Math.min(costCalculator(n - 1, Green), costCalculator(n - 1, Blue)) + cost[n][Red];
            } else if (color == Green) {
                dp[n][Green] = Math.min(costCalculator(n - 1, Red), costCalculator(n - 1, Blue)) + cost[n][Green];
            } else {
                dp[n][Blue] = Math.min(costCalculator(n - 1, Green), costCalculator(n - 1, Red)) + cost[n][Blue];
            }
        }

        return dp[n][color];
    }
}
