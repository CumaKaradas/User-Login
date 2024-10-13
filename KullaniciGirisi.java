import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcı adı ve şifreyi belirleme
        String dogruKullaniciAdi = "kullanici";
        String dogruSifre = "sifre";

        // Kullanıcıya giriş yapma hakkı tanıma
        int girisHakki = 3;

        // Kullanıcı girişi
        while (girisHakki > 0) {
            System.out.println("Kullanıcı Adı: ");
            String kullaniciAdi = scanner.nextLine();

            System.out.println("Şifre: ");
            String sifre = scanner.nextLine();

            // Kullanıcı adı ve şifre doğruysa giriş yap
            if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)) {
                System.out.println("Giriş başarılı! Hoş geldiniz, " + kullaniciAdi + ".");
                break;
            } else {
                girisHakki--;
                System.out.println("Giriş başarısız! Lütfen tekrar deneyin. Kalan giriş hakkınız: " + girisHakki);
            }
        }

        // Giriş hakkı kalmadığında uyarı verme
        if (girisHakki == 0) {
            System.out.println("Giriş hakkınız doldu. Lütfen daha sonra tekrar deneyin.");
        }

        scanner.close();
    }
}
