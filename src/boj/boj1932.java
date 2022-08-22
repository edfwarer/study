package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1932 {
    public static void main(String[] args) throws IOException {
        /**
         * Dynamic Programming
         *
         * 첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.
         *
         * 합이 최대가 되는 경로에 있는 수의 합을 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //층의 개수
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N + 1][N + 1];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //삼각형 밑에서부터 계산하면서 [0][0]까지 
        for (int m = N - 1; m > 0; m--) {
            for (int n = 0; n < m; n++) {
                arr[m - 1][n] += Math.max(arr[m][n], arr[m][n + 1]);
            }
        }

        System.out.println(arr[0][0]);

    }
}
