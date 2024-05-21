import java.util.Scanner;

public class Lection29 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста введите год, который Вы хотите проверить");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = a % 4;
        int c = a % 100;
        int d = a % 400;
        if (a > 0 & b == 0 & c != 0 | d == 0) {
            System.out.println("Введенный Вами год является високосным");
        }
        else {
            System.out.println("Введенный Вами год не является високосным");
        }
        }
    }