package pktSemestral;
import javax.swing.*;

public class clsMain 
{
	public static void main(String[] args) 
	{
		clsMetodos mtd = new clsMetodos();

		//	aquí pide la contra


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
			codigo[i]=JOptionPane.showInputDialog("Ingrese el código del árticulo #"+x);
			descripcion[i]=JOptionPane.showInputDialog("Ingrese la descripción del árticulo #"+x);
			impuesto[i] = (JOptionPane.showInputDialog("Ingrese el impuesto del árticulo #"+x)).charAt(0);
			existencia[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad del árticulo #"+x));
			precio[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del árticulo #"+x));
			i++;
		}

		//	calculo de impuesto
		double[] impuestoProducto = new double[10];
		for(int y=0;y<10;y++)
		{
			impuestoProducto[y]=mtd.impuestos(impuesto, existencia,precio,y);
		}

		//	calculo del valor de cada producto (costo)
		for(int r=0;r<10;r++)
		{
			costo[r]=mtd.valorProducto(precio,existencia,impuestoProducto,r);
		}

		double vlrTotal=mtd.calc(vlrTotal=0.0, costo);
		String mostrarInforme = mtd.informe(mostrarInforme="", codigo,descripcion,precio,existencia,costo,vlrTotal);
		JOptionPane.showMessageDialog(null, mostrarInforme);
	}
}
