public class P2P2_1S21{
	public static void main(String[] args){
		int val=1;
		switch(val){
		case 1: System.out.println("Se evalua a 1"); break;
		case 2: System.out.println("Se evalua a 2"); break;
		case 3: System.out.println("Se evalua a 3"); break;
		case 4: System.out.println("Se evalua a 4"); break;
		case 5: System.out.println("Se evalua a 5"); break;
		default: System.out.println("Valor fuera de rango"); 
		}

		Character opc= 'a';
		switch(opc){
			case'a': System.out.println("Se evalua a A");
			case'b': System.out.println("Se evalua a B");
			case'c': System.out.println("Se evalua a C");
			case'd': System.out.println("Se evalua a D");
			case'e': System.out.println("Se evalua a E");
			case'f': System.out.println("Se evalua a F");
			default: System.out.println("Opcion no existe");
		}

		String cadena = "uno";
		switch(cadena) {
			case "uno": System.out.println("Uno");
			case "dos": System.out.println("Dos");
			case "tres": System.out.println("Tres");
			case "cuatro": System.out.println("Cuatro");
			default: System.out.println("No existe la opcion");
		}
	}
}