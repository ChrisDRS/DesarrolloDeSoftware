package EjercicioN3;
import java.util.Scanner;

public class masculinoMayor 
{

	//	INSTRUCCIONES
	/*
		Lea el nombre, la edad y el sexo de cualquier persona e imprima,
		sólo si la persona es de sexo masculino y mayor de edad, el nombre de la persona.
	*/
	
	public static void main(String[] args) 
	{
		// Declaración de datos
		String nombre;
		int edad;
		int sexo;
		
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese un nombre");
			nombre = sc.nextLine();
			System.out.println("Ingrese una edad");
			edad = sc.nextInt();
			System.out.println("Ingrese un sexo (si es masculindo ingresar 1, si es femenino ingresar 2)");
			sexo = sc.nextInt();
		}
		
		//	Bloque de condicion
		if(edad>17 && sexo==1)
			System.out.println(nombre);
	}

}
