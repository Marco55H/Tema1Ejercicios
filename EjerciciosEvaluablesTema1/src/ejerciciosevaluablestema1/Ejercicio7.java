package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		double mm;
		double cm;
		double m;
		double suma;
		final int diez = 10;
		final int cien = 100;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántos milimetros tienes?");
		mm=sc.nextInt();
		
		System.out.println("Cuántos centimetros tienes?");
		cm=sc.nextInt();
				
		System.out.println("Cuántos metros tienes?");
		m=sc.nextInt();
				
				mm = mm/diez;
				m = m*cien;
				
				suma=mm + m + cm;
		System.out.println("Tienes una suma de "+suma+" centímetros");
				
		sc.close();
	}

}
