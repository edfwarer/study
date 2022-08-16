package boj;

import java.util.Scanner;

public class boj2839 {
    public static void main(String[] args) {
        /**
         * Dynamic Programming
         *
         * 상근이는 지금 설탕을 정확하게 N킬로그램을 봉지에 배달해야 한다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
         * 최대한 적은 봉지를 들고 가려고 한다.
         * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 4 || n == 7) {
            System.out.println(-1);
        } else if (n % 5 == 0) {
            System.out.println(n / 5);
        } else if (n % 5 == 1) {
            System.out.println((n / 5) + 1);
        } else if (n % 5 == 3) {
            System.out.println((n / 5) + 1);
        } else if (n % 5 == 2) {
            System.out.println((n / 5) + 2);
        } else if (n % 5 == 4) {
            System.out.println((n / 5) + 2);
        }
    }
}
