import java.util.Scanner;

public class notOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız: " + ortalama);
        boolean gecmeDurumu = (ortalama >= 60);

        String str = gecmeDurumu ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
