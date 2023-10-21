public class P2P11_1S21 {
	public static void main(String[] args) {
		for (String cadena : args) {
			char operacion = cadena.charAt(1);
			switch(operacion) {
				case 'a': System.out.println("Inciso a "); break;
				case 'b': System.out.println("Inciso b" ); break;
				case 'h': System.out.println("Inciso h "); break;
				case 'e': System.out.println("Inciso e "); break;
			}
		}
	}
}