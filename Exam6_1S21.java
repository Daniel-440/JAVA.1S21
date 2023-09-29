import java.util.Scanner;
import java.lang.Math;

public class Exam6_1S21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X;
        int Y;
        int A;
        int B;
        int C;
        double distancia;

        System.out.println("CALCULAR EL VALOR DE LA DISTANCIA ENTRE UN PUNTO Y UNA LINEA.");
        System.out.println("LAS COORDENADAS DEL PUNTO X ES: ");
        X = teclado.nextInt();
        System.out.println("LAS COORDENADAS DEL PUNTO Y ES: ");
        Y = teclado.nextInt();
        System.out.println("EL VALOR DE A ES:");
        A = teclado.nextInt();
        System.out.println("EL VALOR DE B ES: ");
        B = teclado.nextInt();
        System.out.println("EL VALOR DE C ES: ");
        C = teclado.nextInt();
        double abs = Math.abs(A * X + B * Y + C);
        double raizAB = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        distancia = abs / raizAB;

        System.out.println("EL VALOR DE LA DISTANCIA ES: " + distancia);
    }
}