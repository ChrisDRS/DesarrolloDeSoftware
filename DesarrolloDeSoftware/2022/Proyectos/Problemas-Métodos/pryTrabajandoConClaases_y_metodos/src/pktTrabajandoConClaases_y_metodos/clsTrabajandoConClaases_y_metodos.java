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
					metodo.mtdEnteroPotencia();
					break;
			case 2:
					metodo.mtdPrimo();
					break; 
			case 3:
					metodo.mtdPerfecto();
					break;
			case 4:
					metodo.mtdFeliz();
					break;
			case 5: 
					metodo.mtdInvertir();
					break;
			case 6:
					metodo.mtdCifra();
					break;
			case 7: 
					metodo.mtdUlam();
					break;
			case 8:
					metodo.mtdAbundante();
					break;
			case 9:
					metodo.mtdArmstrong();
					break;
			case 10:
					metodo.mtdParImpar();
					break;
			case 11:
					metodo.mtdFactorial();

					break;
			case 12:
					metodo.mtdAmigos();
					break;
			case 13:
					metodo.mtdCapicua();
					break;
			case 14:
					metodo.mtdPalindrome();
					break;
			default:
					System.out.println("El digito insertado no es correcto.");
		}
		
	}
}