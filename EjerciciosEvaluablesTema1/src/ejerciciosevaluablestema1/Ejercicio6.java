package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	int seg;
	int horas;
	int x;
	int minutos;
	int segundos;
	int y;
	final int ses = 60;
	final int tresmil = 3600;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Dame el número de segundos");
	seg = sc.nextInt();
	
	horas= seg/tresmil;
	x=seg%tresmil;
	minutos =	x == 0? 0 : (seg/ses)-(horas*ses);
	
	y=seg%60;
	
	segundos = y == 0? 0 : (seg)- ((minutos*ses)+(horas*tresmil));
	
	System.out.println("En "+ seg +" segundos hay "+horas+" horas y "+minutos+" minutos y " + segundos+ " segundos");
	sc.close();
}
}
