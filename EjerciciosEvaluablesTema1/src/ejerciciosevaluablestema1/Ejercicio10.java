package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		// Nombramos la variable de los metros
		double metro;
		// Nombramos la variable de los centímetros
		double cm;
		//Nombramos la variable de los centímetros2 para que no salga el .0
		int centimetros;
		// Nombramos la constante que será 100 para realizar la conversión
		final int cien = 100;
		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);

		//pedimos la distancia a la que ha llegado
		System.out.println("A cuántos metros a llegado tu algoritmo?");
		// lo leemos por el teclado
		metro = sc.nextDouble();

		//Pasamos los metros a centimetros
		cm = metro * cien;

		//Quitamos los decimales a los centímetros
		centimetros = (int) cm;

		// damos la solución al usuario
		System.out.println("Tu algoritmo a volado un total de " + centimetros + " centímetros");
		//Cerramos el escáner
		sc.close();
	}

}
