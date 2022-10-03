package ejercicioN20;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class personaEstatura 
{
	//	INSTRUCCIONES
	/*
	  	Se desea escribir un algoritmo que pida la altura de una persona,
	  	si la altura es menor o igual a 150 cm envíe el mensaje: “Persona de estatura baja”;
	  	si la altura está entre 151 y 170 escriba el mensaje: “Persona de estatura media”
	  	y si la altura es mayor al 170 escriba el mensaje: “Persona de estatura alta”.
	*/

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		
		// Entrada de datos
		
			System.out.println("Ingrese su estatura en cm: ");
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			int altura = Integer.parseInt(br.readLine());
	
		//	Bloque de condiciones
		if(altura<=150)
			System.out.println("Persona de estatura baja.");
		else
			if(altura>150 && altura<170)
				System.out.println("Persona de estatura media.");
			else
				if(altura>=170)
					System.out.println("Persona de estatura alta.");
	}

}
