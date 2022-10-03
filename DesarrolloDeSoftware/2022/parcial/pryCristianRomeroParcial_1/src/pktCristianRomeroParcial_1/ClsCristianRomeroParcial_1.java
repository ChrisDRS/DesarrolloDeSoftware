package pktCristianRomeroParcial_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClsCristianRomeroParcial_1 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int caso=0, continuar=1;
		BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
		while(continuar==1)
		{
			System.out.print("\nEstadistica:	1\nMultiplos:	2\nFinalizar:	3\nInserte el digito del problema que quiere ejecutar: ");
			caso = Integer.parseInt(objLeer.readLine());
			if(caso>0 && caso<4)
				switch(caso)
					{
						case(1):
							mtdEstadistica();
							break;
						case(2):
							mtdMultiplos();
							break;
						case(3):
							continuar=0;
							break;
					}
		else
			System.out.println("\nOPCIÓN INCORRECTA.");
		}
	}
	public static void mtdEstadistica() throws NumberFormatException, IOException
	{
		int cantidad=1, numero, numSumado = 0, cantidadPositivos=0;
		BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
		
		while(cantidad<=10)
		{
			System.out.print("\nInserte el digito #"+cantidad+": ");
			numero = Integer.parseInt(objLeer.readLine());
			if(numero>0)
			{
				cantidadPositivos++;
			}
			if(numero%2==0)
			{
				numero = numero + numSumado;
				numSumado = numero;
			}
				cantidad++;
		}
		System.out.println("\n Suma de números pares leídos: "+numSumado);
		System.out.println("\n Total de números positivos leídos: "+cantidadPositivos);
	}
	public static void mtdMultiplos() throws NumberFormatException, IOException
	{
		int multiplo, suma=0;
		for(multiplo=21;multiplo<=99;multiplo+=3)
		{
			suma = suma+multiplo;
		}
		System.out.println("\nSuma de multiplos: "+suma);
	}
}