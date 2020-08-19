package dias;

import java.util.Scanner;

public class Dias 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Digite el año a identificar...");
        n=entrada.nextInt();
        if(n % 400 ==0)
        {
            System.out.println("\f");
            System.out.println("\n Es bisiesto");
        }
        else
        {
            if(n % 100!=0)
            {
                System.out.println("\n  Es bisiesto");
            }
            else
            {
                System.out.println("\n No es bisiesto");
            }
        }
    }
    
}
