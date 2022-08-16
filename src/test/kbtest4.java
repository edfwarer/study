package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class kbtest4 {
    private static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        //괄호는 항상 짝수개
        if(s.length()%2 != 0) {
            return false;
        }

        for(int i =0; i<s.length(); i++) {
            switch(s.charAt(i)) {
                //괄호가 닫힌것은 비교하여 뺀다
                case ')':
                    if(stack.peek() == '(')
                        stack.pop();
                    break;
                case '}':
                    if(stack.peek() == '{')
                        stack.pop();
                    break;
                case ']':
                    if(stack.peek() == '[') {
                        stack.pop();
                    }
                    break;
                //괄호가 열린것은 스택에 담고
                default :
                    stack.push(s.charAt(i));
                    break;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input) ? "true" : "false");
    }
}
