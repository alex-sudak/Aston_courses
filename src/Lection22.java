import java.util.Scanner;

public class Lection22 {
    public static void main(String[] args) {
        checkSumSign();
    }
    public static void checkSumSign(){
        System.out.println("Пожалуйста введите цифру 'a'");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        System.out.println("Пожалуйста введите цифру 'b'");
        int b = cs.nextInt();
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
