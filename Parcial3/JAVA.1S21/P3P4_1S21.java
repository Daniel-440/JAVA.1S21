import java.util.Scanner; 

public class P3P4_1S21 {

	static int veces;

	public static void elevacion( int a, int contador) {

		if (!(contador == veces)) elevacion(a*2,contador+1);
		else System.out.println("EL VALOR ES " + a);
	}

	public static void main (String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("CUANTAS VECES DESEAS REPETIR: ");
		veces = teclado.nextInt();
		int valor = 2;
		elevacion(valor,1);
	}
}