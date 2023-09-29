package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		// Nombramos la variable de las entradas de adulto
		int adult;
		// Nombramos la variable de las entradas de niño
		int niño;
		// Nombramos la constante del 5%
		final double porcentaje = 0.05;
		// Nombramos la constante precio de entrada adulta
		final int precioadult = 20;
		// Nombramos la constante precio de entrada niño
		final double precioniño = 15.50;
		// Nombramos la variable precio final
		double preciofin;

		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);

		//pedimos las entradas de adultos
		System.out.println("¿Cuantas entradas de adulto quieres?");
		// lo leemos por el teclado
		adult = sc.nextInt();

		//pedimos las entradas de niños
		System.out.println("¿Cuantas entradas de infantil quieres?");
		// lo leemos por el teclado
		niño = sc.nextInt();

		//Calculamos el precio de todas las entradas en conjunto
		preciofin = adult * precioadult + niño * precioniño;

		//Creamos un ternario si el precio total es mayor a 100, se aplicará un descuento del 5%
		preciofin = preciofin <= 100 ? preciofin : preciofin - (preciofin * porcentaje);

		// damos la solución al usuario
		System.out.println("El coste total es de: " + preciofin);
		//Cerramos el escáner
		sc.close();
	}
}
