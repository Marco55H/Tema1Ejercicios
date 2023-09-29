package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		// Nombramos la variable numero inicial
		int num1;
		//Nombramos la variable numero segundo
		int num2;
		//Nombramos la variable boolean
		boolean verdad;

		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el numero inicial
		System.out.println("Introduzca el primer número ");
		// lo leemos por el teclado
		num1 = sc.nextInt();
		
		//pedimos el numero 2
		System.out.println("Introduzca el segundo número ");
		// lo leemos por el teclado
		num2 = sc.nextInt();

		//Si num1 es igual a num2 será true, en caso contrario dará false
		verdad = num1 == num2;
		
		// damos la solución al usuario
		System.out.println(" " + verdad);
		//Cerramos el escáner
		sc.close();
	}
}
