import java.util.Scanner;

public class Lection23 {
    public static void main(String[] args) {
        printColor();
    }
    public static void printColor(){
        System.out.println("Пожалуйста введите любое число");
        Scanner cs = new Scanner(System.in);
        int value = cs.nextInt();
        if (value > 0 & value < 100) {
            System.out.println("Желтый");
        }
        if (value >= 100) {
            System.out.println("Зеленый");
        }
        if (value <= 0) {
            System.out.println("Красный");
        }
    }
}

