import java.util.Scanner;

public class P2P6_1S21 {
    public static void main(String[] args) {
        int a = 1; 
        Scanner teclado = new Scanner(System.in); 
        char opc; 

        do {
            System.out.println("aqui nos repetiremos");
            a++;
        } while (a < 10);

        a = 10;
        do {
            System.out.println("acaso se ejecutara esta linea");
        } while (a < 10); 

        do {
            System.out.println("Presiona s para salir");
            opc = teclado.next().charAt(0);
        } while (Character.toLowerCase(opc) != 's');
    }
}