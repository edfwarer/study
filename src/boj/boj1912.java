package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1912 {
    public static void main(String[] args) throws IOException {
        /**
         * Dynamic Programming
         *
         * n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다.
         * 단, 수는 한 개 이상 선택해야 한다.
         *
         * 첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다.
         * 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //입력받은 수역
        int[] arr =  new int[N];
        //덧셈 저장하는 곳
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        int max = dp[0];
        for (int k = 1; k < N; k++) {
            //이전까지 탐색했던 값과 현재 위치의 값을 비교
            dp[k] = Math.max(dp[k-1] + arr[k], arr[k]);
            //최대값 갱신
            max = Math.max(dp[k], max);
        }
        System.out.println(max);
    }
}
