import java.util.Arrays;
import java.util.Scanner;

public class Lection213 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста введите целое число, которое будет определять размер двумерного массива, типа квадрат");
        Scanner cs = new Scanner(System.in);
        int b = cs.nextInt();
        int[][] a = new int[b][b];
    //    System.out.println(Arrays.deepToString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j | b - i - 1 == j) {
                    a[i][j] = 1;
                    System.out.print(" " + a[i][j] + " ");
                }
                else
                    System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
