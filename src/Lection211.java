public class Lection211 {
    public static void main(String[] args) {
        int[] a = new int[100];
        System.out.println("Длина массива до изменения " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Длина массива после изменения " + a.length);
    }
}
