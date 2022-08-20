package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj11053 {
    public static void main(String[] args) throws IOException {
        /**
         * Dynaminc Programming
         *
         * 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
         *
         * 예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
         *
         * 1 ≤ N ≤ 1,000
         * 1 ≤ arr[] ≤ 1,000
         */
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력받은 숫자의 갯수
//        int N = sc.nextInt();
        int N = Integer.parseInt(br.readLine());
        //입력받은 배열
        int[] arr = new int[N + 1];
        //저장소
        int[] dp = new int[N + 1];
        dp[0] = 1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 1;
        //Bottom - Up 방식(재귀)
        for (int a = 1; a <= N; a++) {
            //저장소에 있는 수를 1로 통일
            dp[a] = 1;
            //a 이전의 수를 탐색
            for (int b = 0; b <= a; b++) {
                //arr[a] > arr[b]이고 dp에 저장된 값이 dp[a] <= dp[b]면 dp[a]의 값을 더해준다.
                if (arr[b] < arr[a] && dp[a] <= dp[b] + 1) {
                    dp[a] = dp[b] + 1;
                }
            }
            sum = Math.max(dp[a], sum);
        }
        System.out.println(sum);

    }
}
