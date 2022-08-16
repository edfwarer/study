package boj;

import java.util.Scanner;

public class boj1007 {

    private static int P[][];

    public static void main(String[] args) {
        /**
         * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 구성되어있다.
         *
         * 테스트 케이스의 첫째 줄에 점의 개수 N이 주어진다. N은 짝수이다. 둘째 줄부터 N개의 줄에 점의 좌표가 주어진다.
         * N은 20보다 작거나 같은 자연수이고, 좌표는 절댓값이 100,000보다 작거나 같은 정수다. 모든 점은 서로 다르다.
         */

        Scanner sc = new Scanner(System.in);

        int testCount = sc.nextInt();

        while (testCount --> 0) {
            int pointCount = sc.nextInt();

            P = new int[pointCount][2];

            for (int i = 0; i < pointCount; i++) {

            }
        }
    }

    private void distance(int a, int b){

    }
}
