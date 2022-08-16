package boj;

import java.util.Scanner;

public class boj1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = 0;
        if (b > 0) {
            result = a / b;
        }
        System.out.println(result);
    }
}
