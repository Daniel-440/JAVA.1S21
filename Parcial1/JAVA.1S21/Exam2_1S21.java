import java.util.Scanner;

public class Exam2_1S21 {
    public static void main(String[] args) {

        final double PI = 3.1416;

        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE EL VALOR DEL ANGULO EN GRADOS: ");
        double grados = scanner.nextDouble();

        double radianes = grados * (PI / 180);

        System.out.println(grados + " GRADO SON EQUIVALENTES A " + radianes + " RADIANES ");

        scanner.close();
    }
}