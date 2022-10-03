package ejercicioN17;
import java.util.*;
public class horasExtra 
{
	
	//	INSTRUCCIONES
	/*
	  	Leer de un registro el nombre de un empleado, el salario básico por hora
	  	y el número de horas trabajadas durante la semana.
	  	Calcular el salario neto, teniendo en cuenta que, si el número de horas trabajadas durante la semana
	  	es mayor de 48, esas horas de más se consideran horas extras y tienen un 35% de recargo.
	  	Imprima el nombre del empleado y el salario neto.
	*/

	public static void main(String[] args) 
	{
		//	Declaración de datos
		String nombre;
		double horasT,slrH,horasE,slrN;
		double recargo = 0.35;
		
		//	Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese su nombre: ");
			nombre = sc.nextLine();
			System.out.println("Ingrese el numero de horas trabajadas durante la semana: ");
			horasT = sc.nextDouble();
			System.out.println("Ingrese su salario por hora: ");
			slrH = sc.nextDouble();
		}
		
		//	Bloque de ecuaciones
		slrN=horasT*slrH;
		horasE = horasT-48;
		
		//	Bloque de condicion
		if(horasT>48)
		{
			recargo=horasE*recargo;
			recargo=slrN*recargo;
			slrN=slrN+recargo;
		}
			else
			{
				horasE=0;
				recargo=0.00;
			}
		
		//	Bloque de salida de datos
		System.out.println("------------------------------------");
		System.out.println(nombre);
		System.out.println("");
		System.out.println("Horas extra:                  "+(long)horasE);
		System.out.printf("Recargo por horas extra: ");
		System.out.printf("    %.2f", recargo );
		System.out.println("");
		System.out.printf("Salario neto:");
		System.out.printf("                %.2f", slrN ); 
		System.out.println("");
		System.out.println("------------------------------------");

		
	}

}
