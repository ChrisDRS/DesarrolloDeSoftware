package EjercicioN4;

import java.util.Scanner;

public class estadoCivil 
{
	
	//	INSTRUCCIONES
	/*
	 	Lea el nombre, la edad, el sexo (1 ó 2) y el estado civil de cualquier persona
	 	e imprima sólo si la persona es un hombre soltero mayor de edad, el nombre de la persona.
	*/
	
	public static void main(String[] args)
	{
		// Declaración de datos
		String nombre;
		int edad;
		int sexo;
		int statCivil;
		
		// Entrada de datos
		
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese un nombre");
			nombre = sc.nextLine();
			System.out.println("Ingrese una edad");
			edad = sc.nextInt();
			System.out.println("Ingrese un sexo (si es masculindo ingresar 1, si es femenino ingresar 2)");
			sexo = sc.nextInt();
			System.out.println("Ingrese un estado civil (Si es soltero ingrese 1, si es casado ingrese 2, si no es ninguno de los anteriores ingrese 3)");
			statCivil = sc.nextInt();
		}
		//	Bloque de condicion
		if(edad>17 && sexo==1 && statCivil==1)
			System.out.println(nombre);
	}

}
