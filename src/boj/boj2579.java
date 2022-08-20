package boj;

import java.util.Scanner;

public class boj2579 {
    public static void main(String[] args) {
        /**
         * Dynamic Programming
         *
         * 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
         * 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
         * 마지막 도착 계단은 반드시 밟아야 한다.
         * 따라서 첫 번째 계단을 밟고 이어 두 번째 계단이나, 세 번째 계단으로 오를 수 있다.
         * 하지만, 첫 번째 계단을 밟고 이어 네 번째 계단으로 올라가거나, 첫 번째, 두 번째, 세 번째 계단을 연속해서 모두 밟을 수는 없다.
         *
         * 각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.
         *
         * 계단(stair) <= 300 자연수(score) <= 10000
         */
        Scanner sc = new Scanner(System.in);

        //계단의 갯수
        int N = sc.nextInt();
        int[] stair = new int[301];
        //합을 저장하는 배열
        int[] score = new int[301];

        for (int i = 1; i <= N; i++) {
            stair[i] = sc.nextInt();
        }

        score[1] = stair[1];
        score[2] = stair[1] + stair[2];
        score[3] = Math.max(stair[1], stair[2]) + stair[3];

        //Bottom - Up 방식 대체로 for문으로 해결가능
        for (int k = 4; k <= N; k++) {
            //연속된 계단 3개는 안되므로 Math.max(n-2, n-3 + n-1)를 비교해야한다.
            score[k] = Math.max(score[k-2], score[k-3] + stair[k-1]) + stair[k];
        }

        System.out.println(score[N]);
    }
}
