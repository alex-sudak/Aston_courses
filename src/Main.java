import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean success = false;
        do {
            System.out.println("Пожалуйста введите номер задания Темы 2, которое Вы хотели бы проверить - целое число от 1 до 14");
            Scanner cs = new Scanner(System.in);
            int numberOfTask = cs.nextInt();
            if (numberOfTask == 1) {
                Lection21 l21 = new Lection21();
                l21.main(args);
            }
            if (numberOfTask == 2) {
                Lection22 l22 = new Lection22();
                l22.main(args);
            }
            if (numberOfTask == 3) {
                Lection23 l23 = new Lection23();
                l23.main(args);
            }
            if (numberOfTask == 4) {
                Lection24 l24 = new Lection24();
                l24.main(args);
            }
            if (numberOfTask == 5) {
                Lection25 l25 = new Lection25();
                l25.main(args);
            }
            if (numberOfTask == 6) {
                Lection26 l26 = new Lection26();
                l26.main(args);
            }
            if (numberOfTask == 7) {
                Lection27 l27 = new Lection27();
                l27.main(args);
            }
            if (numberOfTask == 8) {
                Lection28 l28 = new Lection28();
                l28.main(args);
            }
            if (numberOfTask == 9) {
                Lection29 l29 = new Lection29();
                l29.main(args);
            }
            if (numberOfTask == 10) {
                Lection210 l10 = new Lection210();
                l10.main(args);
            }
            if (numberOfTask == 11) {
                Lection211 l11 = new Lection211();
                l11.main(args);
            }
            if (numberOfTask == 12) {
                Lection212 l12 = new Lection212();
                l12.main(args);
            }
            if (numberOfTask == 13) {
                Lection213 l13 = new Lection213();
                l13.main(args);
            }
            if (numberOfTask == 14) {
                Lection214 l14 = new Lection214();
                l14.main(args);
            }
            if (numberOfTask <= 0 | numberOfTask > 15) {
                System.out.println("Вы ввели номер задания, которого не существует, попробуйте снова");
            }
        } while (!success);
    }
}

