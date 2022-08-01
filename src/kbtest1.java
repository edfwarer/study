import java.util.Scanner;

public class kbtest1 {
    public static void main(String[] args) throws Exception {

        int[] alphabets = new int[26];

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace(" ","").toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            //소문자
            char ch = str.toLowerCase().charAt(i);
            alphabets[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            System.out.println((char)(97+i) + ":" + alphabets[i]);
        }
    }
}
