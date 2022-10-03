package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9251 {
    public static void main(String[] args) throws IOException {

        /**
         * Dynamic Programming
         *
         * LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.
         *
         * 예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.
         *
         * 첫째 줄과 둘째 줄에 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며, 최대 1000글자로 이루어져 있다.
         *
         * 첫째 줄에 입력으로 주어진 두 문자열의 LCS의 길이를 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] list1 = br.readLine().toCharArray();
        char[] list2 = br.readLine().toCharArray();

        int[][] dp = new int[list1.length + 1][list2.length + 1];

        for (int i = 1; i <= list1.length; i++) {
            for (int j = 1; j <= list2.length; j++) {
                if (list1[i-1] == list2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[list1.length][list2.length]);
    }
}
