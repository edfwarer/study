package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1904 {
    public static void main(String[] args) throws IOException {
        /**
         * Dynamic Programming
         *
         * 1 하나만으로 이루어진 타일 또는 0타일을 두 개 붙인 한 쌍의 00타일들만이 남게 되었다.
         *
         * N이 주어졌을 때 지원이가 만들 수 있는 모든 가짓수를 세는 것
         * 1 ≤ N ≤ 1,000,000
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력받은 블럭 개수
        int N = Integer.parseInt(br.readLine());
        int[] block = new int[1000001];
        block[1] = 1;
        block[2] = 2;
        block[3] = 3;
        block[4] = 5;
        for (int i = 5; i <= N; i++) {
            //block[5] = block[4] + block[3], block[6] = block[5] + block[4]
            block[i] = (block[i - 1] + block[i - 2]) % 15746;
        }
        System.out.println(block[N]);
    }
}
