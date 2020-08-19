package vectorpromedio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class VectorPromedio 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de digitos "));
        float[] num= new float [nElementos];
        float sposi=0, snega=0,mposi=0, mnega=0;
        int c_posi=0, c_neg=0, czer=0;
        for(int i=0;i<nElementos;i++)
        {
            System.out.println("Introduzca el dato N° "+(i+1));
            num[i]=entrada.nextFloat();
            if(num[i]==0)
            {
                czer++;
            }
            else
            {
                if(num[i]>0)
                {
                    sposi+=num[i];
                    c_posi++;
                }
                else
                {
                    snega+=num[i];
                    c_neg++;
                }
            }
        }
        //Media o promedio de los numeros positivos
        if(c_posi==0)
        {
            System.out.println("Error, imposible sacar media de numeros positivos");
        }
        else
        {
            mposi=sposi/c_posi;
            System.out.println("La media de los numeros positivos es..."+mposi);
        }
        //Media de los numeros negativos
        if(c_neg==0)
        {
            System.out.println("Error, imposible sacar media de numeros negativos");
        }
        else
        {
            mnega=snega/c_neg;
            System.out.println("La media de los numeros negativos es..."+mnega);
        }
        System.out.println("La cantidad de zeros es..."+czer);
    }
    
}
