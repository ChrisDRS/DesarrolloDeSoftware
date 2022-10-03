package ejercicioN12;
import java.util.*;

public class sumaNegativa 
{

	//	INSTRUCCIONES
	/*
	  	Lea dos números y calcule la suma de los números.
	  	Imprima los números leídos y sólo si la suma es negativa, imprímala también.
	 */
	
	public static void main(String[] args) 
	{
		// Declaracion de datos
		int a, b;
		
		//	Entrada de datos
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingrese el primer numero");
			a = sc.nextInt();
			System.out.println("Ingrese el segundo numero");
			b = sc.nextInt();
		}
		
		// Linea de ecuacion
		int x =a+b;
		
		if(x<0) 
		{
			System.out.println(a+" "+b+" = "+x);
		}
		else
			System.out.println("La suma es positiva.");
	}

}
