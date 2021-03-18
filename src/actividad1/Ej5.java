package actividad1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor ingrese num1: ");
		int num1 = input.nextInt();
		System.out.println("Por favor ingrese num2: ");
		int num2 = input.nextInt();
		
		System.out.println("num1: "+num1+ " num2: "+ num2);
		
		int aux = num1;
		
		num1 =num2;
		num2= aux;
		
		System.out.println("Intercambiados: num1: "+ num1+" num2: "+num2);
		
	}

}
