import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception 
    {
        String[] codigo=new String[3];
		String[] descripcion=new String[3];
		char[] impuesto=new char[3];
		int[] existencia=new int[3];
		double[] costo=new double[3];
		double[] precio=new double[3];

        int i=0;
		for(int x=1;x<=3;x++)
		{
			codigo[i]=JOptionPane.showInputDialog("Ingrese el código del árticulo #"+x);
			descripcion[i]=JOptionPane.showInputDialog("Ingrese la descripción del árticulo #"+x);
			impuesto[i] = (JOptionPane.showInputDialog("Ingrese el impuesto del árticulo #"+x)).charAt(0);
			existencia[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad del árticulo #"+x));
			precio[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del árticulo #"+x));
			//System.out.println(codigo[i]+" "+descripcion[i]+" "+impuesto[i]+" "+existencia[i]+" "+precio[i]);
			i=i+1;
		}

		double vlrTotal=0.00;
		double[] valor = new double[10];
		//double vlrTotal=mtd.calc(impuesto,existencia,costo,precio,valor, vlrTotal=0.00);
		double[] imp= new double[10];
        for(int y=0; y<3;y++)
        {
            /*if(impuesto[y]=='0')
                imp[y]=0.00;
                else if(impuesto[y]=='7')
                    imp[y]=0.07;
                        else if(impuesto[y]=='1')
                            imp[y]=0.10;

            costo[y] = precio[y]*existencia[y];
            imp[y] = costo[y]*imp[y];
            valor[y] = costo[y] + imp[y];
            vlrTotal += valor[y];
            System.out.println(costo[y]+" | "+imp[y]+" | "+valor[y]+" | "+vlrTotal);*/
            System.out.println(codigo[y]+" "+descripcion[y]+" "+impuesto[y]+" "+existencia[y]+" "+precio[y]);
        }
		System.out.println("total: "+vlrTotal);
    }
}
