package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11054 {

    /**
     * Dynamic Programming
     *
     * 수열 S가 어떤 수 Sk를 기준으로 S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN을 만족한다면, 그 수열을 바이토닉 수열이라고 한다.
     *
     * 예를 들어, {10, 20, 30, 25, 20}과 {10, 20, 30, 40}, {50, 40, 25, 10} 은 바이토닉 수열이지만,  {1, 2, 3, 2, 1, 2, 3, 2, 1}과 {10, 20, 30, 40, 20, 30} 은 바이토닉 수열이 아니다.
     *
     * 수열 A가 주어졌을 때, 그 수열의 부분 수열 중 바이토닉 수열이면서 가장 긴 수열의 길이를 구하는 프로그램을 작성하시오.
     *
     * 첫째 줄에 수열 A의 크기 N이 주어지고, 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ Ai ≤ 1,000)
     */

    static int N;
    static int[] dp;
    static int[] reverse_dp;
    static int[] seq;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        //메모이제이션 : 수열의 크기값 저장하는 배열
        dp = new int[N];
        reverse_dp = new int[N];
        //입력받은 배열
        seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp_calculate();
        reverse_dp_calculate();

        //dp[]와 reverse_dp[]값을 더해서 최대값이 최대길이 (중복된 원소가 있으므로 -1 해줘야함)
        int max_count = 0;
        for (int k = 0; k < N; k++) {
            //max_count가 배열의 합보다 크면 유지, 작으면 배열의 합으로 교체
            if(max_count < dp[k] + reverse_dp[k]) {
                max_count = dp[k] + reverse_dp[k];
            }
        }

        System.out.println(max_count - 1);
    }

    static void dp_calculate() {
        for (int i = 0; i < N; i++) {
            //초기화
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                //배열 seq[i]의 값이 배열 seq[j]보다 크면서 dp[i]가 dp[j]보다 값이 작으면 dp[j]값에 + 1
                if (seq[i] > seq[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
    }

    static void reverse_dp_calculate() {
        //검색을 거꾸로
        for (int i = N - 1; i >= 0; i--) {
            //초기화
            reverse_dp[i] = 1;
            for (int j = N - 1; j > i; j--) {
                //배열 seq[i]의 값이 배열 seq[j]보다 크면서 dp[i]가 dp[j]보다 값이 작으면 dp[j]값에 + 1
                if (seq[j] < seq[i] && reverse_dp[i] < reverse_dp[j] + 1) {
                    reverse_dp[i] = reverse_dp[j] + 1;
                }
            }
        }
    }
}
