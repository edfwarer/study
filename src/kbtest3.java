import java.util.Scanner;

public class kbtest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        int num = 1;
        int area = size * size;
        int i = 0;
        int j = 0;
        int width = size;
        int height = size - 1;
        while (num <= area) {
            for (int k = 0; k < width; k++) {
                array[i][j] = num;
                j++;
                num++;
            }
            width--;
            i++;
            j--;
            for (int k = 0; k < height; k++) {
                array[i][j] = num;
                i++;
                num++;
            }
            height--;
            i--;
            j--;
            for (int k = 0; k < width; k++) {
                array[i][j] = num;
                j--;
                num++;
            }
            width--;
            i--;
            j++;
            for (int k = 0; k < height; k++) {
                array[i][j] = num;
                i--;
                num++;
            }
            height--;
            i++;
            j++;
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0;  j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
