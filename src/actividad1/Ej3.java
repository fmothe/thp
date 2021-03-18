package actividad1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		int numeroEntero = input.nextInt();
		
		System.out.println("El valor del numero ingresado multiplicado por 5 es: "+ numeroEntero*5);
		
		System.out.println("El valor del numero ingresado divido por 2 es: " + (double) numeroEntero/2 );
		
		
	}

}
