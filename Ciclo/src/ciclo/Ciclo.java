package ciclo;

import javax.swing.JOptionPane;

public class Ciclo 
{
    public static void main(String[] args) 
    {
        String nombre = JOptionPane.showInputDialog("Digite su nombre");
        JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digiteel hasta que numero sera la secuencia"));
        int i=1,num=2,sum=0;
        while(i<=n)
        {
            int cua=(int)Math.pow(num, i);
            JOptionPane.showMessageDialog(null, "El numero "+num+ " elevado al "+ i+" es " +cua);
            i++;
        }
        i=1;
        do
        {
            
            sum=num+i;
            JOptionPane.showMessageDialog(null, "La suma de "+num+ " + "+i+" es "+sum );            
            i++;
            num++;
        }while(i<=n);
        int a=0,b=1;
        for(i=0;i<=n;i++)
        {
            int aux=a;
            a=b;
            b=aux+a;
            JOptionPane.showMessageDialog(null, "La Serie Fibonacci es: "+a); 
        }
        
    }
    
}
