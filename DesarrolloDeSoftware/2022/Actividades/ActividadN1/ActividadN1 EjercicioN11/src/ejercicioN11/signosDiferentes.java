package ejercicioN11;
import java.util.*;

public class signosDiferentes 
{

	//	
	/*
	  	Lea dos números e imprima ambos números sólo si son de diferente signo y distintos de cero.
	*/
	
	public static void main(String[] args) 
	{
		// Declaración de datos
		int a,b;
		
		// Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese el primer numero");
			a = sc.nextInt();
			System.out.println("Ingrese el segundo numero");
			b = sc.nextInt();
		}
		 
		//	Bloque de condicion
		if(a>0 && b<0)
			System.out.println(a+", "+b);
		else
			if(a<0 && b>0)
				System.out.println(a+", "+b);
			else
				System.out.println("Los numeros ingresados son un mismo signo o son 0.");
	}

}
