package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
	int num;
	int rest;
	int siete;
		Scanner sc=new Scanner(System.in);
	System.out.println("Dame el número para ver cuanto hay que sumarle para llegar a ser múltiplo de 7");
	
		num=sc.nextInt();
		
		rest=num%7;
				
		siete =	rest == 0? 0 : 7-rest;
		
		System.out.println("A tu número hay que darle "+ siete +" números");
		sc.close();
	}	
}


