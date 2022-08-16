package test;

public class superlabs3 {
    public int solution(String s) {
        int answer = 1;
        int length = s.length();
        //문자 길이
        for (int i = 2; i <= length; i++) {
            for (int j = 0; j <= length - i; j++) {
                boolean check = true;
                //시작
                int start_char = j;
                //끝
                int end_char = j + i - 1;
                //비교
                while (start_char <= end_char) {
                    //성공
                    if (s.charAt(start_char) == s.charAt(end_char)) {
                        start_char++;
                        end_char--;
                    } else {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    answer = i;
                    break;
                }
            }

        }

        return answer;
    }
}
