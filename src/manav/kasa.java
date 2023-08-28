package manav;
import java.util.Scanner;

public class kasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut, elma, muz, dom, pat, total;
        double aFiyat = 2.14, eFiyat = 3.67, dFiyat = 1.11, mFiyat = 0.95, pFiyat = 5;

        System.out.println("Armut kaç kilo? :");
       armut = input.nextDouble() * aFiyat;
        System.out.println("Elma kaç kilo? :");
        elma = input.nextDouble() * eFiyat;
        System.out.println("Muz kaç kilo? :");
        muz = input.nextDouble() * mFiyat;
        System.out.println("Domates kaç kilo? :");
        dom = input.nextDouble() * dFiyat;
        System.out.println("Patates kaç kilo? :");
        pat = input.nextDouble() * pFiyat;


        total = armut+elma+muz+dom+pat;
        System.out.println("Kasa toplamı : " + total + "TL");

    }
}
