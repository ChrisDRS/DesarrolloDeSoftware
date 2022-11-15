package io.github.jiangdequan;
import java.util.*;

public class clsMain 
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            String text = scanner.nextLine();
            char[] arr = text.toCharArray();

            int y=0,x = arr.length;
            char[] inv = new char[x];
            for(int i=0;i<arr.length;i++)
            {
                x--;
                inv[y] = arr[x];
                y++;
            }
            System.out.print(inv);
            
        }        
    }
}