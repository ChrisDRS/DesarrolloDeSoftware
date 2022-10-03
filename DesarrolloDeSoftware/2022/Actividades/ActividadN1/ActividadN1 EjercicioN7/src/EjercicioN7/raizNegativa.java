package EjercicioN7;
import java.util.*;

public class raizNegativa 
{
	//
	/*
	  Lea un número y calcule e imprima su raíz cuadrada.
	  Si el número es negativo imprima el número y un mensaje que diga: “tiene raíz imaginaria”.
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
		
		//	Linea de ecuacion
		int x = (int) Math.sqrt(a);
		
		//	Bloque de condicion
		if(a<0)
			System.out.println("La raíz cuadrada de "+a+" es imaginaria");
		else
			System.out.println("La raíz cuadrada de "+a+" es "+x+".");
	}

}
