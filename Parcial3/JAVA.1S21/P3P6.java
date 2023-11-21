import java.util.Scanner;

public class P3P6{
	public static int promedio(int[] numeros){
		int suma = 0;
		for(int num : numeros){
			suma += num;
		}
		return suma/numeros.length;
	} 

	public static int[] captura(){
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		for (int x=0;x<10;x++) {
			System.out.println("INGRESA EL VALOR DE NUMEROS["+(x+1)+"]:");
			numeros[x]=teclado.nextInt();
		}
		return numeros;
	}

    public static void main(String[] args) {
    	int [] arreglo = captura();
    	System.out.println("EL PROMEDIO DE 10 NUMEROS ES " + promedio(arreglo));	
    	
    	for (int a=0; a<arreglo.length;a++){ 
    	System.out.println("valor en la posicion["+(a+1)+"]: "+ arreglo[a]);
        }
    }
}