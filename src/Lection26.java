import java.util.Scanner;

public class Lection26 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста введите любое целое число в консоль");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        if (a>=0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
}
