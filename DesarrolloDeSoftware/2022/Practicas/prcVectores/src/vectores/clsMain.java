package io.github.jiangdequan;
import javax.swing.JOptionPane;
import io.github.jiangdequan.clsVectores;

public class clsMain 
{
    static clsVectores vect = new clsVectores();
    public static void main(String[] args) 
    {
        int[] num = new int[25];
        int[] vec = new int[25];
        String entradaNum;
        String entradaVec;

        //  Entrada de datos
        for(int y=0;y<num.length;y++)
        {
        entradaNum = JOptionPane.showInputDialog("Introduzca el valor de NUM["+y+"]");
        num[y] = Integer.parseInt(entradaNum);
        }
        for(int x=0; x<vec.length;x++)
        {
        entradaVec = JOptionPane.showInputDialog("Introduzca el valor de VEC["+x+"]");
        vec[x] = Integer.parseInt(entradaVec);
        }
            System.out.println("    NUM         VEC             MULT  ");
        int[] mult = new int[25];
        for(int i=0; i<mult.length;i++)
        {
            mult[i] = num[i]*vec[i];
            System.out.println("    ["+num[i]+"]         ["+vec[i]+"]             ["+mult[i]+"]");
        }
    }    
}