package boj;

import java.util.Scanner;

public class boj1002 {
    public static void main(String[] args) {
        /**
         * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
         *
         * 한 줄에 x1, y1, r1, x2, y2, r2가 주어진다.
         */
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println(distance(x1, y1, r1, x2, y2, r2));
    }


    public static int distance(int x1, int y1, int r1, int x2, int y2, int r2) {
        //두 지점 사이의 거리
        int distance_circle = (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        //두 원이 동일
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (distance_circle > Math.pow(r1 + r2, 2)) {
            return 0;
        } else if (distance_circle < Math.pow(r1 - r2, 2)) {
            return 0;
        } else if (distance_circle == Math.pow(r1 - r2, 2)) {
            return 1;
        } else if (distance_circle == Math.pow(r1 + r2, 2)) {
            return 1;
        } else {return 2;}
    }
}
