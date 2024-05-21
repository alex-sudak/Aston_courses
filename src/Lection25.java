import java.util.Scanner;

public class Lection25 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста введите любое целое число");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        System.out.println("Пожалуйста введите любое целое число, чтобы завешить проверку введенных Вами чисел");
        int b = cs.nextInt();
        int c = a + b;
        if (c >= 10 & c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
