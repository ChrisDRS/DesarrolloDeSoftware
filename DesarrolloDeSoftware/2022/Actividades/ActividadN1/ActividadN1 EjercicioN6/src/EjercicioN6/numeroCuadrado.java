package EjercicioN6;
import java.util.Scanner;

public class numeroCuadrado 
{

	//	INSTRUCCIONES
	/*
	  	Lea un número e imprima el número y el cuadrado del mismo.
	*/
	
	public static void main(String[] args) 
	{
		// Declaración de datos
		int a;
		
		// Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese un numero");
			a = sc.nextInt();
		}
		
		//	Linea de instruccion
		System.out.println("El valor de "+a+" al cuadrado, es "+a*a);
	}

}
   