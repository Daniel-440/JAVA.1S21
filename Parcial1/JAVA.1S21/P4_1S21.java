import java.util.Scanner;

class P4_1S21 {
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Hola. Introduce tu nombre: ");
		String nombre = escaner.nextLine();

		System.out.println("Introduce tu correo: ");
		String correo = escaner.nextLine();

		System.out.println("Introduce tu edad: ");
		int edad = escaner.nextInt();

		System.out.println("Introduce tu numero: ");
		long numero = escaner.nextLong();

		System.out.println("Te llamas " + nombre + ", tu edad es " + edad + ", tu correo es " + correo + " y tu numero es " + numero);
		System.out.println(" BIENVENIDO :') ");
	}
}

