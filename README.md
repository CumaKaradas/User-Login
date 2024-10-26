# Kullanıcı Giriş Sistemi

Bu Java programı, basit bir kullanıcı giriş sistemi simülasyonu gerçekleştirir. Kullanıcılara 3 giriş hakkı tanır ve doğru kullanıcı adı/şifre kombinasyonunu girmeleri durumunda başarılı giriş mesajı gösterir.

## Özellikler

- Önceden tanımlanmış kullanıcı adı ve şifre kontrolü
- 3 başarısız giriş hakkı
- Kalan giriş hakkı bildirimi
- Güvenli giriş kontrolü

## Gereksinimler

- Java JDK 8 veya üzeri
- Herhangi bir Java IDE'si (Eclipse, IntelliJ IDEA, VS Code vb.)

## Kurulum

1. Projeyi yerel bilgisayarınıza kopyalayın:
```bash
git clone https://github.com/kullaniciadi/KullaniciGirisi.git
```

2. Proje dizinine gidin:
```bash
cd KullaniciGirisi
```

3. Java dosyasını derleyin:
```bash
javac KullaniciGirisi.java
```

4. Programı çalıştırın:
```bash
java KullaniciGirisi
```

## Kullanım

1. Program başlatıldığında kullanıcı adınızı girin
2. Şifrenizi girin
3. Giriş bilgileri doğruysa başarılı mesajı alacaksınız
4. Yanlış giriş durumunda kalan hak sayısı gösterilecektir

Varsayılan giriş bilgileri:
- Kullanıcı adı: `kullanici`
- Şifre: `sifre`

Örnek başarılı giriş:
```
Kullanıcı Adı: 
kullanici
Şifre: 
sifre
Giriş başarılı! Hoş geldiniz, kullanici.
```

Örnek başarısız giriş:
```
Kullanıcı Adı: 
yanlis
Şifre: 
yanlis
Giriş başarısız! Lütfen tekrar deneyin. Kalan giriş hakkınız: 2
```

## Güvenlik Özellikleri

- Sınırlı giriş hakkı (3 deneme)
- Basit şifre kontrolü
- Giriş denemesi takibi
- Oturum sonlandırma

## Planlanan Geliştirmeler

- [ ] Şifre karmaşıklık kontrolü
- [ ] Kullanıcı kaydı özelliği
- [ ] Şifre sıfırlama seçeneği
- [ ] Veritabanı entegrasyonu
- [ ] Giriş logları tutma
- [ ] Şifre maskeleme
- [ ] Captcha ekleme
- [ ] İki faktörlü doğrulama

## Notlar

- Bu program eğitim amaçlıdır
- Gerçek uygulamalarda şifreler açık metin olarak saklanmamalıdır
- Kullanıcı bilgileri şu an kod içinde sabit tanımlıdır
- Üretim ortamında daha güvenli bir doğrulama sistemi kullanılmalıdır

## Katkıda Bulunma

1. Projeyi fork edin
2. Feature branch oluşturun (`git checkout -b feature/YeniOzellik`)
3. Değişikliklerinizi commit edin (`git commit -m 'Yeni özellik: Şifre karmaşıklık kontrolü'`)
4. Branch'inizi push edin (`git push origin feature/YeniOzellik`)
5. Pull Request açın

## Lisans

Bu proje MIT lisansı ile lisanslanmıştır. Detaylar için [LICENSE](LICENSE) dosyasına bakınız.

## İletişim

Geliştirici: [İsim]
E-posta: ornek@email.com
GitHub: [@kullaniciadi]

## Güvenlik Uyarısı

Bu program basic bir giriş sistemi örneğidir. Gerçek projelerde:
- Şifreler hash'lenerek saklanmalıdır
- Güvenli şifre politikaları uygulanmalıdır
- Brute force saldırılarına karşı koruma eklenmelidir
- Session yönetimi yapılmalıdır
