package info.com;

import java.util.Scanner;

public class DikdörtgenCevreHesabı {
    public static void main(String args[]){
        Scanner tarama = new Scanner(System.in);

        System.out.println("UZUN KENARI GİRİNİZ :");
        int uzunkenar = tarama.nextInt();
        System.out.println("LÜTFEN KISA KENARI GİRİNİZ: ");
        int kısakenar = tarama.nextInt();

        int cevre = (kısakenar+uzunkenar)*2;

        System.out.println("dikdörtgen çeresi:"+ cevre);
    }
}
