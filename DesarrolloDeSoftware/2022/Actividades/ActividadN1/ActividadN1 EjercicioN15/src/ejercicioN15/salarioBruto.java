package ejercicioN15;
import java.util.*;

public class salarioBruto
{
	
	//	INSTRUCCIONES
	/*
	  	Leer el nombre de un empleado, su salario básico por hora,
	  	el número de horas trabajadas en el período y un porcentaje de descuento.
	  	Calcular el salario bruto, el valor de descuento y su salario neto.
	*/
	
	public static void main(String[] args) 
	{
		// Declaración de datos
		String nombre;
		float slrH, horasT, desc, slrM, slrA, valorD, slrN;
		
		// Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese su nombre:");
			nombre = sc.nextLine();
			System.out.println("Ingrese su salario por hora:");
			slrH = sc.nextFloat();
			System.out.println("Ingrese el numero de horas trabajadas:");
			horasT = sc.nextFloat();
			System.out.println("Ingrese un porcentaje de descuento (En lugar de % coloque 0. antes del digito):");
			desc = sc.nextFloat();
		}

		//	Bloque de ecuaciones
		slrM = slrH*horasT;
		slrA = slrM*12;
		valorD = slrA*desc/12;
		slrN = slrM-valorD;
		
		//	Bloque de salida de datos
		System.out.println("-----------------------------------");
		System.out.println(nombre);
		System.out.println("");
		System.out.printf("Salario bruto:             ");
		System.out.printf(" %.2f", slrM );
		System.out.println("");
		System.out.printf("Valor de descuento:        ");
		System.out.printf(" %.2f", valorD );
		System.out.println("");
		System.out.printf("Salario neto:              ");
		System.out.printf(" %.2f", slrN );
		System.out.println("");
		System.out.println("-----------------------------------");

	}

}
