package actividad1;

import java.util.Scanner;

public class Ej7 {

	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ancho, alto, valorTotal, metrosAlambre, valorMetro;
		
		System.out.println("Ingrese el ancho: ");
		ancho = input.nextDouble();
		
		System.out.println("Ingrese la altura del terreno: ");
		alto = input.nextDouble();
		
		System.out.println("Ingrese el valor del metro cuadrado: ");
		valorMetro = input.nextDouble();
		
		
		valorTotal = (ancho*alto) * valorMetro;
		
	
		if(ancho == alto) {
//			Significa que esto es un cuadrado
			metrosAlambre = ancho*4;
		}else{
			metrosAlambre = 2*(ancho+alto);
		}
		
		System.out.println("El valor total del terreno es: "+ valorTotal + " por un total de: "+ (ancho*alto)+ " m2");
		System.out.println("Se necesitan "+ metrosAlambre +"metros de alambre para cercar el terreno");
		
		
		
		

	}

}
