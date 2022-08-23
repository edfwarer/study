package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9461 {
    /**
     * Dynamic Programming
     *
     *  삼각형은 정삼각형으로 변의 길이는 1이다. 그 다음에는 다음과 같은 과정으로 정삼각형을 계속 추가한다.
     *  나선에서 가장 긴 변의 길이를 k라 했을 때, 그 변에 길이가 k인 정삼각형을 추가한다.
     *
     * 파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.
     *
     * N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.
     *
     * 1 ≤ N ≤ 100
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스 개수
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            //int의 범위로는 해결이 안되므로 long으로
            long[] p = new long[101];
            p[1] = 1;
            p[2] = 1;
            p[3] = 1;
            p[4] = 2;
            p[5] = 2;

            for (int k = 6; k <= n; k++) {
                p[k] = p[k - 5] + p[k - 1];
            }
            System.out.println(p[n]);
        }
    }
}
