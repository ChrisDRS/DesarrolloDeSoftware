package EjercicioN5;
import java.util.Scanner;

public class hombreCasado 
{
	 
	//	INSTRUCCIONES
	/*
	 	Lea el nombre, la edad, el sexo (F o M) y el estado civil (C: casado, S: soltero, D: divorciado, U: unido y V: viudo)
	 	de cualquier persona e imprima, sólo si la persona es hombre o
	 	mujer menor de edad o es hombre casado de cualquier edad,
	 	el nombre de la persona y un mensaje que diga “usted es un hombre casado”.
	 	En los demás casos imprima el nombre de la persona solamente.
	*/

	public static void main(String[] args) 
	{
		// Declaración de datos
		String nombre;
		int edad;
		char sexo, statCivil;
		
		// Entrada de datos
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Ingrese un nombre");
			nombre = sc.nextLine();
			System.out.println("Ingrese una edad");
			edad = sc.nextInt();
			System.out.println("Ingrese un sexo (si es masculindo ingrese M, si es femenino ingrese F)");
			sexo = sc.next().charAt(0);
			System.out.println("Ingrese un estado civil (Casado:C, Soltero:S, Divorciado:D, Unido:U, Viudo:V)");
			statCivil = sc.next().charAt(0);
		}
		
		//	Bloque de condicion
		if(statCivil=='C' && sexo=='M')
		{
			System.out.println("------------------------------------------");
			System.out.println(" "+nombre +", Usted es un hombre casado");
			System.out.println("------------------------------------------");
		}

		else
		{
			System.out.println("--------------------------");
			System.out.println(" "+nombre);
			System.out.println("--------------------------");
		}

		while(edad<18)
		{
				System.out.println("------------------------");
				System.out.println(" Usted es menor de edad");
				System.out.println("------------------------");
		break;
		}
	}

}
