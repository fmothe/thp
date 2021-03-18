
package actividad2;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
//		Ingresar dos numeros, y dada la operacion a realizar
//		mostrar el resultado.
		
		
		int num1, num2;
		double resultado;
		char operacion;  
		String operacion1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor ingrese su primer numero: ");
		num1 = input.nextInt();
		
		System.out.println("Por favor ingrese su segundo numero: ");
		num2 = input.nextInt();
		
		
		System.out.println("Elija la operación que desea realizar: "
				+"\n A) Suma "
				+"\n B) Resta"
				+"\n C) Multiplicacion "
				+"\n D) Division  ");
		
		operacion1 = input.next();
		
//		if(operacion == 1) {
//			resultado = num1+ num2;
//			System.out.println("El resultado de la suma es: "+ resultado);
//		}else if(operacion == 2) {
//			resultado = num1 - num2;
//			System.out.println("El resultado de la suma es: "+ resultado);
//		}else if(operacion == 3) {
//			resultado = num1*num2;
//			System.out.println("El resultado de la suma es: "+ resultado);
//		}else if(operacion == 4) {
//			if(num2 == 0) {
//				System.out.println("El numero 2 no  puede  ser menor a 0 para la division");
//			}else {
//				resultado = num1 /num2;
//				System.out.println("El resultado de la suma es: "+ resultado);
//			}
//		}
		
		switch (operacion1) {
		case "A":
			resultado = num1+ num2;
			System.out.println("El resultado de la suma es: "+ resultado);
			break;
		case "B":
			resultado = num1- num2;
			System.out.println("El resultado de la suma es: "+ resultado);
			break;
		case "C":
			resultado = num1* num2;
			System.out.println("El resultado de la suma es: "+ resultado);
			break;
		case "D":
			if(num2 == 0) {
				System.out.println("El divisor no puede ser 0");
			}else {
				resultado = num1 / num2;
				System.out.println("El resultado de la suma es: "+ resultado);
			}
			break;
		default:
			System.out.println("No existe opcion");
			break;
		}

	}

}
