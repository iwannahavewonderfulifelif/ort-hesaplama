import java.util.Scanner;

public static void main(String[]args) {

Scanner klavye=new Scanner(System.in);
    {
        System.out.println("Fiyatı giriniz: ");

        double fiyat = klavye.nextDouble();

        double kdv = (fiyat < 1000) ? 0.18 : 0.8;
        double kdvTutari = kdv * fiyat;
        double kdvliFiyat = fiyat + kdvTutari;

        System.out.println("Fiyatınız: " + fiyat);
        System.out.println("KDV oranınız: " + kdv);
        System.out.println("KDV tutarınız: " + kdvTutari);
        System.out.println("KDV'li fiyatınız: " + kdvliFiyat);
    }}