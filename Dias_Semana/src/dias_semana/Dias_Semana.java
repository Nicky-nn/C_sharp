package dias_semana;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Dias_Semana 
{
    public static void main(String[] args) 
    {
        //Scanner entrada = new Scanner(System.in);
        String nombre = JOptionPane.showInputDialog("Digite su nombre");
        JOptionPane.showMessageDialog(null, "Bienvenido q"+nombre);
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite en numero el dia de la semana"));
       
        switch(dia)
        {
            case 1:
                    JOptionPane.showMessageDialog(null, "El numero "+dia+" Es Lunes");
                    break;
            case 2:
                    JOptionPane.showMessageDialog(null, "El numero "+dia+" Es Martes");
                    break;
            case 3:
                    JOptionPane.showMessageDialog(null, "El numero "+dia+" Es Miercoles");
                    break;
            case 4:
                    JOptionPane.showMessageDialog(null, "El numero "+dia+" Es Jueves");
                    break;
            case 5:
                    JOptionPane.showMessageDialog(null, "El numero "+dia+" Es Viernes");
                    break;
            case 6:
                    JOptionPane.showMessageDialog(null, "El numero "+dia+" Es Sabado");
                    break;
            case 7:
                    JOptionPane.showMessageDialog(null, "El numero "+dia+" Es Domingo");
                    break;
            default:
                    JOptionPane.showMessageDialog(null, "El numero "+dia+" No es un dia de la semana");
        }
        
                
    }
    
}
