package actividad1;

import java.util.Scanner;

public class Ej8 {
	
	final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2, suma, resta, multiplicacion;
		double division;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = input.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = input.nextInt();
		
		System.out.println("Suma: " + (num1+num2));
		System.out.println("Resta: " + (num1-num2));
		System.out.println("Multiplicacion: " + (num1*num2));
		System.out.println("Division: " + (double)(num1/num2));
		
		input.close();
	}

}
