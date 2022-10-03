package pktTrabajandoConClaases_y_metodos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class clsCaracteristicaNumeros 
{
    public void mtdEnteroPotencia() throws NumberFormatException, IOException 
    {
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        int base=0,exponente=0, multiplicacion=0, resultado=0;

        System.out.println("Potencia de un entero...");
        System.out.print("\nInserte la base de la potencia: ");
        base = Integer.parseInt(objLeer.readLine());
        System.out.print("\nInserte el exponente de la potencia: ");
        exponente = Integer.parseInt(objLeer.readLine());

        multiplicacion=base;
        for(int i=1;i<exponente;i++)
        {
            multiplicacion = multiplicacion*base;
            resultado = multiplicacion; 
        }
        System.out.println("\nResultado: "+resultado);
    }
    public void mtdPrimo() throws NumberFormatException, IOException 
    {
        int n=0;
        char primo='S';
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Es éste un número primo?");
        System.out.print("Inserte un numero: ");
        n = Integer.parseInt(objLeer.readLine());

        if(n<=1)
        primo = 'N';
        else if(n==2)
            primo='S';
           else 
            {
                for(int i=2; i<n;i++)
                {
                    if(n % i == 0)
                    primo='N';
                }
            }
        System.out.println(primo);
    }
    public void mtdPerfecto() throws NumberFormatException, IOException 
    {
        int n, x=2, perfecto=0;
        char esPerfecto=' ';
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Es éste un número perfecto?");
        System.out.print("Inserte un número: ");
        n = Integer.parseInt(objLeer.readLine());

        while(x<=n)
        {
            if(n % x ==0)
            perfecto = perfecto+(n/x);
            x++;
        }
        if(perfecto==n)
            esPerfecto='S';
        else
            esPerfecto='N';
        
        System.out.println(esPerfecto);
    }
    public void mtdFeliz() 
    {
        
    }
    public void mtdInvertir() throws NumberFormatException, IOException 
    {
        long numero, invertido = 0, resto;
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Invertir número...");
        System.out.print("Ingrese un número: ");
        numero = Long.parseLong(objLeer.readLine());
 
        while(numero>0) 
        {
         resto = numero % 10;
         invertido = invertido * 10 + resto;
         numero /= 10;
        }
      System.out.println(invertido);
    }
    public void mtdCifra() throws NumberFormatException, IOException 
    {
        long num, cifra=0;
       BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("¿Cúantas cifras tiene el número?");
       System.out.print("Inserte el número: ");
       num = Long.parseLong(objLeer.readLine());

       while(num!=0)
       {
            num = num/10;
            cifra++;
       }
       System.out.println(cifra);
    }
    public void mtdUlam() throws NumberFormatException, IOException 
    {
        int x=0;
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Conjetura de Ulam...");
        System.out.print("Ingrese un numero: ");
        x=Integer.parseInt(objLeer.readLine());
        
        while (x!=1)
        {
            if (x%2==0)
                x=x/2;
            else 
                x=(x*3)+1;
        System.out.println(x);
        }
    }
    public void mtdAbundante() throws NumberFormatException, IOException 
    {
        int suma = 0, num;
        boolean abundante = false;
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Será éste un número abundante?");
        System.out.print("Ingrese un numero: ");
        num = Integer.parseInt(objLeer.readLine());
        
        for (int i = 1; i < num; i++)
        {
            if ( num%i == 0)
                suma+=i;
        }
            if (suma > num)
                abundante = true;
            System.out.println(abundante);
    }
    public void mtdArmstrong() throws NumberFormatException, IOException 
    {
        int c = 0, a, temp, n;
        boolean strong = false;
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Será éste un número armstrong?");
        System.out.print("Ingrese el número: ");
        n = Integer.parseInt(objLeer.readLine());
        temp = n;
        while (n > 0) 
        {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            strong = true;

        System.out.println(strong);
    }
    public void mtdParImpar() throws NumberFormatException, IOException 
    {
        int num;
       char parImpar=' ';
       BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("¿El número es par o impar?");
       System.out.print("Inserte un número: ");
       num = Integer.parseInt(objLeer.readLine());

        if(num%2==0)
            parImpar='P';
        else
            parImpar='I';
        System.out.println(parImpar);
    }
    public void mtdFactorial() throws NumberFormatException, IOException 
    {
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
		int num;
        double factorial;
        System.out.println("Factorial de un número...");
		System.out.print("Ingrese un número: ");
		num=Integer.parseInt(objLeer.readLine());
        factorial=1;
		for (int i=num;i>0;i--)
		    factorial=factorial*i;
		System.out.println("Resultado: "+factorial);
    }
    public void mtdAmigos() throws NumberFormatException, IOException 
    {
        int i,suma=0, n1, n2;
        char amigos = ' ';
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Serán estos números amigos?");
        System.out.print("Ingrese un primer número: ");
        n1 = Integer.parseInt(objLeer.readLine());
        System.out.print("Ingrese un segundo número: ");
        n2 = Integer.parseInt(objLeer.readLine());
  
        for(i = 1;i < n1;i++)
        {
            if(n1%i==0)
                suma=suma+i;
        }
        if(suma==n2)
        {
           suma=0;
           for(i = 1;i < n2;i++)
            {
                if(n2%i==0)
                    suma=suma+i;
            }
            if(suma==n1)
                amigos = 'S';
            else
                amigos = 'N';
        }        
        else
                amigos = 'N';
        System.out.println(amigos);
    }
    public void mtdCapicua() throws NumberFormatException, IOException 
    {
        int num, aux, inverso = 0, cifra;
        char capicua = ' ';
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿El número es capicua?");
        System.out.print("Ingrese un número (de más de dos cifras): ");                                                 
        num = Integer.parseInt(objLeer.readLine());
        while (num<10);
                aux = num;
        while (aux!=0)
        {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(num == inverso)
            capicua = 'S';
        else
            capicua='N';
        System.out.println(capicua);
    }
    public void mtdPalindrome() throws NumberFormatException, IOException 
    {
        int num, aux, inverso = 0, cifra;
        char palindromo = ' ';
        BufferedReader objLeer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿El número es palíndromo?");
        System.out.print("Ingrese un número (de más de dos cifras): ");                                                 
        num = Integer.parseInt(objLeer.readLine());
        while (num<10);
                aux = num;
        while (aux!=0)
        {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(num == inverso)
            palindromo = 'S';
        else
            palindromo='N';
        System.out.println(palindromo);
    }
}