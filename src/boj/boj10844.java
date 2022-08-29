package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10844 {
    public static void main(String[] args) throws IOException {
        /**
         * Dynamic Programming
         *
         * 45656이란 수를 보자.
         *
         * 이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.
         *
         * N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.
         *
         * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
         * 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //자릿수
        int N = Integer.parseInt(br.readLine());
        //arr[자릿수][0 ~ 9까지]
        int[][] arr = new int[N + 1][10];
        long count = 0;

        for (int i = 1; i < 10; i++) {
            //한자리수일때는 1개씩밖에 수가 올 수가 없다.
            arr[1][i] = 1;
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                // 자릿값이 0이라면 이전 자릿값은 8만 가능
                if (j == 0) {
                    arr[i][j] = arr[i - 1][1] % 1000000000;
                // 자릿값이 9라면 이전 자릿값은 8만 가능
                } else if (j == 9) {
                    arr[i][j] = arr[i - 1][8] % 1000000000;
                } else {
                    arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1]) % 1000000000;
                }
            }
        }

        for (int k = 0; k < 10; k++) {
            count += arr[N][k];
        }
        System.out.println(count % 1000000000);
    }
}
