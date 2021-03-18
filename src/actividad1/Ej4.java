package actividad1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Ingrese el valor de la hora de trabajo: ");
		
		Double vHora = input.nextDouble();
		
		System.out.println("Ingrese la cantidad de horas trabajadas: ");
		int cantHora = input.nextInt();
		
//		Suponiendo que un dia habil tiene 8 horas
		System.out.println("El empleado recaudo un total de : "+vHora*cantHora + " Trabajando un tiempo total de: "+cantHora);
		System.out.println("El máximo de dinero que puede recaudar es de: "+ vHora*(8*5+4));
		
		
		

	}

}
