import java.util.Scanner;

public class Exam4_1S21{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		double radio;
		double area;
		double longitud;
		System.out.println("CALCULAREMOS EL AREA Y LONGITUD.. ");
		System.out.println();
		System.out.println("ESCRIBE UN RADIO: ");
		radio=teclado.nextInt();
		area= Math.PI*Math.pow(radio,2);
		//area = PI*r^2
		longitud = 2*Math.PI*radio;
		//longitud = 2*PI*r;
		System.out.println("LA AREA ES: " + area);
		System.out.println("LA LONGITUD ES: " + longitud);
	}
}