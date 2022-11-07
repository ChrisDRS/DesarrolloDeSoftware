package pktTrabajandoConClaases_y_metodos;
 
public class clsCaracteristicaNumeros 
{
    public int mtdEnteroPotencia(int base_p, int exponente_p, int multiplicacion_p, int resultado_p)
    {
        multiplicacion_p=base_p;
        for(int i=1;i<exponente_p;i++)
        {
            multiplicacion_p = multiplicacion_p*base_p;
            resultado_p = multiplicacion_p;
        }
        return resultado_p;
    }
    public char mtdPrimo(int numPrimo, char primo)
    { 
        if(numPrimo<=1)
        primo = 'N'; 
        else if(numPrimo==2)
            primo='S';
           else 
            {
                for(int i=2; i<numPrimo;i++)
                {
                    if(numPrimo % i == 0)
                    primo='N';
                }
            }
        return primo;
    }
    public char mtdPerfecto(int numPerfecto, int xPerfecto, int perfecto, char esPerfecto)
    {
        while(xPerfecto<=numPerfecto)
        {
            if(numPerfecto % xPerfecto ==0)
            perfecto = perfecto+(numPerfecto/xPerfecto);
            xPerfecto++;
        }
        if(perfecto==numPerfecto)
            esPerfecto='S';
        else
            esPerfecto='N';
        
        return esPerfecto;
    }
    public void mtdFeliz() 
    {
        System.out.println("Éste metodo no pudo ser resuelto.");
    }
    public long mtdInvertir(long numeroInvertir, long invertido, long restoInvertido)
    {
        while(numeroInvertir>0) 
        {
         restoInvertido = numeroInvertir % 10;
         invertido = invertido * 10 + restoInvertido;
         numeroInvertir /= 10;
        }
      return invertido;
    }
    public long mtdCifra(long numCifra, long cifra)
    {
       while(numCifra!=0)
       {
            numCifra = numCifra/10;
            cifra++;
       }
       System.out.println(cifra);
       return cifra;
    }
    public int mtdUlam(int xUlam)
    {
        while (xUlam!=1)
        {
            if (xUlam%2==0)
                xUlam=xUlam/2;
            else 
                xUlam=(xUlam*3)+1;
        }
        return xUlam;
    }
    public boolean mtdAbundante(int sumaAbun, int numAbun, boolean abundante)
    {
        for (int i = 1; i < numAbun; i++)
        {
            if ( numAbun%i == 0)
                sumaAbun+=i;
        }
            if (sumaAbun > numAbun)
                abundante = true;
        return abundante;
    }
    public boolean mtdArmstrong(int c_Armstrng, int a_Armstrng, int temp_Armstrng, int n_Armstrng, boolean strong) 
    {
        temp_Armstrng = n_Armstrng;
        while (n_Armstrng > 0) 
        {
            a_Armstrng = n_Armstrng % 10;
            n_Armstrng = n_Armstrng / 10;
            c_Armstrng = c_Armstrng + (a_Armstrng * a_Armstrng * a_Armstrng);
        }
        if (temp_Armstrng == c_Armstrng)
            strong = true;
        return strong;
    }
    public char mtdParImpar(int num_PoI, char parImpar)
    {
        if(num_PoI%2==0)
            parImpar='P';
        else
            parImpar='I';
        return parImpar;
    }
    public double mtdFactorial(int num_factor, double factorial)
    {
        factorial=1;
		for (int i=num_factor;i>0;i--)
		    factorial=factorial*i;
        return factorial;
    }
    public char mtdAmigos(int i_amigos, int suma_amigos, int n1_amigos, int n2_amigos, char amigos)
    {  
        for(i_amigos = 1;i_amigos < n1_amigos;i_amigos++)
        {
            if(n1_amigos%i_amigos==0)
                suma_amigos=suma_amigos+i_amigos;
        }
        if(suma_amigos==n2_amigos)
        {
           suma_amigos=0;
           for(i_amigos = 1;i_amigos < n2_amigos;i_amigos++)
            {
                if(n2_amigos%i_amigos==0)
                    suma_amigos=suma_amigos+i_amigos;
            }
            if(suma_amigos==n1_amigos)
                amigos = 'S';
            else
                amigos = 'N';
        }        
        else
                amigos = 'N';
        return amigos;
    }
    public char mtdCapicua(int num_cap, int aux_cap, int inverso_cap, int cifra_cap, char capicua) 
    {
        while (num_cap<10);
                aux_cap = num_cap;
        while (aux_cap!=0)
        {
            cifra_cap = aux_cap % 10;
            inverso_cap = inverso_cap * 10 + cifra_cap;
            aux_cap = aux_cap / 10;
        }
        if(num_cap == inverso_cap)
            capicua = 'S';
        else
            capicua='N';
        return capicua;
    }
    public void mtdPalindrome()
    {
        System.out.println("Éste metodo no pudo ser resuelto.");
    }
}