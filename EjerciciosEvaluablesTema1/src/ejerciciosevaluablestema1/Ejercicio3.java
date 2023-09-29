package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Nombramos la variable numero inicial
		int num;
		// Nombramos la variable numero segundo
		int num2;
		// Nombramos la variable resto
		int rest;
		// Nombramos la variable siete que tendrá la solución
		int siete;
		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el numero inicial
		System.out.println("Introduce el primer número");
		// lo leemos por el teclado
		num = sc.nextInt();

		//pedimos el numero segundo
		System.out.println("Introduce el segundo número");
		// lo leemos por el teclado
		num2 = sc.nextInt();

		//calculamos el resto de la división
		rest = num % num2;

		//Hacemos un ternario si el resto es igual a cero no tendremos q sumar números, en caso contrario calculamos cuantos números necesitamos para que el resto sea 0
		siete = rest == 0 ? 0 : num2 - rest;

		// damos la solución al usuario
		System.out.println("A tu número hay que darle " + siete + " números para que llegue a ser multiplo de " + num2);
		//Cerramos el escáner
		sc.close();
	}

}
