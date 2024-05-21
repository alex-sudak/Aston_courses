import java.util.Scanner;

public class Lection27 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста введите цифру 'a'");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        if (a > 0) {
            System.out.println(false);
        }
        if (a < 0) {
            System.out.println(true);
        }
        if (a == 0) {
            System.out.println("Вы ввели число '0'");
        }
    }
}
