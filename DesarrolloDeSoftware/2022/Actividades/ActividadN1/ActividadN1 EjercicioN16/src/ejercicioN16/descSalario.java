package ejercicioN16;
import java.util.*;

public class descSalario
{
	//	INSTRUCCIONES
	/*
		Para un salario bruto hasta de $1500, no hay descuento.
		Para un salario bruto de $1500 a $3000 el porcentaje de descuento es de 5%.
		Para un salario bruto mayor de $3000 el porcentaje de descuento es de 8%.
		Imprimir el nombre del empleado, el salario bruto, el valor del descuento y
		el salario neto. Se debe leer el nombre y el salario.
	*/

	public static void main(String[] args) 
	{
		// Declaración de datos
		String nombre;
		double slrM, slrN=0, desc;
		double desc1=0.05, desc2=0.08;
		
		// Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese su nombre:");
			nombre = sc.nextLine();
			System.out.println("Ingrese su salario bruto mensual:");
			slrM = sc.nextDouble();
		}
		
		//	Bloque de condiciones
		if(slrM>=1500 && slrM<3000)
		{
			desc = slrM*desc1;
			slrN = slrM-desc;
		}
			else
				if(slrM>=3000)
				{
					desc = slrM*desc2;
					slrN = slrM-desc;
				}
					else
					{
						desc = 0.00;
						slrN = slrM;
					}
		
		//	Bloque de salida de datos
		System.out.println("-------------------------------------");
		System.out.println(nombre);
		System.out.println("");
		System.out.printf("Salario bruto:         ");
		System.out.printf("    %.2f", slrM );
		System.out.println("");
		System.out.printf("Valor de descuento:    ");
		System.out.printf("    %.2f", desc );
		System.out.println("");
		System.out.printf("Salario neto:          ");
		System.out.printf("    %.2f", slrN );
		System.out.println("");
		System.out.println("-------------------------------------");

	}

}
