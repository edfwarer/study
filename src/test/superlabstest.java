package test;

public class superlabstest {
    /**
     * 직사각형의 남은 한 점 구하기
     *
     * @param v 입력받은 좌표
     * @return 남은 한 점
     */
    public int[] solution(int[][] v) {
        int[] answer = new int[2];

        /**
         * [[x0,y0],         [x1,y1],          [x2,y2],          [x3,y3]]
         * [[0][0], [0][1]], [[1][0], [1][1]], [[2][0], [2][1]], [[3][0],[3][1]]
         */

        if(v[0][0] == v[1][0]) {
            answer[0]= v[2][0];
        } else if (v[0][0] == v[2][0]) {
            answer[0] = v[1][0];
        } else if (v[1][0] == v[2][0]){
            answer[0] = v[0][0];
        }

        if (v[0][1] == v[1][1]) {
            answer[1] = v[2][1];
        } else if (v[0][1] == v[2][1]) {
            answer[1] = v[1][1];
        } else if (v[1][1] == v[2][1]) {
            answer[1] = v[0][1];
        }

        return answer;
    }
}
