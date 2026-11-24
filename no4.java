import java.util.Scanner;
import javax.swing.JOptionPane;

public class no4 {
    public static void main(String args[]){
        String d1 = JOptionPane.showInputDialog("Nilai 1: ");
        String d2 = JOptionPane.showInputDialog("Nilai 2: ");
        double n1,n2;
        n1 = Double.parseDouble(d1);
        n2 = Double.parseDouble(d2);
        double count = n1*n2;
        System.out.println("Nilai 1 : " + (int)n1);
        System.out.println("Nilai 2 : " + (int)n2);
        System.out.println("Hasil : " + (int)count);
        JOptionPane.showMessageDialog(null,
             ("Nilai 1 : " + (int)n1 + "\n" + "Nilai 2 : " + (int)n2 +"\n" + 
             "Hasil  : " + (int)count));
    }
}
