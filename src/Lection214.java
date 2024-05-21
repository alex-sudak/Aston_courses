import java.util.Scanner;

public class Lection214 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста введите значение 'initialValue'");
        Scanner cs = new Scanner(System.in);
        String initialValue = cs.nextLine();
        System.out.println("Пожалуйста введите целое число 'len'");
        int len = cs.nextInt();
        String[] a = new String[len];
        System.out.println("Полученный массив длиной " + len + " выглядит следующим образом");
        for (int i = 0; i < len; i++) {
            if (i == len - 1){
                a[i] = initialValue;
                System.out.println(a[i]);
                continue;
            }
            a[i] = initialValue;
            System.out.print(a[i] + " , ");
        }
    }
}