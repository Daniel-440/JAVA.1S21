import java.util.Scanner;

public class P3P9_1S21 {
    static int veces;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas veces deseas repetir:");
        veces = teclado.nextInt();
        System.out.println("0\n1");
        f(0, 1);
    }

    public static void f(int a, int b) {
        int c = a + b;
        if (c < veces) {
            System.out.println(c);
            f(b, c);
        }
    }
}