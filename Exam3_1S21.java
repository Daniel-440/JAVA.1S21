import java.util.Scanner;

public class Exam3_1S21 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("INTRODUCE EL RADIO DE LA ESFERA: ");
        
        double radio = scanner.nextDouble();

        scanner.close();

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("EL VOLUMEN DE LA ESFERA CON EL RADIO  " + radio + " ES IGUAL A " + volumen);
    }
}