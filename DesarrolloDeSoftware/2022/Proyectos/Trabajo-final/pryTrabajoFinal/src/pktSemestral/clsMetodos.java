package pktSemestral;

public class clsMetodos 
{
    public void psswr() 
    {
        
    }
    public double impuestos(char[] impuesto, int[] existencia, double[] precio, int y) 
    {
        double impuestoP,imp=0.0,valor;
        if(impuesto[y]=='0')
            imp=0.00;
        else if(impuesto[y]=='7')
            imp=0.07;
        else if(impuesto[y]=='1')
            imp=0.10;
        
        valor = precio[y]*existencia[y];
        impuestoP = imp*valor;

        return impuestoP;
    }
    public double valorProducto(double[] precio, int[] existencia, double[] impuestoProducto, int r) 
    {
        double valor;
        valor = precio[r]*existencia[r];
        valor += impuestoProducto[r];
        return valor;
    }
    public double calc(double vlrTotal,double[] costo) 
    {
        for(int i=0;i<10;i++)
        {
            vlrTotal += costo[i];
        }
        return vlrTotal;
    }
    public String informe(String mostrarInforme, String[] codigo, String[] descripcion, double[] precio, int[] existencia, double[] costo, double vlrTotal) 
    {
        mostrarInforme="Código  Descripción     costo   cantidad    valor";
        for(int i=0;i<10;i++)
        {
            mostrarInforme += "\n"+codigo[i]+"              "+descripcion[i]+"                  "+precio[i]+"          "+existencia[i]+"          "+costo[i];
        }
        mostrarInforme += "\n   ----------------------------------------------------------------------------    ";
        mostrarInforme += "\n                                                           Valor total: B./"+((vlrTotal));
        return mostrarInforme;
    }
}