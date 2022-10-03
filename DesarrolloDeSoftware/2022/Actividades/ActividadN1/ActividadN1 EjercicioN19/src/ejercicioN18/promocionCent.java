package ejercicioN18;
import java.util.*;

public class promocionCent 
{
	//	INSTRUCCIONES
	/*
	  	Una empresa tiene una promoción para el pago de salarios a sus empleados.
	  	Si la parte decimal de su salario (centavos) es mayor que 50, se le añade un (1)
	  	balboa a la parte entera, de lo contrario, no se añade nada. Leer el salario e
	  	imprimir tanto el salario leído como el nuevo salario.
	*/

	public static void main(String[] args) 
	{
		// Declaracion de datos
		float slr;
		
		//	Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese su salario: ");
			slr = sc.nextFloat();
		}
		System.out.println();
	}

}
