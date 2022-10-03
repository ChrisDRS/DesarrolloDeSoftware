package ejercicioN13;
import java.util.*;

public class cociente 
{
	//	INSTRUCCIONES
	/*
	  	Lea dos números y calcule el cociente de dividir el primero por el segundo. Imprima el cociente.
	  	Si el segundo número es cero, no ejecute el cálculo e imprima un mensaje que diga: “La división no es posible”.
	*/

	public static void main(String[] args) 
	{
		//	Declaración de datos
		int a, b;
		
		//	Entrada de datos
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Ingrese un dividendo");
			a = sc.nextInt();
			System.out.println("Ingrese un divisor");
			b = sc.nextInt();
		}
		
		//	Bloque de condicion
		if(b==0)
			System.out.println("La division no es posible");
		else
			System.out.println(a+" entre "+b+" es igual a "+a/b);
	}

}
