import java.util.Scanner;

public class P2P7_1S21 {
	public static void main (String[] args) { 
	char opc;
	Scanner teclado = new Scanner(System.in);
	boolean estado = true;

	do{
		System.out.println(" MENU DE OPCIONES ");
		System.out.println(" 1.- SUMA ");
		System.out.println(" 2.- RESTA ");
		System.out.println(" 3.- MULTIPLICACION ");
		System.out.println(" 4.- DIVISION ");
		System.out.println(" S.- SALIR ");
		System.out.println("¿QUE OPCION DESEA? ");
		opc = teclado.nextLine().charAt(0);
		switch(opc){
			case '1': System.out.println(" Aqui la Suma "); break;
			case '2': System.out.println(" Aqui la Resta "); break;
			case '3': System.out.println(" Aqui la Multiplicacion "); break;
			case '4': System.out.println(" Aqui la Divsion "); break;
			case 'S':
			case 's': 
			    System.out.println(" Aqui va la opcion de Salir ");
			    estado=false;
			    break;
		    }
		}while(estado);
	}
}