package pktSemestral;
import javax.swing.*;

public class clsMetodos 
{
    public boolean psswr(boolean login) 
    {
        int intentos=0;
        String password = "admin";
        String verificacion="";
        JOptionPane.showMessageDialog(null, "A continuación\ningrese la contraseña...","Login", 1);
        do{
            JPasswordField contraseña = new JPasswordField();
            if(JOptionPane.showConfirmDialog(null, contraseña, "Login", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)
                verificacion = new String(contraseña.getPassword());

        if(verificacion.equals(password))
        {
            JOptionPane.showMessageDialog(null, "Contraseña correcta","Login", 1);
            login=true;
            intentos=3;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta, vuelva a intentar.","Login", 2);
            intentos+=1;
        }
        }while(intentos<3);
        if(intentos==3 && login==false)
        {
            JOptionPane.showMessageDialog(null, "¡Acceso denegado!","Login", 2);
        }
        return login;
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
        return valor;
    }
    public double calc(double vlrTotal,double[] costo,double[] impuestoProducto) 
    {
        for(int i=0;i<10;i++)
        {
            vlrTotal += costo[i]+impuestoProducto[i];
        }
        vlrTotal=Math.round(vlrTotal*100.0)/100.0;
        return vlrTotal;
    }
    public String informe(String mostrarInforme, String[] codigo, String[] descripcion, double[] precio, int[] existencia, double[] costo, double vlrTotal,double impuestoTotal) 
    {
        mostrarInforme = "    Código      Descripción     costo         cantidad         valor   ";
        for(int i=0;i<10;i++)
        {
            mostrarInforme += "\n       "+codigo[i];
            mostrarInforme += "      |          "+descripcion[i];
            mostrarInforme += "      |          "+precio[i];
            mostrarInforme += "      |          "+existencia[i];
            mostrarInforme += "      |      "+costo[i];
        }
        mostrarInforme += "\n-------------------------------------------------------------------------------------------";
        mostrarInforme += "\n                                                                             ITBMS total: B./    "+((impuestoTotal));
        mostrarInforme += "\n                                                                             Valor total: B./    "+((vlrTotal));
        return mostrarInforme;
    }
}