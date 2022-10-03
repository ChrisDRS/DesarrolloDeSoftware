package EjercicioN1;
import java.util.Scanner;

public class soloMayorEdad 
{
	
	//	INSTRUCCIONES
	/*	Lea el nombre y la edad de cualquier persona e imprima,
	 	sólo si la persona es mayor de edad, el nombre de la persona.
	*/
	
	public static void main(String[] args) 
	{
		// Declaración de datos
		String nombre;
		int edad;
		
		// Lineas de instrucciones
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese un nombre");
			nombre = sc.nextLine();
			System.out.println("Ingrese una edad");
			edad = sc.nextInt();
		}
		
		//	Bloque de condicion
		if(edad>17)
			System.out.println(nombre);
	}
	
}
