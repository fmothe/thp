package actividad1;

import java.util.Scanner;

public class Ej6 {

	final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cantVenta;
		double montoAdicional;
		double sueldoTotal;
		
		int sueldoEmpleado = 44000;
		
		System.out.println("Ingrese cantidad de ventas");
		cantVenta = (double) input.nextInt();
		
		montoAdicional = (cantVenta*16)/100;
		
		sueldoTotal = sueldoEmpleado + montoAdicional;
		
		System.out.println("El sueldo del empleado fue de: "+sueldoTotal);
		
		
		
		
		
		input.close();
		
		
		
		
		
	}

}
