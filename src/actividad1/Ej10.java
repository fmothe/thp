package actividad1;

import java.util.Scanner;

public class Ej10 {

	final static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre1, nombre2,nombre3; 
		
		double capital1, capital2, capital3, capitalTotal, porcentaje;
		
		
		System.out.println("Ingrese nombre primer socio: ");
		nombre1 = input.nextLine();
		
		System.out.println("Ingrese el capital aportado: ");
		capital1 = input.nextDouble();
		
		System.out.println("Ingrese nombre segundo socio: ");
		nombre2 = input.nextLine();
		
		System.out.println("Ingrese el capital aportado: ");
		capital2 = input.nextDouble();
		
		System.out.println("Ingrese nombre tercer socio: ");
		nombre3 = input.nextLine();
		
		System.out.println("Ingrese el capital aportado: ");
		capital3 = input.nextDouble();
		
		capitalTotal = capital1+capital2+capital3;
		
		System.out.println("El valor total aportado es: "+ capitalTotal);
		
		
		porcentaje = (capital1*100)/capitalTotal;
		System.out.println("El socio "+ nombre1 + "aporto un total de: "+porcentaje);
		
		porcentaje = (capital2*100)/capitalTotal;
		System.out.println("El socio "+ nombre2 + "aporto un total de: "+porcentaje);
		
		porcentaje = (capital3*100)/capitalTotal;
		System.out.println("El socio "+ nombre3 + "aporto un total de: "+porcentaje);
		
		
		
		
		
		
		
		
	}

}
