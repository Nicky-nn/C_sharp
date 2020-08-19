package vector2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Vector2 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        String[] Nombres={"Nick","Russell","Yana","Choque"};
        int nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de digitos "));
        char[] letras= new char [nElementos];
        System.out.println("Digite los elementos del arreglo");
        for(int i=0;i<nElementos;i++)
        {
            System.out.println("Digite el caracter "+" .....");
            letras[i]=entrada.next().charAt(0);//Tomamos el primer caracter 
        }
        System.out.println("\n Los caracteres del arreglo son");
        for(int i=0;i<nElementos;i++)
        {
            System.out.print(letras[i]+" ");
        }
        for(int i=0;i<Nombres.length;i++)//lee los elemntos del array
        {
            System.out.println("El Nombre es "+Nombres[i]);
        }
        for(String i:Nombres)//Colocamos el tipo de dato y el nombre del array
        {
            System.out.println("Nombres "+i); 
        }
        
    }
    
}
