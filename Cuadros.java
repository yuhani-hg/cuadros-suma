package arreglo;
import javax.swing.JOptionPane;
public class Cuadros {
    
    public static void main(String[] args) { 
        int law;
        double num, zz;
        double  [] arreglo=new double [5];
        JOptionPane.showMessageDialog(null, "numeros");
        for(law=0; law<=4; law++)
        {
            law=JOptionPane.showInputDialog("Ingresa un numero: ");
            num=Double.parseDouble(law);
        }
        for(law=0; law<=4; law++)
        {
             zz=zz+num[law];
             JOptionPane.showMessageDialog(null, "numeros= "+zz);
        }
    }
    
}
