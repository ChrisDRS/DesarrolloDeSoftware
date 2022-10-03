package ejercicio14;
import java.util.*;

public class empleadoHora 
{
	//	INSTRUCCIONES
	/*
	  	Leer el nombre de un empleado, su salario básico por hora y el número de horas trabajadas en el mes.
	  	Calcular su salario mensual e imprimir tanto el nombre como su salario mensual.
	*/

	public static void main(String[] args) 
	{
		// Declaración de datos
		String nombre;
		Float SlrH, horasT;
		
		// Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese su nombre");
			nombre = sc.nextLine();
			System.out.println("Ingrese su salario por hora");
			SlrH = sc.nextFloat();
			System.out.println("Ingrese la cantidad de horas trabajadas");
			horasT = sc.nextFloat();
		}
		
		//	Bloque de salida
		System.out.printf(nombre+", su salario mensual es de ");
		System.out.printf(" %.2f", horasT*SlrH );
	}
}
