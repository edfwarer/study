package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1463 {
    /**
     * Dynamic Programming
     * <p>
     * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
     * <p>
     * X가 3으로 나누어 떨어지면, 3으로 나눈다.
     * X가 2로 나누어 떨어지면, 2로 나눈다.
     * 1을 뺀다.
     * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
     * 1 <= x < 10^6
     */
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int count = 0;
//
//        while (x > 1) {
//            if (x % 3 == 0) {
//                x = x / 3;
//                count++;
//            } else if (x % 2 == 0) {
//                x = x / 2;
//                count++;
//            } else {
//                x = x - 1;
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }

    static int ans = Integer.MAX_VALUE; // 제일 작은 횟수 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        toOne(n, 0);
        System.out.println(ans);
    }

    // Top-down / Bottom-up중에 Top-down식 -> 재귀
    static void toOne(int num, int cnt) {
        if (num == 1) {
            ans = Math.min(ans, cnt);
            return;
        }

        if (cnt >= ans) return;

        if (num % 3 == 0) {
            toOne(num / 3, cnt + 1);
        }
        if (num % 2 == 0) {
            toOne(num / 2, cnt + 1);
        }
        toOne(num - 1, cnt + 1);
    }
}
