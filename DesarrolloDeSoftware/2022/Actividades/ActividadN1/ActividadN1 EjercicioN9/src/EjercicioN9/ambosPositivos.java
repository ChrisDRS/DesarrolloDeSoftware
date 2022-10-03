package EjercicioN9;

import java.util.Scanner;

public class ambosPositivos 
{

	//	INSTRUCCIONES
	/*
	  	Lea dos números e imprima ambos números sólo si son positivos.
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
		
		//	Bloque de condicional
		if(a>0 && b>0)
			System.out.println(a+", "+b);
				else
					System.out.println("al menos uno de los numeros ingresados no es positivo.");
	}

}
