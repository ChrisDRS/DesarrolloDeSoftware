package pktSemestral;
import javax.swing.*;

public class clsMain 
{
	public static void main(String[] args) 
	{
		clsMetodos mtd = new clsMetodos();
		
		//	aquí se pide y verifica la contraseña (la contraseña es "admin")
		Boolean login = mtd.psswr(login=false);

		if(login==true)
		{
			JOptionPane.showMessageDialog(null, "Bienvenido al proyecto final.");

			String[] codigo=new String[10];
			String[] descripcion=new String[10];
			char[] impuesto=new char[10];
			int[] existencia=new int[10];
			double[] costo=new double[10];
			double[] precio=new double[10];

			//	Entrada de datos
			int i = 0;
			for(int x=1;x<=10;x++)
			{
				codigo[i]=JOptionPane.showInputDialog("Ingrese el código del artículo #"+x);
				descripcion[i]=JOptionPane.showInputDialog("Ingrese la descripción del artículo #"+x);
				impuesto[i] = (JOptionPane.showInputDialog("Ingrese el impuesto del artículo #"+x)).charAt(0);
				existencia[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad del artículo #"+x));
				precio[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo #"+x));
				i++;
			}

			//	calculo de impuesto
			double impuestoTotal = 0.0;
			double[] impuestoProducto = new double[10];
			for(int y=0;y<10;y++)
			{
				impuestoProducto[y]=mtd.impuestos(impuesto, existencia,precio,y);
				impuestoTotal += impuestoProducto[y];
			}
			impuestoTotal=Math.round(impuestoTotal*100.0)/100.0;

			//	calculo del valor de cada producto (costo)
			for(int r=0;r<10;r++)
			{
				costo[r]=mtd.valorProducto(precio,existencia,impuestoProducto,r);
			}

			double vlrTotal=mtd.calc(vlrTotal=0.0, costo, impuestoProducto);
			String mostrarInforme = mtd.informe(mostrarInforme="", codigo,descripcion,precio,existencia,costo,vlrTotal,impuestoTotal);
			JOptionPane.showMessageDialog(null, mostrarInforme,"Informe",1);
		}
		JOptionPane.showMessageDialog(null, "El programa ha finalizado.\nTenga un excelente día.");
	}
}
