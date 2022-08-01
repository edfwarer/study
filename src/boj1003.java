import java.util.Scanner;

public class boj1003 {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        /**
         * test : 6, 22 -> 5 8, 10946 17711
         * fib[3] = fib[1] + fib[2]
         */
        dp[0][0] = 1; // 0일때 0호출 횟수
        dp[0][1] = 0; // 0일때 1호출 횟수
        dp[1][0] = 0; // 1일때 0호출 횟수
        dp[1][1] = 1; // 1일때 1호출 횟수

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            fibonacci(n);
        }
        System.out.print(dp[n][0] + " " + dp[n][1]);
    }

    static Integer[] fibonacci(int n) {
        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return dp[n];
    }
}

//import java.util.Scanner;
//
//public class boj1003 {
//
//    static Integer[][] dp = new Integer[41][2];
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
//        dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수
//        dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
//        dp[1][1] = 1;	// N=1 일 때의 1 호출 횟수
//
//        int T = in.nextInt();
//
//        while(T-- > 0){
//            int N = in.nextInt();
//            fibonacci(N);
//            System.out.println(dp[N][0] + " " + dp[N][1]);
//        }
//
//    }
//
//    static Integer[] fibonacci(int N) {
//        // N에 대한 0, 1의 호출 횟수가 없을 떄(탐색하지 않은 값일 때)
//        if(dp[N][0] == null || dp[N][1] == null) {
//            // 각 N에 대한 0 호출 횟수와 1 호출 횟수를 재귀호출한다.
//            dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
//            dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
//        }
//        // N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고있는 [N]을 반환한다.
//        return dp[N];
//
//    }
//
//}