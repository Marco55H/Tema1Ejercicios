package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
        int y;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce el dato a para la fórmula y=ax2+bx+c");
		a = sc.nextInt();
		
		System.out.println("Introduce el dato b para la fórmula y=ax2+bx+c");
		b = sc.nextInt();
		
		System.out.println("Introduce el dato c para la fórmula y=ax2+bx+c");
		c = sc.nextInt();
		
		System.out.println("Introduce el dato x para la fórmula y=ax2+bx+c");
		x = sc.nextInt();
		
	  y=a*(x*x)+b*x+c;
		
	  System.out.println("El resultado de nuestra formula es: "+y);
	  sc.close();
	}

}
