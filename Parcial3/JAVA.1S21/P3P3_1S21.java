public class P3P3_1S21 {

	public static void elevacion(int a, int contador){
		System.out.println("EL VALOR ES " + a);
		if (!(contador == 5)) elevacion(a*2, contador+1);
	}

	public static void main(String[] args) {
		int valor = 2;
		elevacion(2,1);
	}
}