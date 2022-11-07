package pktTrabajandoConClaases_y_metodos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class clsTrabajandoConClaases_y_metodos
{ 
	static BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int repetir=1;
		while(repetir==1)
		{
			String nombre, apellido, nombreCompleto;
			int horasTrabajadas, diaCumple, mesCumple;
			double salarioTotal=0.00, pagoHora=0.00, bonificaciones=0.00, salarioNormal=0.00, salarioReal=0.00;
			clsCaracteristicaNumeros metodo = new clsCaracteristicaNumeros();

			System.out.println("\nIngrese los datos del colaborador...");
			//	registro de colaborador
			System.out.print("\nIngrese su nombre: ");
			nombre = objLeer.readLine();
			System.out.print("\nIngrese su apellido: ");
			apellido = objLeer.readLine();
			System.out.print("\nIngrese su dia de cumpleaños: ");
			diaCumple = Integer.parseInt(objLeer.readLine());
			System.out.print("\nIngrese su mes de cumpleaños: ");
			mesCumple = Integer.parseInt(objLeer.readLine());
			System.out.print("\n¿Cuanto vale su tiempo? (Pago por hora): ");
			pagoHora = Integer.parseInt(objLeer.readLine());
			System.out.print("\n¿Cuantas horas ha trabajado? (horas trabajadas): ");
			horasTrabajadas = Integer.parseInt(objLeer.readLine());
			
			nombreCompleto=nombre+" "+apellido;
			//	Bonificacion A

			
			//	Bonificacion B
			int cumple=mesCumple+diaCumple, numPerfecto=cumple, xPerfecto=2, perfecto=0;
			char esPerfecto=metodo.mtdPerfecto(numPerfecto, xPerfecto, perfecto, esPerfecto=' ');
			if(esPerfecto=='S')
			bonificaciones=bonificaciones+50.00;

			//	Bonificacion C
			int numPrimo=mesCumple;
			char primo=metodo.mtdPrimo(numPrimo, primo='S');
			if(primo=='S')
			bonificaciones=bonificaciones+30.00;

			//	Bonificacion D

			//	Bonificacion E

			//	Calculo de salario
			salarioNormal=pagoHora*horasTrabajadas;
			salarioTotal=salarioNormal+bonificaciones;

			// Salario real invertido
			Long numeroInvertir=(long)salarioTotal, invertido=(long) 0, restoInvertido=(long) 0, verificar;
			verificar = metodo.mtdInvertir(numeroInvertir, invertido, restoInvertido);
			if(verificar>numeroInvertir)
				salarioReal=verificar;
			else
				salarioReal=salarioTotal;

			System.out.print("\nNombre completo: "+nombreCompleto);
			System.out.print("\nSalario normal:	B/");
			System.out.printf("%.2f", salarioNormal);
			System.out.print("\nBonificación:	B/");
			System.out.printf("%.2f", bonificaciones);
			System.out.print("\nSalario total:	B/");
			System.out.printf("%.2f", salarioTotal);
			System.out.print("\nSalario real:	B/");
			System.out.printf("%.2f", salarioReal);

			System.out.print("\n\nSi desea registrar otro colaborador ingrese 1, de lo contrario ingrese cualquier otro numero: ");
			repetir = Integer.parseInt(objLeer.readLine());
		}
		System.out.println("\nEl programa ha finalizado.");
	}
}