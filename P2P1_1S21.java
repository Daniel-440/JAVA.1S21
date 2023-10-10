public class P2P1_1S21{
	public static void main (String[] args){
		int a=12;
		if(a<10){
			System.out.println("Si ingreso porque es verdadero");
		}

		if (a>10){
			System.out.println("Este elemento si se ejecuta porque cumple con la condicion");
		}

		if(true){
			System.out.println("Aqui se ejecuta porque es verdadero");
		}

		if (false){
			System.out.println("Esto no se ejecuta porque es falso");
		}

		if((a>10) == true){
			System.out.println("Se ejecutara?");
		}
		System.out.println("Continuamos el codigo");

		System.out.println("");

		a=18;

		if(a>17){
			System.out.println("Eres mayor de edad");
		}else{
			System.out.println("Eres menor de edad");
		}

		a=2;

		if(a == 1){
			System.out.println("Se evaluo a 1");
		} else if (a == 2){
			System.out.println("Se evaluo a 2");
		} else if (a == 3){
			System.out.println("Se evaluo a 3");
		} else if (a == 4){
			System.out.println("Se evaluo a 4");
		} else if (a == 5){
			System.out.println("Se evaluo a 5");
		} else{
			System.out.println("Se evaluaron los demas digitos");
		}

		int divisor=0;
		int dividendo=0;

		if (divisor == 0){
			System.out.println("No es posible hacer la division");
		}else{
			System.out.println("Si puedo hacer la division");
		}
	}
}