package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// Nombramos la variable segundo
		int seg;
		// Nombramos la variable horas
		int horas;
		// Nombramos la variable resto1
		int x;
		// Nombramos la variable minutos
		int minutos;
		// Nombramos la variable segundos 2 para que aparezca en la pantalla
		int segundos;
		// Nombramos la variable resto2
		int y;
		// Nombramos la constante 60 para la conversión
		final int ses = 60;
		// Nombramos la constante 3600 para la conversión
		final int tresmil = 3600;

		// iniciamos el escaner
		Scanner sc = new Scanner(System.in);

		//pedimos los segundos
		System.out.println("Dame el número de segundos");
		// lo leemos por el teclado
		seg = sc.nextInt();

		//Pasamos los segundos y calculamos cuantas horas nos caben
		horas = seg / tresmil;
		//Calculamos el resto de la división
		x = seg % tresmil;
		
		//Si el resto es 0 no hay ni minutos ni segundos, si es distinto de cero si habrá, aquí calculamos los minutos, quitando los ya utilizados por las horas
		minutos = x == 0 ? 0 : (seg / ses) - (horas * ses);

		//Calculamos el resto de la división
		y = seg % 60;

		//Si el resto es 0 no hay segundos, si es distinto de cero si habrá, aquí calculamos los segundos, quitando los ya utilizados por las horas y minutos
		segundos = y == 0 ? 0 : (seg) - ((minutos * ses) + (horas * tresmil));

		// damos la solución al usuario
		System.out.println("En " + seg + " segundos hay " + horas + " horas y " + minutos + " minutos y " + segundos+ " segundos");
		//Cerramos el escáner
		sc.close();
	}
}
