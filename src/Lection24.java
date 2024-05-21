import java.util.Scanner;

public class Lection24 {
    public static void main(String[] args) {
        compareNumbers();
    }
    public static void compareNumbers(){
        System.out.println("Пожалуйста введите цифру 'a'");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        System.out.println("Пожалуйста введите цифру 'b'");
        int b = cs.nextInt();
        if (a >= b) {
        System.out.println("a >= b");
            } else {
        System.out.println("a < b");
    }
}
}
