package test;

public class superlabs1 {

    public int solution(int n, int a, int b)
    {
        int answer = 0;
        //부모노드에서 만날때까지의 횟수
        while (a != b) {
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;
        }
        return answer;
    }
}
