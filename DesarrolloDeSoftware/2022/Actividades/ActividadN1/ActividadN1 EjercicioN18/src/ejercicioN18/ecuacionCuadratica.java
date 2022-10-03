package ejercicioN18;
import java.util.*;

public class ecuacionCuadratica 
{
	//	INSTRUCCIONES
	/*
	  	Elaborar un algoritmo para resolver una ecuación de segundo grado ax^2 + bx + c = 0
	*/

	public static void main(String[] args) 
	{
		// Declaración de datos
		int a,b,c;
		
		// Entrada de datos
		
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingese el valor de a: ");
			a = sc.nextInt();
			System.out.println("Ingese el valor de b: ");
			b = sc.nextInt();
			System.out.println("Ingese el valor de c: ");
			c = sc.nextInt();
		}
		
		//	Bloque de ecuacion
		double determinante=Math.pow(b, 2)-(4*a*c);
		
		//	Bloque de condicion
		if(determinante>0)
		{
			double x1=((b*(-1)) + Math.sqrt(determinante))/(2*a);
			double x2=((b*(-1)) - Math.sqrt(determinante))/(2*a);
			System.out.printf("x1 = ");
			System.out.printf("%.1f", x1 );
			System.out.println(" ");
			System.out.printf("x2 = ");
			System.out.printf("%.1f", x2 );
		}
		else
			System.out.println("El determinante es negativo.");
	}

}
