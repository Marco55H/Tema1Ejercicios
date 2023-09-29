package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// Nombramos la variable altura
		double altura;
		// Nombramos la variable base
		double base;
		// Nombramos la variable area
		double area;
		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el numero base
		System.out.println("Dame una base para el triángulo");
		// lo leemos por el teclado
		base = sc.nextDouble();
		
		//pedimos el numero atura
		System.out.println("Dame una altura para el triángulo");
		// lo leemos por el teclado
		altura = sc.nextDouble();

		//LLevamos a cabo la fórmula del triángulo con los datos introducidos
		area = (base * altura) / 2;

		// damos la solución al usuario
		System.out.println("El area de tu triángulo es de:" + area);
		//Cerramos el escáner
		sc.close();
	}
}
