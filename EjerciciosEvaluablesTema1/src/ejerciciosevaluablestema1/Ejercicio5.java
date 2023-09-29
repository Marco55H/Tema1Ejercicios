package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Nombramos la variable a
		int a;
		// Nombramos la variable b
		int b;
		// Nombramos la variable c
		int c;
		// Nombramos la variable x
		int x;
		// Nombramos la variable y que tendrá la solución
		int y;
		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);

		//pedimos el numero a
		System.out.println("Introduce el dato a para la fórmula y=ax2+bx+c");
		// lo leemos por el teclado
		a = sc.nextInt();

		//pedimos el numero b
		System.out.println("Introduce el dato b para la fórmula y=ax2+bx+c");
		// lo leemos por el teclado
		b = sc.nextInt();

		//pedimos el numero c
		System.out.println("Introduce el dato c para la fórmula y=ax2+bx+c");
		// lo leemos por el teclado
		c = sc.nextInt();

		//pedimos el numero x
		System.out.println("Introduce el dato x para la fórmula y=ax2+bx+c");
		// lo leemos por el teclado
		x = sc.nextInt();

		//Llevamos a cabo nuestra fórmula para obtener la y
		y = a * (x * x) + b * x + c;

		// damos la solución al usuario
		System.out.println("El resultado de nuestra formula es: " + y);
		//Cerramos el escáner
		sc.close();
	}

}
