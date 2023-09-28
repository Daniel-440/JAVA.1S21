import java.util.Scanner;

public class P9_1S21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		System.out.println("Que tipo de operacion desea realizar");
		System.out.println("Escribala: suma, resta");
		operacion = teclado.nextLine();

		if (operacion.equals("suma")){
			System.out.println("Haremos una suma");
		}   else if (operacion.equals("resta")){
			System.out.println("Haremos una resta");
		} else {
			System.out.println("No existe la operacion.. ");
		}
	}
}