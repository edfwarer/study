package boj;

import java.util.Scanner;

public class boj1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //시행횟수
        int t = sc.nextInt();

        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int count = 0;
            //행성의 갯수
            int planet_count = sc.nextInt();
            for (int i = 0; i < planet_count; i++) {
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int cr = sc.nextInt();
                int distance1 = (int) (Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2));
                //끝점과 원의 중점 거리 구하기
                int distance2 = (int) (Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2));
                //케이스
                if (distance1 < Math.pow(cr, 2) && distance2 < Math.pow(cr, 2)) {
                    continue;
                }
                if (distance1 < Math.pow(cr, 2) || distance2 < Math.pow(cr, 2)) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
