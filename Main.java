import java.util.Scanner;

public static void main(String[]args) {
    int fizik, kimya, mat, fizikLab, algoritma, bbg, trdili, ing;
    Scanner klavye = new Scanner(System.in);

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = klavye.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = klavye.nextInt();
        System.out.println("Matematik notunuzu giriniz: ");
        mat = klavye.nextInt();
        System.out.println("Fizik laboratuvarı notunuzu giriniz: ");
        fizikLab = klavye.nextInt();
        System.out.println("Algoritma ve proramlama notunuzu giriniz: ");
        algoritma = klavye.nextInt();
        System.out.println("Bilgisayar bilimine giriş notunuzu giriniz: ");
        bbg = klavye.nextInt();
        System.out.println("Türk dili notunuzu giriniz: ");
        trdili = klavye.nextInt();
        System.out.println("İngilizce notunuzu giriniz: ");
        ing = klavye.nextInt();

    double ort=((fizik+kimya+mat+fizikLab+algoritma+bbg+trdili+ing)/8);
    System.out.println("Vize notunuz: "+ort);

    if (ort<60){
        double finalNotu = (600 - ort * 4) / 6;
        if(ort<60){
            System.out.println("Final notunuz en az "+finalNotu+" olmalıdır!");
        }
}}







