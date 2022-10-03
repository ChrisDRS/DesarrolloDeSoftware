package EjercicioN2;

import java.util.Scanner;

public class menorNoVota 
{
	
	//	INSTRUCCIONES
	/*
	 Lea el nombre y la edad de cualquier persona e imprima, 
	 sólo si la persona es mayor de edad, el nombre de la persona,
	 de lo contrario, imprima un mensaje que diga: “no puede votar”.
	*/

	public static void main(String[] args) 
	{
		// Declaración de datos
		String nombre;
		int edad;
		
		// Entrada de datos
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
		else
			System.out.println("no puede votar");
	}

}
