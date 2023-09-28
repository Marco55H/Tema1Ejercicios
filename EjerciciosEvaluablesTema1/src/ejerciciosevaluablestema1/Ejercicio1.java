package ejerciciosevaluablestema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
	
public static void main(String[] Arg) {
	//Nombramos la variable numero inicial
double num ;
//Nombramos la variable del aproximado
int aprox;
		// iniciamos el escaner
Scanner sc = new Scanner(System.in);
// creamos la localización
sc.useLocale(Locale.US);
//pedimos el numero inicial
System.out.println("Introduzca su número decimal para ser redondeado");
// lo leemos por el teclado
num = sc.nextFloat();
	//pasamos el aproximado a int y le sumamos a num 0.5 metiendolo en el aproximado para que el numero entero sea el que queramos
aprox = (int) (num+0.5); 
	
System.out.println("Tu número redondeado es :" + aprox );
sc.close();
}
}
