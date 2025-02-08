# IBB Ecodation Java Core
[GitHub](https://github.com/hamitmizrak/ibb_ecodation_javacore.git)
[JDK](https://www.oracle.com/tr/java/technologies/downloads/#jdk23-windows)
[Intellij Idea Community](https://www.jetbrains.com/idea/download/?section=windows)
[Git](https://git-scm.com/downloads)
[Java Tutorials](https://www.w3schools.com/java/default.asp)


## Git
```sh 
git init
git add .
git commit -m "add message"
git push -u origin master

git clone  https://github.com/hamitmizrak/ibb_ecodation_javacore.git
```
---

## Java Common Rules ()
```sh 
Class isimleri PascalCase göre yazılır
Class isimleri: Fiil olarak kullanmayız (mak-mek)
Class : Java 1 tane public class vardır (inner class hariç)
Class : Java static class yoktur (inner class hariç)

Paket isimleri: Küçük harflerle yazılır.
Paket isimleri: fiil olarak kullanmayız (mak-mek)
Paket kısa net bir şekilde olması gerekiyor.

Javada Her biten kelime ; ile bitirmek zorundayız.
```
---


## Java Core Information
```sh 
Java case sensitive bir dildir. (Küçük büyük harfe duyarlı yüksek seviyede bir dildir.)
```
---

## Maven Nedir ?
```sh 

```
---
### **1. Maven Nedir?**
Maven, Java projelerini oluşturmak, yönetmek ve otomatikleştirmek için kullanılan bir **build automation** (inşa otomasyonu) aracıdır. Apache tarafından geliştirilmiştir ve özellikle Java projelerinde bağımlılık yönetimi, derleme, test etme ve dağıtım süreçlerini kolaylaştırır. Maven, XML tabanlı bir yapılandırma dosyası olan `pom.xml` kullanarak projenin yapılandırmasını ve bağımlılıklarını yönetir.

**Maven’in Sağladıkları:**
- **Bağımlılık Yönetimi:** Projeye eklenmesi gereken kütüphaneleri otomatik olarak indirir.
- **Proje Yapılandırması:** Projeyi standart bir yapıda düzenler.
- **Otomatik Derleme:** Projeyi derler (`mvn compile`).
- **Test Çalıştırma:** JUnit ve TestNG gibi test araçlarıyla testleri çalıştırır (`mvn test`).
- **Paketleme:** Projeyi `jar` veya `war` formatında paketler (`mvn package`).
- **Dağıtım Yönetimi:** Uygulamayı uzak sunuculara veya depolara gönderir (`mvn deploy`).

---

## pom.xml Nedir ?
```sh 

```
### **2. `pom.xml` Nedir?**
`pom.xml` (**Project Object Model**) dosyası, Maven projelerinin merkezi yapılandırma dosyasıdır. Projenin bağımlılıklarını, sürüm bilgilerini, eklentilerini ve yapılandırmalarını içerir.

Örnek bir `pom.xml` dosyası:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.7.4</version>
        </dependency>
    </dependencies>
</project>
```
Bu dosya:
- Projenin kimliğini (`groupId`, `artifactId`, `version`)
- Bağımlılıklarını (`dependencies`)
- Yapılandırmalarını içerir.

---


## JDK Nedir ?
```sh 

```
### **3. JDK (Java Development Kit) Nedir?**
**JDK (Java Development Kit)**, Java ile uygulama geliştirmek için kullanılan geliştirme ortamıdır. İçerisinde:
- **JRE (Java Runtime Environment)** (Çalışma zamanı ortamı)
- **JVM (Java Virtual Machine)** (Java Sanal Makinesi)
- **Java Compiler (javac)** (Java derleyicisi)
- **Java Debugger (jdb)** (Hata ayıklayıcı)
- **Java API ve kütüphaneleri** bulunur.

JDK olmadan Java kodu yazılamaz ve çalıştırılamaz.
---

## JRE Nedir ?
```sh 

```
### **4. JRE (Java Runtime Environment) Nedir?**
**JRE (Java Runtime Environment)**, Java uygulamalarını çalıştırmak için gereken ortamdır. İçerisinde:
- **JVM (Java Virtual Machine)** bulunur.
- **Java Kütüphaneleri** içerir.
- **Çalışma zamanı dosyaları** bulunur.

Eğer sadece Java programlarını çalıştırmak istiyorsanız, JDK yerine sadece JRE yükleyebilirsiniz. Ancak, JRE **Java kodu yazmak veya derlemek için yeterli değildir**.
---

### **5. JVM (Java Virtual Machine) Nedir?**
**JVM (Java Virtual Machine)**, Java programlarını çalıştıran sanal bir makinedir. JVM sayesinde Java platform bağımsızdır çünkü Java kodu her işletim sisteminde çalışabilecek **bayt koduna** (`.class` dosyalarına) çevrilir.

JVM’in Görevleri:
- **Bayt kodunu çalıştırır.**
- **Bellek yönetimini yapar (Garbage Collection).**
- **Çoklu iş parçacığını (multithreading) destekler.**
- **Platform bağımsızlığı sağlar.**
---

## Compiler Nedir ?
```sh 

```
### **5. Compiler (Derleyici) Nedir?**
**Compiler (Derleyici)**, insan tarafından yazılan yüksek seviyeli programlama dillerini makine koduna veya bayt koduna dönüştüren bir programdır. Java’da derleyici `javac` olarak adlandırılır.

**Java'da Çalışma Süreci:**
1. **Java kodu yazılır:** `MyClass.java`
2. **Derleyici (`javac`) çalıştırılır:** `javac MyClass.java`
3. **Bayt kodu (`.class` dosyası) oluşturulur:** `MyClass.class`
4. **JVM bayt kodunu çalıştırır.**
---


## Intepreter Nedir ?
```sh 

```
### **7. Interpreter (Yorumlayıcı) Nedir?**
**Interpreter (Yorumlayıcı),** programın satır satır çalıştırılmasını sağlayan bir programdır. 
Java’da **JVM içerisinde yer alan yorumlayıcı (interpreter)**, bayt kodlarını satır satır çalıştırır.

**Derleyici (Compiler) vs. Yorumlayıcı (Interpreter):**
- **Derleyici**: Tüm kodu derleyerek tek seferde çalıştırılabilir hale getirir.
- **Yorumlayıcı**: Kodu satır satır çalıştırır.

Java hem **derleyici (`javac`)** hem de **yorumlayıcı (JVM içinde)** kullanır.
---

### **8. Java Nedir?**
Java, **nesne yönelimli (OOP), platform bağımsız, güvenli, çok iş parçacıklı (multithreading) ve taşınabilir** bir programlama dilidir.

- **1995’te Sun Microsystems tarafından geliştirildi.**
- **"Bir kere yaz, her yerde çalıştır" (Write Once, Run Anywhere - WORA)** prensibiyle çalışır.
- **Mobil, web, masaüstü ve büyük ölçekli sistemlerde kullanılır.**
---

### **9. Java’nın Özellikleri Nelerdir?**
- **Platform Bağımsızdır.** (JVM sayesinde her yerde çalışır)
- **Nesne Yönelimli Programlama (OOP) Desteği** vardır.
- **Güvenlidir.** (Bellek yönetimi ve güvenlik mekanizmaları içerir)
- **Çok İş Parçacıklı (Multithreading)** çalışmayı destekler.
- **Otomatik Bellek Yönetimi (Garbage Collection)** yapar.
- **Dağıtık ve Ağ Tabanlı Uygulamaları Destekler.**
---

### **10. Data Types (Veri Tipleri) Nedir?**
Java'da değişkenlerin alabileceği veri türlerini ifade eder. İki ana kategoriye ayrılır:
1. **Primitive Types (İlkel Veri Tipleri)**
2. **Reference Types (Referans Tipleri)**
---

### **11. Primitive Types Nedir?**
Java'daki **ilkel veri tipleri (Primitive Types)** hafızada doğrudan değer saklayan basit veri türleridir.

| Veri Tipi  | Boyut | Varsayılan Değer | Aralık |
|------------|------|----------------|------------------|
| `byte`     | 1B  | 0              | -128 to 127 |
| `short`    | 2B  | 0              | -32,768 to 32,767 |
| `int`      | 4B  | 0              | -2^31 to 2^31-1 |
| `long`     | 8B  | 0L             | -2^63 to 2^63-1 |
| `float`    | 4B  | 0.0f           | ~7 basamak |
| `double`   | 8B  | 0.0d           | ~15 basamak |
| `char`     | 2B  | '\u0000'       | Unicode karakterler |
| `boolean`  | 1B  | `false`        | `true` veya `false` |
---

### **12. Wrapper Types Nedir?**
**Wrapper Class’lar,** primitive veri tiplerinin nesne olarak kullanılmasını sağlar.

Örneğin:
```java
int num = 10;
Integer obj = Integer.valueOf(num);
```

**Primitive -> Wrapper Dönüşümleri:**
- **`int -> Integer`**
- **`double -> Double`**
- **`char -> Character`**
- **`boolean -> Boolean`**

Wrapper class’lar **Java Collections API’lerinde** kullanılır çünkü koleksiyonlar yalnızca nesne saklayabilir.


## Java Core (Primitive Types)
```sh 

```
---

**`javac` (Java Compiler) ve bayt kodu (bytecode) süreci**, derleme süresi ve oluşturulan `.class` dosyasının boyutunu etkileyebilir. Aşağıda bunun nasıl gerçekleştiğine dair detaylı bir açıklama bulabilirsiniz.
---

## **1. `javac` Derleyici ve Derleme Süresi**
### **Derleme Süresini Etkileyen Faktörler**
- **Kodun Karmaşıklığı:**
    - Daha fazla **sınıf, metod ve kod satırı** içeren projeler daha uzun sürede derlenir.
    - Büyük projelerde, bağımlılıklar ve `import` edilen kütüphaneler derleme süresini uzatabilir.

- **Optimize Edilmiş Derleme (`javac` Seçenekleri)**:
    - **Incremental Compilation (Artımlı Derleme):**
        - Eğer sadece değişiklik yapılan sınıflar derlenirse, `javac` süresi kısalır.
    - **Hata Ayıklama Seçenekleri (`-g:none`)**:
        - `javac -g:none` komutu hata ayıklama bilgilerini içermeyen bir bytecode oluşturur ve derleme süresini kısaltabilir.
    - **Çoklu İş Parçacığı (Multithreading) Kullanımı:**
        - Büyük projelerde **Gradle** gibi derleme sistemleri çoklu iş parçacığı desteği sağlar, böylece derleme süresi azalır.

- **Donanım ve JVM Yapılandırması:**
    - Daha hızlı CPU ve SSD kullanan sistemlerde derleme süresi düşer.
    - Yetersiz RAM veya düşük işlem gücü derleme süresini artırır.

---

## **2. Bayt Kodu (Bytecode) ve Dosya Boyutu**
**Bytecode,** `javac` tarafından üretilen **platformdan bağımsız bir ara koddur** ve `.class` dosyalarında saklanır.

### **Bytecode Boyutunu Etkileyen Faktörler**
1. **Kodun İçeriği ve Karmaşıklığı:**
    - Uzun metotlar, fazla satır kod ve daha fazla `class` tanımlaması dosya boyutunu artırır.

2. **Yerel Değişkenler ve Sabit Havuzu (Constant Pool):**
    - Java’nın **String Constant Pool** ve diğer sabit değişkenleri yönetme mekanizması, **fazla sayıda string veya sabit tanımı içeren** kodlarda `.class` dosyasının boyutunu artırabilir.

3. **Kullanılan Optimizasyonlar:**
    - **JVM Optimizasyonları:**
        - JVM, bayt kodunu çalıştırırken **Just-In-Time (JIT) Compiler** gibi tekniklerle optimizasyon yapar.
    - **Inline Kod Kullanımı:**
        - `final` ve `static` değişkenlerin derleme zamanında yerine konulması, bytecode boyutunu artırabilir.

4. **Lombok, Annotation Processing ve Kütüphaneler:**
    - **Lombok, Spring gibi kütüphaneler** **otomatik kod üretme (code generation)** yapıyorsa, `.class` dosya boyutunu artırabilir.
    - **Annotation Processing**, derleme zamanında ek kodlar üreterek dosya boyutunu büyütebilir.

5. **Obfuscation (Kod Gizleme) ve Minifikasyon:**
    - Eğer kod **ProGuard veya R8 gibi optimizasyon araçlarıyla küçültülürse**, bytecode dosya boyutu azalır.
    - **Android projelerinde R8 ve ProGuard kullanımı**, bytecode boyutunu küçültmek için yaygın bir tekniktir.

---

## **3. Örnek Bir Kodun Derleme Süresi ve Bytecode Boyutu Üzerindeki Etkisi**
Aşağıdaki iki kodu karşılaştıralım:

### **Kod 1 – Basit Java Kodu**
```java
public class SimpleClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
- **Derleme Süresi:** Çok kısa (~milisaniyeler)
- **Bytecode Boyutu:** Küçük (~1-2 KB)

---

### **Kod 2 – Daha Büyük ve Karmaşık Kod**
```java
import java.util.ArrayList;

public class ComplexClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.size());
    }
}
```
- **Derleme Süresi:** Daha uzun (~milisaniyeler ile saniyeler arasında)
- **Bytecode Boyutu:** Daha büyük (~10-20 KB)

---

## **4. Sonuç**
- **Kodun karmaşıklığı ve kullanılan yapılar hem derleme süresini hem de bayt kodunun boyutunu etkiler.**
- **Optimize edilmiş derleme (`javac -g:none`, ProGuard gibi araçlar) bytecode boyutunu azaltabilir.**
- **Büyük projelerde derleme süresi donanıma ve çoklu iş parçacığı desteğine bağlı olarak değişebilir.**
- **Fazla sayıda sınıf, uzun metotlar ve büyük sabit havuzu derleme süresini ve bytecode boyutunu artırır.**

**Özet:** Daha fazla kod satırı, büyük sınıflar, fazladan kütüphane kullanımı ve karmaşık yapıların kullanımı hem derleme süresini uzatır hem de `.class` dosyalarının boyutunu artırır.


## Java Common Rules 
```sh 

```
---

### **Java Değişken İsimlendirme Kuralları ve En İyi Uygulamalar**
Java'da değişken isimlendirme kuralları **sözdizimsel (syntax)** kurallar ve **en iyi uygulamalar (best practices)** olarak ikiye ayrılır. Sözdizim kurallarına uyulmazsa derleme hatası alınır, en iyi uygulamalara uyulmaması ise okunabilirliği ve bakımı zorlaştırır.
---

## **1. Java'da Değişken İsimlendirme Kuralları (Syntax Kuralları)**
Java'da değişken isimlendirme aşağıdaki zorunlu kurallara tabidir:

### ✅ **Geçerli Değişken İsimlendirme Kuralları**
1. **Alfabede yer alan harfler (`a-z`, `A-Z`) kullanılabilir.**
2. **Rakamlar (`0-9`) kullanılabilir, ancak değişken ismi rakamla başlayamaz.**
3. **Alt çizgi `_` ve dolar işareti `$` kullanılabilir.**
4. **Java anahtar kelimeleri (reserved words) değişken adı olarak kullanılamaz.**  
   Örneğin, `int`, `class`, `static`, `for`, `if` gibi kelimeler değişken adı olamaz.

### ❌ **Geçersiz Değişken İsimlendirme Örnekleri**
| **Geçersiz Değişken** | **Hata Nedeni** |
|------------------------|-----------------|
| `1number`             | Rakamla başlayamaz |
| `int`                 | Java anahtar kelimesidir |
| `first-name`          | `-` işareti kullanılamaz |
| `@value`              | `@` özel karakteri kullanılamaz |
| `my variable`         | Boşluk içeremez |

---

## **2. Java Değişken İsimlendirme En İyi Uygulamaları (Best Practices)**
Geçerli değişken adları derleme hatası vermez, ancak bazı yazım standartlarına uyulması okunabilirliği artırır. En iyi uygulamalar şunlardır:

### ✅ **1. Camel Case Kullanımı (Önerilir)**
Java'da değişkenler için **camelCase** kullanılır:
- İlk kelime **küçük harfle başlar**, sonraki kelimeler **büyük harfle başlar**.

**Örnek:**
```java
int studentAge;
double accountBalance;
String firstName;
boolean isActive;
```

### ✅ **2. Anlamlı ve Açıklayıcı İsimler Seçin**
- Kısa ve anlamsız değişken adlarından kaçının.
- Değişkenin ne yaptığını veya hangi veriyi sakladığını anlatan isimler kullanın.

❌ Kötü Örnek:
```java
int x;
double y;
```

✅ İyi Örnek:
```java
int studentCount;
double totalSalary;
```

---

### ✅ **3. Değişken Adları Küçük Harfle Başlamalıdır**
- **Java'da değişkenler küçük harfle başlar**, ardından gelen kelimeler büyük harfle devam eder.

❌ Kötü Örnek:
```java
int StudentCount;
```
✅ İyi Örnek:
```java
int studentCount;
```

---

### ✅ **4. Sabit Değerler (Constants) İçin `UPPER_CASE` Kullanılmalı**
- `final` değişkenler **büyük harf** ve **alt çizgi (`_`)** ile yazılmalıdır.

✅ **İyi Örnek (Sabitler için)**:
```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```

---

### ✅ **5. Boşluk ve Özel Karakterler Kullanılmamalıdır**
Değişken isimlerinde **boşluk (space) veya özel karakterler (`@`, `#`, `!`, `-`, `%`)** kullanılamaz.

❌ Geçersiz:
```java
int my variable;
String first-name;
```

✅ Geçerli:
```java
int myVariable;
String firstName;
```

---

### ✅ **6. `_` ve `$` Kullanımı (Genellikle Önerilmez)**
- **`_`** ve **`$`** kullanılabilir, ancak **genellikle değişken isimlerinde kullanılmaz**.
- **Özel durumlar:**
    - `_` genellikle **sabit değerlerde** (`final static`) kullanılır.
    - `$` genellikle **otomatik üretilen kodlarda** kullanılır (örneğin, Java'nın iç mekanizmalarında).

✅ Geçerli:
```java
String _privateVar;  // Genellikle kaçınılır
String $generatedCode;  // Kullanılabilir ama önerilmez
```

---

## **3. Özet**
| **Kural**                           | **Örnek (✅ Doğru)** | **Örnek (❌ Yanlış)** |
|--------------------------------------|---------------------|---------------------|
| **Harf, rakam, `_`, `$` kullanılabilir** | `age`, `userName`, `account_balance` | `user-name`, `1stName`, `my var` |
| **Rakamla başlayamaz**               | `name1`            | `1name` |
| **Anahtar kelimeler kullanılamaz**    | `totalAmount`      | `class`, `int` |
| **Camel case kullanılmalı**          | `studentCount`     | `Studentcount`, `student_count` |
| **Sabit değişkenler büyük harfle yazılmalı** | `MAX_USERS`, `PI`  | `MaxUsers`, `piValue` |
| **Boşluk içeremez**                   | `fullName`         | `full name` |

---

## **4. Örnek Kullanımlar**
### ✅ **İyi Uygulama Örnekleri**
```java
public class NamingExample {
    public static void main(String[] args) {
        int studentCount = 25;
        double accountBalance = 1050.75;
        final double PI = 3.14159;
        boolean isAvailable = true;

        System.out.println("Student Count: " + studentCount);
        System.out.println("Account Balance: $" + accountBalance);
        System.out.println("PI: " + PI);
        System.out.println("Available: " + isAvailable);
    }
}
```

---

### **Sonuç**
- Java değişken isimlendirme kurallarına uymak kodun **okunabilirliğini, bakımını ve standartlarını artırır**.
- **Camel Case** kullanımı önerilir: `myVariable`
- **Sabitler (`final`) büyük harfle yazılır**: `MAX_VALUE`
- **Değişken isimleri anlamlı olmalı**: `userName`, `totalAmount`
- **Java anahtar kelimeleri değişken adı olarak kullanılamaz**.

Bu kurallara uymak, kodunuzu daha **anlaşılır, düzenli ve sürdürülebilir** hale getirecektir. 🚀


## Java Core
```sh 

```
---

# **Java'da Primitive Type (İlkel Veri Tipleri) - Detaylı Açıklama**

Java'da **Primitive Types (İlkel Veri Tipleri)**, temel ve hafif veri tipleridir. Java'nın **hafıza yönetimi**, **hızlı işlem yapabilme** ve **düşük bellek tüketimi** sağlaması için kullanılırlar. Primitive türler, doğrudan bellekte saklanır ve nesne (`Object`) değildirler.

Java’da **8 adet** primitive type vardır:
- **Tam sayı tipleri:** `byte`, `short`, `int`, `long`
- **Ondalıklı sayılar:** `float`, `double`
- **Karakter tipi:** `char`
- **Mantıksal tip:** `boolean`

---

## **1. Java'da Primitive Veri Tiplerinin Genel Özellikleri**
1. **Nesne Değildir:**
    - Primitive değişkenler doğrudan bellekte saklanır.
    - `Integer`, `Double` gibi **Wrapper Class’lar** nesne iken, `int`, `double` gibi **primitive türler** nesne değildir.

2. **Daha Verimlidir:**
    - Nesne yerine doğrudan hafızada saklandıkları için işlemler daha hızlı gerçekleştirilir.
    - Örneğin, `int` yerine `Integer` kullanılırsa **heap bellekte fazladan bir nesne oluşur**.

3. **Varsayılan Değerleri Vardır:**
    - Primitive değişkenler **başlangıç değerleriyle** başlar (örneğin `int` için `0`, `boolean` için `false`).

4. **Değer Tutarlar, Referans Değil:**
    - Primitive türler **değer bazlıdır**, yani doğrudan değişkenin içinde tutulur.
    - `int x = 10;` yazıldığında, `x` değişkeninin içinde `10` değeri saklanır.

---

# **2. Java Primitive Veri Tipleri**
Aşağıda **Java'nın 8 primitive veri tipi** detaylı bir şekilde açıklanmaktadır.

## **A. Tam Sayı Türleri (Integer Types)**
Bu veri tipleri **ondalıklı olmayan** sayıları saklamak için kullanılır.

| **Tip**    | **Boyut** | **Aralık**                 | **Varsayılan Değer** |
|------------|---------|---------------------------|-----------------|
| `byte`     | 1 byte  | -128 to 127               | 0               |
| `short`    | 2 byte  | -32,768 to 32,767         | 0               |
| `int`      | 4 byte  | -2³¹ to (2³¹-1)           | 0               |
| `long`     | 8 byte  | -2⁶³ to (2⁶³-1)           | 0L              |

### **1. `byte` (1 Byte - Küçük Tam Sayılar)**
- **Bellek tasarrufu** sağlamak için kullanılır.
- **Sık kullanılan küçük değerler** için uygundur.
- Örneğin **100 kişilik öğrenci listesi** tutarken kullanışlıdır.

```java
byte smallNumber = 100;
byte minByte = -128;
byte maxByte = 127;
```

### **2. `short` (2 Byte - Orta Büyüklükte Tam Sayılar)**
- `byte`'tan büyük, `int`'ten küçük değerler için kullanılır.
- **Bellek kullanımını optimize etmek** için uygundur.

```java
short shortNumber = 32000;
short minShort = -32768;
short maxShort = 32767;
```

### **3. `int` (4 Byte - Standart Tam Sayılar)**
- Java'da **en çok kullanılan** tam sayı tipidir.
- Varsayılan olarak **tamsayı değerleri `int` türündedir**.

```java
int myAge = 25;
int totalUsers = 500000;
int minInt = -2147483648;
int maxInt = 2147483647;
```

### **4. `long` (8 Byte - Büyük Tam Sayılar)**
- Büyük sayılar için kullanılır.
- Sayının sonuna **`L` harfi** eklenmelidir (`long number = 10000000000L;`).

```java
long population = 7800000000L; // Dünya nüfusu
long distanceToSun = 149600000000L; // Güneşe olan mesafe (km)
```

---

## **B. Ondalıklı Sayılar (Floating Point Types)**
Ondalıklı sayılar için kullanılan **kayan nokta tipleridir**.

| **Tip**    | **Boyut** | **Yaklaşık Hassasiyet** | **Varsayılan Değer** |
|------------|---------|---------------------|-----------------|
| `float`    | 4 byte  | ~7 basamak          | 0.0f            |
| `double`   | 8 byte  | ~15 basamak         | 0.0d            |

### **1. `float` (4 Byte - Daha Az Hassas)**
- Daha az yer kaplar ama **kesinlik kaybı olabilir**.
- Sayının sonuna **`f` eklenmelidir** (`float pi = 3.14f;`).

```java
float pi = 3.14159f;
float gravity = 9.81f;
```

### **2. `double` (8 Byte - Daha Hassas)**
- **Hassas matematiksel işlemler** için kullanılır.
- **Varsayılan ondalıklı veri tipidir.**

```java
double precisePi = 3.141592653589793;
double speedOfLight = 299792458.0;
```

---

## **C. `char` (Karakter Tipi)**
- **Tek bir karakter saklar.**
- **Unicode destekler**, yani her dili ve sembolü içerebilir.

```java
char letter = 'A';
char digit = '5';
char symbol = '@';
char smiley = '\u263A'; // ☺ Unicode karakter
```

---

## **D. `boolean` (Mantıksal Veri Tipi)**
- **İki olası değer alır:** `true` veya `false`
- **Kontrol yapılarında (if, while, for)** yaygın kullanılır.

```java
boolean isJavaFun = true;
boolean isRaining = false;
```

---

# **3. Primitive Türler İçin Varsayılan Değerler**
Java'da bir primitive değişken **başlangıç değeri atanmazsa**, şu varsayılan değerleri alır:

| **Veri Tipi** | **Varsayılan Değer** |
|--------------|-----------------|
| `byte`       | 0               |
| `short`      | 0               |
| `int`        | 0               |
| `long`       | 0L              |
| `float`      | 0.0f            |
| `double`     | 0.0d            |
| `char`       | '\u0000' (Boş karakter) |
| `boolean`    | false           |

---

# **4. Primitive ve Wrapper Class Arasındaki Fark**
Java, primitive türlerin nesne olarak kullanılmasını sağlayan **Wrapper Class’ları** içerir.

| **Primitive Type** | **Wrapper Class** |
|-------------------|-----------------|
| `byte`           | `Byte`           |
| `short`          | `Short`          |
| `int`            | `Integer`        |
| `long`           | `Long`           |
| `float`          | `Float`          |
| `double`         | `Double`         |
| `char`           | `Character`      |
| `boolean`        | `Boolean`        |

Örneğin:
```java
int x = 10;
Integer y = Integer.valueOf(x); // Primitive -> Wrapper (Boxing)
int z = y.intValue(); // Wrapper -> Primitive (Unboxing)
```

---


## Java Core
```sh 

```
---
Java'da **primitive types** (ilkel türler) ve **wrapper types** (sarmalayıcı türler) arasındaki farkları detaylı bir şekilde inceleyelim.

---

## 1. **Primitive Type ve Wrapper Type Nedir?**
- **Primitive Types**: Java'daki en temel veri türleridir. Bellekte doğrudan değerleri saklarlar ve **hafıza açısından daha verimli** çalışırlar.
- **Wrapper Types**: Primitive türlerin nesne (object) olarak kullanılabilmesini sağlayan Java sınıflarıdır. Java'da **koleksiyonlar (List, Set, Map gibi)** nesnelerle çalıştığından, primitive türlerin nesne versiyonları (wrapper types) kullanılır.

---

## 2. **Primitive Types ve Wrapper Types Karşılaştırması**
| **Özellik**            | **Primitive Types**         | **Wrapper Types**          |
|----------------------|------------------------|------------------------|
| **Tanım**            | Doğrudan değeri saklayan türlerdir. | Primitive türleri sarmalayan sınıflardır. |
| **Hafıza Kullanımı**  | Daha az bellek kullanır, daha verimlidir. | Daha fazla bellek tüketir (ekstra nesne oluşturur). |
| **Depolama**         | Stack bellekte saklanır. | Heap bellekte saklanır (Nesne olarak oluşturulduğu için). |
| **Değer Tipi**       | Değer (value) tipindedir. | Referans (object) tipindedir. |
| **Null Olabilir mi?** | **Hayır** (null olamaz). | **Evet** (null olabilir). |
| **Varsayılan Değer**  | int → 0, double → 0.0, boolean → false vb. | null (eğer nesne oluşturulmamışsa). |
| **Nesne Davranışı**  | Nesne değildir, direkt hesaplama yapar. | Nesnedir, metodları vardır. |
| **Koleksiyonlarda Kullanım** | **Doğrudan kullanılamaz** (List<int> gibi bir şey yazamayız). | **Kullanılabilir** (List<Integer> mümkündür). |
| **Dönüştürme İşlemi** | Boxing & Unboxing gerektirir. | Boxing & Unboxing ile primitive türlere dönüşebilir. |

---

## 3. **Primitive Türler ve Karşılık Gelen Wrapper Türler**
| **Primitive Type** | **Wrapper Class** |
|-------------------|-----------------|
| `byte`           | `Byte`          |
| `short`          | `Short`         |
| `int`            | `Integer`       |
| `long`           | `Long`          |
| `float`          | `Float`         |
| `double`         | `Double`        |
| `char`           | `Character`     |
| `boolean`        | `Boolean`       |

---

## 4. **Örneklerle Açıklamalar**

### 4.1 **Primitive Type Kullanımı**
```java
public class PrimitiveExample {
    public static void main(String[] args) {
        int x = 10;
        double y = 20.5;
        boolean isJavaFun = true;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Java eğlenceli mi? " + isJavaFun);
    }
}
```
📌 **Burada `x`, `y` ve `isJavaFun` değişkenleri doğrudan bellekte saklanır, nesne oluşturulmaz.**

---

### 4.2 **Wrapper Type Kullanımı**
```java
public class WrapperExample {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(10);
        Double y = Double.valueOf(20.5);
        Boolean isJavaFun = Boolean.TRUE; // veya new Boolean(true) (Eski kullanım)

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Java eğlenceli mi? " + isJavaFun);
    }
}
```
📌 **Burada `x`, `y` ve `isJavaFun` nesne olarak saklanır, heap bellekte yer kaplar.**

---

## 5. **Autoboxing ve Unboxing (Primitive ile Wrapper Arasındaki Dönüşüm)**
Java 5 ile gelen **Autoboxing** ve **Unboxing**, primitive ve wrapper türleri arasında otomatik dönüşüm yapılmasını sağlar.

### 5.1 **Autoboxing (Primitive → Wrapper)**
**Primitive türler, otomatik olarak wrapper nesnelere dönüşür.**
```java
public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing

        System.out.println("Wrapper Integer: " + wrapperValue);
    }
}
```
**Bu kod,** `Integer wrapperValue = Integer.valueOf(primitiveValue);` **ile aynıdır.**

---

### 5.2 **Unboxing (Wrapper → Primitive)**
**Wrapper türler, otomatik olarak primitive değerlere dönüşür.**
```java
public class UnboxingExample {
    public static void main(String[] args) {
        Integer wrapperValue = 200;
        int primitiveValue = wrapperValue; // Unboxing

        System.out.println("Primitive int: " + primitiveValue);
    }
}
```
**Bu kod,** `int primitiveValue = wrapperValue.intValue();` **ile aynıdır.**

---

## 6. **Primitive Type vs. Wrapper Type Kullanım Senaryoları**

| **Senaryo** | **Primitive Kullanımı** | **Wrapper Kullanımı** |
|------------|--------------------|--------------------|
| **Hız & Performans Önemli** | ✅ Daha hızlı | ❌ Yavaş |
| **Bellek Verimliliği** | ✅ Az bellek kullanır | ❌ Fazla bellek harcar |
| **Koleksiyonlarda Kullanım (List, Set, Map)** | ❌ Kullanılamaz | ✅ Kullanılabilir |
| **Null Değer Atama** | ❌ Mümkün değil | ✅ Mümkün |
| **Nesne Yönelimli Programlama Gerekirse** | ❌ Uygun değil | ✅ Nesne olarak kullanılabilir |
| **Metodlarla Çalışma** | ❌ Metod içermez | ✅ `Integer.parseInt()`, `Double.valueOf()` gibi metodlar kullanılabilir |

---

## 7. **Ne Zaman Hangi Tür Kullanılmalı?**
- **Performans kritikse ve koleksiyonlarla çalışılmıyorsa → Primitive types kullanılmalı.**
- **Koleksiyonlar (List, Map, Set) veya nesne yönelimli bir yapı gerekiyorsa → Wrapper types kullanılmalı.**
- **Null değerler gerekliliği varsa → Wrapper types tercih edilmeli.**
- **Hesaplamalar yapılıyorsa → Primitive types daha hızlı ve verimli çalışır.**

---

## 8. **Sonuç**
| **Konu** | **Primitive Type** | **Wrapper Type** |
|---------|-----------------|-----------------|
| Hafıza Kullanımı | Az bellek harcar | Daha fazla bellek tüketir |
| Hız | Daha hızlıdır | Daha yavaştır |
| Null Olabilir mi? | ❌ Hayır | ✅ Evet |
| Nesne mi? | ❌ Hayır | ✅ Evet |
| Koleksiyonlarda Kullanılabilir mi? | ❌ Hayır | ✅ Evet |

📌 **Özetle**, performans gereken durumlarda **primitive types** kullanılır, nesne yönelimli işlemler ve koleksiyonlar için **wrapper types** gereklidir.

💡 **Soru:** `List<int> list = new ArrayList<>();` neden hatalıdır?
📌 Çünkü **primitive types koleksiyonlarda kullanılamaz.** `List<Integer> list = new ArrayList<>();` şeklinde **wrapper type** kullanmalıyız.

Bu detaylı açıklamalar, primitive ve wrapper türleri arasındaki farkları net bir şekilde anlamanıza yardımcı olacaktır! 🚀



# **Sonuç**
- **Primitive türler** doğrudan bellekte saklanır, nesne değildir.
- **Daha hızlıdır ve daha az bellek tüketir**.
- **8 temel tür vardır:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
- **Matematik işlemleri ve kontrollerde en verimli yöntemleri sunar**.

**Primitive türler Java'nın temelini oluşturur ve performans açısından büyük avantaj sağlar! 🚀**


## Java Core
```sh 

```
---

# **Java Math (Matematiksel İşlemler) - Detaylı Açıklama**

Java'da **matematiksel işlemleri gerçekleştirmek** için kullanılan **Math** sınıfı (`java.lang.Math`), birçok hazır **matematik fonksiyonu** sunar. Bu fonksiyonlar sayesinde **üstel, logaritmik, trigonometrik ve yuvarlama işlemleri** gibi birçok işlemi gerçekleştirebiliriz.

---

# **1. `Math` Sınıfının Genel Özellikleri**
✅ **Math sınıfı `java.lang` paketinin bir parçasıdır**  
✅ **Statik metotlar içerir, bu yüzden nesne oluşturmaya gerek yoktur**  
✅ **Performans açısından optimize edilmiştir**  
✅ **Temel aritmetik, yuvarlama, üstel işlemler, trigonometri fonksiyonları içerir**

Örneğin:
```java
double sqrtValue = Math.sqrt(25); // 5.0
double powerValue = Math.pow(2, 3); // 8.0
double randomValue = Math.random(); // 0 ile 1 arasında rastgele sayı
```

---

# **2. Java Math Sınıfının Kullanımı**

### **A. Temel Matematiksel İşlemler**
Math sınıfı **mutlak değer, maksimum, minimum gibi işlemleri** kolayca yapar.

| **Metot**               | **Açıklama** | **Örnek Kullanım** |
|-------------------------|-------------|---------------------|
| `Math.abs(x)`          | x’in mutlak değerini döndürür. | `Math.abs(-10) → 10` |
| `Math.max(a, b)`       | a ve b’nin maksimumunu bulur. | `Math.max(5, 8) → 8` |
| `Math.min(a, b)`       | a ve b’nin minimumunu bulur. | `Math.min(5, 8) → 5` |

```java
System.out.println(Math.abs(-15)); // 15
System.out.println(Math.max(100, 200)); // 200
System.out.println(Math.min(50, 30)); // 30
```

---

### **B. Üstel ve Logaritmik İşlemler**
| **Metot**                | **Açıklama** | **Örnek Kullanım** |
|-------------------------|-------------|---------------------|
| `Math.sqrt(x)`         | x’in karekökünü döndürür. | `Math.sqrt(9) → 3.0` |
| `Math.pow(x, y)`       | x’in y. kuvvetini hesaplar. | `Math.pow(2, 3) → 8.0` |
| `Math.exp(x)`          | e^x hesaplar. | `Math.exp(2) → 7.389` |
| `Math.log(x)`          | x’in doğal logaritmasını hesaplar (ln x). | `Math.log(2.718)` |
| `Math.log10(x)`        | x’in 10 tabanında logaritmasını hesaplar. | `Math.log10(100) → 2.0` |

```java
System.out.println(Math.sqrt(16)); // 4.0
System.out.println(Math.pow(2, 5)); // 32.0
System.out.println(Math.exp(1)); // 2.718
System.out.println(Math.log(Math.E)); // 1.0
System.out.println(Math.log10(1000)); // 3.0
```

---

### **C. Yuvarlama İşlemleri**
Java Math sınıfı **yuvarlama işlemleri için** farklı fonksiyonlar sunar.

| **Metot**             | **Açıklama** | **Örnek Kullanım** |
|----------------------|-------------|---------------------|
| `Math.round(x)`     | En yakın tam sayıya yuvarlar. | `Math.round(5.7) → 6` |
| `Math.ceil(x)`      | Yukarı yuvarlar. | `Math.ceil(3.2) → 4.0` |
| `Math.floor(x)`     | Aşağı yuvarlar. | `Math.floor(3.9) → 3.0` |

```java
System.out.println(Math.round(4.5)); // 5
System.out.println(Math.ceil(3.2)); // 4.0
System.out.println(Math.floor(6.8)); // 6.0
```

---

### **D. Trigonometri Fonksiyonları**
Trigonometri fonksiyonları **radyan cinsinden** hesaplama yapar.

| **Metot**            | **Açıklama** | **Örnek Kullanım** |
|----------------------|-------------|---------------------|
| `Math.sin(x)`      | x’in sinüsünü hesaplar. | `Math.sin(Math.PI/2) → 1.0` |
| `Math.cos(x)`      | x’in kosinüsünü hesaplar. | `Math.cos(0) → 1.0` |
| `Math.tan(x)`      | x’in tanjantını hesaplar. | `Math.tan(Math.PI/4) → 1.0` |
| `Math.asin(x)`     | x’in ters sinüsünü hesaplar. | `Math.asin(0.5)` |
| `Math.acos(x)`     | x’in ters kosinüsünü hesaplar. | `Math.acos(1)` |
| `Math.atan(x)`     | x’in ters tanjantını hesaplar. | `Math.atan(1)` |

```java
System.out.println(Math.sin(Math.PI/2)); // 1.0
System.out.println(Math.cos(0)); // 1.0
System.out.println(Math.tan(Math.PI/4)); // 1.0
```

---

### **E. Rastgele Sayı Üretme**
`Math.random()` metodu **0.0 ile 1.0 arasında rastgele bir sayı döndürür**.

**Örnek Kullanımlar:**
```java
System.out.println(Math.random()); // 0.0 ile 1.0 arasında rastgele sayı
System.out.println((int)(Math.random() * 100)); // 0-99 arası sayı
System.out.println((int)(Math.random() * 50) + 1); // 1-50 arası sayı
```

---

### **F. Sabitler**
Math sınıfı **matematiksel sabitleri** de içerir.

| **Sabit** | **Açıklama** | **Örnek Kullanım** |
|----------|-------------|---------------------|
| `Math.PI` | π değeri (3.141592653589793) | `Math.PI * r * r` (Daire Alanı) |
| `Math.E` | Euler sabiti (2.718281828459045) | `Math.exp(1) → 2.718` |

```java
System.out.println(Math.PI); // 3.141592653589793
System.out.println(Math.E); // 2.718281828459045
```

---

# **3. Java Math Kullanımına Örnek**
Aşağıdaki Java programı, **Math sınıfının en önemli metodlarını** içeren bir örnektir.

```java
public class MathExample {
    public static void main(String[] args) {
        // Mutlak Değer
        System.out.println("Mutlak Değer: " + Math.abs(-25));

        // Karekök ve Üstel İşlemler
        System.out.println("Karekök: " + Math.sqrt(64));
        System.out.println("Üs Al: " + Math.pow(2, 5));

        // Yuvarlama İşlemleri
        System.out.println("Yuvarla (Round): " + Math.round(4.6));
        System.out.println("Yukarı Yuvarla (Ceil): " + Math.ceil(4.2));
        System.out.println("Aşağı Yuvarla (Floor): " + Math.floor(4.9));

        // Rastgele Sayı
        System.out.println("Rastgele Sayı (0-100): " + (int)(Math.random() * 100));

        // Trigonometri
        System.out.println("Sinüs: " + Math.sin(Math.toRadians(90)));
        System.out.println("Kosinüs: " + Math.cos(Math.toRadians(0)));

        // Matematiksel Sabitler
        System.out.println("PI Sayısı: " + Math.PI);
    }
}
```

---

# **Sonuç**
- **Java Math sınıfı**, temel ve ileri matematik işlemlerini hızlı ve optimize bir şekilde yapar.
- **Math metotları `static` olduğu için nesne oluşturmaya gerek yoktur.**
- **Yuvarlama, üstel işlemler, logaritma, trigonometrik fonksiyonlar gibi birçok fonksiyon içerir.**

🚀 **Java'da matematik işlemleri için `Math` sınıfını öğrenmek, sayısal işlemleri hızlı ve verimli yapmanızı sağlar!** 🚀


## Java Core
```sh 

```
---

### **Java Core Escape (Kaçış Dizileri) Nedir?**
Java'da **escape sequences (kaçış dizileri)**, özel karakterleri String içinde kullanmamızı sağlayan ters eğik çizgi (`\`) ile başlayan özel karakterlerdir. Normalde doğrudan yazılamayan karakterleri temsil ederler.

💡 **Örneğin:**
- `"` çift tırnak işareti bir String içinde doğrudan yazılamaz. (`"Bu bir "örnek" metin"`) → Hatalı
- Çözüm: `\"` kaçış dizisi kullanılır. (`"Bu bir \"örnek\" metin"`) → Doğru

---

## **Java'daki Kaçış Dizileri (Escape Sequences)**
| **Kaçış Dizisi** | **Anlamı** | **Örnek Kullanımı** |
|----------------|----------|----------------|
| `\n` | Yeni satır (Newline) | `"Satır 1\nSatır 2"` |
| `\t` | Sekme (Tab) | `"İsim:\tMehmet"` |
| `\'` | Tek tırnak (Single quote) | `char c = '\'';` |
| `\"` | Çift tırnak (Double quote) | `"Bu bir \"örnek\" metin"` |
| `\\` | Ters eğik çizgi (Backslash) | `"C:\\Users\\Documents"` |
| `\r` | Satır başı (Carriage return) | `"Merhaba\rDünya"` |
| `\b` | Geri al (Backspace) | `"ABC\bD"` (Sonuç: "ABD") |
| `\f` | Form feed (Sayfa sonu) | `"Sayfa sonu\fYeni Sayfa"` |
| `\uXXXX` | Unicode karakteri | `"\u00E7"` (ç harfi) |

---

## **Kaçış Dizileriyle Örnekler**
### **1. `\n` → Yeni Satır**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya!\nBu bir alt satıra geçti.");
    }
}
```
**Çıktı:**
```
Merhaba Dünya!
Bu bir alt satıra geçti.
```

---

### **2. `\t` → Sekme (Tab)**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("İsim:\tAhmet");
        System.out.println("Soyisim:\tYılmaz");
    }
}
```
**Çıktı:**
```
İsim:     Ahmet
Soyisim:  Yılmaz
```

---

### **3. `\'` ve `\"` → Tek ve Çift Tırnak**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Bu bir \"Java\" programıdır.");
        System.out.println("Tek tırnak: \'A\' karakteri");
    }
}
```
**Çıktı:**
```
Bu bir "Java" programıdır.
Tek tırnak: 'A' karakteri
```

---

### **4. `\\` → Ters Eğik Çizgi**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Dosya yolu: C:\\Users\\Documents\\file.txt");
    }
}
```
**Çıktı:**
```
Dosya yolu: C:\Users\Documents\file.txt
```

---

### **5. `\r` → Satır Başı**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Merhaba\rDünya!");
    }
}
```
**Çıktı (bazı sistemlerde farklı olabilir):**
```
Dünya!
```
📌 `\r`, satır başına döner ve **"Dünya!"**, "Merhaba"nın üzerine yazılır.

---

### **6. `\b` → Geri Al (Backspace)**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("ABC\bD");
    }
}
```
**Çıktı:**
```
ABD
```
📌 `\b` ifadesi, **son karakteri siler**. `"ABC\bD"` → `C` silinir, sonuç `"ABD"` olur.

---

### **7. `\f` → Form Feed (Sayfa Sonu)**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Sayfa sonu\fYeni Sayfa");
    }
}
```
📌 Çoğu modern sistemde görünmezdir ama yazıcı ve eski terminallerde **sayfa sonu karakteri** olarak kullanılır.

---

### **8. `\uXXXX` → Unicode Kullanımı**
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Türkçe karakter: \u00E7, \u011F, \u015F");
    }
}
```
**Çıktı:**
```
Türkçe karakter: ç, ğ, ş
```
📌 **Unicode** ile tüm dillerde özel karakterler kullanılabilir.

---

## **Sonuç**
- Java'da **kaçış dizileri**, String içinde özel karakterleri kullanmamızı sağlar.
- En sık kullanılanlar: `\n` (yeni satır), `\t` (sekme), `\"` (çift tırnak), `\\` (ters eğik çizgi).
- **Gelişmiş kullanım:** Unicode (`\uXXXX`) ile özel karakterleri String içinde yazabiliriz.

📌 **Özetle:** Eğer bir metin içinde özel karakterler yazmak istiyorsanız, **escape sequences** kullanmanız gereklidir! 🚀


# **Java Scanner Sınıfı (java.util.Scanner) – Detaylı Açıklama**
## **1. Scanner Nedir?**
**Scanner**, Java’da **kullanıcıdan giriş almak**, **dosyalardan veri okumak** ve **stringleri ayrıştırmak (parsing)** için kullanılan bir sınıftır. **java.util.Scanner** paketinde bulunur.

Java’da veri girişlerini almak için **System.in (klavyeden giriş), dosyalardan okuma (File), Stringlerden okuma** gibi işlemler için kullanılır.

---

## **2. Scanner Sınıfının Kullanım Alanları**
| **Kullanım Alanı** | **Açıklama** |
|-----------------|--------------|
| **Kullanıcıdan veri almak** | `Scanner` ile klavyeden giriş alabiliriz. |
| **Dosya okumak** | Dosyalardan satır satır veya kelime kelime veri okuyabiliriz. |
| **String parçalama** | String ifadeleri belirli bir ayraç ile bölebiliriz. |
| **Veri türlerine dönüştürme** | String değerleri `int`, `double`, `boolean` gibi tiplere çevirebiliriz. |

---

## **3. Scanner Sınıfının Import Edilmesi**
Scanner sınıfı **java.util** paketinde bulunduğu için kullanmadan önce **import edilmesi gerekir**:

```java
import java.util.Scanner;
```

💡 **Eğer `import java.util.Scanner;` yazmazsak, Java bu sınıfı tanımaz ve hata verir!**

---

## **4. Scanner ile Kullanıcıdan Veri Alma**
Scanner sınıfı ile **farklı türlerde** veri alabiliriz:

### **4.1. String Veri Okuma (`next()` ve `nextLine()`)**
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.next();  // Tek kelime okur

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.next();  // Tek kelime okur

        System.out.print("Cümlenizi girin: ");
        scanner.nextLine(); // Önceki enter'ı temizler
        String cumle = scanner.nextLine(); // Bütün satırı okur

        System.out.println("Adınız: " + ad);
        System.out.println("Soyadınız: " + soyad);
        System.out.println("Girdiğiniz cümle: " + cumle);

        scanner.close();
    }
}
```
### **Farklar:**
| **Metot** | **Açıklama** |
|----------|--------------|
| `next()` | **Tek bir kelime** okur. Boşluk görünce okuma işlemi durur. |
| `nextLine()` | **Bütün satırı** okur. Enter tuşuna basılana kadar bekler. |

💡 **Not:** `nextLine()` kullanmadan önce `next()` veya `nextInt()` gibi metotlar çalıştırılırsa, enter karakterini temizlemek için bir `scanner.nextLine();` satırı eklenmelidir.

---

### **4.2. Sayısal Veri Okuma (`nextInt()`, `nextDouble()`, `nextFloat()`, `nextLong()`)**
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Boyunuzu girin: ");
        double boy = scanner.nextDouble();

        System.out.print("Ağırlığınızı girin: ");
        float agirlik = scanner.nextFloat();

        System.out.println("Yaşınız: " + yas);
        System.out.println("Boyunuz: " + boy);
        System.out.println("Kilonuz: " + agirlik);

        scanner.close();
    }
}
```

### **Metotlar ve Veri Türleri**
| **Metot** | **Aldığı Veri Türü** |
|---------|--------------|
| `nextInt()` | `int` (Tamsayı) |
| `nextDouble()` | `double` (Ondalıklı sayı) |
| `nextFloat()` | `float` (Küçük ondalıklı sayı) |
| `nextLong()` | `long` (Büyük tamsayı) |
| `nextShort()` | `short` (Küçük tamsayı) |
| `nextByte()` | `byte` (Çok küçük tamsayı) |
| `nextBoolean()` | `boolean` (true/false) |

📌 **Dikkat:** Kullanıcı eğer yanlış türde giriş yaparsa (`nextInt()` beklerken `a` girerse), hata (`InputMismatchException`) oluşur.

---

## **5. Scanner ile Dosya Okuma**
Scanner sınıfı sadece **klavyeden giriş almak için değil**, **dosyalardan veri okumak için de** kullanılır.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) {
        try {
            File file = new File("veri.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                System.out.println(satir);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı!");
        }
    }
}
```
### **Açıklamalar:**
- `new File("veri.txt")` → `"veri.txt"` dosyasını açar.
- `hasNextLine()` → **Dosyada satır kaldığı sürece okumaya devam eder.**
- `nextLine()` → **Satır satır okur.**
- **Dosya yoksa** `FileNotFoundException` fırlatılır.

---

## **6. Scanner ile Belirli Bir Ayraca Göre String Parçalama**
Scanner, **virgül, boşluk veya özel karakterlere** göre string parçalamak için kullanılabilir.

```java
import java.util.Scanner;

public class ScannerDelimiterExample {
    public static void main(String[] args) {
        String veri = "Ahmet,Mehmet,Ayşe,Fatma";
        Scanner scanner = new Scanner(veri);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}
```
### **Çıktı:**
```
Ahmet
Mehmet
Ayşe
Fatma
```

📌 **Özet:** `scanner.useDelimiter(",")` ile **virgülü** ayırıcı olarak belirledik.

---

## **7. Scanner’ın Kapatılması (`close()`)**
Scanner nesnesi **kullanıldıktan sonra kapatılmalıdır**, aksi halde kaynak sızıntısı olabilir.

```java
scanner.close();
```

💡 **Eğer Scanner kapatılmazsa, bellek sızıntısına neden olabilir!**

---

## **8. Scanner ile Kullanıcıdan Tekrar Tekrar Veri Alma**
Eğer kullanıcıdan **sürekli giriş almak** istiyorsak, bir **döngü** kullanabiliriz.

```java
import java.util.Scanner;

public class ScannerLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Bir sayı girin (Çıkış için -1): ");
            int sayi = scanner.nextInt();
            
            if (sayi == -1) {
                System.out.println("Çıkış yapıldı.");
                break;
            }
            
            System.out.println("Girdiğiniz sayı: " + sayi);
        }

        scanner.close();
    }
}
```
📌 **Kullanıcı `-1` girene kadar veri girişi yapabilir.**

---

## **9. Özet**
- **Scanner**, **kullanıcıdan veri almak**, **dosya okumak**, **stringleri ayrıştırmak** için kullanılır.
- `nextInt()`, `nextDouble()`, `nextLine()`, `next()` gibi metotlarla farklı veri türleri okunabilir.
- **Dosyalardan veri okumak için** `Scanner(File file)` kullanılabilir.
- **Belirli bir karaktere göre bölmek için** `useDelimiter()` kullanılabilir.
- **Kaynak sızıntısını önlemek için** `scanner.close();` ile kapatılmalıdır.

🚀 **Scanner, Java'da veri almak için en yaygın kullanılan sınıflardan biridir!**


# **Java Wrapper Type Nedir? – Detaylı Açıklama**

## **1. Wrapper Type (Sarmalayıcı Tür) Nedir?**
Java'da **Wrapper Type**, **primitive type (ilkel veri türleri)** ile çalışırken nesneye (Object) ihtiyaç duyduğumuz durumlarda kullanılan **sarmalayıcı (wrapper) sınıflardır**.

### **Neden Wrapper Type Kullanılır?**
Java’daki **primitive veri türleri (`int`, `double`, `boolean` vb.) nesne değildir.** Ancak, Java’da birçok yapı (Koleksiyonlar `List`, `Set`, `Map` vb.) **nesnelerle çalışır**. Bu nedenle **primitive türleri nesnelere dönüştürmek için** Wrapper Type kullanılır.

**Örnek:**
```java
int x = 10;          // Primitive type
Integer y = 10;      // Wrapper type (Nesne)
```
Burada:
- `x` bir **primitive** int türüdür.
- `y` ise **Integer sınıfından bir nesnedir**.

---

## **2. Primitive Type ve Wrapper Type Karşılaştırması**
| **Primitive Type** | **Karşılık Gelen Wrapper Type** |
|-------------------|--------------------------------|
| `byte`           | `Byte`                         |
| `short`          | `Short`                        |
| `int`            | `Integer`                      |
| `long`           | `Long`                         |
| `float`          | `Float`                        |
| `double`         | `Double`                       |
| `char`           | `Character`                    |
| `boolean`        | `Boolean`                      |

💡 **Wrapper sınıflar, primitive türlerin büyük harfle başlayan ve nesne olarak kullanılabilen versiyonlarıdır.**

---

## **3. Wrapper Type Kullanımı**
Wrapper sınıfları genellikle **koleksiyonlarla çalışma, null değer atama, veri türleri arasında dönüşüm yapma** gibi işlemler için kullanılır.

### **Örnek Kullanım:**
```java
import java.util.ArrayList;
import java.util.List;

public class WrapperExample {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);  // int → Integer (Autoboxing)
        sayilar.add(20);
        System.out.println(sayilar); // [10, 20]
    }
}
```
📌 **List<int> kullanılamaz!** Java Koleksiyonları nesnelerle çalıştığından, **List<Integer>** kullanmalıyız.

---

## **4. Autoboxing ve Unboxing**
Java 5 ile gelen **Autoboxing ve Unboxing**, primitive türler ile Wrapper türler arasında **otomatik dönüşüm sağlar**.

### **4.1. Autoboxing (Primitive → Wrapper)**
Java, **primitive türleri otomatik olarak nesneye çevirir**.

```java
public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing (int → Integer)

        System.out.println(wrapperValue); // 100
    }
}
```
**Arka planda şuna dönüşür:**
```java
Integer wrapperValue = Integer.valueOf(primitiveValue);
```

---

### **4.2. Unboxing (Wrapper → Primitive)**
Wrapper türleri, **otomatik olarak primitive türlerine dönüştürülür**.

```java
public class UnboxingExample {
    public static void main(String[] args) {
        Integer wrapperValue = 200;
        int primitiveValue = wrapperValue; // Unboxing (Integer → int)

        System.out.println(primitiveValue); // 200
    }
}
```
**Arka planda şuna dönüşür:**
```java
int primitiveValue = wrapperValue.intValue();
```

---

## **5. Wrapper Type Metotları**
Wrapper sınıfları, **primitive türlerde olmayan bazı metotlara sahiptir**.

### **5.1. `valueOf()` – Primitive’den Wrapper’a Dönüştürme**
```java
Integer intObj = Integer.valueOf(10);
Double doubleObj = Double.valueOf(5.5);
Boolean boolObj = Boolean.valueOf(true);

System.out.println(intObj);   // 10
System.out.println(doubleObj); // 5.5
System.out.println(boolObj);  // true
```

---

### **5.2. `xxxValue()` – Wrapper’dan Primitive’e Dönüştürme**
```java
Integer intObj = Integer.valueOf(100);
int primitiveInt = intObj.intValue(); // Wrapper → Primitive

Double doubleObj = Double.valueOf(55.5);
double primitiveDouble = doubleObj.doubleValue(); // Wrapper → Primitive

System.out.println(primitiveInt);  // 100
System.out.println(primitiveDouble); // 55.5
```

---

### **5.3. `parseXXX()` – String’den Primitive’e Dönüştürme**
```java
int sayi = Integer.parseInt("123");
double ondalik = Double.parseDouble("12.34");
boolean dogruMu = Boolean.parseBoolean("true");

System.out.println(sayi);      // 123
System.out.println(ondalik);   // 12.34
System.out.println(dogruMu);   // true
```
📌 **Eğer String geçersizse `NumberFormatException` hatası alınır!**

---

### **5.4. `toString()` – Primitive’den String’e Dönüştürme**
```java
int sayi = 456;
String str = Integer.toString(sayi);
System.out.println(str); // "456"
```

Aynı işlem `String.valueOf()` ile de yapılabilir:
```java
String str2 = String.valueOf(sayi);
System.out.println(str2); // "456"
```

---

## **6. Wrapper Type Kullanım Senaryoları**
| **Senaryo** | **Primitive Kullanımı** | **Wrapper Kullanımı** |
|------------|--------------------|--------------------|
| **Performans & Bellek** | ✅ Daha hızlı, az bellek kullanır. | ❌ Daha fazla bellek kullanır. |
| **Koleksiyonlarla Kullanım** | ❌ Kullanılamaz. (`List<int>` hata verir) | ✅ Kullanılabilir. (`List<Integer>`) |
| **Null Değer Atama** | ❌ Mümkün değil. | ✅ Mümkün (`Integer x = null;`) |
| **Metot Kullanımı** | ❌ Metotları yoktur. | ✅ `valueOf()`, `parseInt()` gibi metotlar içerir. |
| **Generics (Jenerik Türler)** | ❌ Kullanılamaz (`T extends int` olmaz). | ✅ Kullanılabilir (`T extends Number`). |

---

## **7. Ne Zaman Hangi Tür Kullanılmalı?**
- **Performans ve bellek önemliyse → `primitive type` kullanın.**
- **Koleksiyonlar ve nesne yönelimli programlama gerekiyorsa → `wrapper type` kullanın.**
- **Null değeri gerekliyse → `wrapper type` kullanın.**
- **Matematiksel hesaplamalar için → `primitive type` daha hızlıdır.**

---

## **8. Özet**
| **Özellik** | **Primitive Type** | **Wrapper Type** |
|------------|----------------|----------------|
| **Bellek Kullanımı** | Az bellek tüketir. | Daha fazla bellek tüketir. |
| **Hız** | Daha hızlıdır. | Daha yavaştır. |
| **Null Değer** | ❌ Null olamaz. | ✅ Null olabilir. |
| **Nesne mi?** | ❌ Hayır. | ✅ Evet. |
| **Metotları Var mı?** | ❌ Hayır. | ✅ `parseInt()`, `valueOf()` gibi metotları vardır. |
| **Koleksiyonlarla Kullanılabilir mi?** | ❌ Hayır. | ✅ Evet. |

📌 **Özetle:** **Wrapper Type**, nesne yönelimli programlama ve koleksiyonlarla çalışırken kullanılır. Ancak, **performans ve bellek yönetimi açısından primitive type daha avantajlıdır**.

💡 **Soru:** `List<int> list = new ArrayList<>();` neden hata verir?
📌 **Cevap:** Java koleksiyonları nesne tutar. `int` bir nesne değildir, bu yüzden **`List<Integer>`** kullanmalıyız. 🚀
