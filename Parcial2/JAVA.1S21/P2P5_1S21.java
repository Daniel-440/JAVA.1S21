public class P2P5_1S21 {
    public static void main(String[] args) {
        int a = 1;
        while (a < 10) {
            System.out.println("Estamos repitiéndonos dentro de un ciclo while");
            a++;
        }

        a = 10; 
        while (a < 10) {
            System.out.println("Que pasa con esta instrucción");
        }

        a = 1;
        while (true) { 
            System.out.println("Aqui controlamos el contador de forma manual");
            System.out.println("Y generamos un if para que la condición decida");
            System.out.println("cuando debemos terminar la repetición");
            if (a > 10) break;
            a++;
        }

        a = 1;
        while (false) {
            System.out.println("Cual es la justificación para no ejecutarse");
            break; 
        }
    }
}