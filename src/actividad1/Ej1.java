package actividad1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
//		Creo un nuevo objeto scanner que me va a permitir leer un input por consola
		Scanner input = new Scanner (System.in);
		System.out.println("Ingresa tu nombre: ");
//		Luego del primer mensaje, voy a leer la proxima linea con el scanner que cree anteriormente. 
		String nombre = input.nextLine();
//		Resultado
		System.out.println("Que tal "+ nombre +". Como estas ?");
		 
		
	}

}
