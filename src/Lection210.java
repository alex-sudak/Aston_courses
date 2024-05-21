public class Lection210 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
                System.out.print(a[i]);
                continue;
            }
            if (a[i] == 1) {
                a[i] = 0;
                System.out.print(a[i]);
            }
        }
    }
}
