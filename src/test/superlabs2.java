package test;

public class superlabs2 {
    //    public long solution(int[][] rectangles) {
//        long answer = 0;
//        int x = 0;
//        int y = 0;
//        int [][] sum = new int[100][100];
//
//        for(int i = 0; i < rectangles.length; i++){
//            for (x = rectangles[i][0]; x < rectangles[i][2]; x++) {
//                for (y = rectangles[i][1]; y < rectangles[i][3]; y++) {
//                    sum[x][y] += 1;
//                    answer++;
//                    if (sum[x][y] >= 2) {
//                        answer--;
//                    }
//                }
//            }
//        }
//
//        return answer;
//    }
    public long solution2(int[][] rectangles) {
        /**
         * (x1, y1), (x2, y2)가 주어지고, 모든 사각형의 넓이?
         * 0<= x1 < x2 < 10^9
         * 0<= y1 < y2 < 10^9
         */
        // DP랑 관련있어 보인다.
        long answer = 0;
        int x = 0;
        int y = 0;
        int maxValue = 0;
        int[][] sum = new int[rectangles[0][3]][10000];
        int rectangle_sum = 0;

        for (int i = 0; i < rectangles.length; i++) {
            int x1 = rectangles[i][0];
            int y1 = rectangles[i][1];
            int x2 = rectangles[i][2];
            int y2 = rectangles[i][3];
            rectangle_sum = (x2-x1) * (y2-y1);
            for (x = x1; x < x2; x++) {
                for (y = y1; y < y2; y++) {
                    sum[x][y] += 1;
                    answer++;
                    if (sum[x][y] >= 2) {
                        answer--;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{0, 1, 4, 4}, {3, 1, 5, 3}};
        long answer = 0;
        int x = 0;
        int y = 0;
        int[][] sum = new int[10000][10000];

        for (int i = 0; i < rectangles.length; i++) {
            int x1 = rectangles[i][0];
            int y1 = rectangles[i][1];
            int x2 = rectangles[i][2];
            int y2 = rectangles[i][3];

            for (x = x1; x < x2; x++) {
                for (y = y1; y < y2; y++) {
                    sum[x][y] += 1;
                    answer++;
                    if (sum[x][y] >= 2) {
                        answer--;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
