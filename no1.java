import java.util.Scanner;
import java.util.Vector;

public class no1 {
    public static void main(String args[]){
        String nim = "30082021";
        String nama = "Huga Ghaisan";
        System.out.println("Nim   : " + nim);
        System.out.println("Nama: : " + nama);
        if (nama.length()>=7){
        String subs = "";
        for (int i=3; i<=6;i++){
            subs += nama.charAt(i);
        }
        System.out.println(subs);
        }
    }
}
