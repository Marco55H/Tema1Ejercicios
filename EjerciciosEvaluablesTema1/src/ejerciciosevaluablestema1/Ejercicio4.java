package ejerciciosevaluablestema1;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	double altura;
	double base;
	double area;
	Scanner sc= new Scanner(System.in);
	System.out.println("Dame una base para el triángulo");
	base=sc.nextDouble();
	System.out.println("Dame una altura para el triángulo");
	altura=sc.nextDouble();
	
	 area = (base * altura) /2;

	 System.out.println("El area de tu triángulo es de:" +area);
	sc.close();
}
}
