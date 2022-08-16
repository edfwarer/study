package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class kbtest {
    /**
     * 양의 정수를 입력받고 그 수의 약수를 전부 출력하는 프로그램
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int number = Integer.parseInt(input);
        List<Integer> yaksList = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                yaksList.add(i);
            }
        }
        StringBuilder str = new StringBuilder();
        for (int yak : yaksList) {
            str.append(yak);
            str.append(" ");
        }
        System.out.println(str);
    }
}