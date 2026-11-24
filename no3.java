import java.util.Scanner;
import javax.swing.JOptionPane;

public class no3 {
    public static void main(String args[]){
        int flag = 0;
        double n1,n2,n3;
        
        do{
        if (flag == 1) JOptionPane.showMessageDialog(null, ("Error: Silahkan input di rentang 0-100!"));
        String d1 = JOptionPane.showInputDialog("Nilai 1: ");
        String d2 = JOptionPane.showInputDialog("Nilai 2: ");
        String d3 = JOptionPane.showInputDialog("Nilai 3: ");

        n1 = Double.parseDouble(d1);
        n2 = Double.parseDouble(d2);
        n3 = Double.parseDouble(d3);
        flag = ((n1<0 || n1>100) || (n2<0 || n2>100) || (n3<0 || n3>100)) ? 1 : 0;
        } 
        while ((n1<0 || n1>100) || (n2<0 || n2>100) || (n3<0 || n3>100) );

        System.out.println("Nilai 1: " + String.format("%.2f", n1));
        System.out.println("Nilai 2: " + String.format("%.2f", n2));
        System.out.println("Nilai 3: " + String.format("%.2f", n3));

        double avg = (n1+n2+n3)/3;

        System.out.print("Rata: ");
        System.out.printf("%.2f", avg);
        System.out.println("");
        System.out.println("Hasil: " + (avg>=60 ? "LULUS" : "GAGAL"));
        JOptionPane.showMessageDialog(null, 
            ("Rata: " + String.format("%.2f", avg) + '\n' + "Hasil: " + (avg>=60 ? "LULUS" : "GAGAL")));
    }
}
