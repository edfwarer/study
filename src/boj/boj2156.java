package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2156 {
    public static void main(String[] args) throws IOException {
        /**
         * Dynamic Programming
         *
         * 포도주 잔의 개수 n이 주어진다. (1 ≤ n ≤ 10,000)
         * n+1번째 줄까지 포도주 잔에 들어있는 포도주의 양이 순서대로 주어진다. 포도주의 양은 1,000 이하의 음이 아닌 정수이다.
         *
         * 포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
         * 연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
         *
         * 최대로 마실 수 있는 포도주의 양을 출력
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력받은 잔의 개수
        int n = Integer.parseInt(br.readLine());
        //일벽받은 포도주의 양
        int[] arr = new int[n + 1];
        //포도주의 총량
        int[] score = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        score[1] = arr[1];
        score[2] = arr[1] + arr[2];
        score[3] = Math.max(score[2], Math.max(score[1], arr[2]) + arr[3]);

        //Math.max(n n+2, n+1)
        for (int i = 4; i <= n; i++) {
            //1,2,3이 있을때 1+2, 2+3, 1+3 전부 비교
            score[i] = Math.max(score[i - 1], Math.max(score[i - 2], score[i - 3] + arr[i - 1]) + arr[i]);
        }

        System.out.println(score[n]);
    }
}
