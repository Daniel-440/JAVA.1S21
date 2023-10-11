import java.util.Scanner;
import java.lang.Math;

public class Exam5_1S21{
	public static void main(String[] args) {
		java.util.Scanner teclado= new Scanner(System.in);
		System.out.println("CLACULAR EL AREA DE UN TRIANGULO: ");
		System.out.println("   *");
		System.out.println("   * *");
		System.out.println(" a *   *  b");
		System.out.println("   *  s  *");
		System.out.println("   *       *");
		System.out.println("   * * * * * *");
		System.out.println("        c");
		int a;
		int b;
		int c;
		int s;
		int area;
		double resultado;
		System.out.println("EL VALOR A ES: ");
		a= teclado.nextInt();
		System.out.println("EL VALOR B ES: ");
		b= teclado.nextInt();
		System.out.println("EL VALOR C ES: ");
		c= teclado.nextInt();
		s= (a+b+c)/2;
		area= s*(s-a)*(s-b)*(s-c);
		resultado= Math.sqrt(area);
		System.out.println(" EL AREA DEL TRINGULO ES : "+ resultado);
	}
}