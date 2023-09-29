package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		// Nombramos la variable milimetros
		double mm;
		// Nombramos la variable metros
		double cm;
		// Nombramos la variable metros
		double m;
		// Nombramos la variable suma
		double suma;
		// Nombramos la constante 10 para la conversión
		final int diez = 10;
		// Nombramos la variable 100 para la conversión
		final int cien = 100;

		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);

		//pedimos el numero milimetros
		System.out.println("Cuántos milimetros tienes?");
		// lo leemos por el teclado
		mm = sc.nextInt();

		//pedimos el numero centimetros
		System.out.println("Cuántos centimetros tienes?");
		// lo leemos por el teclado
		cm = sc.nextInt();

		//pedimos el numero metros
		System.out.println("Cuántos metros tienes?");
		// lo leemos por el teclado
		m = sc.nextInt();

		//Pasamos los milímetros a centímetros, aunque guardemos en nuevo dato en la misma variable
		mm = mm / diez;
		//Pasamos los metros a centímetros, aunque guardemos en nuevo dato en la misma variable
		m = m * cien;

		//Hacemos la suma de todos los números ya pasados a centímetros
		suma = mm + m + cm;
		
		// damos la solución al usuario
		System.out.println("Tienes una suma de " + suma + " centímetros");
		//Cerramos el escáner
		sc.close();
	}

}
