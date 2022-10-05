package pktTrabajandoConClaases_y_metodos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class clsTrabajandoConClaases_y_metodos
{ 
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int caso=0;
		BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
		clsCaracteristicaNumeros metodo = new clsCaracteristicaNumeros();
		System.out.print("\nIngrese el numero correspondiente al método que desea ejecutar: ");
		caso = Integer.parseInt(objLeer.readLine());
		switch(caso)
		{
			case 1:
					int base_p=0,exponente_p=0, multiplicacion_p=0, resultado_p=0;
					System.out.println("Potencia de un entero...");
					System.out.print("\nInserte la base de la potencia: ");
					base_p = Integer.parseInt(objLeer.readLine());
					System.out.print("\nInserte el exponente de la potencia: ");
					exponente_p = Integer.parseInt(objLeer.readLine());
					metodo.mtdEnteroPotencia(base_p,exponente_p,multiplicacion_p,resultado_p);
					break;
			case 2:
					int numPrimo=0;
					char primo='S';
					System.out.println("¿Es éste un número primo?");
					System.out.print("Inserte un numero: ");
					numPrimo = Integer.parseInt(objLeer.readLine());
					metodo.mtdPrimo(numPrimo,primo);
					break; 
			case 3:
					int numPerfecto, xPerfecto=2, perfecto=0;
					char esPerfecto=' ';
					System.out.println("¿Es éste un número perfecto?");
					System.out.print("Inserte un número: ");
					numPerfecto = Integer.parseInt(objLeer.readLine());
					metodo.mtdPerfecto(numPerfecto,xPerfecto,perfecto,esPerfecto);
					break;
			case 4:
					metodo.mtdFeliz();
					break;
			case 5:
					long numeroInvertir, invertido = 0, restoInvertido=0;
					System.out.println("Invertir número...");
					System.out.print("Ingrese un número: ");
					numeroInvertir = Long.parseLong(objLeer.readLine());
					metodo.mtdInvertir(numeroInvertir,invertido,restoInvertido);
					break;
			case 6:
					long numCifra, cifra=0;
					System.out.println("¿Cúantas cifras tiene el número?");
					System.out.print("Inserte el número: ");
					numCifra = Long.parseLong(objLeer.readLine());
					metodo.mtdCifra(numCifra,cifra);
					break;
			case 7: 
					int xUlam=0;
					System.out.println("Conjetura de Ulam...");
					System.out.print("Ingrese un numero: ");
					xUlam=Integer.parseInt(objLeer.readLine());
					metodo.mtdUlam(xUlam);
					break;
			case 8:
					int sumaAbun = 0, numAbun;
					boolean abundante = false;
					System.out.println("¿Será éste un número abundante?");
					System.out.print("Ingrese un numero: ");
					numAbun = Integer.parseInt(objLeer.readLine());
					metodo.mtdAbundante(sumaAbun,numAbun,abundante);
					break;
			case 9:
					int c_Armstrng = 0, a_Armstrng=0, temp_Armstrng=0, n_Armstrng;
					boolean strong = false;
					System.out.println("¿Será éste un número armstrong?");
					System.out.print("Ingrese el número: ");
					n_Armstrng = Integer.parseInt(objLeer.readLine());
					metodo.mtdArmstrong(c_Armstrng,a_Armstrng,temp_Armstrng,n_Armstrng,strong);
					break;
			case 10:
					int num_PoI;
					char parImpar=' ';
					System.out.println("¿El número es par o impar?");
					System.out.print("Inserte un número: ");
					num_PoI = Integer.parseInt(objLeer.readLine());
					metodo.mtdParImpar(num_PoI,parImpar);
					break;
			case 11:
					int num_factor;
					double factorial=0;
					System.out.println("Factorial de un número...");
					System.out.print("Ingrese un número: ");
					num_factor=Integer.parseInt(objLeer.readLine());
					metodo.mtdFactorial(num_factor,factorial);
					break;
			case 12:
					int i_amigos=0,suma_amigos=0, n1_amigos, n2_amigos;
					char amigos = ' ';
					System.out.println("¿Serán estos números amigos?");
					System.out.print("Ingrese un primer número: ");
					n1_amigos = Integer.parseInt(objLeer.readLine());
					System.out.print("Ingrese un segundo número: ");
					n2_amigos = Integer.parseInt(objLeer.readLine());
					metodo.mtdAmigos(i_amigos,suma_amigos,n1_amigos,n2_amigos,amigos);
					break;
			case 13:
					int num_cap, aux_cap=0, inverso_cap = 0, cifra_cap=0;
					char capicua = ' ';
					System.out.println("¿El número es capicua?");
					System.out.print("Ingrese un número (de más de dos cifras): ");                                                 
					num_cap = Integer.parseInt(objLeer.readLine());
					metodo.mtdCapicua(num_cap,aux_cap,inverso_cap,cifra_cap,capicua);
					break;
			case 14:
					metodo.mtdPalindrome();
					break;
			default:
					System.out.println("El digito insertado no es correcto.");
		}
		
	}
}