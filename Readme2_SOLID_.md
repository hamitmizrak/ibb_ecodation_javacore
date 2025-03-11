# IBB Ecodation Java Core
[GitHub](https://github.com/hamitmizrak/ibb_ecodation_javacore.git)
[JDK](https://www.oracle.com/tr/java/technologies/downloads/#jdk23-windows)
[Intellij Idea Community](https://www.jetbrains.com/idea/download/?section=windows)
[Git](https://git-scm.com/downloads)
[Java Tutorials](https://www.w3schools.com/java/default.asp)


## Clean Code
```sh 

```
---

# **Java'da Clean Code (Temiz Kod) Nedir?**

Clean Code (Temiz Kod), yazılım geliştirme sürecinde kodun anlaşılır, bakımı kolay ve sürdürülebilir olmasını sağlayan bir yazım ve tasarım felsefesidir. İlk olarak **Robert C. Martin (Uncle Bob)** tarafından "Clean Code: A Handbook of Agile Software Craftsmanship" kitabında detaylıca ele alınmıştır. Temiz kod, sadece çalışır durumda olan bir koddan fazlasını ifade eder; **okunabilir, modüler, genişletilebilir ve hataya karşı dayanıklı** bir kod yazmayı amaçlar.

---

## **1. Temiz Kodun Önemi**
Bir yazılım projesinde kodun **çalışması** yeterli değildir, aynı zamanda **bakımının kolay** ve **geliştirilmeye açık** olması da gereklidir. İşte temiz kodun neden önemli olduğuna dair bazı nedenler:

- **Okunabilirlik**: Kodun daha anlaşılır olması, geliştiricilerin projeyi daha hızlı kavramasına yardımcı olur.
- **Bakım Kolaylığı**: İlerleyen süreçte hataları gidermek veya yeni özellikler eklemek daha az zaman alır.
- **İşbirliği**: Takım içinde kodu paylaşmayı ve birlikte çalışmayı kolaylaştırır.
- **Test Edilebilirlik**: Temiz kod, daha az hata içerir ve test edilmesi daha kolaydır.
- **Verimlilik**: Kötü kod, zaman içinde teknik borç oluşturur ve projenin gelişimini yavaşlatır.

---

## **2. Clean Code İlkeleri**
### **2.1 Anlamlı ve Açıklayıcı İsimlendirme**
Kod yazarken **değişkenler, fonksiyonlar, sınıflar ve metodlar** için açık ve anlamlı isimler kullanmak gerekir. Değişken ismi, yaptığı işi açıklamalıdır.

**❌ Kötü Örnek**
```java
int d; // Bu değişkenin ne anlama geldiği belli değil.
```

**✅ İyi Örnek**
```java
int elapsedTimeInDays; // Değişkenin neyi ifade ettiği açıkça belirtiliyor.
```

**İyi isimlendirme kuralları şunlardır:**
- **Anlamlı** ve **açıklayıcı** olmalıdır.
- **Kısaltmalardan kaçınılmalıdır.** (`getUserInfo()` yerine `getUsrInf()` kullanmamalıyız.)
- **Boolean değişkenler "is" veya "has" ile başlamalıdır.** (Örneğin: `isActive`, `hasPermission`)
- **Fonksiyon isimleri eylem içermelidir.** (Örneğin: `calculateSalary()`, `fetchData()`)

---

### **2.2 Tek Sorumluluk Prensibi (Single Responsibility Principle - SRP)**
Bir fonksiyon veya sınıf **yalnızca tek bir işi** yapmalıdır. Çok fazla sorumluluğa sahip bir fonksiyonun anlaşılması ve değiştirilmesi zor olur.

**❌ Kötü Örnek**
```java
public class Employee {
    public void calculateSalary() {
        // Maaş hesaplama kodu
    }
    
    public void printEmployeeDetails() {
        // Çalışan bilgilerini yazdırma kodu
    }
    
    public void saveToDatabase() {
        // Çalışanı veritabanına kaydetme kodu
    }
}
```
**Bu kod yanlış çünkü tek bir sınıf birden fazla iş yapıyor.**

**✅ İyi Örnek**
```java
public class Employee {
    private String name;
    private double salary;
    
    public double calculateSalary() {
        return salary * 1.1; // Örnek hesaplama
    }
}

public class EmployeePrinter {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Çalışan: " + employee.getName());
    }
}

public class EmployeeRepository {
    public void saveToDatabase(Employee employee) {
        // Veritabanı işlemleri
    }
}
```
**Burada her sınıf tek bir sorumluluk üstlenmiş durumda.**

---

### **2.3 Fonksiyonlar Küçük ve Odaklı Olmalıdır**
Bir fonksiyon **yalnızca tek bir işi yapmalıdır** ve bu işi **en iyi şekilde yapmalıdır**. Fonksiyonlar mümkün olduğunca kısa olmalıdır.

**❌ Kötü Örnek**
```java
public void processEmployeeData() {
    // Çalışan verilerini oku
    // Verileri doğrula
    // Maaş hesapla
    // Sonuçları yazdır
    // Veritabanına kaydet
}
```

**✅ İyi Örnek**
```java
public void processEmployeeData() {
    Employee employee = readEmployeeData();
    validateEmployeeData(employee);
    double salary = calculateSalary(employee);
    printEmployeeData(employee, salary);
    saveToDatabase(employee, salary);
}
```
Bu şekilde **her işlev için ayrı bir fonksiyon** yazılmış oldu. Okunabilirlik ve modülerlik arttı.

---

### **2.4 Magic Number Kullanımından Kaçının**
Sabit sayılar yerine **anlamlı sabitler** veya **enum değerleri** kullanmalıyız.

**❌ Kötü Örnek**
```java
if (userType == 1) {
    // Admin işlemleri
} else if (userType == 2) {
    // Kullanıcı işlemleri
}
```
**✅ İyi Örnek**
```java
public enum UserType {
    ADMIN, USER;
}

if (userType == UserType.ADMIN) {
    // Admin işlemleri
} else if (userType == UserType.USER) {
    // Kullanıcı işlemleri
}
```
Böylece kod daha anlamlı ve hataya karşı daha dayanıklı hale gelir.

---

### **2.5 Kodun Tekrarını Önleyin (DRY - Don’t Repeat Yourself)**
Aynı işlevi birden fazla yerde tekrar tekrar yazmaktan kaçınmalıyız.

**❌ Kötü Örnek**
```java
public double calculateDiscount(double price) {
    return price * 0.10;
}

public double calculateTax(double price) {
    return price * 0.18;
}
```
Burada **hesaplama mantığı** tekrar edilmiştir. Bunun yerine:

**✅ İyi Örnek**
```java
public double calculatePercentage(double price, double percentage) {
    return price * percentage;
}
```
Şimdi hem vergi hem de indirim hesaplamasında bu fonksiyon kullanılabilir.

---

### **2.6 Kodun Kolay Test Edilebilir Olması**
Kodun **test edilebilir** olması önemlidir. Fonksiyonlar bağımlılıklardan arındırılmalı ve test yazmaya uygun olmalıdır.

**❌ Kötü Örnek**
```java
public double calculateTotalPrice(double price) {
    double tax = price * 0.18;
    System.out.println("Vergi hesaplandı: " + tax);
    return price + tax;
}
```
Bu fonksiyon **hem hesaplama yapıyor hem de konsola çıktı veriyor**, test edilmesi zor.

**✅ İyi Örnek**
```java
public double calculateTotalPrice(double price, double taxRate) {
    return price + (price * taxRate);
}
```
Bu şekilde kod **bağımsız hale** geldi ve kolay test edilebilir oldu.

---

## **Sonuç**
Clean Code, **yalnızca kodun çalışmasını değil**, kodun **bakımını ve geliştirilmesini** de kolaylaştırmayı amaçlayan bir yaklaşımdır. Temiz kod yazmanın bazı temel ilkeleri şunlardır:

1. **Anlamlı ve açıklayıcı isimlendirme**
2. **Tek sorumluluk prensibi (SRP)**
3. **Fonksiyonları küçük ve odaklı yazma**
4. **Magic number kullanmamak**
5. **Kod tekrarından kaçınmak (DRY prensibi)**
6. **Kolay test edilebilir kod yazmak**

Java'da Clean Code prensiplerine uyarak, daha **sürdürülebilir**, **modüler**, **anlaşılır** ve **hatasız** kod yazabiliriz. Bu prensiplere sadık kalmak, uzun vadede proje maliyetlerini düşürecek ve yazılım kalitesini artıracaktır. 🚀

## Yazılım Prensibleri
```sh 

```
---
Yazılım geliştirme sürecinde, **temiz, sürdürülebilir, okunabilir ve ölçeklenebilir** kod yazmak için kullanılan birçok **yazılım geliştirme prensibi** vardır. Bu prensipler, yazılımcıların **hataları azaltmasına, kod tekrarını önlemesine ve projelerin daha yönetilebilir hale gelmesine** yardımcı olur.

Aşağıda **SOLID prensipleri haricindeki** önemli yazılım geliştirme prensiplerini **detaylı açıklamalar** ve **Java kod örnekleriyle** ele alacağız.

---

## **1. DRY (Don't Repeat Yourself - Kendini Tekrarlama)**
DRY prensibi, **tekrarlayan kodun önlenmesi** gerektiğini savunur.  
Kod tekrarını önlemek için **metotlar, sınıflar ve modüller** kullanılmalıdır.

✅ **Avantajları:**
- Kodun **bakımı daha kolaydır**.
- **Güncellenmesi kolaydır** (Bir yerde değişiklik yapıldığında, her yerde düzelir).
- **Daha okunaklı ve ölçeklenebilir** olur.

🚫 **Yanlış Kullanım (Kod Tekrarı İçeriyor - DRY Prensibine Aykırı)**
```java
class Ogrenci {
    String ad;
    int yas;

    public Ogrenci(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public void bilgiGoster() {
        System.out.println("Öğrenci Adı: " + ad);
        System.out.println("Öğrenci Yaşı: " + yas);
    }
}

class Ogretmen {
    String ad;
    int yas;

    public Ogretmen(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public void bilgiGoster() {
        System.out.println("Öğretmen Adı: " + ad);
        System.out.println("Öğretmen Yaşı: " + yas);
    }
}
```
Bu kod, **kod tekrarına** neden olur çünkü hem `Ogrenci` hem de `Ogretmen` sınıfları aynı işlemi yapıyor.

✅ **Doğru Kullanım (DRY Prensibine Uygun)**
```java
class Kisi {
    protected String ad;
    protected int yas;

    public Kisi(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public void bilgiGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
    }
}

class Ogrenci extends Kisi {
    public Ogrenci(String ad, int yas) {
        super(ad, yas);
    }
}

class Ogretmen extends Kisi {
    public Ogretmen(String ad, int yas) {
        super(ad, yas);
    }
}
```
Bu sayede `Ogrenci` ve `Ogretmen` sınıfları **kod tekrarını önleyerek** `Kisi` sınıfından miras alır.

---

## **2. KISS (Keep It Simple, Stupid - Basit Tut)**
KISS prensibi, **kodun mümkün olduğunca basit ve anlaşılır** olması gerektiğini vurgular.  
Kod ne kadar **karmaşıksa**, hata yapma ihtimali o kadar yüksek olur.

🚫 **Yanlış Kullanım (Gereksiz Karmaşıklık)**
```java
public class Hesaplama {
    public static double alanHesapla(String sekil, double... parametreler) {
        if ("kare".equals(sekil)) {
            return parametreler[0] * parametreler[0];
        } else if ("dikdortgen".equals(sekil)) {
            return parametreler[0] * parametreler[1];
        } else {
            return 0;
        }
    }
}
```
Bu kod **gereksiz koşul ifadeleri** kullanıyor. Daha basit hale getirilebilir.

✅ **Doğru Kullanım (KISS Prensibine Uygun)**
```java
interface Sekil {
    double alanHesapla();
}

class Kare implements Sekil {
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar * kenar;
    }
}

class Dikdortgen implements Sekil {
    private double uzunluk, genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }
}
```
Kod, daha sade ve genişletilebilir hale getirilmiştir.

---

## **3. YAGNI (You Ain't Gonna Need It - Şu An Lazım Değil)**
YAGNI prensibi, **ihtiyaç duyulmadan önce bir özelliğin geliştirilmemesi** gerektiğini savunur.

🚫 **Yanlış Kullanım (Gereksiz Özellik Eklemek)**
```java
class Kullanici {
    String isim;
    String email;
    String telefon;
    String sosyalMedyaHesabi;  // Kullanılmıyor ama eklenmiş!

    public Kullanici(String isim, String email, String telefon, String sosyalMedyaHesabi) {
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
        this.sosyalMedyaHesabi = sosyalMedyaHesabi;
    }
}
```
Burada `sosyalMedyaHesabi` özelliği **gereksizdir**, çünkü kullanılmayabilir.

✅ **Doğru Kullanım (YAGNI Prensibine Uygun)**
```java
class Kullanici {
    String isim;
    String email;
    String telefon;

    public Kullanici(String isim, String email, String telefon) {
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
    }
}
```
**Sadece gerekli özellikler eklenmiştir**.

---

## **4. Law of Demeter (LoD - Demeter Yasası)**
Bir nesne, yalnızca **doğrudan ilişkili olduğu nesnelerle iletişim kurmalıdır**.  
Bir nesne, **başka bir nesnenin iç yapısına erişmemelidir**.

🚫 **Yanlış Kullanım (Demeter Yasasına Aykırı)**
```java
class Universite {
    private Bolum bolum;

    public Bolum getBolum() {
        return bolum;
    }
}

class Bolum {
    private Ogrenci ogrenci;

    public Ogrenci getOgrenci() {
        return ogrenci;
    }
}

class Ogrenci {
    public void bilgiGoster() {
        System.out.println("Öğrenci Bilgileri");
    }
}

public class Main {
    public static void main(String[] args) {
        Universite universite = new Universite();
        universite.getBolum().getOgrenci().bilgiGoster();  // Kötü Tasarım!
    }
}
```
Burada, `Main` sınıfı **fazla bağımlılık içeriyor**.

✅ **Doğru Kullanım (LoD Prensibine Uygun)**
```java
class Universite {
    private Bolum bolum;

    public void ogrenciBilgiGoster() {
        bolum.ogrenciBilgiGoster();
    }
}

class Bolum {
    private Ogrenci ogrenci;

    public void ogrenciBilgiGoster() {
        ogrenci.bilgiGoster();
    }
}

class Ogrenci {
    public void bilgiGoster() {
        System.out.println("Öğrenci Bilgileri");
    }
}

public class Main {
    public static void main(String[] args) {
        Universite universite = new Universite();
        universite.ogrenciBilgiGoster(); // Daha iyi tasarım!
    }
}
```
Burada, `Main` sınıfı yalnızca `Universite` sınıfıyla etkileşime giriyor.

---

## **Sonuç**
Yukarıdaki prensipler **temiz, ölçeklenebilir ve bakımı kolay yazılım geliştirmek** için önemlidir.  
Bu prensipleri takip ederek **hata oranını azaltabilir**, **geliştirme süresini kısaltabilir** ve **daha sürdürülebilir kod** yazabilirsiniz. 🚀

## Yazılım Prensibleri-2
```sh 

```
---
 **yazılım mühendisliğinde** kullanılan birçok önemli **prensip ve tasarım ilkesi** daha vardır. Aşağıda **SOLID haricinde** en yaygın yazılım prensiplerini detaylı açıklamaları ve **Java kod örnekleriyle** sıralıyorum:

---

## **5. SRP (Single Responsibility Principle - Tek Sorumluluk Prensibi)**
Bu prensip **SOLID** içinde yer alsa da, özellikle vurgulanması gereken önemli bir ilke olduğu için burada da bahsediyoruz.

**Özet:**
- **Her sınıfın veya metodun sadece bir sorumluluğu olmalıdır.**
- **Değişim için tek bir sebep olmalıdır.**

🚫 **Yanlış Kullanım (SRP'ye Aykırı)**
```java
class Ogrenci {
    String ad;
    int ogrenciNo;

    public Ogrenci(String ad, int ogrenciNo) {
        this.ad = ad;
        this.ogrenciNo = ogrenciNo;
    }

    public void ogrenciKaydet() {
        System.out.println("Öğrenci kaydedildi.");
    }

    public void ogrenciBilgisiGoster() {
        System.out.println("Öğrenci: " + ad);
    }
}
```
**Neden yanlış?**
- Hem **veri yönetimi (kaydetme)** hem de **gösterim işlemleri** aynı sınıfta.
- Ayrıştırılmalı!

✅ **Doğru Kullanım (SRP'ye Uygun)**
```java
class Ogrenci {
    String ad;
    int ogrenciNo;

    public Ogrenci(String ad, int ogrenciNo) {
        this.ad = ad;
        this.ogrenciNo = ogrenciNo;
    }
}

class OgrenciKayit {
    public void ogrenciKaydet(Ogrenci ogrenci) {
        System.out.println("Öğrenci kaydedildi: " + ogrenci.ad);
    }
}

class OgrenciGoster {
    public void ogrenciBilgisiGoster(Ogrenci ogrenci) {
        System.out.println("Öğrenci Bilgisi: " + ogrenci.ad);
    }
}
```
- **Veri yönetimi (kaydetme) ayrı bir sınıfa taşındı.**
- **Görselleştirme ayrı bir sınıfa taşındı.**

---

## **6. TDA (Tell, Don’t Ask - Söyle, Sorma)**
**Özet:**
- **Bir nesneye verilerini sorgulatmak yerine, ona ne yapması gerektiğini söylemelisiniz.**
- **Getter’lar yerine nesnelerin işlevleri gerçekleştirmesi daha iyi olabilir.**

🚫 **Yanlış Kullanım (TDA’ya Aykırı)**
```java
class Araba {
    private boolean calisiyor;

    public boolean isCalisiyor() {
        return calisiyor;
    }

    public void setCalisiyor(boolean calisiyor) {
        this.calisiyor = calisiyor;
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        if (!araba.isCalisiyor()) {
            araba.setCalisiyor(true);
        }
    }
}
```
**Neden yanlış?**
- **Dışarıdan bir sınıf iç durumu kontrol ediyor ve değiştiriyor.**
- **Bu durum, gereksiz bağımlılıklar yaratır.**

✅ **Doğru Kullanım (TDA’ya Uygun)**
```java
class Araba {
    private boolean calisiyor;

    public void calistir() {
        this.calisiyor = true;
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.calistir(); // Araba kendi iç mantığını yönetiyor.
    }
}
```
- **Arabanın iç mantığı dışarıdan sorgulanmıyor.**
- **Daha iyi enkapsülasyon sağlandı.**

---

## **7. POLA (Principle of Least Astonishment - En Az Şaşırtma İlkesi)**
**Özet:**
- **Kodunuz beklenildiği gibi çalışmalıdır.**
- **Bir metot veya fonksiyon ismi, amacını doğru yansıtmalıdır.**
- **Beklenmedik yan etkiler oluşturmaktan kaçınılmalıdır.**

🚫 **Yanlış Kullanım (POLA’ya Aykırı)**
```java
class BankaHesabi {
    private double bakiye;

    public double getBakiye() {
        this.bakiye -= 10; // Beklenmeyen bir yan etki var!
        return bakiye;
    }
}
```
- **Kullanıcı "getBakiye()" metodunu çağırdığında bakiyenin azalmasını beklemez.**

✅ **Doğru Kullanım (POLA’ya Uygun)**
```java
class BankaHesabi {
    private double bakiye;

    public double getBakiye() {
        return bakiye;
    }

    public void paraCek(double miktar) {
        if (bakiye >= miktar) {
            bakiye -= miktar;
        }
    }
}
```
- **Metot isimleri amacını yansıtıyor.**
- **Beklenmeyen yan etkiler yok.**

---

## **8. GRASP (General Responsibility Assignment Software Patterns)**
**Özet:**
- **Yazılımın sorumluluklarını belirlerken bazı genel ilkeleri tanımlar.**
- **Temel ilkeleri şunlardır:**
    - **Information Expert:** Veriye sahip olan sınıf, veriyi işleyen metodu da içermelidir.
    - **Creator:** Bir nesne başka bir nesneyi kullanacaksa, onu oluşturan sınıf olmalıdır.
    - **Controller:** Kullanıcıdan gelen istekleri yönetmelidir.

✅ **Örnek (GRASP - Information Expert)**
```java
class Fatura {
    private List<Double> urunFiyatlari;

    public Fatura() {
        this.urunFiyatlari = new ArrayList<>();
    }

    public void urunEkle(double fiyat) {
        urunFiyatlari.add(fiyat);
    }

    public double toplamHesapla() {
        double toplam = 0;
        for (double fiyat : urunFiyatlari) {
            toplam += fiyat;
        }
        return toplam;
    }
}
```
- **Verilere erişen sınıf (Fatura), o verilerle ilgili işlemi de yapar.**
- **Başka bir sınıfın verileri alıp hesaplama yapması gerekmez.**

---

## **9. CQS (Command Query Separation - Komut ve Sorgu Ayrımı)**
**Özet:**
- **Bir metodun ya bir şey yapması (komut), ya da bir değer döndürmesi (sorgu) gerekir.**
- **İkisini birden yapmamalıdır.**

🚫 **Yanlış Kullanım (CQS’ye Aykırı)**
```java
class Stok {
    private int miktar;

    public int azaltVeDondur(int miktar) {
        this.miktar -= miktar; // Hem değiştiriyor, hem de geri döndürüyor!
        return this.miktar;
    }
}
```
- **Metot hem stok miktarını değiştiriyor hem de döndürüyor.**

✅ **Doğru Kullanım (CQS’ye Uygun)**
```java
class Stok {
    private int miktar;

    public void miktarAzalt(int miktar) {
        this.miktar -= miktar;
    }

    public int getMiktar() {
        return this.miktar;
    }
}
```
- **Bir metodun tek bir amacı var.**
- **Komut ve sorgu ayrımı sağlandı.**

---

## **Sonuç**
Bu yazılım prensipleri, kodunuzu daha **temiz, esnek ve sürdürülebilir** hale getirecektir. **SOLID prensiplerine ek olarak,**
- **DRY (Tekrarı Önleme),**
- **YAGNI (Gereksiz Özellik Ekleme),**
- **KISS (Basit Tut),**
- **TDA, POLA, GRASP, CQS** gibi prensipleri uygularsanız **kaliteli ve profesyonel yazılım geliştirebilirsiniz.** 🚀


## SOLID Prensibleri
```sh 

```
---
SOLID, nesne yönelimli programlamada (OOP) daha esnek, ölçeklenebilir ve bakımı kolay yazılımlar geliştirmek için kullanılan beş temel prensibi içeren bir kılavuzdur.

### **SOLID Prensipleri:**
1. **S - Single Responsibility Principle (Tek Sorumluluk Prensibi)**
    - Bir sınıfın yalnızca **tek bir sorumluluğu** olmalıdır.
    - Bir sınıfın değişme sebebi **tek bir neden** olmalıdır.

2. **O - Open/Closed Principle (Açık/Kapalı Prensibi)**
    - Bir sınıf, **genişletilmeye açık**, ancak değiştirilmeye kapalı olmalıdır.
    - Yeni özellikler eklemek için mevcut kodu değiştirmek yerine, genişletebilir şekilde yazılmalıdır.

3. **L - Liskov Substitution Principle (Liskov'un Yerine Koyma Prensibi)**
    - Bir alt sınıf, **türetilmiş olduğu üst sınıfın yerine** kullanılabilmelidir.
    - Alt sınıflar, üst sınıfların yerine **hata vermeden** çalışabilmelidir.

4. **I - Interface Segregation Principle (Arayüz Ayrımı Prensibi)**
    - Bir sınıf, **ihtiyaç duymadığı** metotları içeren büyük arayüzleri **uygulamak zorunda kalmamalıdır**.
    - Küçük ve özelleşmiş arayüzler tanımlanmalıdır.

5. **D - Dependency Inversion Principle (Bağımlılıkların Ters Çevrilmesi Prensibi)**
    - Üst seviyedeki modüller, alt seviyedeki modüllere **doğrudan bağımlı olmamalıdır**.
    - Bağımlılıklar, soyutlamalar aracılığıyla tanımlanmalıdır.

---

## **SOLID Prensiplerine Uygun Java Örneği**
Aşağıda, **Öğrenci Bilgi Sistemi** için **SOLID prensiplerine uygun olarak yazılmış** bir örnek bulunmaktadır.

---

### **1. Single Responsibility Principle (SRP)**
**Tek Sorumluluk Prensibi** gereği, öğrenci işlemleri, ders işlemleri ve not işlemleri farklı sınıflara ayrılmıştır.

```java
import java.util.*;

// Öğrenci Sınıfı (Tek Sorumluluk Prensibine Uygun)
class Ogrenci {
    private String ad;
    private int ogrenciNo;
    private Map<String, Double> notlar;

    public Ogrenci(String ad, int ogrenciNo) {
        this.ad = ad;
        this.ogrenciNo = ogrenciNo;
        this.notlar = new HashMap<>();
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public String getAd() {
        return ad;
    }

    public void notEkle(String ders, double not) {
        notlar.put(ders, not);
    }

    public void notlariGoster() {
        System.out.println("Öğrenci: " + ad + " (No: " + ogrenciNo + ")");
        for (Map.Entry<String, Double> entry : notlar.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

// Öğrenci Yönetim Sınıfı (Ayrı bir sorumluluk)
class OgrenciYonetimi {
    private List<Ogrenci> ogrenciler;

    public OgrenciYonetimi() {
        this.ogrenciler = new ArrayList<>();
    }

    public void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
        System.out.println("Öğrenci eklendi: " + ogrenci.getAd());
    }

    public void ogrenciListele() {
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println("- " + ogrenci.getAd() + " (No: " + ogrenci.getOgrenciNo() + ")");
        }
    }
}
```

---

### **2. Open/Closed Principle (OCP)**
Yeni özellikler eklerken, mevcut kod değiştirilmeden genişletilebilmelidir.

```java
// Not Hesaplama Arayüzü
interface NotHesaplayici {
    double notHesapla(double[] notlar);
}

// Standart Not Hesaplama
class StandartNotHesaplayici implements NotHesaplayici {
    @Override
    public double notHesapla(double[] notlar) {
        double toplam = 0;
        for (double not : notlar) {
            toplam += not;
        }
        return toplam / notlar.length;
    }
}

// Yeni Not Hesaplama Algoritması (Mevcut Kodu Değiştirmeden Eklenebilir)
class AgirlikliNotHesaplayici implements NotHesaplayici {
    @Override
    public double notHesapla(double[] notlar) {
        return 0.6 * notlar[0] + 0.4 * notlar[1];
    }
}
```

---

### **3. Liskov Substitution Principle (LSP)**
Alt sınıflar, üst sınıfların yerine kullanılabilmelidir.

```java
abstract class Kisi {
    protected String ad;

    public Kisi(String ad) {
        this.ad = ad;
    }

    public abstract void bilgiGoster();
}

class OgrenciLSP extends Kisi {
    private int ogrenciNo;

    public OgrenciLSP(String ad, int ogrenciNo) {
        super(ad);
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Öğrenci: " + ad + " No: " + ogrenciNo);
    }
}

class Ogretmen extends Kisi {
    private String brans;

    public Ogretmen(String ad, String brans) {
        super(ad);
        this.brans = brans;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Öğretmen: " + ad + " Branş: " + brans);
    }
}
```

---

### **4. Interface Segregation Principle (ISP)**
Bir arayüz, büyük ve kapsamlı olmamalı, parçalanmalıdır.

```java
interface OgrenciIslemleri {
    void notEkle(String ders, double not);
}

interface DersIslemleri {
    void dersEkle(String ders);
}

class OgrenciISP implements OgrenciIslemleri {
    private String ad;
    private Map<String, Double> notlar = new HashMap<>();

    public OgrenciISP(String ad) {
        this.ad = ad;
    }

    @Override
    public void notEkle(String ders, double not) {
        notlar.put(ders, not);
    }
}
```

---

### **5. Dependency Inversion Principle (DIP)**
Üst seviyedeki modüller, alt seviyedeki modüllere doğrudan bağımlı olmamalıdır.

```java
class NotServisi {
    private final NotHesaplayici hesaplayici;

    public NotServisi(NotHesaplayici hesaplayici) {
        this.hesaplayici = hesaplayici;
    }

    public double notHesapla(double[] notlar) {
        return hesaplayici.notHesapla(notlar);
    }
}

// Kullanım
public class Main {
    public static void main(String[] args) {
        NotServisi notServisi = new NotServisi(new StandartNotHesaplayici());
        double sonuc = notServisi.notHesapla(new double[]{80, 90, 85});
        System.out.println("Ortalama Not: " + sonuc);
    }
}
```

---

### **Sonuç**
Bu kod örnekleri, **SOLID prensiplerine uygun olarak Öğrenci Bilgi Sistemi'ni nasıl oluşturabileceğimizi gösteriyor**. Her bir prensip, yazılımı **daha sürdürülebilir, esnek ve test edilebilir** hale getiriyor.


## Design Pattern 
```sh 

```
---

# **Design Pattern (Tasarım Desenleri) Nedir?**

**Design Pattern (Tasarım Deseni)**, **yazılım geliştirme sürecinde sık karşılaşılan problemleri çözmek için geliştirilmiş, tekrar tekrar kullanılabilen, test edilmiş ve optimize edilmiş kod yapılarıdır.**

- **Tasarım desenleri**, yazılımın **esnek, ölçeklenebilir ve bakımı kolay** olmasını sağlar.
- Genellikle **Object-Oriented Programming (OOP)** prensipleriyle çalışır.
- **Kod tekrarını önler**, **esnekliği artırır** ve **geliştirme süresini kısaltır**.
- **Gang of Four (GoF)** tarafından tanımlanmıştır.

---

# **Tasarım Desenleri Çeşitleri**
Tasarım desenleri, kullanım amaçlarına göre **üç ana kategoriye** ayrılır:

1. **Yaratımsal (Creational) Desenler:**
    - Nesne oluşturma sürecini yönetir.
    - **Örnekler:** Singleton, Factory Method, Abstract Factory, Builder, Prototype.

2. **Yapısal (Structural) Desenler:**
    - Sınıfların ve nesnelerin arasındaki ilişkileri düzenler.
    - **Örnekler:** Adapter, Bridge, Composite, Decorator, Facade, Proxy, Flyweight.

3. **Davranışsal (Behavioral) Desenler:**
    - Nesneler arası iletişimi ve etkileşimi yönetir.
    - **Örnekler:** Observer, Strategy, Command, State, Chain of Responsibility, Mediator, Memento.

---

## **1. Yaratımsal (Creational) Tasarım Desenleri**
### **1.1 Singleton Pattern**
**Amaç:**
- **Tek bir nesne örneği** oluşturur ve sistemin her yerinde **aynı nesneyi kullanır**.
- **Veritabanı bağlantıları, Logger, Konfigürasyon dosyaları** gibi **tek bir örneğe ihtiyaç duyulan** yerlerde kullanılır.

✅ **Singleton Örneği (Java)**:
```java
class Singleton {
    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton logger = Singleton.getInstance();
        logger.logMessage("Sistem başlatıldı.");
    }
}
```
**✔ Avantajları:**
- Hafıza yönetimini kolaylaştırır.
- Aynı nesne her yerde kullanılabilir.

**❌ Dezavantajları:**
- Test edilmesi zordur.
- Çoklu iş parçacığı (multithreading) için dikkat edilmelidir.

---

### **1.2 Factory Method Pattern**
**Amaç:**
- **Alt sınıfların nesne oluşturmasını sağlar.**
- Nesne oluşturma sürecini merkezileştirir.

✅ **Factory Method Örneği (Java)**:
```java
abstract class Araba {
    abstract void marka();
}

class BMW extends Araba {
    void marka() {
        System.out.println("BMW Araba üretildi.");
    }
}

class Mercedes extends Araba {
    void marka() {
        System.out.println("Mercedes Araba üretildi.");
    }
}

class ArabaFactory {
    public static Araba arabaUret(String tip) {
        if (tip.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (tip.equalsIgnoreCase("Mercedes")) {
            return new Mercedes();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba1 = ArabaFactory.arabaUret("BMW");
        araba1.marka();

        Araba araba2 = ArabaFactory.arabaUret("Mercedes");
        araba2.marka();
    }
}
```
**✔ Avantajları:**
- Kodun **genişletilmesini kolaylaştırır**.
- **Kod tekrarını önler**.

**❌ Dezavantajları:**
- Fazladan bir sınıf oluşturma gerektirir.

---

## **2. Yapısal (Structural) Tasarım Desenleri**
### **2.1 Adapter Pattern**
**Amaç:**
- **Farklı sistemleri birbirine bağlamak için kullanılır.**
- Örneğin, bir **eski sistem** ile **yeni bir sistem** arasında bağlantı kurar.

✅ **Adapter Pattern Örneği (Java)**
```java
interface EskiSistem {
    void eskiMetot();
}

class YeniSistem {
    void yeniMetot() {
        System.out.println("Yeni sistem metodu çalışıyor.");
    }
}

class Adapter implements EskiSistem {
    private YeniSistem yeniSistem;

    public Adapter(YeniSistem yeniSistem) {
        this.yeniSistem = yeniSistem;
    }

    public void eskiMetot() {
        yeniSistem.yeniMetot();
    }
}

public class Main {
    public static void main(String[] args) {
        YeniSistem yeniSistem = new YeniSistem();
        EskiSistem adapter = new Adapter(yeniSistem);
        adapter.eskiMetot();
    }
}
```
**✔ Avantajları:**
- Farklı sistemlerin entegrasyonunu sağlar.

**❌ Dezavantajları:**
- **Kod karmaşıklığını artırabilir.**

---

## **3. Davranışsal (Behavioral) Tasarım Desenleri**
### **3.1 Observer Pattern**
**Amaç:**
- **Bir nesnedeki değişiklikleri, bağlı nesnelere otomatik olarak iletir.**
- **Örneğin, kullanıcı arayüzü, haber bildirim sistemleri gibi yerlerde kullanılır.**

✅ **Observer Pattern Örneği (Java)**
```java
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String mesaj);
}

class Kullanici implements Observer {
    private String ad;

    public Kullanici(String ad) {
        this.ad = ad;
    }

    public void update(String mesaj) {
        System.out.println(ad + " bildirim aldı: " + mesaj);
    }
}

class HaberKaynak {
    private List<Observer> aboneler = new ArrayList<>();

    public void aboneEkle(Observer abone) {
        aboneler.add(abone);
    }

    public void haberGonder(String mesaj) {
        for (Observer abone : aboneler) {
            abone.update(mesaj);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HaberKaynak haberKaynak = new HaberKaynak();

        Kullanici kullanici1 = new Kullanici("Ali");
        Kullanici kullanici2 = new Kullanici("Veli");

        haberKaynak.aboneEkle(kullanici1);
        haberKaynak.aboneEkle(kullanici2);

        haberKaynak.haberGonder("Yeni haber yayınlandı!");
    }
}
```
**✔ Avantajları:**
- **Gevşek bağlı (loose coupling)** bir sistem sağlar.

**❌ Dezavantajları:**
- **Çok fazla abone olduğunda performans sorunları olabilir.**

---

# **Sonuç**
Tasarım desenleri, **yazılım geliştirme süreçlerinde tekrar eden problemleri çözmek için kullanılan, optimize edilmiş ve test edilmiş çözümler** sunar.  
Bu desenleri kullanarak **daha esnek, ölçeklenebilir ve sürdürülebilir** yazılımlar geliştirebilirsiniz. 🚀