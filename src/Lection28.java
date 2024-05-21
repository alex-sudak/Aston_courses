import java.util.Scanner;

public class Lection28 {
    public static void main(String[] args) {

        System.out.println("Пожалуйста введите свой текст");
        Scanner cs = new Scanner(System.in);
        String a = cs.nextLine();
        System.out.println("Пожалуйста введите любое целое положительное число");
        int b = cs.nextInt();
        for(int i = 1; i <= b ; i++){
            System.out.println(a);
        }
    }
}