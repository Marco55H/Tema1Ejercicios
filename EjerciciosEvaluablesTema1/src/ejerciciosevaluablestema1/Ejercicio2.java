package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Nombramos la variable numero inicial
		int num;
		// Nombramos la variable resto
		int rest;
		// Nombramos la variable siete que tendrá el resultado
		int siete;
		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el numero inicial
		System.out.println("Dame el número para ver cuanto hay que sumarle para llegar a ser múltiplo de 7");
		// lo leemos por el teclado
		num = sc.nextInt();

		//Calculamos el resto de la división
		rest = num % 7;

		//Hacemos un ternario si el resto es igual a cero no tendremos q sumar números, en caso contrario calculamos cuantos números necesitamos para que el resto sea 0
		siete = rest == 0 ? 0 : 7 - rest;

		// damos la solución al usuario
		System.out.println("A tu número hay que darle " + siete + " números");
		//Cerramos el escáner
		sc.close();
	}
}
