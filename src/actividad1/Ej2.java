package actividad1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		int nota1,nota2,nota3 = 0;
//		Ingreso valores
		System.out.println("Ingrese la nota perteneciente al primer trimestre: ");
		nota1 = input.nextInt();
		System.out.println("Ingrese la nota perteneciente al segundo trimestre: ");
		nota2 = input.nextInt();
		System.out.println("Ingrese la nota perteneciente al tercer trimestre: ");
		nota3 = input.nextInt();
		
//		Al no poder asignarse valores int a un double preciso hacer un casteo a double de los valores int que ya tengo
//		Si no se entiende con esto no se preocupen, ya que es mas avanzado
//		lo pueden hacer creando mas variables tal como se hizo en clase
		Double promedio = (double) (nota1+nota2+nota3)/3;
		System.out.println("La nota promedio es de: " + promedio);

	}

}
