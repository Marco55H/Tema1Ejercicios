package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int num;
		int num2;
		int rest;
		int siete;
			Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer número");
		
			num=sc.nextInt();
			
			System.out.println("Introduce el segundo número");
			
			num2=sc.nextInt();
			
			rest=num%num2;
					
			siete =	rest == 0? 0 : num2-rest;
			
			System.out.println("A tu número hay que darle "+ siete +" números para que llegue a ser multiplo de " +num2);
			sc.close();
		}	

}
