package actividad1;

import java.util.Scanner;

public class Ej9 {
	
	final static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double angulo1;
		double angulo2;
		double angulo3;
		
		System.out.println("Ingrese el primer angulo");
		angulo1 = input.nextDouble();
		
		System.out.println("Ingrese el segundo angulo");
		angulo2 = input.nextDouble();
		
		angulo3 = 180-(angulo1+angulo2);
		
		
		System.out.println("El angulo restante tiene: "+ angulo3+" grados");
		
		input.close();
		
		

	}

}
