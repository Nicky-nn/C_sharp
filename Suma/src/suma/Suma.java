package suma;
//import java.lang.*;
//import java.io.*;

import java.util.Scanner;

public class Suma 
{

    public static void main(String[] args) 
    {       
       Scanner entrada = new Scanner(System.in);
       float n1,n2,n3;
       System.out.print("Digite el primer mumero....");
       n1=entrada.nextFloat();
       System.out.print("Digite el segundo mumero....");
       n2=entrada.nextFloat();
       System.out.print("Digite el tercer mumero....");
       n3=entrada.nextFloat();
       float suma = n1+n2+n3;
       float r=n1-n2-n3;
       float m=n1*n2*n3;
       float d=n1/n2/n3;
       //suma*=0.5f; sacar porcentaje%
       System.out.println("\n La suma es "+suma);
       System.out.println("\n La resta es "+r);
       System.out.println("\n La multiplicacion es "+m);
       System.out.println("\n La division es "+d);
               
       
       
    }
    
}
