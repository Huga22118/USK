import java.util.Scanner;

public class no2 {
    // convert double to rupiah format -Huga
    public static String s(double e){
        String temp;
        temp = String.format("%.1f", e);
        int ef = 0;
        for (int i=0;i<temp.length();i++){
            if (temp.charAt(i) == ','){
                ef = i;
                break;
            }
        }
        String s = temp.substring(0, ef);
        String yf = "";
        int length = s.length();
        int takeFirst = s.length() % 3;
        for (int i=0; i<Math.min(takeFirst,length); i++){
            yf += s.charAt(i);
        }
        if (length>=3){
            int idx = takeFirst;

            if (takeFirst>0) yf+='.';

            yf += s.substring(idx, idx+3);
            idx+=3;

            while (idx<length){
            yf+='.' + s.substring(idx, idx+3);
            idx +=3;
            }
        }
        return yf;
    }
    public static void main(String args[]){
        double hargaBarang, dis;
        hargaBarang = 10000;
        dis = 10;
        System.out.println("Harga Barang : Rp. " + s(hargaBarang));
        System.out.println("Diskon : " + (int)dis + " %");
        double discount, temp;
        discount = hargaBarang/100*dis;
        temp = hargaBarang-discount;
        System.out.println("Diskon(Rp.) : Rp. " + s(discount));
        System.out.println("Total Harga : Rp. " + s(temp));
    }
}
