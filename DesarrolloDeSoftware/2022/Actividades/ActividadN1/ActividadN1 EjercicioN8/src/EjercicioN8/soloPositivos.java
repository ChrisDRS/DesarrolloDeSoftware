package EjercicioN8;
import java.util.*;

public class soloPositivos 
{

	//
	/*
	  	Lea dos e imprima sólo los positivos.
	 */
	
	public static void main(String[] args)
	{
		// Declaración de datos
		int a, b;
		
		// Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese el primer numero");
			a = sc.nextInt();
			System.out.println("Ingrese el segundo numero");
			b = sc.nextInt();
		}
		
		//	Bloque de condicion
		if(a>0 && b>0)
			System.out.println(a+", "+b);
		else
			if(a>0)
				System.out.println(a);
			else
				if(b>0)
					System.out.println(b);
				else
					System.out.println("Ninguno de los numeros ingresados es positivo.");	
	}

}
