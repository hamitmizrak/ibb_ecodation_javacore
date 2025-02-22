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


## Primitive Types
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


## Primitive type - Wrapper Type
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

## Wrapper new kullanımı()
```sh 

```
---
Eğer **wrapper sınıflarını** `new` anahtar kelimesiyle oluşturmak istiyorsak, her bir primitive türünün **wrapper sınıfını** kullanarak aşağıdaki gibi yazabiliriz:

```java
public class WrapperExample {
    public static void main(String[] args) {
        Byte wrapperTypeByte = new Byte((byte) 127);
        wrapperTypeByte = null; // Wrapper sınıflar null alabilir
        System.out.println(wrapperTypeByte);

        Short wrapperTypeShort = new Short((short) 32767);
        Integer wrapperTypeInt = new Integer(2147483647);
        Long wrapperTypeLong = new Long(9223372036854775807L);

        Float wrapperTypeFloat = new Float(14.23f);
        Double wrapperTypeDouble = new Double(14.23);

        Boolean wrapperTypeBoolean = new Boolean(true);
        Character wrapperTypeChar = new Character('a');

        System.out.println("Short: " + wrapperTypeShort);
        System.out.println("Integer: " + wrapperTypeInt);
        System.out.println("Long: " + wrapperTypeLong);
        System.out.println("Float: " + wrapperTypeFloat);
        System.out.println("Double: " + wrapperTypeDouble);
        System.out.println("Boolean: " + wrapperTypeBoolean);
        System.out.println("Character: " + wrapperTypeChar);
    }
}
```

### **Önemli Notlar**
1. **Java 9 ve Sonrasında `new` Kullanımı Önerilmez**
    - Java 9'dan itibaren `new Byte()`, `new Integer()` gibi kullanımlar **depreceated (kullanım dışı)** olarak işaretlenmiştir.
    - Bunun yerine **doğrudan atama** yapılmalıdır:
      ```java
      Byte wrapperTypeByte = 127;  // Önerilen kullanım
      ```
    - **Çünkü:** Java **autoboxing** mekanizması sayesinde `new` kullanmadan da bu türleri otomatik olarak wrapper class'lara çevirebilir.

2. **Performans ve Bellek Yönetimi**
    - `new` kullanımı **gereksiz nesne oluşturduğu için heap belleği gereksiz yere doldurur**.
    - Örneğin:
      ```java
      Integer a = 100;  // Autoboxing (Önerilen kullanım)
      Integer b = new Integer(100); // Heap bellekte yeni nesne oluşturur
      ```
    - **`new Integer(100)` kullanırsanız heap’te yeni bir nesne oluşturulur ve gereksiz hafıza tüketilir.**

### **Sonuç**
- **Eğer eski sürümlerle çalışmıyorsanız** ve özel bir nedeniniz yoksa, `new` kullanmadan **autoboxing** yöntemini tercih etmelisiniz.
- **Java 9+ ile çalışıyorsanız**, `new` kullanmaktan kaçının ve doğrudan atamaları kullanın. 🚀

## Stack Memory(Primitive) Heap Memory Memory()
```sh 

```
---
### **Java'da Primitive Stack Hafıza ve Wrapper Heap Hafıza Arasındaki Farklar**

Java'da **primitive veri tipleri** (**int, double, boolean, char, float, long, short, byte**) ve **wrapper sınıfları** (**Integer, Double, Boolean, Character, Float, Long, Short, Byte**) bellek yönetimi açısından farklı yerlerde saklanır. Bu iki veri tipi arasındaki en büyük fark, **stack ve heap bellek yönetimi** ile ilgilidir. Şimdi bu farkları **çok detaylı** şekilde inceleyelim.

---

## **1. Stack ve Heap Hafızasının Tanımı**
Java bellek yönetiminde **iki temel bölge** vardır:
- **Stack (Yığın Hafıza):** Küçük, hızlı ve yönetimi kolaydır. **Primitive veri tipleri burada saklanır.**
- **Heap (Yığın Hafıza):** Daha büyük, daha yavaş ama esnek bir yapıya sahiptir. **Wrapper sınıfları (nesne olarak kullanılan veriler) burada saklanır.**

---

## **2. Stack ve Heap Hafızasının Karşılaştırılması**

| **Özellik**        | **Stack (Yığın Hafıza)** | **Heap (Yığın Hafıza)** |
|--------------------|-----------------------|-----------------------|
| **Saklanan Veri Tipleri** | Primitive değişkenler (`int, double, char`) | Nesneler ve Wrapper sınıfları (`Integer, Double, Character`) |
| **Bellek Yönetimi** | LIFO (Last In First Out – Son giren, ilk çıkar) | Garbage Collector tarafından yönetilir |
| **Hız** | Çok hızlı | Görece daha yavaş |
| **Erişim Süresi** | Stack değişkenlerine erişim **daha hızlıdır** | Heap değişkenlerine erişim **daha yavaştır** |
| **Ömür** | Bir metodun çalışma süresi boyunca var olur | Program çalıştığı sürece var olabilir |
| **Bellek Alanı** | Küçüktür | Daha büyüktür |
| **Çoklu Thread Kullanımı** | Thread'e özeldir (Her thread'in kendi stack’i vardır) | Heap bellek **tüm thread’ler tarafından paylaşılır** |
| **Otomatik Temizleme** | Otomatik temizlenir, Garbage Collector çalışmasına gerek yoktur | Garbage Collector tarafından yönetilir, bellek temizliği gerektiğinde yapılır |

---

## **3. Primitive ve Wrapper Arasındaki Bellek Kullanım Farkı**

### **A) Primitive Veri Tipleri (Stack)**
Primitive veri tipleri **hafızada doğrudan değer olarak saklanır**. Örneğin:

```java
int x = 10;
```
- `x` değişkeni **stack hafızada** saklanır.
- Stack, değişkenleri hızlı bir şekilde yönetir ve **fonksiyon bittiğinde** otomatik olarak temizler.

Stack'teki bellek organizasyonu şu şekildedir:

```
Stack Memory:
+----------------------+
| int x = 10          |
+----------------------+
```

---

### **B) Wrapper Sınıfları (Heap)**
Eğer primitive yerine bir **wrapper class** (nesne) kullanırsak:

```java
Integer y = new Integer(10);
```

Bu durumda, bellek yapısı şu şekilde olur:
- `y` değişkeni **stack içinde bir referans** olarak saklanır.
- `new Integer(10)` ifadesiyle oluşturulan nesne **heap hafızada** saklanır.
- Heap’te saklanan nesneye erişmek için stack’te bir referans (adres) tutulur.

```
Stack Memory:
+----------------------+
| Integer y (ref: 0xA) |
+----------------------+

Heap Memory:
+----------------------+
| [Integer: 10] (0xA) |
+----------------------+
```

Yani, **primitive bir değişken doğrudan değeri içerirken**, wrapper class'lar **referansları saklar ve asıl veri heap içinde tutulur**.

---

## **4. Detaylı Örnek: Stack ve Heap Karşılaştırması**

Şimdi stack ve heap farkını anlamak için aşağıdaki kodu inceleyelim:

```java
public class MemoryTest {
    public static void main(String[] args) {
        int a = 5;
        Integer b = new Integer(5);
        
        modify(a, b);
        
        System.out.println("a: " + a);  // 5
        System.out.println("b: " + b);  // 5
    }
    
    public static void modify(int x, Integer y) {
        x = 10;       // Stack içindeki x değişir
        y = new Integer(10); // Yeni bir nesne oluşturulur (Heap)
    }
}
```

### **Kod Çalışma Mantığı**
1. `int a = 5;`  → **Stack'te doğrudan 5 değeri saklanır.**
2. `Integer b = new Integer(5);`  → **Heap’te yeni bir Integer nesnesi oluşturulur. Stack'te referansı tutulur.**
3. `modify(a, b);` metoduna çağrılırken:
    - `x` → yeni bir stack değişkeni olarak **5 değerini kopyalar** (pass by value).
    - `y` → referans olarak **yeni bir Integer nesnesi alır**.
4. `x = 10;` → **Stack içinde yeni bir değişken oluşturulur ve değer değiştirilir.**
5. `y = new Integer(10);` → **Heap’te yeni bir Integer nesnesi oluşturulur, ancak bu `modify` metodu içinde kalır ve main metodundaki `b` değişkenini etkilemez.**
6. `main` metodu bittiğinde, `a` hâlâ `5`, `b` hâlâ `5` olarak kalır.

Bu durum, **primitive’lerin değiştirilememesi (pass-by-value) ve wrapper nesnelerinin yeni bir nesne oluşturduğunda eski referanslarını kaybetmesi nedeniyle** oluşur.

---

## **5. Wrapper Sınıfları ve Otomatik Boxing / Unboxing**
Java, primitive ve wrapper sınıfları arasında otomatik dönüşüm sağlar. Buna **Autoboxing ve Unboxing** denir.

### **Autoboxing (Primitive → Wrapper)**
```java
int primitiveValue = 100;
Integer wrapperValue = primitiveValue; // Autoboxing
```
- Burada **`primitiveValue`**, otomatik olarak `Integer` nesnesine dönüştürülür ve heap’te saklanır.

### **Unboxing (Wrapper → Primitive)**
```java
Integer wrapperValue = 200;
int primitiveValue = wrapperValue; // Unboxing
```
- `wrapperValue`, heap’ten alınıp stack’te saklanan `primitiveValue` değişkenine atanır.

Bu dönüşümler bazı **performans kayıplarına** neden olabilir, çünkü primitive tiplerde heap erişimi olmadığı için daha hızlı işlem yapılır.

---

## **6. Ne Zaman Primitive, Ne Zaman Wrapper Kullanmalıyız?**
| Kullanım Durumu | Primitive Kullan (Stack) | Wrapper Kullan (Heap) |
|----------------|------------------------|----------------------|
| **Hafıza Verimliliği** | ✅ | ❌ (Heap daha fazla bellek kullanır) |
| **Performans (Hızlı Erişim)** | ✅ | ❌ (Heap erişimi daha yavaş) |
| **Nesne Odaklı Programlama (OOP)** | ❌ | ✅ (Nesne özellikleri ile kullanılabilir) |
| **Nullable Değerler (Null Atama)** | ❌ | ✅ (Primitive null olamaz, wrapper olabilir) |
| **Collection (List, Set, Map)** | ❌ | ✅ (Primitive veri tipleri Collection ile kullanılamaz) |

Eğer **hafıza ve hız önemliyse**, **primitive tipleri** kullanmalıyız.  
Eğer **nesne tabanlı programlama, null değeri saklama veya koleksiyonlar (List, Set, Map) ile çalışma gerekiyorsa**, **wrapper sınıfları** kullanmalıyız.

---

## **Sonuç**
- **Primitive değişkenler stack hafızada tutulur, doğrudan değeri içerir ve daha hızlıdır.**
- **Wrapper sınıfları heap hafızada saklanır, referans üzerinden erişilir ve daha fazla bellek kullanır.**
- **Otomatik Boxing/Unboxing sayesinde dönüşümler mümkündür, ancak performansa dikkat edilmelidir.**

Bu bilgiler doğrultusunda, projenin gereksinimlerine göre en uygun bellek kullanım stratejisini belirlemek gerekir. 🚀

## Wrapper new kullanımı
```sh 
Short wrapperTypeShort = new Short((short) 32767); 
bununla Short wrapperTypeShort 2=32767 arasındaki far nedir ?
```
---

Java'da aşağıdaki iki satır arasındaki farkı inceleyelim:

```java
Short wrapperTypeShort1 = new Short((short) 32767); // 1. Yöntem (Explicit Object Creation - new kullanımı)
Short wrapperTypeShort2 = 32767; // 2. Yöntem (Autoboxing)
```

Bu iki yaklaşımın arasındaki temel farklar şunlardır:

---

## **1. `new Short((short) 32767)` Kullanımı (Heap Bellekte Yeni Nesne Oluşturur)**
```java
Short wrapperTypeShort1 = new Short((short) 32767);
```
- `new` anahtar kelimesi kullanıldığı için **her çağrıldığında yeni bir nesne oluşturulur**.
- **Heap bellekte ayrı bir nesne** oluşturılır.
- **Garbage Collector (GC)** tarafından temizlenmesi gerekir.
- **Bellek tüketimi ve performans açısından dezavantajlıdır.**
- **`==` operatörü ile karşılaştırıldığında farklı nesneler olduğu için false dönebilir.**
- Java 9 ve sonraki sürümlerde bu yöntem **depreceated (kullanım dışı)** hale gelmiştir.

---

## **2. `Short wrapperTypeShort2 = 32767;` Kullanımı (Autoboxing - Cached Object Kullanımı)**
```java
Short wrapperTypeShort2 = 32767;
```
- **Autoboxing** sayesinde primitive `short` değeri otomatik olarak `Short` nesnesine dönüştürülür.
- **Java'nın Integer ve Short için cache mekanizmasını kullanır.**
- Küçük sayı aralıklarında (`-128` ile `127` arasında) **önbellekten (cache) alınan nesneleri kullanabilir.**
- **Daha performanslıdır**, çünkü her seferinde yeni bir nesne oluşturmaz.

---

## **Farklılıkların Kanıtı: Karşılaştırma Testi**
Aşağıdaki kodu çalıştırarak farkı gözlemleyebiliriz:

```java
public class ShortComparison {
    public static void main(String[] args) {
        Short wrapperTypeShort1 = new Short((short) 127);
        Short wrapperTypeShort2 = 127; // Autoboxing
        
        Short wrapperTypeShort3 = new Short((short) 127);
        Short wrapperTypeShort4 = 127; // Autoboxing
        
        System.out.println(wrapperTypeShort1 == wrapperTypeShort3); // false (Heap'te farklı nesneler)
        System.out.println(wrapperTypeShort2 == wrapperTypeShort4); // true (Cache mekanizması sayesinde aynı nesne)
        
        Short wrapperTypeShort5 = 32767;
        Short wrapperTypeShort6 = 32767;

        System.out.println(wrapperTypeShort5 == wrapperTypeShort6); // false (Çünkü cache dışında)
    }
}
```

---

## **Sonuçlar**
1. **Eğer `new` kullanırsanız**, heap bellekte **yeni bir nesne** oluşur ve `==` operatörü farklı nesneler döndürdüğü için `false` olur.
2. **Eğer `Short wrapperTypeShort2 = 32767;` şeklinde yazarsanız**, Java **autoboxing kullanır**.
3. **Java `-128` ile `127` arasındaki değerleri cache olarak tuttuğu için** bu aralıkta `==` karşılaştırması true dönebilir. Ancak `32767` gibi büyük değerler cache dışında olduğu için farklı nesneler oluşturulur.

---

## **Hangi Kullanımı Tercih Etmeliyiz?**
✔ **Performans açısından `Short wrapperTypeShort = 32767;` (Autoboxing) tercih edilmelidir.**  
❌ **`new Short((short) 32767)` kullanımı gereksiz bellek tüketimine neden olur ve önerilmez.**

Bu yüzden **`new` ile nesne oluşturmaktan kaçınılmalı ve autoboxing kullanımı tercih edilmelidir.** 🚀

## Java Life-Cycles
```sh 

```
---
### **Java'da Compiler mı Önce, Interpreter mı?**
Java programlarının çalışma süreci **hem compiler (derleyici) hem de interpreter (yorumlayıcı)** içerir, ancak **önce compiler çalışır, sonra interpreter devreye girer**.

1. **Compiler (Derleyici) İlk Çalışır:**
    - Java kaynak kodu (`.java` dosyaları) **Javac (Java Compiler)** tarafından **Bytecode**’a (`.class` dosyaları) dönüştürülür.
    - Bytecode **işletim sistemine bağımsızdır**, yani her ortamda çalışabilir.

2. **Interpreter (Yorumlayıcı) Sonra Çalışır:**
    - **Java Virtual Machine (JVM)**, Bytecode’u alır ve **Just-In-Time (JIT) Compiler** ile çalıştırılabilir makine koduna dönüştürür.
    - JVM, Bytecode'u **satır satır yorumlar ve çalıştırır**.

### **Java Programının Life-Cycle (Yaşam Döngüsü)**
Java'daki bir programın baştan sona yaşam döngüsünü adım adım açıklayalım:

---

## **1. Yazılım Aşaması (Source Code - `.java` Dosyası)**
Geliştirici, **Java kaynak kodunu** (`.java` dosyalarını) yazar.  
Örneğin:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

## **2. Compilation (Derleme) Aşaması**
Java **compiler** (`javac`), kaynak kodunu **Bytecode**’a çevirir.

### **Bu aşamada şunlar olur:**
- **Syntax kontrolü yapılır:** Derleyici (`javac`), kodun sözdizimi hatalarını kontrol eder.
- **Optimizasyon yapılır:** Kod en verimli hale getirilir.
- **Bytecode üretilir:** **Makineye bağımsız** `.class` dosyası oluşturulur.

### **Kompilasyon (Derleme) Komutu:**
```sh
javac HelloWorld.java
```

Bu komut sonucunda, aşağıdaki dosya oluşur:

```
HelloWorld.class
```

Bu `.class` dosyası **Java Bytecode** içerir.

---

## **3. ClassLoader Aşaması**
Java **ClassLoader**, `.class` dosyalarını JVM’ye yükler.

- **Bootstrap ClassLoader:** Java’nın temel sınıflarını (`java.lang.*`) yükler.
- **Extensions ClassLoader:** Ekstra kütüphaneleri (`lib/ext` dizinindekileri) yükler.
- **Application ClassLoader:** Kullanıcının kendi yazdığı sınıfları yükler.

---

## **4. Bytecode Verification (Bytecode Doğrulama)**
- **JVM, Bytecode’un güvenliğini kontrol eder.**
- **Hatalı veya zararlı kodların çalışmasını önler.**
- **Bellek aşımı veya yasadışı bellek erişimlerini engeller.**

---

## **5. Interpreter (Yorumlayıcı) Aşaması**
- **Java Interpreter**, Bytecode’u **satır satır okur ve çalıştırır**.
- Ancak, **sürekli yorumlama yavaş olabilir**, bu yüzden **JIT (Just-In-Time) Compiler** devreye girer.

---

## **6. Just-In-Time (JIT) Compiler Aşaması**
- JIT Compiler, **tekrar eden kodları alır ve doğrudan makine koduna çevirir**.
- **JVM’nin performansını artırır**, çünkü aynı kodun sürekli yorumlanmasını önler.

---

## **7. Runtime (Çalışma Zamanı)**
- **Garbage Collector (GC):** Kullanılmayan nesneleri bellekten temizler.
- **Thread Management:** Çoklu işlemler arasında zamanlamayı yönetir.
- **Exception Handling:** Çalışma sırasında oluşan hataları yakalar.

---

## **8. Programın Çıkışı**
Eğer her şey doğru giderse, programın çıktısı ekrana yazdırılır:

```sh
Hello, World!
```

---

### **Genel Özet: Java Çalışma Döngüsü**
1. **Source Code (`.java`) yazılır.**
2. **Java Compiler (`javac`) kodu Bytecode (`.class`) haline getirir.**
3. **ClassLoader**, `.class` dosyasını JVM’ye yükler.
4. **Bytecode Verification** aşaması güvenlik kontrolü yapar.
5. **Interpreter**, Bytecode’u **satır satır yorumlar** ve çalıştırır.
6. **JIT Compiler**, sık kullanılan kodları **makine koduna** çevirir (performans artırır).
7. **Garbage Collector**, kullanılmayan bellekleri temizler.
8. **Program sonucu ekrana yazdırılır.**

---

### **Compiler vs. Interpreter: Hangisi Önce?**
✅ **Önce Compiler (`javac`) çalışır → Sonra Interpreter (`JVM`) çalışır.**  
🚀 **Sonuç:** Java hem **compiled** (derlenen) hem de **interpreted** (yorumlanan) bir dildir.


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


## Cast-1
```sh 

```
---
# **📌 Java'da Cast (Tür Dönüştürme) Nedir? (Detaylı Açıklama)**

## **🔹 1. Cast (Tür Dönüştürme) Nedir?**
Java'da **Cast (Tür Dönüştürme)**, bir değişkenin veya nesnenin **bir veri tipinden başka bir veri tipine dönüştürülmesi işlemidir**.

Tür dönüştürme (casting) **iki ana kategoriye ayrılır:**
1. **Primitive (İlkel) Türler Arasında Dönüştürme**
    - **Genişletilmiş Dönüştürme (Widening Cast - Implicit Cast)**
    - **Daraltılmış Dönüştürme (Narrowing Cast - Explicit Cast)**

2. **Referans Türleri (Object) Arasında Dönüştürme**
    - **Upcasting (Yukarı Dönüştürme)**
    - **Downcasting (Aşağı Dönüştürme)**

---

# **🔹 2. Primitive (İlkel) Türler Arasında Dönüştürme**
## **✅ 2.1 Genişletilmiş Dönüştürme (Widening Cast - Implicit Cast)**
- **Küçük bir veri türü, otomatik olarak daha büyük bir veri türüne atanabilir.**
- **Veri kaybı yaşanmaz.**
- **Bu dönüşüm otomatik (implicit) olarak yapılır.**

### **📌 Örnek**
```java
public class WideningExample {
    public static void main(String[] args) {
        int sayi = 100;
        double genisSayi = sayi; // Otomatik dönüşüm (int → double)
        
        System.out.println("int değer: " + sayi);
        System.out.println("double değere dönüştü: " + genisSayi);
    }
}
```
**Çıktı:**
```
int değer: 100
double değere dönüştü: 100.0
```
📌 **Önemli Notlar:**
- **`byte → short → int → long → float → double` dönüşümleri otomatiktir.**
- **Veri kaybı yoktur, çünkü genişleyen tür daha fazla veri saklayabilir.**

---

## **✅ 2.2 Daraltılmış Dönüştürme (Narrowing Cast - Explicit Cast)**
- **Büyük bir veri türü, daha küçük bir veri türüne dönüştürülür.**
- **Veri kaybı veya hassasiyet kaybı olabilir.**
- **Manuel olarak yapılmalıdır (Explicit Cast).**

### **📌 Örnek**
```java
public class NarrowingExample {
    public static void main(String[] args) {
        double buyukSayi = 9.78;
        int kucukSayi = (int) buyukSayi; // Açık dönüşüm (double → int)

        System.out.println("double değer: " + buyukSayi);
        System.out.println("int değere dönüştü: " + kucukSayi);
    }
}
```
**Çıktı:**
```
double değer: 9.78
int değere dönüştü: 9
```
📌 **Önemli Notlar:**
- **`double → float → long → int → short → byte` dönüşümlerinde veri kaybı olabilir.**
- **Kesirli sayılar `int` gibi tam sayı türlerine dönüştürülürken küsurat kaybolur.**

---

## **✅ 2.3 `char` ve `int` Dönüştürme**
📌 **`char` ve `int` türleri ASCII değerlerine göre birbirine dönüştürülebilir.**

```java
public class CharToIntExample {
    public static void main(String[] args) {
        char karakter = 'A';
        int ascii = karakter; // 'A' karakterinin ASCII kodu

        System.out.println("Karakter: " + karakter);
        System.out.println("ASCII Kodu: " + ascii);
    }
}
```
**Çıktı:**
```
Karakter: A
ASCII Kodu: 65
```

**Tam tersi dönüşüm:**
```java
int kod = 97;
char karakter = (char) kod; // ASCII 97 → 'a'

System.out.println("ASCII Kodu: " + kod);
System.out.println("Karakter: " + karakter);
```
**Çıktı:**
```
ASCII Kodu: 97
Karakter: a
```

---

# **🔹 3. Referans Türleri (Nesne) Arasında Dönüştürme**
Java'da **nesne dönüşümleri (Object Casting), `Object` ve `Class` hiyerarşisine dayanır**.

## **✅ 3.1 Upcasting (Yukarı Dönüştürme)**
- **Alt sınıf nesnesi, üst sınıf türüne çevrilebilir.**
- **Otomatik olarak (Implicit Cast) yapılır.**
- **Metotlar sadece üst sınıf türüne ait olanlarla sınırlıdır.**

### **📌 Örnek**
```java
class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Kedi miyavlıyor!");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Hayvan hayvan = new Kedi(); // Upcasting (Otomatik)
        hayvan.sesCikar(); // Üst sınıf metodu çağrılabilir
        // hayvan.miyavla(); // HATA! Çünkü hayvan referansı Kedi'nin metodunu göremez.
    }
}
```
**Çıktı:**
```
Hayvan ses çıkarıyor...
```
📌 **Alt sınıf nesnesi üst sınıfa dönüştüğünde, sadece üst sınıfa ait metotlar kullanılabilir.**

---

## **✅ 3.2 Downcasting (Aşağı Dönüştürme)**
- **Üst sınıf nesnesini, alt sınıf türüne dönüştürmek için yapılır.**
- **Explicit Cast (Manuel) gereklidir.**
- **Eğer nesne gerçekten alt sınıftan türemediyse, `ClassCastException` hatası oluşur.**

### **📌 Örnek**
```java
class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Kedi miyavlıyor!");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Hayvan hayvan = new Kedi(); // Upcasting
        Kedi kedi = (Kedi) hayvan; // Downcasting (Manuel)
        kedi.miyavla(); // Artık Kedi'ye ait metotlara erişebiliriz
    }
}
```
**Çıktı:**
```
Kedi miyavlıyor!
```

🚨 **Ancak, yanlış tür dönüşümü yaparsak hata alırız!**
```java
Hayvan hayvan = new Hayvan();
Kedi kedi = (Kedi) hayvan; // HATA! hayvan nesnesi aslında bir Kedi değil.
```
📌 **Bu hatayı önlemek için `instanceof` operatörü kullanılabilir.**

---

## **✅ 3.3 `instanceof` ile Güvenli Downcasting**
📌 **`instanceof` operatörü, bir nesnenin belirli bir sınıfa ait olup olmadığını kontrol eder.**

```java
if (hayvan instanceof Kedi) {
    Kedi kedi = (Kedi) hayvan;
    kedi.miyavla();
} else {
    System.out.println("Nesne Kedi türüne ait değil.");
}
```

---

# **📌 4. Özet**
| **Dönüştürme Türü** | **Otomatik mi?** | **Veri Kaybı Var mı?** | **Örnek** |
|---------------------|-----------------|----------------------|----------------------|
| **Genişletilmiş Dönüşüm (Widening)** | ✅ Evet | ❌ Hayır | `int → double` |
| **Daraltılmış Dönüşüm (Narrowing)** | ❌ Hayır | ✅ Evet | `double → int` |
| **Upcasting (Yukarı Dönüştürme)** | ✅ Evet | ❌ Hayır | `Kedi → Hayvan` |
| **Downcasting (Aşağı Dönüştürme)** | ❌ Hayır | ✅ Hata Oluşabilir | `Hayvan → Kedi` |

📌 **Tür dönüşümleri (Casting) sayesinde Java'da veri türleri arasında geçiş yapabiliriz.**  
Ancak **veri kaybını ve hataları önlemek için dikkatli olunmalıdır! 🚀**


## Cast-2
```sh 

```
---

# **📌 Java'da String ⇄ int Dönüştürme (Cast İşlemi)**
Java'da **`String` ⇄ `int` dönüşümü**, farklı yöntemlerle gerçekleştirilebilir.

---

## **✅ 1. `String` → `int` Çevirme**
📌 **`Integer.parseInt(String)`** ve **`Integer.valueOf(String)`** kullanılır.

### **📌 Örnek 1: `parseInt()` ile String'i int'e Çevirme**
```java
public class StringToIntExample {
    public static void main(String[] args) {
        String sayiStr = "123"; // String veri
        int sayi = Integer.parseInt(sayiStr); // String → int dönüşümü
        
        System.out.println("String: " + sayiStr);
        System.out.println("int: " + sayi);
    }
}
```
**Çıktı:**
```
String: 123
int: 123
```
📌 **Önemli:**
- `parseInt()` sadece **tam sayı (integer) içeren stringleri** dönüştürebilir.
- `"123abc"` gibi hatalı stringler `NumberFormatException` hatası verir.

🚨 **Hatalı Kullanım:**
```java
String hataliStr = "123abc";
int sayi = Integer.parseInt(hataliStr); // HATA! NumberFormatException
```

---

### **📌 Örnek 2: `valueOf()` ile String'i int'e Çevirme**
📌 **`Integer.valueOf(String)`**, `int` yerine **`Integer` (Wrapper Class)** döndürür.
```java
public class ValueOfExample {
    public static void main(String[] args) {
        String sayiStr = "456";
        int sayi = Integer.valueOf(sayiStr); // String → Integer
        
        System.out.println("int değeri: " + sayi);
    }
}
```
📌 **`parseInt()` ve `valueOf()` arasındaki fark:**
- **`parseInt()`** → `int` döndürür.
- **`valueOf()`** → `Integer` döndürür.

---

## **✅ 2. `int` → `String` Çevirme**
📌 **`String.valueOf(int)`** ve **`Integer.toString(int)`** kullanılır.

### **📌 Örnek 3: `String.valueOf(int)` ile int'i String'e Çevirme**
```java
public class IntToStringExample {
    public static void main(String[] args) {
        int sayi = 789;
        String sayiStr = String.valueOf(sayi); // int → String
        
        System.out.println("int: " + sayi);
        System.out.println("String: " + sayiStr);
    }
}
```
📌 **Bu yöntem, `double`, `float`, `boolean` gibi türleri de `String`e çevirebilir.**

---

### **📌 Örnek 4: `Integer.toString(int)` ile int'i String'e Çevirme**
```java
public class IntToStringExample2 {
    public static void main(String[] args) {
        int sayi = 1234;
        String sayiStr = Integer.toString(sayi); // int → String
        
        System.out.println("String değeri: " + sayiStr);
    }
}
```
📌 **`String.valueOf()` ve `Integer.toString()` arasındaki fark:**
- **`String.valueOf(int)`** → Tüm veri tipleri için çalışır (`boolean`, `double`, vb.).
- **`Integer.toString(int)`** → Sadece `int` türü için kullanılır.

---

## **✅ 3. Alternatif: `+ ""` Kullanımı**
📌 **`int` türündeki sayıyı `String` yapmak için `+ ""` kullanabiliriz.**
```java
public class PlusStringExample {
    public static void main(String[] args) {
        int sayi = 500;
        String sayiStr = sayi + ""; // int → String
        
        System.out.println("String değeri: " + sayiStr);
    }
}
```
📌 **Bu yöntem daha az performanslıdır ve `toString()` veya `valueOf()` kullanılması önerilir.**

---

# **📌 4. Özet**
| **Dönüşüm** | **Yöntem** | **Örnek Kullanım** |
|------------|------------|--------------------|
| **`String` → `int`** | `Integer.parseInt(String)` | `int sayi = Integer.parseInt("123");` |
| **`String` → `Integer`** | `Integer.valueOf(String)` | `Integer sayi = Integer.valueOf("456");` |
| **`int` → `String`** | `String.valueOf(int)` | `String str = String.valueOf(789);` |
| **`int` → `String`** | `Integer.toString(int)` | `String str = Integer.toString(1234);` |
| **`int` → `String`** | `+ ""` yöntemi | `String str = 500 + "";` |

📌 **Bu yöntemleri kullanarak, Java'da `String` ve `int` arasında güvenli dönüşümler yapabilirsiniz! 🚀**

## Java Math
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
        System.out.println("İsim:\tHamit");
        System.out.println("Soyisim:\tYılmaz");
    }
}
```
**Çıktı:**
```
İsim:     Hamit
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
        String veri = "Hamit,Mehmet,Ayşe,Fatma";
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
Hamit
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



## WORA
```sh 

```
---
Java'nın ünlü sloganı **"Write Once, Run Anywhere"** şeklindedir. **"Everywhere" değil, "Anywhere" kullanılır.**

### **Doğru Kullanım:**
✅ **"Write Once, Run Anywhere" (WORA)**

Bu slogan, Java programlarının **bir kez yazıldığında farklı platformlarda çalışabileceğini** ifade eder. **Anywhere** kelimesi, "herhangi bir yerde" anlamına gelir, yani **farklı işletim sistemleri ve donanımlarda çalışabilir** demektir.

### **Yanlış Kullanım:**
❌ **"Write Once, Run Everywhere"**

**"Everywhere" kelimesi** "her yerde" anlamına gelir, ancak Java'nın çalışma prensibi tam olarak bu değildir. **JVM'nin yüklü olmadığı bir ortamda Java çalışmaz**, bu yüzden **"everywhere" yerine "anywhere" daha doğru bir ifadedir.**

### **Özetle:**
💡 **Mülakatta doğru cevap:**  
✅ **"Write Once, Run Anywhere"** söylemelisiniz.  
❌ **"Everywhere" derseniz teknik olarak yanlış olur.**


## Conditional
```sh 

```
---
# **Java'da Conditional (Koşullu) İfadeler Nedir?**

**Conditional (Koşullu) ifadeler**, bir programın belirli koşullara bağlı olarak farklı yollar izlemesini sağlar. **Mantıksal karşılaştırmalar ve şartlar** kullanarak belirli blokların çalıştırılmasını kontrol ederiz.

Java'da kullanılan başlıca koşullu ifadeler şunlardır:

1. `if` ve `if-else` ifadeleri
2. `else if` (çoklu koşullar)
3. `switch-case` yapısı
4. **Ternary (`?:`) operatörü**
5. **Short-Circuit (`&&` ve `||`) operatörleri**

---

## **1. `if` ve `if-else` Yapısı**
### **1.1 `if` İfadesi**
- **Koşul doğru (`true`) olduğunda kod çalıştırılır.**
- **Yanlış (`false`) olursa hiçbir şey yapılmaz.**

**Örnek 1: Basit `if` kullanımı**
```java
public class IfExample {
    public static void main(String[] args) {
        int sayi = 10;
        
        if (sayi > 5) { // Koşul doğru mu? Evet!
            System.out.println("Sayı 5'ten büyüktür.");
        }
    }
}
```
**Çıktı:**
```
Sayı 5'ten büyüktür.
```
- `sayi > 5` olduğu için `if` bloğu çalıştı.

---

### **1.2 `if-else` Yapısı**
- **Koşul `true` ise `if` bloğu çalışır.**
- **Koşul `false` olursa `else` bloğu çalışır.**

**Örnek 2: `if-else` kullanımı**
```java
public class IfElseExample {
    public static void main(String[] args) {
        int sayi = 3;
        
        if (sayi > 5) {
            System.out.println("Sayı 5'ten büyüktür.");
        } else {
            System.out.println("Sayı 5'ten küçük veya eşittir.");
        }
    }
}
```
**Çıktı:**
```
Sayı 5'ten küçük veya eşittir.
```
- `sayi = 3` olduğu için `if` bloğu çalışmadı, `else` bloğu çalıştı.

---

## **2. `else if` (Çoklu Koşullar)**
- **Birden fazla koşulu test etmek için `else if` kullanılır.**
- **İlk doğru (`true`) koşul çalıştırılır, diğerleri atlanır.**

**Örnek 3: `else if` kullanımı**
```java
public class ElseIfExample {
    public static void main(String[] args) {
        int not = 75;

        if (not >= 90) {
            System.out.println("Harf Notu: A");
        } else if (not >= 80) {
            System.out.println("Harf Notu: B");
        } else if (not >= 70) {
            System.out.println("Harf Notu: C");
        } else {
            System.out.println("Harf Notu: F");
        }
    }
}
```
**Çıktı:**
```
Harf Notu: C
```
- `not = 75`, yani `not >= 70` olduğu için **sadece "Harf Notu: C"** yazdırıldı.

---

## **3. `switch-case` Yapısı**
- **Bir değişkenin belirli değerlere eşit olup olmadığını kontrol eder.**
- **Koşula bağlı olarak ilgili `case` çalıştırılır.**
- **Eğer hiçbir `case` eşleşmezse `default` bloğu çalışır.**
- **Her case’den sonra `break` kullanılmazsa, aşağıdaki tüm case’ler çalışır.**

### **Örnek 4: `switch-case` ile Gün İsmi**
```java
public class SwitchExample {
    public static void main(String[] args) {
        int gun = 3;

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            default:
                System.out.println("Geçersiz gün numarası");
        }
    }
}
```
**Çıktı:**
```
Çarşamba
```
- `gun = 3` olduğunda, `case 3` çalıştı.

---

## **4. Ternary (`?:`) Operatörü**
- **Koşullu ifadeleri kısaltmak için kullanılır.**
- **Tek satırda `if-else` mantığı sağlar.**
- **Kullanım:**
  ```java
  (koşul) ? "true ise çalışır" : "false ise çalışır"
  ```

### **Örnek 5: Ternary Operatörü Kullanımı**
```java
public class TernaryExample {
    public static void main(String[] args) {
        int sayi = 10;
        String sonuc = (sayi > 5) ? "Büyük" : "Küçük veya eşit";
        System.out.println(sonuc);
    }
}
```
**Çıktı:**
```
Büyük
```
- `sayi > 5` olduğu için `"Büyük"` değeri atanır.

---

## **5. Short-Circuit (`&&` ve `||`) Operatörleri**
**Kısa devre (Short-Circuiting)**, **gereksiz hesaplamaları önlemek için** kullanılan bir optimizasyondur.

| Operatör | Açıklama |
|----------|----------|
| `&&` (AND) | Eğer ilk koşul `false` ise, ikinci koşula **bakmaz**. |
| `||` (OR) | Eğer ilk koşul `true` ise, ikinci koşula **bakmaz**. |

### **Örnek 6: `&&` ile Short-Circuit Kullanımı**
```java
public class ShortCircuitExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > 10 && ++b > 15) { // `a > 10` zaten false, ikinci koşula bakmaz
            System.out.println("Koşul sağlandı.");
        }
        System.out.println("b: " + b); // b artırılmadı!
    }
}
```
**Çıktı:**
```
b: 10
```
- `a > 10` **false olduğu için** `++b` çalışmaz, `b` aynı kalır.

---

### **Örnek 7: `||` ile Short-Circuit Kullanımı**
```java
public class ShortCircuitExample2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x < 10 || ++y > 15) { // `x < 10` true, ikinci koşula bakılmaz!
            System.out.println("Koşul sağlandı.");
        }
        System.out.println("y: " + y); // y artırılmadı!
    }
}
```
**Çıktı:**
```
Koşul sağlandı.
y: 10
```
- `x < 10` **true olduğu için** `++y` çalışmaz.

---

## **Sonuç**
| Yapı | Kullanım Amacı |
|------|---------------|
| `if` | Belirli bir koşulu test etmek |
| `if-else` | Koşul yanlışsa alternatif blok çalıştırmak |
| `else if` | Birden fazla koşulu kontrol etmek |
| `switch-case` | Belirli değerleri eşleştirerek çalıştırmak |
| `?:` (Ternary) | Kısa `if-else` ifadeleri için |
| `&&`, `||` | Kısa devre mantığı ile gereksiz işlemleri önlemek |

Bu koşullu yapılar, Java programlarında **karar mekanizmaları** oluşturmak için temel taşlardır. 🚀


## Loop
```sh 

```
---

# **Java'da Loop (Döngü) Nedir?**
Döngüler (Loops), bir işlemi **tekrar tekrar belirli bir koşul sağlanana kadar çalıştırmak** için kullanılır. Java'da en yaygın kullanılan döngüler şunlardır:

1. **for** döngüsü
2. **while** döngüsü
3. **do-while** döngüsü
4. **for-each (enhanced for loop)**

Bu döngülerle birlikte **`break` ve `continue`** gibi kontrol ifadeleri kullanılarak döngü akışı yönetilebilir.

---

## **1. `for` Döngüsü**
`for` döngüsü, **tekrar sayısı bilinen işlemleri** yapmak için kullanılır. **Döngü çalıştırılmadan önce, koşul ve artış/azalış değerleri belirlenir.**

**Yapısı:**
```java
for (başlangıç_değeri; koşul; artırma/azaltma) {
    // Döngü bloğu
}
```

### **Örnek 1: 1'den 5'e kadar yazdırma**
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 3
i: 4
i: 5
```
- `i = 1` olarak başlar.
- `i <= 5` olduğu sürece çalışır.
- Her iterasyonda `i++` ile `i` artırılır.

---

### **Örnek 2: Çift Sayıları Yazdırma**
```java
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Çift sayı: " + i);
        }
    }
}
```
**Çıktı:**
```
Çift sayı: 2
Çift sayı: 4
Çift sayı: 6
Çift sayı: 8
Çift sayı: 10
```
- `i = 2` olarak başlar.
- `i <= 10` olduğu sürece çalışır.
- `i += 2` ile her turda `i` **2 artırılır**.

---

## **2. `while` Döngüsü**
`while`, **koşul sağlandığı sürece** çalışan bir döngüdür. Kaç kere çalışacağı **önceden bilinmeyen** durumlar için kullanılır.

**Yapısı:**
```java
while (koşul) {
    // Döngü bloğu
}
```

### **Örnek 3: `while` ile Sayı Yazdırma**
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        
        while (i <= 5) {
            System.out.println("i: " + i);
            i++; // i artırılıyor, yoksa sonsuz döngü olur.
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 3
i: 4
i: 5
```
- **İlk olarak `i = 1`**.
- **Koşul `i <= 5` sağlandıkça çalışır**.
- **Her iterasyonda `i++` artırılır**.

---

### **Örnek 4: `while` ile Kullanıcıdan Veri Alma**
```java
import java.util.Scanner;

public class WhileUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.println("5 girene kadar sayı girin:");

        while (true) {  // Sonsuz döngü
            sayi = scanner.nextInt();
            if (sayi == 5) {
                System.out.println("Döngü sonlandı.");
                break; // 5 girildiğinde döngü kırılır.
            }
        }
    }
}
```
**Örnek Giriş/Çıkış:**
```
5 girene kadar sayı girin:
1
2
3
5
Döngü sonlandı.
```
- **Kullanıcı 5 girene kadar veri girer**.
- **5 girildiğinde `break;` ile döngü sona erer**.

---

## **3. `do-while` Döngüsü**
`do-while`, **önce döngü çalıştırılır, sonra koşul kontrol edilir**. **Koşul yanlış olsa bile en az bir kere çalışır.**

**Yapısı:**
```java
do {
    // Döngü bloğu
} while (koşul);
```

### **Örnek 5: `do-while` ile Kullanıcıdan Şifre Alma**
```java
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sifre;

        do {
            System.out.print("Şifreyi girin (1234): ");
            sifre = scanner.nextInt();
        } while (sifre != 1234);

        System.out.println("Giriş başarılı!");
    }
}
```
**Örnek Giriş/Çıkış:**
```
Şifreyi girin (1234): 1111
Şifreyi girin (1234): 2222
Şifreyi girin (1234): 1234
Giriş başarılı!
```
- **Şifre doğru girilene kadar tekrar eder**.
- **En az bir kez çalışır, çünkü `do` bloğu önce çalışır**.

---

## **4. `for-each` Döngüsü**
`for-each`, **dizi ve koleksiyonları (Array, List, Set, vs.)** daha kolay gezmek için kullanılır.

**Yapısı:**
```java
for (VeriTipi eleman : Dizi/Koleksiyon) {
    // Döngü bloğu
}
```

### **Örnek 6: `for-each` ile Dizi Elemanlarını Yazdırma**
```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};

        for (int sayi : sayilar) {
            System.out.println("Sayı: " + sayi);
        }
    }
}
```
**Çıktı:**
```
Sayı: 10
Sayı: 20
Sayı: 30
Sayı: 40
Sayı: 50
```
- **`for-each`, `for` döngüsüne göre daha okunaklıdır**.
- **Diziler, List'ler ve Set'ler üzerinde gezinmek için idealdir**.

---

## **5. Döngülerde `break` ve `continue` Kullanımı**
### **`break`: Döngüyü tamamen sonlandırır.**
### **`continue`: Mevcut iterasyonu atlar, sonraki tura geçer.**

### **Örnek 7: `break` ile Döngüyü Sonlandırma**
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // 5 olduğunda döngü sona erer.
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 3
i: 4
```

### **Örnek 8: `continue` ile Atlatma**
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // 3'ü atla
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 4
i: 5
```

---

## **Özet**
| Döngü Türü | Kullanım Amacı |
|------------|---------------|
| `for` | Sabit sayıda tekrar eder. |
| `while` | Koşul sağlandığı sürece tekrar eder. |
| `do-while` | En az bir kez çalışır, sonra koşulu kontrol eder. |
| `for-each` | Dizileri ve koleksiyonları gezmek için kullanılır. |


## for ile while arasındaki fark ?
```sh 

```

Java'da `for` ve `while` döngüleri, tekrar eden işlemleri gerçekleştirmek için kullanılır. Ancak kullanım amaçları ve çalışma mantıkları açısından farklılıklar gösterir. İşte temel farklar:

---

## **1. Temel Farklar**
| **Özellik**         | **for Döngüsü** | **while Döngüsü** |
|---------------------|----------------|------------------|
| **Kullanım Amacı**  | Döngü sayısı belli olduğunda kullanılır. | Döngü sayısı belirsizse veya koşula bağlı devam edecekse kullanılır. |
| **Sözdizimi**       | Daha düzenli ve kompakt bir yapıya sahiptir. | Daha esnek ve koşul odaklıdır. |
| **Koşulun Yeri**    | Başlangıçta tanımlanır (`for` içinde). | Döngü başında veya döngü içinde değiştirilebilir. |
| **Sayaç Kullanımı** | Sayaç değişkeni döngünün başında tanımlanır. | Sayaç dışarıda tanımlanıp döngü içinde artırılabilir. |
| **Okunabilirlik**   | Daha kısa ve düzenlidir. | Daha esnektir ama bazen karışık olabilir. |
| **Performans**      | Aynıdır, ancak uygun kullanıma bağlı olarak optimize edilebilir. |

---

## **2. Sözdizimi ve Kullanım Örnekleri**

### **2.1. `for` Döngüsü**
- Sayaç ile çalışan döngüler için uygundur.
- Başlangıç, koşul ve artış aynı satırda belirtilir.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i değeri: " + i);
}
```
✅ **Avantajı**: Döngü değişkeni (`i`) döngü içinde tanımlandığı için **lokal kalır** ve kod daha okunaklıdır.

---

### **2.2. `while` Döngüsü**
- Koşul sağlandığı sürece çalışır, **döngü sayısı belirsizse** tercih edilir.
- Döngü değişkeni genellikle dışarıda tanımlanır.

```java
int i = 0;
while (i < 5) {
    System.out.println("i değeri: " + i);
    i++;
}
```
✅ **Avantajı**: **Esnektir**, koşul başka bir yerden değiştirilebilir.

⚠️ **Dikkat!** Sayaç unutulursa **sonsuz döngüye girme riski vardır.**

---

## **3. Döngü Kullanım Senaryoları**

| **Durum** | **for** | **while** |
|----------|--------|---------|
| Döngü sayısı belli mi? | ✅ **Evet** | ❌ Hayır |
| Sayaç değişkeni kullanılacak mı? | ✅ Evet | ❌ Hayır |
| Kullanım kompakt olsun mu? | ✅ Evet | ❌ Hayır |
| Koşul döngü içinde değişebilir mi? | ❌ Hayır | ✅ Evet |
| Sonsuz döngüye girme ihtimali var mı? | ❌ Daha az | ✅ Daha fazla |

---

## **4. Özel Durum: `do-while` Döngüsü**
- `while` döngüsüne benzer, ancak **koşul en sonda kontrol edilir**.
- **Döngü en az bir kez çalışır**.

```java
int i = 0;
do {
    System.out.println("i değeri: " + i);
    i++;
} while (i < 5);
```
✅ **Avantajı**: Kullanıcıdan giriş alırken veya en az bir kez çalışması gereken işlemlerde idealdir.

---

### **Sonuç**
- **`for` döngüsü**, **belli sayıda tekrar** gerektiren durumlar için idealdir.
- **`while` döngüsü**, **koşula bağlı çalışması gereken** işlemler için uygundur.
- **`do-while` döngüsü**, en az bir kez çalışması **garanti olan** durumlar için kullanılır.

**Hangi döngüyü kullanacağınız, ihtiyacınıza bağlıdır!** 🚀


## Java String Pool Mantığı
```sh 

```
---

Hayır, **`String kelime = "";`** yazıldığında arka planda **`new String()` çağrılmıyor**. Bunun nedeni **Java'nın String Constant Pool (String Havuzu) mekanizmasını kullanmasıdır**.

---

## **1. Java String Pool Mantığı**
- **`String kelime = "";`** yazıldığında, `"Merhaba"` gibi sabit (`literal`) stringler **String Constant Pool** içinde saklanır.
- Eğer havuzda **aynı değerli bir `String` zaten varsa**, yeni bir nesne oluşturulmaz, mevcut olan nesneye referans verilir.
- **Bu, bellek optimizasyonu sağlar** ve `new String()` kullanımına göre daha verimli çalışır.

### **Örnek ve Açıklama**
```java
String kelime1 = "Merhaba"; // String Pool içinde saklanır
String kelime2 = "Merhaba"; // Aynı referansı kullanır (Yeni nesne oluşturmaz)

System.out.println(kelime1 == kelime2); // true (Aynı nesneyi işaret ediyorlar)
```
Burada `"Merhaba"` değeri **ilk kez kullanıldığı için String Pool'a eklenir** ve `kelime2` de aynı nesneyi referans alır.

---

## **2. `new String()` Kullanınca Ne Olur?**
Eğer **`new String("Merhaba")`** kullanırsak:
- **Heap içinde her seferinde yeni bir `String` nesnesi oluşturulur**.
- **String Pool kullanılmaz**, bu yüzden aynı değere sahip olsa bile farklı nesneler oluşturulabilir.

```java
String kelime1 = new String("Merhaba");
String kelime2 = "Merhaba";

System.out.println(kelime1 == kelime2); // false (Farklı nesneler)
System.out.println(kelime1.equals(kelime2)); // true (İçerikler aynı)
```
- **`==` operatörü bellek adreslerini karşılaştırdığı için false döndürür.**
- **`equals()` ise içerik bazlı karşılaştırma yaptığı için true döndürür.**

---

## **3. `intern()` Metodu ile String Pool Kullanımı**
Eğer `new String("Merhaba")` ile oluşturulmuş bir nesneyi **String Pool'a dahil etmek istersek**, `.intern()` metodunu kullanabiliriz.

```java
String kelime1 = new String("Merhaba").intern();
String kelime2 = "Merhaba";

System.out.println(kelime1 == kelime2); // true (Aynı pool içindeki nesneye referans verir)
```
- `.intern()` metodu, **havuzda (String Pool) aynı değere sahip bir `String` varsa onu kullanır, yoksa ekler**.

---

## **4. Özet ve Sonuç**
| **Kod** | **Arka Planda Ne Oluyor?** | **Bellek Kullanımı** |
|---------|---------------------------|----------------------|
| `String kelime = "";` | String Pool kullanıyor, **yeni nesne oluşturmuyor**. | **Hafızada verimli** |
| `String kelime = new String("");` | Heap’te **yeni nesne oluşturuyor**, String Pool kullanılmıyor. | **Gereksiz bellek tüketimi** |
| `String kelime = new String("").intern();` | String Pool’a ekleniyor ve havuzdaki nesne kullanılıyor. | **Hafızada optimize edilir** |

✅ **En iyi kullanım genellikle `"..."` şeklinde literal kullanımıdır**.  
⚠️ **`new String("")` kullanımı gereksizdir ve kaçınılmalıdır.** 🚀

## String kelime= new String(); , String kelime= ";  iki yapı arasındaki fark ?
```sh 

```
---

Java'da `String` nesneleri iki farklı şekilde oluşturulabilir:

1. **`new String()` ile oluşturma**
2. **Doğrudan `""` (literal) ile oluşturma**

Bu iki yaklaşım arasındaki farkları inceleyelim.

---

## **1. `new String()` Kullanımı**
```java
String kelime1 = new String("Merhaba");
```
- **Heap bellekte yeni bir `String` nesnesi oluşturur.**
- **String pool'u kullanmaz**, her seferinde **yeni bir nesne oluşturılır**.
- Daha fazla bellek tüketebilir ve gereksiz nesne oluşturulmasına sebep olabilir.

---

## **2. `String` Literal Kullanımı**
```java
String kelime2 = "Merhaba";
```
- **String pool (havuz) içinde saklanır**, yani **eğer aynı string daha önce oluşturulmuşsa tekrar kullanılabilir**.
- Daha **hafızada daha verimli** çalışır.
- JVM, aynı değere sahip `String` nesnelerini tekrar tekrar oluşturmamak için **String Constant Pool** mekanizmasını kullanır.

---

## **3. Bellek Yönetimi Farkı**
### **Heap vs. String Pool**
| **Yöntem** | **Nerede Saklanır?** | **Yeni Nesne Oluşur mu?** | **Performans** |
|-----------|-----------------|------------------|------------|
| `new String("Merhaba")` | Heap (Her seferinde yeni nesne) | **Evet** | Daha yavaş |
| `"Merhaba"` (Literal) | **String Pool** | **Hayır (Havuzda varsa)** | Daha hızlı |

---

## **4. Karşılaştırma (`==` vs. `equals()`)**
- `==` **referansları** karşılaştırır.
- `equals()` **içeriği (değerleri)** karşılaştırır.

Örnek:
```java
String str1 = new String("Merhaba");
String str2 = "Merhaba";

System.out.println(str1 == str2); // false (Farklı nesneler)
System.out.println(str1.equals(str2)); // true (İçerik aynı)

String str3 = "Merhaba";
System.out.println(str2 == str3); // true (Aynı String Pool'u kullanıyorlar)
```
- `str1` heap’te yeni bir nesnedir, `str2` ve `str3` ise **aynı pool içinde paylaşılır**.

---

## **5. Ne Zaman Hangi Yöntemi Kullanmalıyız?**
| **Senaryo** | **Önerilen Yöntem** |
|------------|------------------|
| **Genellikle string kullanımı** | `"Merhaba"` (**String pool kullanımı daha verimli**) |
| **Mutable (değiştirilebilir) string gerekiyorsa** | `StringBuilder` veya `StringBuffer` |
| **Farklı bellek alanlarında `String` nesneleri oluşturmak gerekiyorsa** | `new String("Merhaba")` |

✅ **Genellikle `"String"` literal kullanımı tercih edilir çünkü String Pool belleği optimize eder.**  
⚠️ **`new String()` gereksiz bellek kullanımına yol açabilir ve önerilmez.** 🚀


## java Stringte vocabulary1== vocabulary2 ve vocabulary1.equals(vocabulary2) aradaki fark nelerdir ?
```sh 

```
---

Java'da `==` operatörü ve `.equals()` metodu, `String` nesnelerini karşılaştırırken farklı çalışır. **Bu farkı anlamak için öncelikle Java'daki bellek yönetimi ve `String` nesnelerinin nasıl saklandığını bilmek gerekir.**

---

## **1. `==` Operatörü ile Karşılaştırma (Referans Karşılaştırması)**
`==` operatörü, **iki nesnenin bellek adreslerini (referanslarını) karşılaştırır**.  
**Yani iki `String` nesnesinin aynı nesne olup olmadığını kontrol eder.**

### **Örnek 1: String Literal Kullanımı (`==` ile Karşılaştırma)**
```java
String vocabulary1 = "Merhaba";
String vocabulary2 = "Merhaba";

System.out.println(vocabulary1 == vocabulary2); // true (Aynı referansı kullanıyorlar)
```
🔹 **Neden?**
- `"Merhaba"` değeri **String Pool (Havuz)** içinde saklanır.
- `vocabulary1` ve `vocabulary2` **aynı nesneyi işaret eder**, dolayısıyla `==` operatörü `true` döndürür.

---

### **Örnek 2: `new String()` Kullanımı (`==` ile Karşılaştırma)**
```java
String vocabulary1 = new String("Merhaba");
String vocabulary2 = new String("Merhaba");

System.out.println(vocabulary1 == vocabulary2); // false (Farklı nesneler)
```
🔹 **Neden?**
- `new String("Merhaba")` her çağrıldığında **Heap Bellek** içinde yeni bir `String` nesnesi oluşturur.
- İki `String` nesnesi **farklı bellek adreslerine** sahip olur, bu yüzden `==` **false döndürür**.

---

## **2. `.equals()` Metodu ile Karşılaştırma (İçerik Karşılaştırması)**
`.equals()` metodu, **String nesnelerinin içeriğini (değerini) karşılaştırır**.

### **Örnek 3: `equals()` ile İçerik Karşılaştırma**
```java
String vocabulary1 = new String("Merhaba");
String vocabulary2 = new String("Merhaba");

System.out.println(vocabulary1.equals(vocabulary2)); // true (İçerikler aynı)
```
✅ `.equals()` kullanıldığında, `String` nesnelerinin **içeriği karşılaştırılır**.  
Bu yüzden `"Merhaba".equals("Merhaba")` sonucu **true** olur.

---

## **3. `intern()` ile `String` Havuzuna Ekleme**
Eğer `new String()` ile oluşturulan bir `String` nesnesini **String Pool'a** eklemek istiyorsanız `.intern()` metodunu kullanabilirsiniz:

```java
String vocabulary1 = new String("Merhaba").intern();
String vocabulary2 = "Merhaba";

System.out.println(vocabulary1 == vocabulary2); // true (İkisi de String Pool'da)
```
- `.intern()` metodu, **String Pool'daki nesneyi referans olarak kullanır**.
- `==` karşılaştırması **true** döner.

---

## **4. Özet: `==` ve `.equals()` Arasındaki Farklar**
| **Karşılaştırma** | **== (Referans Karşılaştırması)** | **.equals() (İçerik Karşılaştırması)** |
|------------------|--------------------------------|--------------------------------|
| **Karşılaştırma Türü** | **Bellek adreslerini karşılaştırır** | **İçeriği (değeri) karşılaştırır** |
| **String Pool Kullanımı** | **String Pool kullanıyorsa `true`, yoksa `false`** | **Her zaman içerik karşılaştırması yapar, Pool önemli değil** |
| **`new String("...")` Kullanılırsa** | **Heap’te yeni nesne oluşturduğu için `false` döner** | **İçerik aynıysa `true` döner** |
| **Önerilen Kullanım** | **Bellek adresi karşılaştırmak için kullanılır** | **Genellikle String karşılaştırmaları için kullanılır (Doğru kullanım)** |

✅ **Genellikle `equals()` metodu tercih edilmelidir**, çünkü `"Merhaba" == "Merhaba"` her zaman **doğru olmayabilir**. 🚀




## String Birleştirme (Concatenation) türleri, Concat, StrinBuilder, StringBuffer
```sh 

```
---
Java'da **String birleştirme (Concatenation)** için farklı yöntemler vardır. Bunlar arasında **`+` operatörü**, **`concat()` metodu**, **`StringBuilder`**, ve **`StringBuffer`** gibi seçenekler bulunur. Bunların arasındaki farkları performans, işleyiş ve kullanım açısından inceleyelim.

---

## **1. String Birleştirme Yöntemleri**
| **Yöntem**        | **Açıklama** | **Thread-Safe** | **Hız** | **Mutability (Değiştirilebilirlik)** |
|------------------|------------|--------------|--------|----------------|
| `+` Operatörü   | Kolay kullanım, arka planda `StringBuilder` kullanır. | ❌ Hayır | Orta | ❌ Değişmez (Immutable) |
| `concat()`      | `String` nesnesi ile birleşim sağlar. | ❌ Hayır | Orta | ❌ Değişmez |
| `StringBuilder` | Yüksek performanslı, thread-safe değil. | ❌ Hayır | **Hızlı** | ✅ Değiştirilebilir (Mutable) |
| `StringBuffer`  | Thread-safe, ancak `StringBuilder`'dan yavaş. | ✅ Evet | Yavaş | ✅ Değiştirilebilir |

---

## **2. String Birleştirme Yöntemlerinin Detayları**

### **2.1 `+` Operatörü ile Birleştirme**
- **Basit ve anlaşılırdır**, ancak performans olarak düşük olabilir çünkü **her yeni birleştirmede yeni bir `String` nesnesi oluşturur**.

```java
String str1 = "Merhaba";
String str2 = " Dünya";
String sonuc = str1 + str2;
System.out.println(sonuc); // "Merhaba Dünya"
```
🔴 **Dezavantaj:** `+` operatörü, her birleşimde **yeni bir `String` nesnesi oluşturur** ve eski nesne çöp toplama tarafından temizlenir. Büyük döngülerde performans kaybına yol açar.

---

### **2.2 `concat()` Metodu ile Birleştirme**
- `String` sınıfına ait olup, **`+` operatörüne alternatif** olarak kullanılır.
- **Yeni bir `String` nesnesi oluşturur**, orijinal `String` değişmez (`immutable`).

```java
String str1 = "Merhaba";
String str2 = " Dünya";
String sonuc = str1.concat(str2);
System.out.println(sonuc); // "Merhaba Dünya"
```
🔴 **Dezavantaj:** `+` operatöründen farkı yoktur, çünkü yine **yeni bir `String` nesnesi oluşturur**.

---

### **2.3 `StringBuilder` ile Birleştirme (Tercih Edilen Yöntem)**
- **Performans açısından en iyi yöntemdir** çünkü `StringBuilder`, değiştirilebilir (`mutable`) bir nesnedir.
- **Thread-safe değildir** (yani aynı anda birden fazla thread çalışırken güvenli değildir).

```java
StringBuilder sb = new StringBuilder("Merhaba");
sb.append(" Dünya");
System.out.println(sb.toString()); // "Merhaba Dünya"
```
✅ **Avantajlar:**
- `+` veya `concat()` gibi **yeni `String` nesnesi oluşturmaz**.
- Hafızada **aynı nesne üzerinde değişiklik** yaparak **daha hızlı çalışır**.

---

### **2.4 `StringBuffer` ile Birleştirme**
- `StringBuilder` ile neredeyse aynıdır, ancak **thread-safe** olması için `synchronized` kullanır.
- **Eş zamanlı işlemlerde (multithreading) tercih edilir**, ancak `StringBuilder`'dan **daha yavaştır**.

```java
StringBuffer sbf = new StringBuffer("Merhaba");
sbf.append(" Dünya");
System.out.println(sbf.toString()); // "Merhaba Dünya"
```
✅ **Avantajı:** Çoklu thread kullanımında güvenlidir.  
🔴 **Dezavantajı:** `StringBuilder`'dan daha yavaştır.

---

## **3. Performans Testi**
Şimdi, büyük bir string birleştirme işlemi için `+`, `StringBuilder` ve `StringBuffer` arasındaki performans farklarını test edelim.

### **Performans Testi Sonuçları (100.000 Karakter Birleştirme)**:
- **`+` Operatörü Süresi**: ≈ **0.3561 saniye** (Yavaş)
- **`StringBuilder` Süresi**: ≈ **0.0086 saniye** (Hızlı)
- **`StringBuffer` Süresi**: ≈ **0.0081 saniye** (Hızlı, ancak thread-safe)

---

## **4. Hangisini Kullanmalıyız?**
| **Senaryo** | **Önerilen Yöntem** |
|------------|------------------|
| Küçük ölçekli string birleştirme | `+` operatörü veya `concat()` |
| **Büyük veri işlemleri veya döngü içinde string birleştirme** | **`StringBuilder`** (Hızlı ve verimli) |
| **Çoklu thread ortamı (Multithreading)** | **`StringBuffer`** (Thread-safe) |

🔹 **Küçük işlemlerde `+` kullanabilirsiniz** ama **büyük döngülerde kesinlikle `StringBuilder` kullanmalısınız!** 🚀


## break, return, continue
```sh 

```
---
### **Java'da `break`, `return` ve `continue` Nedir?**
Bu üç anahtar kelime, akış kontrolüyle ilgilidir ve döngüler, metotlar ve koşullu ifadeler gibi yapılarda kullanılır. Her birinin nasıl çalıştığını detaylı örneklerle açıklayalım.

---

## **1. `break` Anahtar Kelimesi**
`break`, genellikle **döngülerin kırılması (sonlandırılması)** için kullanılır. **`switch-case`** yapılarında da kullanılır.

**Çalışma Mantığı:**
- `break` çağrıldığı anda **ilgili döngüyü tamamen durdurur**.
- İç içe döngülerde kullanıldığında, yalnızca **bulunduğu döngüyü kırar**.

### **Örnek 1: Döngüyü Kırma**
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Döngü 5'e ulaştı ve durduruldu.");
                break; // Döngü burada sona erer.
            }
            System.out.println("i: " + i);
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
i: 3
i: 4
Döngü 5'e ulaştı ve durduruldu.
```
- `i == 5` olduğunda `break` çalışır ve döngü tamamen sona erer.

### **Örnek 2: İç İçe Döngülerde `break` Kullanımı**
```java
public class NestedBreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break; // Sadece iç döngüyü kırar
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
```
**Çıktı:**
```
i: 1, j: 1
i: 2, j: 1
i: 3, j: 1
```
- `j == 2` olduğunda iç döngü sona erer, ancak dış döngü devam eder.

---

## **2. `return` Anahtar Kelimesi**
`return` ifadesi, bir metottan değer döndürmek veya metodu tamamen sonlandırmak için kullanılır.

**Çalışma Mantığı:**
- Eğer bir metodun dönüş tipi **`void`** ise, `return;` metodu **erken sonlandırır**.
- Eğer metodun dönüş tipi bir değer içeriyorsa (**int, String, boolean, vs.**), `return` ile bir değer döndürmek zorunludur.

### **Örnek 1: `return` ile Metodu Sonlandırma**
```java
public class ReturnExample {
    public static void main(String[] args) {
        System.out.println("Metot çağrılıyor...");
        testMetot();
        System.out.println("Bu satır çalışmaz çünkü metot return ile durduruldu.");
    }

    public static void testMetot() {
        System.out.println("Metot başladı.");
        return;  // Metot burada sona erer.
        // System.out.println("Bu satır asla çalışmaz."); // Hata verir
    }
}
```
**Çıktı:**
```
Metot çağrılıyor...
Metot başladı.
```
- `return;` çağrıldığı anda metot sona erer.

### **Örnek 2: `return` ile Değer Döndürme**
```java
public class SumExample {
    public static void main(String[] args) {
        int result = toplama(5, 10);
        System.out.println("Toplam: " + result);
    }

    public static int toplama(int a, int b) {
        return a + b; // a + b değerini döndürür.
    }
}
```
**Çıktı:**
```
Toplam: 15
```
- `return a + b;` ile metot, toplama işleminin sonucunu döndürür.

---

## **3. `continue` Anahtar Kelimesi**
`continue`, döngü içindeki mevcut yinelemeyi atlayarak bir sonraki tura geçmek için kullanılır. **Döngüyü kırmaz**, yalnızca **belirtilen koşulda o adımı atlar**.

**Çalışma Mantığı:**
- `continue` çağrıldığında, döngünün geri kalan kodları çalıştırılmaz ve **bir sonraki iterasyona geçilir**.
- Genellikle **belirli bir durumu atlamak** için kullanılır.

### **Örnek 1: Tek Sayıları Atlamak**
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Tek sayılar için
                continue; // Döngüde kalan işlemleri atla ve bir sonraki adıma geç.
            }
            System.out.println("Çift sayı: " + i);
        }
    }
}
```
**Çıktı:**
```
Çift sayı: 2
Çift sayı: 4
Çift sayı: 6
Çift sayı: 8
Çift sayı: 10
```
- `i` tek sayı olduğunda `continue` çalışır ve o iterasyonun geri kalan kısmı atlanır.

### **Örnek 2: İç İçe Döngülerde `continue` Kullanımı**
```java
public class NestedContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // `j == 2` olduğunda iç döngünün bu iterasyonu atlanır.
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
```
**Çıktı:**
```
i: 1, j: 1
i: 1, j: 3
i: 2, j: 1
i: 2, j: 3
i: 3, j: 1
i: 3, j: 3
```
- `j == 2` olduğunda `continue` çalışır ve o adımdaki işlemleri atlar.

---

## **Sonuç Karşılaştırması**
| Anahtar Kelime | Kullanım Alanı | Etkisi |
|---------------|---------------|--------|
| `break` | Döngüleri ve `switch` bloklarını kırmak için | Döngü tamamen sona erer. |
| `return` | Metotlardan çıkış yapmak için | Metodu bitirir ve değer döndürür. |
| `continue` | Döngü içinde belirli bir iterasyonu atlamak için | O iterasyonu atlar, döngü devam eder. |


## String
```sh 

```
---
# **Java'da String Nedir? (Detaylı Açıklama)**

### **📌 String Nedir?**
Java'da **`String`** bir **karakter dizisi** (text verisi) saklamak için kullanılan **sınıf (class)** türüdür. **Java’da `String`, ilkel (primitive) bir veri tipi değildir**, aksine **`java.lang.String` sınıfına** ait bir **nesnedir**.

- **Immutable (değiştirilemez)** bir yapıya sahiptir.
- **Heap** üzerinde oluşturulur ve **String Pool (Havuz)** kullanılarak yönetilir.
- `+` operatörü ile birleştirme (concatenation) yapılabilir.
- **`equals()` ve `==` farkı** gibi önemli detayları vardır.

---

## **📌 1. String Tanımlama Yöntemleri**
Java’da `String` oluşturmanın **iki farklı yolu** vardır:

### **1️⃣ String Havuzu (`String Pool`) ile Tanımlama**
```java
String str1 = "Merhaba"; // String literal ile oluşturuldu
String str2 = "Merhaba";
```
- `"Merhaba"` **String Pool’a eklenir**.
- **Aynı String değerini tekrar oluşturduğumuzda, hafızada yeni bir nesne oluşturulmaz**, aynı referansa atanır.
- **Bellek kullanımını optimize eder**.

---

### **2️⃣ `new` Operatörü ile Tanımlama**
```java
String str3 = new String("Merhaba");
String str4 = new String("Merhaba");
```
- **Her seferinde yeni bir nesne oluşturur** (Heap içinde).
- **Fazladan bellek harcar**, çünkü `new` ile oluşturulan `String` nesneleri `String Pool` kullanmaz.

📌 **Karşılaştırma:**
```java
System.out.println(str1 == str2); // true (Aynı referans)
System.out.println(str3 == str4); // false (Farklı nesneler)
System.out.println(str1.equals(str3)); // true (İçerik karşılaştırması)
```

---

## **📌 2. String Metotları**
Java'nın `String` sınıfı **zengin bir metot koleksiyonuna sahiptir**. Bunları detaylıca inceleyelim.

### **✅ 2.1 Uzunluk Öğrenme - `length()`**
```java
String text = "Java Programlama";
System.out.println(text.length()); // 17
```

---

### **✅ 2.2 Karakter Erişimi - `charAt(index)`**
```java
String text = "Java";
System.out.println(text.charAt(0)); // J
System.out.println(text.charAt(2)); // v
```

---

### **✅ 2.3 Parça Alma (Substring) - `substring()`**
```java
String text = "Merhaba Dünya";
System.out.println(text.substring(8)); // "Dünya"
System.out.println(text.substring(0, 7)); // "Merhaba"
```

---

### **✅ 2.4 Küçük ve Büyük Harfe Çevirme - `toUpperCase()` & `toLowerCase()`**
```java
String text = "Java";
System.out.println(text.toUpperCase()); // "JAVA"
System.out.println(text.toLowerCase()); // "java"
```

---

### **✅ 2.5 String Karşılaştırma - `equals()` ve `equalsIgnoreCase()`**
```java
String a = "Java";
String b = "java";

System.out.println(a.equals(b)); // false
System.out.println(a.equalsIgnoreCase(b)); // true
```
📌 **Neden `==` kullanılmamalı?**
- `==`, **referansları** karşılaştırır.
- `equals()` ise **içeriği** karşılaştırır.

---

### **✅ 2.6 String İçerik Kontrolleri**
#### **`contains()` → İçinde geçiyor mu?**
```java
String text = "Java öğrenmek çok eğlenceli!";
System.out.println(text.contains("Java")); // true
System.out.println(text.contains("Python")); // false
```

#### **`startsWith()` & `endsWith()` → Başlangıç ve Bitiş Kontrolü**
```java
String text = "Merhaba Dünya";
System.out.println(text.startsWith("Merhaba")); // true
System.out.println(text.endsWith("Dünya")); // true
```

---

### **✅ 2.7 String Parçalama - `split()`**
```java
String metin = "Java,Python,C++";
String[] diller = metin.split(",");

for (String dil : diller) {
    System.out.println(dil);
}
```
**Çıktı:**
```
Java
Python
C++
```

---

### **✅ 2.8 `trim()` - Boşlukları Kaldırma**
```java
String text = "   Java   ";
System.out.println(text.trim()); // "Java"
```

---

### **✅ 2.9 Değiştirme - `replace()` ve `replaceAll()`**
```java
String text = "Java kolaydır";
System.out.println(text.replace("kolay", "harika")); // "Java harikadır"
```

---

## **📌 3. String Birleştirme (Concatenation)**
### **1️⃣ `+` Operatörü ile**
```java
String s1 = "Merhaba";
String s2 = " Dünya";
String sonuc = s1 + s2;
System.out.println(sonuc); // "Merhaba Dünya"
```

### **2️⃣ `concat()` Metodu ile**
```java
String s1 = "Java";
String s2 = " Programlama";
System.out.println(s1.concat(s2)); // "Java Programlama"
```

---

## **📌 4. `StringBuilder` ve `StringBuffer`**
📌 **`String` nesneleri değiştirilemez (immutable) olduğu için, çok fazla işlem yapıldığında `StringBuilder` veya `StringBuffer` kullanmak daha verimlidir.**

### **1️⃣ `StringBuilder` (Daha Hızlı)**
```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programlama");
System.out.println(sb); // "Java Programlama"
```

### **2️⃣ `StringBuffer` (Thread-Safe)**
```java
StringBuffer sb = new StringBuffer("Java");
sb.append(" Öğreniyorum");
System.out.println(sb); // "Java Öğreniyorum"
```

| **Özellik**  | **String** | **StringBuilder** | **StringBuffer** |
|-------------|------------|----------------|----------------|
| **Değiştirilebilir mi?** | ❌ Hayır | ✅ Evet | ✅ Evet |
| **Hızlı mı?** | 🚀 Yavaş | ⚡ Hızlı | 🔒 Daha yavaş (Thread-safe) |
| **Thread-Safe mi?** | ❌ Hayır | ❌ Hayır | ✅ Evet |

---

## **📌 5. String ile `==` ve `equals()` Farkı**
```java
String str1 = "Java";
String str2 = new String("Java");

System.out.println(str1 == str2); // false (Farklı referanslar)
System.out.println(str1.equals(str2)); // true (Aynı içerik)
```
📌 **Özetle:**
- **`==`**, hafızadaki referansları karşılaştırır.
- **`equals()`**, içeriği karşılaştırır.

---

## **📌 6. String Pool ve Bellek Yönetimi**
**String Pool**, `String` nesnelerinin tekrar kullanılmasını sağlayarak **bellek optimizasyonu** yapar.

```java
String str1 = "Hello";
String str2 = "Hello";
System.out.println(str1 == str2); // true (Aynı referans)
```
Ama:
```java
String str3 = new String("Hello");
System.out.println(str1 == str3); // false (Yeni nesne)
```

---

## **📌 Sonuç**
- **`String` immutable’dır, değiştirilemez.**
- **Karşılaştırma için `equals()` kullanılır.**
- **Çok fazla işlem yapılacaksa `StringBuilder` tercih edilmelidir.**
- **Bellek yönetimi için `String Pool` mekanizması vardır.**

🚀 **String’leri etkili kullanmak, Java programlarının performansını artırabilir!** 🚀


## switch-case ile if-elseif-else arasındaki farklar nelerdir
```sh 

```
Java'da `switch-case` ve `if-else if` yapıları, akış kontrolü sağlamak için kullanılır ancak bazı temel farklara sahiptir:

### 1. **Kullanım Alanı**:
- **`if-else if` Yapısı**: Mantıksal karşılaştırmaların, aralıkların ve karmaşık koşulların değerlendirilmesi için daha esnektir. Her türlü karşılaştırmayı kullanabilirsiniz.
- **`switch-case` Yapısı**: Genellikle bir değişkenin belirli sabit değerlerle eşleşmesini kontrol etmek için kullanılır. Daha okunaklı ve performanslı olabilir.

### 2. **Desteklenen Değerler**:
- **`if-else if`**: Tüm karşılaştırmaları destekler (`<`, `>`, `<=`, `>=`, `==`, `!=`, &&, || vb.).
- **`switch-case`**: Sadece belirli sabit değerlere (`int`, `char`, `String`, `enum`, vb.) göre çalışır.

### 3. **Performans**:
- **`if-else if`**: Koşullar sırasıyla kontrol edilir, uzun bir zincir varsa performans düşebilir.
- **`switch-case`**: Derleyici `switch` ifadelerini optimize edebilir ve "jump table" gibi mekanizmalar sayesinde daha hızlı çalışabilir.

### 4. **Okunabilirlik**:
- **`if-else if`**: Uzun koşullar içeren kodlar okunabilirliği zorlaştırabilir.
- **`switch-case`**: Daha düzenli ve okunaklı olabilir, özellikle sabit değerlerle çalışırken.

---

### **Örnek Kullanım**:
#### **1. `if-else if` ile Kullanım**
```java
int sayi = 5;

if (sayi > 0 && sayi <= 10) {
    System.out.println("Sayı 1 ile 10 arasında");
} else if (sayi > 10 && sayi <= 20) {
    System.out.println("Sayı 11 ile 20 arasında");
} else {
    System.out.println("Sayı 20’den büyük");
}
```
✅ **Avantaj**: Aralık bazlı kontroller için uygundur.

---

#### **2. `switch-case` ile Kullanım**
```java
int gun = 3;
switch (gun) {
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("Salı");
        break;
    case 3:
        System.out.println("Çarşamba");
        break;
    default:
        System.out.println("Geçersiz gün");
}
```
✅ **Avantaj**: Sabit değerlere göre işlem yaparken daha düzenli bir yapı sunar.

---

### **Ne Zaman Hangi Yapıyı Kullanmalıyız?**
| **Kriter**         | **if-else if** | **switch-case** |
|-------------------|---------------|----------------|
| **Koşul Karmaşıklığı** | Esnek (>, <, &&, ||) | Sabit değerlere göre çalışır |
| **Performans** | Daha yavaş olabilir | Daha hızlı olabilir |
| **Okunabilirlik** | Karmaşık olabilir | Daha düzenli |
| **Veri Türü** | Her türlü veriyle çalışır | Sadece belirli veri türlerini destekler (`int`, `char`, `String`, `enum`) |

Eğer **aralık bazlı ve karmaşık koşullar** söz konusuysa `if-else if`, eğer **sabit değerlere göre seçim yapılıyorsa** `switch-case` kullanmak en iyi seçimdir. 🚀


## switch-case ile if-elseif-else arasındaki hız faktöri
```sh 

```
Java'da `switch-case` ve `if-else if` yapılarının algoritmik analizi için **Big-O** karmaşıklıklarını ve çalışma mekanizmalarını inceleyelim.

---

## **1. Zaman Karmaşıklığı (Time Complexity)**
### **İf-Else If-Else**
```java
if (x == 1) {
    // İşlem 1
} else if (x == 2) {
    // İşlem 2
} else if (x == 3) {
    // İşlem 3
} else {
    // Varsayılan işlem
}
```
- **En iyi durum (Best Case) - O(1)**: Eğer ilk `if` koşulu doğruysa, yalnızca bir kontrol yapılır.
- **En kötü durum (Worst Case) - O(n)**: Tüm `if` blokları kontrol edildikten sonra `else` bloğuna ulaşılırsa **n adet karşılaştırma** yapılır.
- **Ortalama durum (Average Case) - O(n/2) ≈ O(n)**: Rastgele bir değerde ortalama olarak `n/2` karşılaştırma yapılır.

✅ **Sonuç**: `if-else if` yapısı **lineer zaman karmaşıklığına (O(n))** sahiptir.

---

### **Switch-Case**
```java
switch (x) {
    case 1:
        // İşlem 1
        break;
    case 2:
        // İşlem 2
        break;
    case 3:
        // İşlem 3
        break;
    default:
        // Varsayılan işlem
}
```
Switch-case’in algoritmik analizi derleyici tarafından nasıl optimize edildiğine bağlıdır:

1. **Jump Table Kullanımı (O(1))**
    - Eğer `case` ifadeleri **küçük ve sıralı tamsayılar (int, char, enum)** ise derleyici **jump table** oluşturur.
    - Jump table, doğrudan indeksleme yaparak ilgili case’e gider. Yani **sabit zamanda (O(1))** çalışır.

2. **Binary Search Kullanımı (O(log n))**
    - Eğer case değerleri **çok büyük, rastgele dağılmış veya sıralı değilse**, JVM genellikle **binary search** kullanır.
    - Binary search, **O(log n)** zaman karmaşıklığı sağlar.

✅ **Sonuç**:
- Eğer **jump table uygulanırsa → O(1)**
- Eğer **binary search uygulanırsa → O(log n)**
- Eğer **çok fazla case varsa ve fallback olarak lineer kontrol yapılırsa → O(n)** (çok nadir)

---

## **2. Uzay (Bellek) Karmaşıklığı (Space Complexity)**
| Yapı | Uzay Karmaşıklığı |
|------|------------------|
| **If-Else If** | O(1) (Yalnızca değişkenler için bellek kullanır) |
| **Switch-Case (Jump Table)** | O(n) (Tüm case değerlerini içeren bir tablo saklar) |
| **Switch-Case (Binary Search)** | O(1) (Ekstra bellek kullanmaz) |

- `if-else` yapısında ekstra bellek kullanılmaz.
- `switch-case` için **jump table yöntemi kullanılıyorsa**, tüm olası case değerleri için bir tablo tutulduğundan **O(n) bellek** kullanımı olabilir.

---

## **3. Karşılaştırmalı Tablo**
| **Özellik**  | **If-Else If** | **Switch-Case** |
|-------------|--------------|--------------|
| **Zaman Karmaşıklığı (Worst Case)** | O(n) | O(1) (Jump Table) veya O(log n) (Binary Search) |
| **En iyi durum** | O(1) | O(1) |
| **Ortalama durum** | O(n) | O(1) veya O(log n) |
| **Aralık Kontrolü** | Evet | Hayır |
| **Hız (Küçük n için)** | Yavaş olabilir | Daha hızlı |
| **Hız (Büyük n için)** | Daha yavaş (O(n)) | Daha hızlı (O(1) veya O(log n)) |
| **Esneklik** | Daha esnek | Sadece belirli değerler için uygun |

---

## **4. Ne Zaman Hangi Yapıyı Kullanmalıyız?**
| **Durum** | **Önerilen Yapı** |
|-----------------|----------------|
| Aralık bazlı karşılaştırmalar (x > 10, x < 50 gibi) | **If-Else If** |
| Mantıksal koşullar (`&&`, `||`, `!`) | **If-Else If** |
| **Sabit değerleri karşılaştırma** | **Switch-Case** |
| **Küçük ve ardışık integer değerleriyle çalışıyorsanız** | **Switch-Case (O(1) Jump Table)** |
| **Büyük ve rastgele dağılımlı değerlerde** | **Switch-Case (O(log n) Binary Search)** |

---

### **Sonuç**
- `if-else if` **daha esnektir** ancak **O(n) performansı** nedeniyle büyük kod bloklarında yavaş olabilir.
- `switch-case` **daha hızlıdır** ve `jump table` veya `binary search` kullanarak **O(1) veya O(log n)** çalışabilir.
- Küçük sayılar ve sabit değerler için **switch-case** tercih edilmelidir.
- Mantıksal ifadeler ve aralık kontrolleri için **if-else if** kullanılır.

Bu analiz ışığında, senaryoya göre uygun olanı seçmek en iyi yaklaşımdır. 🚀

## switch-case ile if-elseif-else arasındaki hız faktöri
```sh 

```


## Method
```sh 

```
---
# **Java'da Metot (Method) Nedir? (Detaylı Açıklama)**

## **📌 1. Metot (Method) Nedir?**
Java'da **metot (method)**, belirli bir işi gerçekleştiren **kod bloklarıdır**.  
Metotlar, **kod tekrarını önler, programı daha düzenli hale getirir ve yeniden kullanılabilirlik sağlar**.  
Bir metot, **parametre alabilir, bir değer döndürebilir veya sadece bir işlemi gerçekleştirebilir.**

---

## **📌 2. Java’da Metot Tanımlama**
Java'da bir metot **4 ana bileşenden oluşur**:

1. **Erişim Belirleyici (Access Modifier)** → `public`, `private`, `protected`
2. **Geri Dönüş Tipi (Return Type)** → `void`, `int`, `double`, `String`, vb.
3. **Metot Adı (Method Name)** → `camelCase` kuralına uygun olmalıdır.
4. **Parametre Listesi (Parameters)** → **Metodun giriş değerleri**.

📌 **Genel Metot Tanımı:**
```java
erişimBelirteci geriDönüşTipi metotAdı(parametreler) {
    // Metot gövdesi (method body)
}
```

---

## **📌 3. Parametresiz ve Parametreli Metotlar**
### **✅ 3.1 Parametresiz Metot**
Parametresiz metot, **hiçbir giriş almadan** belirli bir işlemi gerçekleştirir.

```java
public class MetotOrnek {
    public static void selamVer() {
        System.out.println("Merhaba, hoş geldiniz!");
    }

    public static void main(String[] args) {
        selamVer(); // Metot çağrıldı
    }
}
```
**Çıktı:**
```
Merhaba, hoş geldiniz!
```
- **Metot parametre almaz**.
- **Çağrıldığında her zaman aynı çıktıyı üretir**.

---

### **✅ 3.2 Parametreli Metot**
Bir metot, **giriş değerleri (parametreler) alarak farklı sonuçlar üretebilir**.

```java
public class MetotOrnek {
    public static void selamVer(String isim) {
        System.out.println("Merhaba, " + isim + "!");
    }

    public static void main(String[] args) {
        selamVer("Hamit"); // Parametre olarak "Hamit" gönderildi
        selamVer("Ayşe");  // Parametre olarak "Ayşe" gönderildi
    }
}
```
**Çıktı:**
```
Merhaba, Hamit!
Merhaba, Ayşe!
```
📌 **Metot farklı girişlerle farklı sonuçlar üretebilir.**

---

## **📌 4. Geri Dönüş Tipi (Return Type)**
Metotlar, işlem sonucunda bir değer döndürebilir. Bunun için **geri dönüş tipi belirtilmelidir**.

### **✅ 4.1 `void` Metotlar**
Eğer metot **bir değer döndürmeyecekse**, **`void`** olarak tanımlanır.

```java
public class VoidExample {
    public static void yazdir(String mesaj) {
        System.out.println(mesaj);
    }

    public static void main(String[] args) {
        yazdir("Java metotları öğreniyoruz!");
    }
}
```
**Çıktı:**
```
Java metotları öğreniyoruz!
```
📌 **`void` metotlar, bir işlem yapar ama geri dönüş değeri yoktur.**

---

### **✅ 4.2 Değer Döndüren Metotlar**
Metot bir işlem sonucunda bir değer döndürebilir.

```java
public class MetotOrnek {
    public static int kareAl(int sayi) {
        return sayi * sayi;
    }

    public static void main(String[] args) {
        int sonuc = kareAl(5);
        System.out.println("Sonuç: " + sonuc);
    }
}
```
**Çıktı:**
```
Sonuç: 25
```
📌 **Metot `int` türünde bir değer döndürdüğü için `return` ifadesi kullanıldı.**

---

## **📌 5. Metot Aşırı Yükleme (Method Overloading)**
📌 **Aynı isimli birden fazla metot tanımlamak mümkündür, ancak parametreleri farklı olmalıdır.**

```java
public class OverloadingExample {
    public static int toplama(int a, int b) {
        return a + b;
    }

    public static double toplama(double a, double b) {
        return a + b;
    }

    public static int toplama(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(toplama(5, 10));        // int parametreli
        System.out.println(toplama(5.5, 2.5));    // double parametreli
        System.out.println(toplama(1, 2, 3));      // 3 parametreli
    }
}
```
**Çıktı:**
```
15
8.0
6
```
📌 **Method Overloading ile farklı parametre türlerine göre farklı işlemler yapılabilir.**

---

## **📌 6. `static` ve `non-static` Metotlar**
### **✅ 6.1 `static` Metotlar**
- **Sınıfa aittir, nesne oluşturmadan çağrılabilir**.
- **Doğrudan `ClassName.metotAdi()` şeklinde erişilir**.

```java
public class MathUtil {
    public static int kupAl(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        System.out.println(kupAl(3)); // 27
    }
}
```
---

### **✅ 6.2 `non-static` Metotlar**
- **Nesne oluşturularak çağrılır**.
- **Her nesne için farklı değerler tutabilir**.

```java
public class HesapMakinesi {
    public int topla(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        HesapMakinesi hm = new HesapMakinesi();
        System.out.println(hm.topla(3, 7)); // 10
    }
}
```

---

## **📌 7. Rekürsif (Recursive) Metotlar**
📌 **Metot, kendi kendini çağırır**. Özellikle **faktöriyel, Fibonacci gibi hesaplamalarda** kullanılır.

```java
public class RecursionExample {
    public static int faktoriyel(int n) {
        if (n == 1) {
            return 1;
        }
        return n * faktoriyel(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(faktoriyel(5)); // 120
    }
}
```
**Çıktı:**
```
120
```
📌 **Özyinelemeli metotlar, dikkatli kullanılmazsa sonsuz döngüye neden olabilir!**

---

## **📌 8. `final` Metotlar (Override Engelleme)**
- **Bir metot `final` olarak tanımlanırsa, alt sınıflar tarafından değiştirilemez.**

```java
class Hayvan {
    public final void sesCikar() {
        System.out.println("Ses çıkarıyorum!");
    }
}

class Kedi extends Hayvan {
    // public void sesCikar() {} // HATA! Çünkü final metot değiştirilemez.
}
```

---

## **📌 9. Özet**
| Özellik | Açıklama |
|---------|---------|
| **Parametresiz Metot** | Hiçbir giriş almadan çalışır. |
| **Parametreli Metot** | Dışarıdan veri alır ve ona göre işlem yapar. |
| **Geri Dönüşlü Metot** | İşlem sonucunu döndürür. |
| **Overloading (Aşırı Yükleme)** | Aynı isimli farklı parametrelerle metot tanımlanır. |
| **Static Metot** | Nesne oluşturmadan çağrılabilir. |
| **Non-Static Metot** | Nesne oluşturarak kullanılır. |
| **Rekürsif (Recursive) Metot** | Kendi kendini çağıran metottur. |

📌 **Java'da metotlar, kod tekrarını önler ve programın yönetilebilirliğini artırır! 🚀**


## Javada Adresleme Nasıldır ?
```sh 

```
---


## **Java'da Adresleme Nasıl Çalışır? (Bellek Yönetimi ve Referanslar)**
Java'da adresleme, **bellek yönetimi, nesne referansları ve değişkenlerin nasıl saklandığıyla** ilgilidir. **Java, bellek yönetimini büyük ölçüde otomatik hale getirir (Garbage Collector sayesinde), ancak bellekte verilerin nasıl tutulduğunu anlamak önemlidir.**

---

## **1. Java'da Bellek Alanları**
Java'da bellek iki ana bölüme ayrılır:

| **Bellek Alanı** | **Ne İçin Kullanılır?** |
|----------------|----------------------|
| **Stack Bellek** | **Yerel değişkenler, primitive türler ve referans değişkenleri burada saklanır.** |
| **Heap Bellek** | **Tüm nesneler burada saklanır. Heap üzerindeki nesneler referans değişkenleri tarafından işaret edilir.** |

### **📌 Önemli: Java'da Bellek Adresleme Mantığı**
- **Primitive türler (`int`, `double`, `char`, vb.)** **stack bellekte** doğrudan saklanır.
- **Referans türler (`String`, `Array`, `Object`, vb.)** **heap bellekte saklanır**, ancak değişkenler stack'te sadece **adresini (referansını)** tutar.
- **Nesneye erişim, referans üzerinden yapılır** (C++'daki pointer'lara benzemez, ama mantık olarak benzer çalışır).

---

## **2. Örneklerle Java'da Adresleme**

### **🎯 Örnek 1: Primitive Veri Türlerinin Stack Üzerinde Saklanması**
```java
public class PrimitiveStackExample {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // b, a'nın değerini alır (Kopyalanır, adres paylaşımı olmaz)
        b = 20;
        
        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // 20
    }
}
```
📌 **Stack Bellek Yapısı:**
- `a` değişkeni stack bellekte saklanır (`a -> 10`).
- `b = a;` dediğimizde `b` için yeni bir bellek alanı açılır ve `10` kopyalanır.
- `b` değiştiğinde `a` etkilenmez, çünkü **primitive değişkenler direkt olarak stack bellekte saklanır ve kopyalanır**.

---

### **🎯 Örnek 2: Referans Türleri ve Heap Bellek**
```java
class Araba {
    String model;
}

public class ReferenceExample {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.model = "BMW";

        Araba araba2 = araba1; // araba1'in referansı kopyalandı

        araba2.model = "Mercedes";

        System.out.println("araba1 Model: " + araba1.model); // Mercedes
        System.out.println("araba2 Model: " + araba2.model); // Mercedes
    }
}
```
📌 **Heap Bellek Yapısı:**
1. `Araba araba1 = new Araba();`
    - Yeni bir `Araba` nesnesi **Heap bellekte oluşturulur**.
    - `araba1` değişkeni, stack bellekte nesnenin **heap adresini** tutar.
2. `Araba araba2 = araba1;`
    - `araba2`, **araba1 ile aynı heap adresini işaret eder** (Yeni nesne oluşturulmaz!).
    - Yani `araba1` ve `araba2` aynı nesneyi gösterir.
3. `araba2.model = "Mercedes";`
    - `araba2` üzerinden nesne değiştirildiği için, **`araba1` de aynı nesneyi gösterdiğinden değişim her iki değişkende de görünür.**

🚨 **Önemli Not:**  
Eğer `araba2 = new Araba();` yapsaydık, **heap bellekte yeni bir nesne oluşturulurdu** ve `araba1` ile bağı kopardı.

---

## **3. Adresleme Mantığı: `==` vs `.equals()`**
### **📌 `==` Operatörü (Bellek Adresi Karşılaştırması)**
- İki referansın **aynı heap adresine** mi işaret ettiğini kontrol eder.

### **📌 `.equals()` Metodu (İçerik Karşılaştırması)**
- **Nesnelerin içeriğini karşılaştırır**.

```java
String s1 = new String("Merhaba");
String s2 = new String("Merhaba");

System.out.println(s1 == s2); // false (Farklı heap nesneleri)
System.out.println(s1.equals(s2)); // true (İçerik aynı)
```
📌 **Neden?**
- `s1` ve `s2` ayrı `new String()` ile oluşturulduğundan **farklı heap adreslerinde** saklanır.
- **Ancak içerikleri aynı olduğundan** `.equals()` true döndürür.

---

## **4. Garbage Collector (Çöp Toplayıcı)**
- **Java’da manuel `free()` veya `delete` yoktur (C++ gibi).**
- **Garbage Collector (GC)**, kullanılmayan nesneleri otomatik olarak temizler.

### **GC'nin Çalıştığı Durumlar:**
1. **Bir nesneye referans kalmazsa temizlenir**:
```java
Araba araba1 = new Araba();
araba1 = null; // Bu nesne artık Garbage Collector tarafından temizlenebilir.
```
2. **Eğer referans başka bir nesneye atanırsa, önceki nesne erişilemez olur**:
```java
Araba araba1 = new Araba();
Araba araba2 = new Araba();
araba1 = araba2; // Önceki araba1 nesnesi artık kullanılmaz ve GC temizleyebilir.
```
✅ **Heap bellekten silinme işlemi Garbage Collector tarafından yönetilir.**

---

## **5. Nesneleri Kopyalama ve Adresleme**
- Eğer **nesnenin farklı bir kopyasını oluşturmak** istiyorsak **deep copy (derin kopya) yapmalıyız**.

### **📌 Shallow Copy (Yüzeysel Kopyalama - Aynı Referansı Kullanır)**
```java
Araba araba1 = new Araba();
araba1.model = "Audi";

Araba araba2 = araba1; // Aynı heap adresini gösterir
araba2.model = "Tesla";

System.out.println(araba1.model); // Tesla
```

### **📌 Deep Copy (Derin Kopyalama - Yeni Bir Nesne Oluşturur)**
```java
Araba araba1 = new Araba();
araba1.model = "Audi";

Araba araba2 = new Araba();
araba2.model = araba1.model; // Yeni nesneye ayrı değer atanıyor.

araba2.model = "Tesla";

System.out.println(araba1.model); // Audi (Değişmez!)
System.out.println(araba2.model); // Tesla
```
✅ **Deep Copy kullanarak heap bellekte farklı nesneler oluşturmuş olduk.**

---

## **6. Özet: Java'da Adresleme**
| **Tür** | **Saklandığı Bellek** | **Adresleme Mantığı** |
|---------|----------------|----------------|
| **Primitive Türler (`int`, `char`, `double`, vb.)** | **Stack Bellekte** | Direkt değer saklanır, referans kullanılmaz |
| **Referans Türler (`String`, `Array`, `Object`)** | **Stack’te referans, Heap’te nesne** | Heap’te nesne tutulur, stack sadece adresini saklar |
| **`==` Operatörü** | **Heap adreslerini karşılaştırır** | Aynı heap nesnesine mi işaret ediyor? |
| **`.equals()` Metodu** | **İçeriği karşılaştırır** | İçerik aynı mı? |
| **Garbage Collector (GC)** | **Heap’teki kullanılmayan nesneleri temizler** | Kullanılmayan nesneleri siler |

✅ **Java, bellek adresleme işlemlerini otomatik olarak yönetir, ancak referans mantığını anlamak performans açısından önemlidir.** 🚀


## Tarih
```sh 

```
---
# **📌 Java'da Tarihler ve Zaman İşlemleri (Detaylı Açıklama)**

Java'da tarih ve zaman işlemleri için birçok **sınıf ve API** bulunmaktadır. **Java 8**'den önce ve sonra farklı yöntemler kullanılmıştır.
- **Java 8 öncesi:** `java.util.Date`, `java.util.Calendar`, `java.text.SimpleDateFormat`
- **Java 8 sonrası:** `java.time` paketi (`LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, vb.)

---

# **🔹 1. Java'da Tarih ve Zaman Kullanımı**
## **✅ 1.1 `java.util.Date` Sınıfı (Eski Yöntem)**
`Date` sınıfı, **tarih ve zaman bilgilerini saklayan eski bir sınıftır.**  
**Ancak modifiye edilemez (immutable) olduğu için yetersizdir.**

```java
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date simdikiZaman = new Date(); // Şu anki tarih ve saat
        System.out.println("Bugünün Tarihi: " + simdikiZaman);
    }
}
```
**Çıktı (Anlık Değişir):**
```
Bugünün Tarihi: Mon Feb 12 14:30:21 TRT 2025
```

📌 **Sorunlar:**
- **Zaman dilimi (TimeZone) destekleri yetersizdir.**
- **Daha iyi biçimlendirme ve zaman işlemleri için `SimpleDateFormat` ve `Calendar` kullanmak gerekir.**

---

## **✅ 1.2 `SimpleDateFormat` ile Tarih Biçimlendirme**
`SimpleDateFormat` kullanarak, tarihleri **istenilen formatta gösterebiliriz.**

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        Date tarih = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        String formatliTarih = sdf.format(tarih);
        System.out.println("Formatlı Tarih: " + formatliTarih);
    }
}
```
**Çıktı:**
```
Formatlı Tarih: 12/02/2025 14:30:21
```
📌 **Format Açıklamaları:**
- `dd` → Gün (`12`)
- `MM` → Ay (`02`)
- `yyyy` → Yıl (`2025`)
- `HH:mm:ss` → Saat, dakika, saniye (`14:30:21`)

---

## **✅ 1.3 `java.util.Calendar` ile Tarih Manipülasyonu**
`Calendar`, `Date` sınıfının eksikliklerini gidermek için geliştirilmiş bir sınıftır.

```java
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Yıl: " + cal.get(Calendar.YEAR));
        System.out.println("Ay: " + (cal.get(Calendar.MONTH) + 1)); // Aylar 0'dan başlar!
        System.out.println("Gün: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}
```
📌 **Eksikleri:**
- **Karmaşık bir yapıdadır.**
- **Java 8 ile daha modern API'ler gelmiştir.**

---

# **🔹 2. Java 8 ve Sonrası (`java.time` Paketi)**
📌 **Java 8 ile gelen `java.time` paketi**, modern ve güçlü tarih/zaman işlemleri sağlar.
- **Immutable (değiştirilemez)** nesneler oluşturur.
- **Daha okunaklı ve kolay manipülasyon sağlar.**
- **Zaman dilimleri ve biçimlendirme desteği daha iyidir.**

---

## **✅ 2.1 `LocalDate` (Sadece Tarih İçin)**
`LocalDate`, **sadece tarih (gün, ay, yıl) bilgisi tutar, saat tutmaz.**

```java
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now(); // Bugünün tarihi
        System.out.println("Bugünün Tarihi: " + bugun);
        
        LocalDate ozelTarih = LocalDate.of(2025, 2, 12); // Özel bir tarih
        System.out.println("Özel Tarih: " + ozelTarih);
    }
}
```
📌 **LocalDate, tarih hesaplamaları için idealdir.**

---

## **✅ 2.2 `LocalTime` (Sadece Saat İçin)**
`LocalTime`, **sadece saat, dakika, saniye tutar, tarih bilgisi içermez.**

```java
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime simdikiSaat = LocalTime.now();
        System.out.println("Şu anki saat: " + simdikiSaat);
    }
}
```
**Çıktı (Anlık Değişir):**
```
Şu anki saat: 14:30:21.345
```
📌 **Mikrosaniye ve nanosaniye bile içerebilir.**

---

## **✅ 2.3 `LocalDateTime` (Tarih ve Saat Birlikte)**
`LocalDateTime`, hem **tarih hem de saat** bilgisini içerir.

```java
import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime simdi = LocalDateTime.now();
        System.out.println("Şu an: " + simdi);
    }
}
```
📌 **`LocalDateTime`, `LocalDate` ve `LocalTime` birleşimidir.**

---

## **✅ 2.4 `ZonedDateTime` (Zaman Dilimi ile Tarih ve Saat)**
📌 **Farklı zaman dilimlerine göre tarih/saat almak için `ZonedDateTime` kullanılır.**

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime istanbulSaati = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("İstanbul Saati: " + istanbulSaati);
    }
}
```
📌 **Dünya çapında geçerli zaman dilimlerini kullanarak çalışabilirsiniz.**

---

# **🔹 3. Java'da Tarih İşlemleri**
## **✅ 3.1 Tarih ve Saat Manipülasyonu**
`plusDays()`, `minusMonths()`, `plusHours()` gibi metotlarla tarih/saat hesaplamaları yapılabilir.

```java
import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate birHaftaSonra = bugun.plusDays(7);
        LocalDate birAyÖnce = bugun.minusMonths(1);

        System.out.println("Bugün: " + bugun);
        System.out.println("Bir Hafta Sonra: " + birHaftaSonra);
        System.out.println("Bir Ay Önce: " + birAyÖnce);
    }
}
```
📌 **Immutable olduğu için, tarih değişmez, yeni bir tarih nesnesi oluşturulur.**

---

# **🔹 4. Tarih Karşılaştırma**
📌 **Tarihler `isBefore()`, `isAfter()`, `isEqual()` metotlarıyla karşılaştırılabilir.**

```java
import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate tarih1 = LocalDate.of(2025, 2, 12);
        LocalDate tarih2 = LocalDate.of(2025, 5, 15);

        System.out.println("tarih1, tarih2'den önce mi? " + tarih1.isBefore(tarih2));
        System.out.println("tarih1, tarih2 ile aynı mı? " + tarih1.isEqual(tarih2));
    }
}
```
📌 **Tarihler sıralama veya geçerlilik kontrollerinde kullanışlıdır.**

---

# **📌 5. Özet**
| **Sınıf** | **Ne İçin Kullanılır?** |
|-----------|--------------------------|
| `Date` | Eski tarih/saat sınıfı, önerilmez. |
| `Calendar` | Eski tarih manipülasyonu, önerilmez. |
| `SimpleDateFormat` | Tarih biçimlendirme, eski yöntem. |
| `LocalDate` | **Sadece tarih** (yıl, ay, gün). |
| `LocalTime` | **Sadece saat** (saat, dakika, saniye). |
| `LocalDateTime` | **Tarih + Saat** birlikte. |
| `ZonedDateTime` | **Zaman dilimi ile tarih/saat işlemleri.** |

📌 **Java 8+ ile `java.time` kullanarak daha güçlü ve güvenilir tarih işlemleri yapabilirsiniz! 🚀**


## Exception
```sh 

```
---
# **📌 Java'da Exception (İstisna) Nedir? (Detaylı Açıklama)**

---

## **🔹 1. Exception (İstisna) Nedir?**
**Exception (İstisna)**, program çalışırken meydana gelen **beklenmedik hatalar** ve **öngörülemeyen durumları** ifade eder.  
Java'da **Exception Handling (İstisna Yönetimi)** sayesinde programın çökmesi engellenir ve hatalar yönetilebilir hale gelir.

📌 **Java'da hatalar iki ana kategoriye ayrılır:**
1. **Checked Exceptions (Denetlenen İstisnalar)**
2. **Unchecked Exceptions (Denetlenmeyen İstisnalar)**

---

## **🔹 2. Java'da Exception Hiyerarşisi**
Java'daki tüm hata türleri **`Throwable`** sınıfından türetilir.

```
Throwable
 ├── Exception  (Checked Exceptions)
 │   ├── IOException
 │   ├── SQLException
 │   ├── FileNotFoundException
 │   ├── ClassNotFoundException
 │   ├── InterruptedException
 │
 ├── RuntimeException (Unchecked Exceptions)
 │   ├── ArithmeticException
 │   ├── NullPointerException
 │   ├── ArrayIndexOutOfBoundsException
 │   ├── IllegalArgumentException
 │   ├── NumberFormatException
 │
 └── Error
     ├── StackOverflowError
     ├── OutOfMemoryError
     ├── VirtualMachineError
```

### **📌 2.1 `Exception` (İstisna)**
- **Programcı tarafından kontrol edilebilir hatalardır.**
- **`try-catch` blokları ile yakalanabilir.**
- Örnekler: `IOException`, `SQLException`, `FileNotFoundException`.

### **📌 2.2 `RuntimeException` (Çalışma Zamanı İstisnaları)**
- **Kod çalıştırıldığında ortaya çıkan beklenmedik hatalardır.**
- **Önceden kontrol edilmek zorunda değildir.**
- Örnekler: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`.

### **📌 2.3 `Error` (Sistemsel Hatalar)**
- **Programcı tarafından kontrol edilemez.**
- **Genellikle JVM kaynaklı hatalardır.**
- Örnekler: `OutOfMemoryError`, `StackOverflowError`.

---

# **🔹 3. Java'da Exception Handling (İstisna Yönetimi)**

## **✅ 3.1 `try-catch` Blokları ile Hata Yönetimi**
**`try-catch` bloğu**, hata alabilecek kodları yönetmek için kullanılır.

```java
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int sayi = 10 / 0; // Hata: Bölme işlemi sıfıra bölünemez!
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme hatası!");
        }
        System.out.println("Program devam ediyor...");
    }
}
```
**Çıktı:**
```
Hata: Sıfıra bölme hatası!
Program devam ediyor...
```
📌 **`try` bloğu hata içerirse, `catch` bloğu devreye girer ve program çökmeden devam eder.**

---

## **✅ 3.2 `Multiple Catch` (Birden Fazla `catch` Bloğu Kullanımı)**
**Farklı hataları yakalamak için birden fazla `catch` bloğu kullanılabilir.**

```java
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] dizi = {1, 2, 3};
            System.out.println(dizi[5]); // Hata: Dizinin sınırları aşılıyor!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Dizi sınırları aşıldı!");
        } catch (ArithmeticException e) {
            System.out.println("Hata: Matematiksel hata!");
        }
        System.out.println("Program devam ediyor...");
    }
}
```
**Çıktı:**
```
Hata: Dizi sınırları aşıldı!
Program devam ediyor...
```

📌 **Her `catch` bloğu, farklı hata türlerini yakalamak için kullanılır.**

---

## **✅ 3.3 `finally` Bloğu (Her Koşulda Çalışan Kod)**
- **`finally` bloğu, hata olsun ya da olmasın her durumda çalışır.**
- **Genellikle kaynakları kapatmak için kullanılır (`File`, `Database Connection`, vb.).**

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int sonuc = 10 / 2;
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Matematiksel hata!");
        } finally {
            System.out.println("Bu blok her zaman çalışır!");
        }
    }
}
```
**Çıktı:**
```
Sonuç: 5
Bu blok her zaman çalışır!
```

📌 **Hata olsun veya olmasın, `finally` bloğu her zaman çalışır.**

---

## **✅ 3.4 `throws` ile Hata Bildirme**
📌 **Bir metot hata üretebiliyorsa, bunu `throws` ile belirtmelidir.**

```java
import java.io.*;

public class ThrowsExample {
    public static void dosyaOku() throws IOException {
        FileReader file = new FileReader("dosya.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        try {
            dosyaOku();
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası!");
        }
    }
}
```
📌 **`throws`, metot içinde oluşabilecek hataları bildirmek için kullanılır.**

---

## **✅ 3.5 `throw` ile Manuel Hata Fırlatma**
📌 **Kendi özel hatalarınızı fırlatmak için `throw` kullanılır.**

```java
public class ThrowExample {
    public static void kontrolEt(int yas) {
        if (yas < 18) {
            throw new IllegalArgumentException("Yaş 18'den küçük olamaz!");
        }
        System.out.println("Giriş başarılı.");
    }

    public static void main(String[] args) {
        kontrolEt(16); // Hata fırlatılır
    }
}
```
**Çıktı:**
```
Exception in thread "main" java.lang.IllegalArgumentException: Yaş 18'den küçük olamaz!
```
📌 **`throw`, özel hatalar oluşturmak için kullanılır.**

---

# **🔹 4. Özel Exception (Custom Exception)**
Java'da **kendimize özel hata sınıfları oluşturabiliriz.**

```java
class YasHatasi extends Exception {
    public YasHatasi(String mesaj) {
        super(mesaj);
    }
}

public class CustomExceptionExample {
    public static void kontrolEt(int yas) throws YasHatasi {
        if (yas < 18) {
            throw new YasHatasi("Yaş 18'den küçük olamaz!");
        }
        System.out.println("Giriş başarılı.");
    }

    public static void main(String[] args) {
        try {
            kontrolEt(16);
        } catch (YasHatasi e) {
            System.out.println("Özel Hata: " + e.getMessage());
        }
    }
}
```
**Çıktı:**
```
Özel Hata: Yaş 18'den küçük olamaz!
```
📌 **Kendi hata türlerimizi oluşturup fırlatabiliriz.**

---

# **📌 5. Özet**
| **Exception Türü** | **Açıklama** | **Örnek** |
|------------------|-------------|-------------|
| **Checked Exception** | **Derleme (compile-time) sırasında kontrol edilir.** | `IOException`, `SQLException` |
| **Unchecked Exception** | **Çalışma zamanında (runtime) meydana gelir.** | `NullPointerException`, `ArithmeticException` |
| **Error** | **Sistem kaynaklı büyük hatalar.** | `StackOverflowError`, `OutOfMemoryError` |

📌 **Exception Handling ile programlarımız hata alsa bile çökmemeyi ve düzgün çalışmayı sürdürmeyi başarabilir. 🚀**



## javda null değeri ne zaman kullanmalıyım ?
```sh 

```
---
Java'da **`null` değeri**, bir referansın **herhangi bir nesneyi işaret etmediğini** belirtmek için kullanılır. Ancak, **dikkatli kullanılmalıdır**, çünkü `NullPointerException` hatasına neden olabilir.

---

## **1. `null` Ne Zaman Kullanılır?**
### **a) Nesne Başlatmadan (Initialize) Kullanım**
- Bir `String` veya nesne henüz belirsizse `null` atanabilir:
```java
String metin = null;
System.out.println(metin); // null
```
- Ancak, **kullanılmadan önce `null` kontrolü yapılmalıdır**:
```java
if (metin != null) {
    System.out.println(metin.length()); // NullPointerException'ı önler
}
```

---

### **b) Nesne Ataması Sonradan Yapılacaksa**
- Eğer bir nesne **ilerleyen aşamalarda atanacaksa** ama şimdilik bir değere sahip olmaması gerekiyorsa:
```java
class Araba {
    String model = null; // Model henüz belirlenmedi
}
```
- Böylece **ilk başta bellek tüketilmez**, nesne oluşturulduğunda atanır.

---

### **c) Bir Nesne Serbest Bırakılmak (Garbage Collection) İstenirse**
- Java'da **manuel bellek yönetimi yoktur**, ancak bir nesne `null` yapılarak **çöp toplayıcının (Garbage Collector) temizlemesine izin verilebilir**.
```java
Araba araba = new Araba();
araba = null; // Garbage Collector artık bu nesneyi temizleyebilir
```

---

### **d) Koleksiyonlarda Başlangıç Değeri Olarak**
- Eğer bir `List` veya `Map` içinde **başlangıçta bir değerin olmaması gerekiyorsa**:
```java
Map<String, String> isimler = new HashMap<>();
isimler.put("Ali", null); // Ali için henüz bir değer yok
```
- **Ancak, `null` yerine `Optional` kullanımı önerilir (bkz. `Optional<T>`)**.

---

## **2. `null` Kullanımında Dikkat Edilmesi Gerekenler**
### **🚨 `NullPointerException` (NPE) Hatası**
Eğer `null` olan bir nesneye metot çağrısı yapılırsa:
```java
String kelime = null;
System.out.println(kelime.length()); // 🚨 NullPointerException Hatası!
```
**Çözüm:** `null` kontrolü yapın:
```java
if (kelime != null) {
    System.out.println(kelime.length());
}
```

---

## **3. `null` Kullanımına Alternatifler**
### **a) `Optional<T>` Kullanımı (Tavsiye Edilir ✅)**
- **Java 8+**, `null` hatalarını önlemek için `Optional<T>` sunar:
```java
Optional<String> kelime = Optional.ofNullable(null);
System.out.println(kelime.orElse("Varsayılan Değer")); // Varsayılan Değer
```
✅ **Avantajı:** `null` kontrollerini otomatik yapar.

---

### **b) Boş String Kullanımı (`""` yerine `null`)**
Bazı durumlarda `null` yerine boş string (`""`) kullanmak daha güvenli olabilir:
```java
String mesaj = ""; // NullPointerException riski yok
```

---

## **4. Özet: `null` Kullanımı**
| **Durum** | **Kullanım** |
|-----------|------------|
| **Değişkenin başlatılmadığını belirtmek için** | ✅ Kullanılabilir |
| **Bir nesnenin çöp toplayıcı tarafından temizlenmesini sağlamak için** | ✅ Kullanılabilir |
| **Koleksiyonlarda bilinmeyen değerler için** | ✅ Kullanılabilir (Ancak `Optional` önerilir) |
| **Metot çağrılarında ve işlemlerde `null` değer beklenmiyorsa** | 🚫 Kullanılmamalı (Yerine `Optional` veya boş nesne kullanılmalı) |
| **Kontrol edilmeden `null` üzerinden işlem yapmak (`.length()`, `.get()`, vb.)** | 🚫 `NullPointerException` hatasına neden olabilir |

---

✅ **Sonuç:** `null` dikkatli kullanılmalıdır. **Gereksiz `null` kullanımı yerine `Optional<T>`, varsayılan değerler veya boş nesneler kullanılabilir.** 🚀


## Formatter
```sh 

```
---
# **📌 Java `Formatter` Nedir? (Detaylı Anlatım)**
`Formatter` sınıfı, Java'da metinleri **biçimlendirmek (formatlamak)** için kullanılan bir sınıftır. `printf()`, `String.format()` gibi yöntemlerle çalışır ve sayıları, tarihleri, metinleri özel formatlara sokmak için kullanılır.

### **📌 Kullanım Alanları**
✅ **Metin biçimlendirme** (`String.format()` ve `printf()`)  
✅ **Sayıları belirli ondalık hassasiyette göstermek**  
✅ **Tarih ve saat biçimlendirme**  
✅ **Tablolar, raporlar veya dosya çıktıları için veri düzenleme**

---

# **1️⃣ Formatter Kullanımı**
`java.util.Formatter` doğrudan kullanılabilir. Ancak genellikle `String.format()` veya `System.out.printf()` ile dolaylı olarak kullanılır.

```java
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Merhaba %s, yaşınız %d", "Hamit", 25);
        System.out.println(formatter);
        formatter.close();
    }
}
```
**🎯 Çıktı:**
```
Merhaba Hamit, yaşınız 25
```

### **📌 Açıklamalar:**
- `%s` → **String** türü için yer tutucu.
- `%d` → **Tam sayı** türü için yer tutucu.
- `formatter.close();` → Formatter’ı kapatarak belleği serbest bırakır.

---

# **2️⃣ `String.format()` ile Kullanım (Önerilen)**
`Formatter` kullanmanın en yaygın yolu `String.format()` metodudur. Bu yöntemle **formatlı bir String döndürülür**.

```java
public class Main {
    public static void main(String[] args) {
        String formattedString = String.format("Merhaba %s, yaşınız %d", "Ayşe", 30);
        System.out.println(formattedString);
    }
}
```
**🎯 Çıktı:**
```
Merhaba Ayşe, yaşınız 30
```
**📌 `String.format()` kullanmanın avantajı:**
✅ Tek satırda formatlama sağlar.  
✅ `Formatter` nesnesi oluşturmaya gerek kalmaz.  
✅ Daha az bellek tüketir.

---

# **3️⃣ `printf()` ile Kullanım**
Eğer doğrudan **ekrana yazdırmak** istiyorsanız `System.out.printf()` kullanabilirsiniz.

```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("Merhaba %s, yaşınız %d\n", "Mehmet", 40);
    }
}
```
**🎯 Çıktı:**
```
Merhaba Mehmet, yaşınız 40
```

---

# **4️⃣ Biçimlendirme (`Format Specifiers`)**
Java `Formatter`'da kullanılan temel format belirteçleri şunlardır:

| **Belirteç** | **Açıklama** | **Örnek Kullanım** | **Çıktı** |
|-------------|-------------|---------------------|-----------|
| `%d`  | Tam sayı | `System.out.printf("%d", 25);` | `25` |
| `%f`  | Ondalıklı sayı | `System.out.printf("%.2f", 3.14159);` | `3.14` |
| `%s`  | String | `System.out.printf("%s", "Merhaba");` | `Merhaba` |
| `%c`  | Tek karakter | `System.out.printf("%c", 'A');` | `A` |
| `%b`  | Boolean | `System.out.printf("%b", true);` | `true` |
| `%n`  | Yeni satır | `System.out.printf("Merhaba%nDünya");` | `Merhaba` (alt satır) `Dünya` |

---

## **5️⃣ Ondalıklı Sayılar için Biçimlendirme**
```java
public class Main {
    public static void main(String[] args) {
        double pi = 3.14159265359;
        System.out.printf("Pi sayısı: %.2f\n", pi); // 2 ondalık basamak göster
    }
}
```
**🎯 Çıktı:**
```
Pi sayısı: 3.14
```
✔ `%.2f` → **Ondalıklı sayıyı iki basamağa yuvarlar.**  
✔ `%.3f` → **Üç basamak gösterir.**

---

## **6️⃣ Sayıları Sağdan ve Soldan Hizalama**
Metinleri hizalamak için **`%10s` veya `%-10s`** gibi formatlar kullanılabilir.

```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("|%10s|%n", "Merhaba");  // Sağdan hizalar
        System.out.printf("|%-10s|%n", "Merhaba"); // Soldan hizalar
    }
}
```
**🎯 Çıktı:**
```
|   Merhaba|
|Merhaba   |
```
✔ `%10s` → **Sağdan hizalar ve boşluk ekler.**  
✔ `%-10s` → **Soldan hizalar ve boşluk ekler.**

---

## **7️⃣ Sayıları Sıfır ile Doldurma**
Sayının önüne sıfır eklemek için `%0Xd` kullanılabilir (`X` karakter sayısıdır).

```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("%05d\n", 42);
    }
}
```
**🎯 Çıktı:**
```
00042
```
✔ `%05d` → **5 haneli yapar ve eksik kısımları `0` ile doldurur.**

---

## **8️⃣ Para Birimi Formatlama**
`Locale` kullanarak farklı ülkelerin para birimini formatlayabiliriz.

```java
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double amount = 1234567.89;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(currencyFormatter.format(amount)); // ABD formatı
    }
}
```
**🎯 Çıktı:**
```
$1,234,567.89
```
✔ `Locale.US` → Amerikan dolar formatına göre gösterir.  
✔ `Locale.FRANCE` → Fransız para formatına çevirir.

---

## **9️⃣ Tarih ve Saat Formatlama**
```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(sdf.format(now));
    }
}
```
**🎯 Çıktı:**
```
15-02-2025 14:45:30
```

---

## **🔍 Formatter mı, String.format() mı?**
| **Özellik** | **Formatter** | **String.format()** |
|-------------|--------------|---------------------|
| Nesne oluşturma | `Formatter formatter = new Formatter();` | `String.format()` ile tek satır |
| Bellek tüketimi | Daha fazla bellek kullanır | Daha az bellek kullanır |
| Kullanım kolaylığı | Daha karmaşık | Daha kolay |

📌 **Genellikle `String.format()` önerilir!**

---

## **✅ Özet**
- **`Formatter`**, Java'da metin, sayı ve tarih biçimlendirmek için kullanılır.
- **`String.format()` ve `printf()`**, `Formatter` sınıfını kullanmanın en yaygın yollarıdır.
- **Sayıları ve tarihleri formatlamak**, ondalık hassasiyet eklemek, hizalama yapmak için çok kullanışlıdır.

Java'da **biçimlendirilmiş çıktılar** oluşturmak için `Formatter` sınıfını etkili şekilde kullanabilirsin! 🚀

## Renk Çıktıları
```sh 

```
---
Java'nın standart `System.out.println()` veya `System.out.printf()` çıktıları **renkli desteklemez**, ancak **ANSI kaçış kodları** (`ANSI Escape Codes`) kullanarak terminalde renkli metinler yazdırabilirsiniz. 🚀

---

## **📌 1️⃣ ANSI Kaçış Kodları ile Renkli Çıktılar**
Java'da terminale renkli metin yazdırmak için aşağıdaki ANSI kodlarını kullanabilirsiniz:

### **🟢 Renk Kodu Tablosu**
| **Renk** | **Kod** |
|----------|--------|
| **🔴 Kırmızı** | `\033[31m` |
| **🟢 Yeşil** | `\033[32m` |
| **🟡 Sarı** | `\033[33m` |
| **🔵 Mavi** | `\033[34m` |
| **🟣 Mor** | `\033[35m` |
| **🔵 Açık Mavi** | `\033[36m` |
| **⚪ Beyaz** | `\033[37m` |
| **🖤 Siyah** | `\033[30m` |
| **⚫ Arkaplan Siyah** | `\033[40m` |
| **🔴 Arkaplan Kırmızı** | `\033[41m` |
| **🟢 Arkaplan Yeşil** | `\033[42m` |
| **🔵 Arkaplan Mavi** | `\033[44m` |

**⚠️ Önemli Not:** Bu yöntem **Windows Terminal, macOS, Linux, IntelliJ IDEA ve bazı IDE'lerde** çalışır, ancak **Eclipse gibi IDE'lerde desteklenmeyebilir**.

---

### **🛠 Örnek: Java'da Renkli Çıktı**
```java
public class Main {
    // ANSI Renk Kodları
    public static final String RESET = "\033[0m";  // Renk sıfırlama
    public static final String RED = "\033[31m";   // Kırmızı
    public static final String GREEN = "\033[32m"; // Yeşil
    public static final String YELLOW = "\033[33m";// Sarı
    public static final String BLUE = "\033[34m";  // Mavi
    public static final String PURPLE = "\033[35m";// Mor
    public static final String CYAN = "\033[36m";  // Açık Mavi

    public static void main(String[] args) {
        System.out.println(RED + "Bu kırmızı renkte!" + RESET);
        System.out.println(GREEN + "Bu yeşil renkte!" + RESET);
        System.out.println(YELLOW + "Bu sarı renkte!" + RESET);
        System.out.println(BLUE + "Bu mavi renkte!" + RESET);
        System.out.println(PURPLE + "Bu mor renkte!" + RESET);
        System.out.println(CYAN + "Bu açık mavi renkte!" + RESET);
    }
}
```

**🎯 Çıktı (Terminalde)**:
```
🔴 Bu kırmızı renkte!
🟢 Bu yeşil renkte!
🟡 Bu sarı renkte!
🔵 Bu mavi renkte!
🟣 Bu mor renkte!
🔵 Bu açık mavi renkte!
```
✔ `RESET` → **Yazdırdıktan sonra rengi sıfırlar**.  
✔ **Her rengin sonunda `+ RESET` eklenmelidir, yoksa sonraki tüm çıktılar o renkte kalır.**

---

## **📌 2️⃣ String.format() ile Renkli Çıktı**
`String.format()` ile de renk kodlarını kullanabiliriz:

```java
public class Main {
    public static final String GREEN = "\033[32m"; // Yeşil
    public static final String RESET = "\033[0m";  // Renk sıfırlama

    public static void main(String[] args) {
        String formattedString = String.format(GREEN + "Merhaba %s, yaşınız %d" + RESET, "Hamit", 30);
        System.out.println(formattedString);
    }
}
```
**🎯 Çıktı (Terminalde Yeşil Renkli)**
```
Merhaba Hamit, yaşınız 30
```

---

## **📌 3️⃣ System.out.printf() ile Renkli Çıktı**
Aynı yöntemi `printf()` ile de uygulayabiliriz:

```java
public class Main {
    public static final String RED = "\033[31m";   // Kırmızı
    public static final String RESET = "\033[0m";  // Sıfırlama

    public static void main(String[] args) {
        System.out.printf(RED + "Hata: %s dosyası bulunamadı!%n" + RESET, "config.txt");
    }
}
```
**🎯 Çıktı (Kırmızı Renk)**
```
Hata: config.txt dosyası bulunamadı!
```

---

## **📌 4️⃣ Renkli Metin Formatlama Metodu**
Tekrar eden renk kodlarından kurtulmak için bir metot yazabiliriz:

```java
public class Main {
    public static final String RESET = "\033[0m";
    public static final String BLUE = "\033[34m";
    public static final String GREEN = "\033[32m";
    public static final String RED = "\033[31m";

    public static String colorText(String text, String color) {
        return color + text + RESET;
    }

    public static void main(String[] args) {
        System.out.println(colorText("Bu mavi renkte!", BLUE));
        System.out.println(colorText("Bu yeşil renkte!", GREEN));
        System.out.println(colorText("Bu kırmızı renkte!", RED));
    }
}
```
✔ **`colorText()` metodu ile her seferinde renk kodlarını eklemeye gerek kalmaz.**  
✔ **Kod daha okunaklı hale gelir.** 🚀

---

## **📌 5️⃣ Renkli Arkaplan Kullanalım!**
Metin rengi yerine **arkaplan rengini değiştirebiliriz**:

```java
public class Main {
    public static final String RESET = "\033[0m";
    public static final String BLACK_BG = "\033[40m"; // Siyah Arkaplan
    public static final String RED_BG = "\033[41m";   // Kırmızı Arkaplan
    public static final String GREEN_BG = "\033[42m"; // Yeşil Arkaplan

    public static void main(String[] args) {
        System.out.println(RED_BG + "Bu metnin arka planı kırmızı!" + RESET);
        System.out.println(GREEN_BG + "Bu metnin arka planı yeşil!" + RESET);
    }
}
```
**🎯 Çıktı (Terminalde Arkaplan Renkli)**
```
🟥 Bu metnin arka planı kırmızı!
🟩 Bu metnin arka planı yeşil!
```

---

## **⚠️ Önemli Notlar**
❌ **Eclipse gibi IDE'lerde ANSI renkleri desteklenmez.**  
✅ **Terminal, IntelliJ IDEA ve VS Code Terminal'de çalışır.**  
✅ **Windows 10+ veya Linux/macOS’ta desteklenir.**  
✅ **Windows'ta CMD yerine `PowerShell` veya `Windows Terminal` kullanmalısınız.**

---

## **🎯 Sonuç**
✔ **Java'da renkli metinler yazdırmak için ANSI kaçış kodlarını kullanabilirsin.**  
✔ **String.format(), printf() ve System.out.println() ile renkli çıktı alınabilir.**  
✔ **Renk kodlarını metodlaştırarak daha temiz bir kod yazabilirsin.**  
✔ **Arkaplan renkleri de desteklenir!**

Bu yöntemle **Java çıktılarınızı daha okunaklı ve şık hale getirebilirsiniz!** 🚀✨



## Dizi(Array)
```sh 

```
---
# **Java'da Dizi (Array) Nedir? **

## **📌 1. Dizi (Array) Nedir?**
Java'da **dizi (array)**, **aynı veri tipindeki** birden fazla elemanı **tek bir değişken içinde saklamak** için kullanılır.  
Diziler:
- **Sabit bir boyuta sahiptirler** (Oluşturulduktan sonra boyutu değiştirilemez).
- **Aynı türden elemanları saklarlar** (`int`, `double`, `String`, vb.).
- **Dizi indisleri (index) 0'dan başlar**.
- **Diziler bellek üzerinde bitişik (contiguous) olarak saklanır**.

---

## **📌 2. Java’da Dizi Tanımlama ve Kullanımı**
### **✅ 2.1 Dizi Tanımlama**
Dizi tanımlamanın iki temel yolu vardır:

**1️⃣ İlk Yöntem: Dizi Tanımlama ve Bellekte Yer Ayırma**
```java
int[] sayilar = new int[5]; // 5 elemanlı bir int dizisi
```
- **Dizinin boyutu `5` olarak belirlendi ve varsayılan değerlerle (0) dolduruldu.**

---

**2️⃣ İkinci Yöntem: Tanımlama ve Değer Atama**
```java
int[] sayilar = {10, 20, 30, 40, 50};
```
- **Dizi doğrudan tanımlandı ve elemanları atandı**.

📌 **Önemli:**
- Java’da dizinin boyutu **sonradan değiştirilemez**.
- Bir dizi `null` olabilir ama **başlangıçta boyutu belirtilmeden oluşturulamaz**.

🚫 **Hatalı Tanımlama**
```java
int[] dizi; 
dizi = {1, 2, 3, 4}; // HATA! Doğrudan böyle atama yapılamaz.
```

✅ **Doğru Kullanım**
```java
int[] dizi;
dizi = new int[]{1, 2, 3, 4};
```

---

## **📌 3. Dizi Elemanlarına Erişim ve Değiştirme**
Dizi elemanlarına **indeks (index) numarası** kullanılarak erişilir.

```java
public class DiziErisim {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};

        // Dizinin 0. elemanını yazdırma
        System.out.println("İlk eleman: " + sayilar[0]); // 10
        
        // Dizinin 2. elemanını değiştirme
        sayilar[2] = 100;
        
        System.out.println("Yeni 2. eleman: " + sayilar[2]); // 100
    }
}
```
📌 **Dizi indisleri 0'dan başlar ve `dizi.length - 1` kadar gider.**

---

## **📌 4. Dizinin Boyutunu Öğrenme**
Java'da **bir dizinin boyutu**, **`.length`** özelliği ile öğrenilir.

```java
public class DiziBoyutu {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 30, 40};
        System.out.println("Dizi uzunluğu: " + dizi.length); // 4
    }
}
```
📌 **Dikkat:**
- `dizi.length` bir metot değil, **bir özelliktir** (`()` parantezleri kullanılmaz).

---

## **📌 5. Dizi Üzerinde Döngüler Kullanımı**
### **✅ 5.1 `for` Döngüsü ile Dizi Kullanımı**
```java
public class DiziDongu {
    public static void main(String[] args) {
        int[] sayilar = {5, 10, 15, 20, 25};

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Eleman " + i + ": " + sayilar[i]);
        }
    }
}
```
**Çıktı:**
```
Eleman 0: 5
Eleman 1: 10
Eleman 2: 15
Eleman 3: 20
Eleman 4: 25
```

---

### **✅ 5.2 `for-each` Döngüsü ile Dizi Kullanımı**
```java
public class ForEachOrnek {
    public static void main(String[] args) {
        String[] diller = {"Java", "Python", "C++", "JavaScript"};

        for (String dil : diller) {
            System.out.println("Programlama Dili: " + dil);
        }
    }
}
```
**Çıktı:**
```
Programlama Dili: Java
Programlama Dili: Python
Programlama Dili: C++
Programlama Dili: JavaScript
```
📌 **`for-each` dizileri gezmek için kullanışlıdır ama dizinin indeksine erişemez.**

---

## **📌 6. Çok Boyutlu Diziler (Multidimensional Arrays)**
### **✅ 6.1 İki Boyutlu (2D) Dizi Tanımlama**
```java
int[][] matris = new int[3][3]; // 3x3'lük bir matris
```

📌 **Başlangıç değerleri `0` olur.**

---

### **✅ 6.2 Değer Atama ve Erişim**
```java
public class IkiBoyutluDizi {
    public static void main(String[] args) {
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Orta Eleman: " + matris[1][1]); // 5
    }
}
```
📌 **İlk indeks satır, ikinci indeks sütunu temsil eder**.

---

### **✅ 6.3 `for` Döngüsü ile Çok Boyutlu Diziyi Yazdırma**
```java
public class MatrisYazdirma {
    public static void main(String[] args) {
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
**Çıktı:**
```
1 2 3
4 5 6
7 8 9
```
📌 **`matris.length` satır sayısını, `matris[i].length` sütun sayısını verir.**

---

## **📌 7. Java’da Dizi Kopyalama**
### **✅ 7.1 `System.arraycopy()` Kullanımı**
```java
public class DiziKopyalama {
    public static void main(String[] args) {
        int[] orijinal = {1, 2, 3, 4, 5};
        int[] kopya = new int[5];

        System.arraycopy(orijinal, 0, kopya, 0, 5);

        for (int eleman : kopya) {
            System.out.print(eleman + " ");
        }
    }
}
```
**Çıktı:**
```
1 2 3 4 5
```
📌 **Diziyi manuel kopyalamaya göre daha verimlidir.**

---

## **📌 8. `Arrays` Sınıfı ile Dizi İşlemleri**
Java’nın **`java.util.Arrays`** sınıfı, diziler için **yardımcı metotlar** içerir.

### **✅ 8.1 `Arrays.toString()` - Diziyi String'e Çevirme**
```java
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] sayilar = {3, 1, 4, 1, 5};
        System.out.println(Arrays.toString(sayilar));
    }
}
```
**Çıktı:**
```
[3, 1, 4, 1, 5]
```

---

## **📌 9. Özet**
| **Özellik** | **Açıklama** |
|-------------|-------------|
| **Dizi Tanımlama** | `int[] dizi = new int[5];` |
| **Diziye Değer Atama** | `dizi[0] = 10;` |
| **Dizi Boyutu** | `dizi.length` |
| **Tek Boyutlu Dizi** | `{10, 20, 30}` |
| **Çok Boyutlu Dizi** | `int[][] matris = new int[3][3];` |
| **Dizi Kopyalama** | `System.arraycopy()` |
| **Dizi Sıralama** | `Arrays.sort(dizi);` |

📌 **Java’da diziler, veri saklama ve yönetme açısından oldukça önemli yapılardır! 🚀**


## Array (Diziler) Devam
```sh 

```
---
### **Java'da Diziler (Arrays) Detaylı Açıklama**
Java'da **diziler (arrays)**, aynı türdeki verileri belirli bir sıralamada saklamak için kullanılan veri yapılarıdır. Java'daki diziler, **sabit boyutlu, sıralı ve indeks tabanlı veri yapılarıdır**.

---

## **1. Dizi Tanımlama ve Başlatma**
Bir dizi, belirli bir veri tipindeki elemanları saklayan nesne olarak oluşturulur.

### **1.1. Dizi Tanımlama (Declaration)**
Bir dizi değişkeni tanımlamak için aşağıdaki sözdizimi kullanılır:

```java
veri_tipi[] dizi_adi;  // Tercih edilen kullanım
veri_tipi dizi_adi[];  // Alternatif kullanım
```

Örnek:
```java
int[] sayilar; // Tercih edilen kullanım
double ondaliklar[]; // Alternatif kullanım
```

### **1.2. Dizi Oluşturma (Instantiation)**
Java'da diziler, `new` anahtar kelimesi kullanılarak oluşturulur. **Dizinin boyutu sabittir ve sonradan değiştirilemez.**

```java
dizi_adi = new veri_tipi[boyut];
```

Örnek:
```java
sayilar = new int[5]; // 5 elemanlı bir int dizisi oluşturuldu.
```

Tek satırda tanımlama ve oluşturma:
```java
int[] sayilar = new int[5];
```

---

## **2. Diziye Değer Atama**
Bir diziye değer atamak için **indeks (index) numarası** kullanılır. Java'da diziler **0'dan başlar**.

Örnek:
```java
int[] sayilar = new int[5]; 

sayilar[0] = 10;
sayilar[1] = 20;
sayilar[2] = 30;
sayilar[3] = 40;
sayilar[4] = 50;
```

Alternatif olarak, diziyi doğrudan başlatabilirsiniz:
```java
int[] sayilar = {10, 20, 30, 40, 50};
```

---

## **3. Dizinin Uzunluğunu Bulma**
Dizinin uzunluğu `.length` özelliği ile bulunur:
```java
System.out.println("Dizinin uzunluğu: " + sayilar.length);
```

---

## **4. Dizi Elemanlarını Döngüyle Erişme**
Dizilerde elemanlara erişmek için **for** ve **foreach** döngüleri kullanılabilir.

### **4.1. For Döngüsü ile Erişim**
```java
for (int i = 0; i < sayilar.length; i++) {
    System.out.println("Eleman " + i + ": " + sayilar[i]);
}
```

### **4.2. Foreach Döngüsü ile Erişim**
```java
for (int eleman : sayilar) {
    System.out.println(eleman);
}
```

---

## **5. Çok Boyutlu Diziler**
Java'da **çok boyutlu diziler** (matrisler) oluşturulabilir.

### **5.1. İki Boyutlu Dizi Tanımlama**
```java
int[][] matris = new int[3][3]; // 3x3 boyutunda bir matris
```

### **5.2. Matris İçin Değer Atama**
```java
matris[0][0] = 1;
matris[0][1] = 2;
matris[0][2] = 3;
matris[1][0] = 4;
matris[1][1] = 5;
matris[1][2] = 6;
matris[2][0] = 7;
matris[2][1] = 8;
matris[2][2] = 9;
```

### **5.3. Matris İçin Döngü Kullanımı**
```java
for (int i = 0; i < matris.length; i++) { //satır
    for (int j = 0; j < matris[i].length; j++) { //sutun
        System.out.print(matris[i][j] + " ");
    }
    System.out.println();
}
```

---

## **6. Dizi ile İlgili Önemli Metotlar**
Java'da diziler için bazı kullanışlı metotlar `Arrays` sınıfı ile sağlanır.

```java
import java.util.Arrays;

public class DiziMetotlari {
    public static void main(String[] args) {
        int[] sayilar = {5, 3, 8, 1, 2};

        // Diziyi sıralama
        Arrays.sort(sayilar);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(sayilar));

        // Belirli bir elemanı arama (binary search)
        int index = Arrays.binarySearch(sayilar, 3);
        System.out.println("3 sayısının indeksi: " + index);

        // Diziyi belirli bir değerle doldurma
        Arrays.fill(sayilar, 7);
        System.out.println("Dizi 7 ile dolduruldu: " + Arrays.toString(sayilar));
    }
}
```

---

## **7. Dizi Kullanımında Dikkat Edilmesi Gerekenler**
1. **Dizilerin Boyutu Sabittir:** Java'da diziler **dinamik değildir**, yani oluşturulduktan sonra boyutları değiştirilemez. Daha esnek bir yapı için `ArrayList` kullanılabilir.

2. **Dizilerde Varsayılan Değerler:** Diziler oluşturulduğunda içindeki elemanlar şu varsayılan değerlere sahip olur:
    - `int` → `0`
    - `double` → `0.0`
    - `boolean` → `false`
    - `String` ve diğer referans tipleri → `null`

3. **ArrayIndexOutOfBoundsException:** Dizinin sınırlarını aşan bir indekse erişmeye çalışırsanız hata alırsınız:
   ```java
   int[] dizi = {1, 2, 3};
   System.out.println(dizi[3]); // Hata: ArrayIndexOutOfBoundsException
   ```

---

## **8. Alternatif: List Kullanımı (Dizi Yerine)**
Eğer boyutu değişebilen bir diziye ihtiyacınız varsa, `ArrayList` kullanabilirsiniz:
```java
import java.util.ArrayList;

public class DiziAlternatif {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        System.out.println("Liste: " + sayilar);
        sayilar.remove(1); // 2. elemanı siler
        System.out.println("Güncellenmiş Liste: " + sayilar);
    }
}
```

---

## **Sonuç**
Java'da diziler, aynı türdeki verileri saklamak için kullanılan **sabit boyutlu** veri yapılarıdır. Temel özellikleri:
✅ Hızlı ve etkili bellek kullanımı sağlar.  
✅ Sabit boyutlu oldukları için dinamik değişime uygun değildir.  
✅ **`Arrays`** sınıfı ile ek işlemler yapılabilir.  
✅ **Alternatif olarak `ArrayList` gibi koleksiyonlar kullanılabilir.**

Bu detaylı rehberle, Java dizileri hakkında kapsamlı bir bilgiye sahip oldunuz! 🚀


## Array Büyükten küçüğe
```sh 

```
---
Java'da bir diziyi **büyükten küçüğe** sıralamak için aşağıdaki yöntemlerden birini kullanabilirsiniz:

---

### **1. `Arrays.sort()` ile Büyükten Küçüğe Sıralama (Tersten Yazdırma)**
Java'da `Arrays.sort()` metodu **küçükten büyüğe** sıralama yapar. Büyükten küçüğe sıralamak için **tersine çevirmeliyiz**.

#### **Örnek:**
```java
import java.util.Arrays;
import java.util.Collections;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Integer[] sayilar = {5, 2, 9, 1, 3};

        // Arrays.sort() + Collections.reverseOrder() ile büyükten küçüğe sıralama
        Arrays.sort(sayilar, Collections.reverseOrder());

        System.out.println("Büyükten Küçüğe Sıralanmış Dizi: " + Arrays.toString(sayilar));
    }
}
```

**Çıktı:**
```
Büyükten Küçüğe Sıralanmış Dizi: [9, 5, 3, 2, 1]
```

---

### **2. `Arrays.sort()` ile Küçükten Büyüğe Sıralayıp Ters Çevirme**
Eğer **primitive veri tipi** (`int`, `double`) kullanıyorsanız, `Collections.reverseOrder()` çalışmaz. Bu durumda önce `Arrays.sort()` ile küçükten büyüğe sıralayıp, sonra ters çevirebiliriz.

#### **Örnek (Primitive Tiplerle)**
```java
import java.util.Arrays;

public class BuyuktenKucugeSiralamaPrimitive {
    public static void main(String[] args) {
        int[] sayilar = {5, 2, 9, 1, 3};

        // Küçükten büyüğe sırala
        Arrays.sort(sayilar);

        // Ters çevirerek büyükten küçüğe yazdır
        System.out.print("Büyükten Küçüğe Sıralanmış Dizi: ");
        for (int i = sayilar.length - 1; i >= 0; i--) {
            System.out.print(sayilar[i] + " ");
        }
    }
}
```

**Çıktı:**
```
Büyükten Küçüğe Sıralanmış Dizi: 9 5 3 2 1
```

---

### **3. `Arrays.stream().boxed()` ile Büyükten Küçüğe Sıralama (Java 8+)**
Java 8 ve üstü sürümlerde **Streams API** kullanarak sıralama yapabilirsiniz.

#### **Örnek (Lambda ile)**
```java
import java.util.Arrays;
import java.util.Comparator;

public class StreamSirala {
    public static void main(String[] args) {
        int[] sayilar = {5, 2, 9, 1, 3};

        // Stream ile büyükten küçüğe sıralama
        int[] sirali = Arrays.stream(sayilar)
                             .boxed()
                             .sorted(Comparator.reverseOrder())
                             .mapToInt(Integer::intValue)
                             .toArray();

        System.out.println("Büyükten Küçüğe Sıralanmış Dizi: " + Arrays.toString(sirali));
    }
}
```

**Çıktı:**
```
Büyükten Küçüğe Sıralanmış Dizi: [9, 5, 3, 2, 1]
```

---

### **Hangi Yöntemi Kullanmalıyım?**
| **Yöntem** | **Kullanım Durumu** |
|------------|--------------------|
| `Arrays.sort()` + `Collections.reverseOrder()` | `Integer[]` dizisi için en hızlı yöntem. |
| `Arrays.sort()` + `for` döngüsüyle ters yazdırma | `int[]` dizisi için uygun (primitive tip). |
| `Streams API (Java 8+)` | Modern ve kısa kod yazmak isteyenler için. |

Eğer `int[]` kullanıyorsanız **2. yöntemi**, `Integer[]` kullanıyorsanız **1. yöntemi** tercih edebilirsiniz. Java 8 ve sonrası için **3. yöntem** daha okunaklıdır.

Hangi yöntemi seçerseniz seçin, büyükten küçüğe sıralamayı başarıyla yapabilirsiniz! 🚀


## Zaman Karmaşıklığı Uzay Karmaşıklığı
```sh 

```
---

### **Zaman Karmaşıklığı (Time Complexity) ve Uzay Karmaşıklığı (Space Complexity) Nedir?**

Bir algoritmanın performansını ölçerken iki temel faktörü dikkate alırız:
1. **Zaman Karmaşıklığı (Time Complexity)**
2. **Uzay Karmaşıklığı (Space Complexity)**

Bu kavramlar, bir algoritmanın **verimliliğini** anlamamıza yardımcı olur.

---

## **1. Zaman Karmaşıklığı (Time Complexity)**
Bir algoritmanın **çalışma süresinin**, **girdi büyüklüğüne (n)** bağlı olarak nasıl değiştiğini ifade eder.

### **Zaman Karmaşıklığı Nasıl Ölçülür?**
- Bir algoritmadaki temel işlemlerin (toplama, çarpma, döngü işlemleri vb.) **kaç kez çalıştığını** hesaplarız.
- Büyük veri kümeleriyle çalışırken, sabit zamanlı işlemler yerine **en kötü senaryo analizi (Big-O Notasyonu)** kullanılır.
- **Big-O Notasyonu**, algoritmanın çalıştığı süreyi büyüme oranı olarak ifade eder.

### **Zaman Karmaşıklığı Türleri**
| **Big-O** | **Açıklama** | **Örnek Algoritma** |
|-----------|-------------|---------------------|
| **O(1) - Sabit Zaman** | Girdi büyüklüğünden bağımsızdır, hep aynı sürede çalışır. | Dizinin ilk elemanına erişim (`arr[0]`) |
| **O(log n) - Logaritmik Zaman** | Her adımda girdi miktarını yarıya indirir. | Binary Search (İkili Arama) |
| **O(n) - Doğrusal Zaman** | Girdi büyüklüğü arttıkça işlem süresi aynı oranda artar. | Bir dizinin tüm elemanlarını toplama |
| **O(n log n) - Lineer Logaritmik Zaman** | Genellikle sıralama algoritmalarında görülür. | Merge Sort, Quick Sort |
| **O(n²) - Karesel Zaman** | İç içe döngüler varsa oluşur. | Çift döngülü algoritmalar (Bubble Sort) |
| **O(2ⁿ) - Üstel Zaman** | Her adımda işlemler katlanarak artar. | Fibonacci’nin basit özyinelemeli (recursive) hesaplanması |
| **O(n!) - Faktöriyel Zaman** | Girdi arttıkça işlem süresi çok hızlı artar. | Gezgin Satıcı Problemi (TSP) gibi bazı kombinatorik algoritmalar |

---

### **Zaman Karmaşıklığı Örnekleri**
#### **Örnek 1: O(1) - Sabit Zaman**
```java
int firstElement(int[] arr) {
    return arr[0];  // Her zaman sabit sürede çalışır
}
```
Bu fonksiyon **O(1)** karmaşıklığına sahiptir, çünkü girdi ne kadar büyük olursa olsun **tek işlemde** çalışır.

#### **Örnek 2: O(n) - Doğrusal Zaman**
```java
int sumArray(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return sum;
}
```
Bu fonksiyon **O(n)** karmaşıklığına sahiptir, çünkü dizide **n** eleman varsa, **n** kez toplama işlemi yapılır.

#### **Örnek 3: O(n²) - Karesel Zaman**
```java
void printPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
}
```
Bu algoritma **iç içe geçmiş döngüler içerdiğinden**, **O(n²)** karmaşıklığa sahiptir. Çünkü her bir eleman için tekrar tüm elemanlar dolaşılır.

---

## **2. Uzay Karmaşıklığı (Space Complexity)**
Bir algoritmanın **çalışması için ihtiyaç duyduğu bellek miktarının**, girdi büyüklüğüne **(n)** bağlı olarak nasıl değiştiğini ifade eder.

### **Uzay Karmaşıklığı Nasıl Ölçülür?**
- Algoritmanın kullandığı **değişkenler, diziler, veri yapıları** gibi ek bellek ihtiyacını hesaplarız.
- **Big-O Notasyonu** burada da kullanılır.
- Bellek tüketimi **sabit (O(1)), doğrusal (O(n)), karesel (O(n²))** gibi değerlendirilebilir.

### **Uzay Karmaşıklığı Türleri**
| **Big-O** | **Açıklama** | **Örnek Algoritma** |
|-----------|-------------|---------------------|
| **O(1) - Sabit Uzay** | Sabit miktarda bellek kullanır. | Tek değişken kullanımı (`int a = 5;`) |
| **O(n) - Doğrusal Uzay** | Girdi büyüklüğüne bağlı olarak ek bellek kullanır. | Bir dizinin kopyalanması |
| **O(n²) - Karesel Uzay** | Bir matris gibi iç içe veri saklanması gerektiğinde ortaya çıkar. | Dinamik programlama tablosu |

---

### **Uzay Karmaşıklığı Örnekleri**
#### **Örnek 1: O(1) - Sabit Uzay**
```java
int add(int a, int b) {
    return a + b; // Sadece iki değişken kullanılıyor
}
```
Bu algoritma **O(1)** uzay karmaşıklığına sahiptir çünkü sadece **sabit** miktarda bellek kullanır.

#### **Örnek 2: O(n) - Doğrusal Uzay**
```java
int[] copyArray(int[] arr) {
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[i];
    }
    return newArr;
}
```
Bu algoritma **O(n)** uzay karmaşıklığına sahiptir çünkü **n** elemanlık yeni bir dizi oluşturuyor.

#### **Örnek 3: O(n²) - Karesel Uzay**
```java
int[][] createMatrix(int n) {
    int[][] matrix = new int[n][n];  // n*n boyutunda matris
    return matrix;
}
```
Bu algoritma **O(n²)** uzay karmaşıklığına sahiptir, çünkü **n × n** boyutunda bir matris bellekte tutulur.

---

## **Özet**
| **Kavram** | **Tanım** | **Ölçüm Kriteri** | **Örnek Algoritmalar** |
|-----------|----------|----------------|----------------|
| **Zaman Karmaşıklığı** | Algoritmanın çalışma süresi | İşlem sayısı (**n**'e bağlı) | Sıralama algoritmaları, arama algoritmaları |
| **Uzay Karmaşıklığı** | Algoritmanın bellek tüketimi | Ek bellek miktarı | Matris işlemleri, dinamik programlama |

### **Genel Pratikler**
1. **Zaman karmaşıklığını** optimize etmek için döngüleri azaltın, daha hızlı algoritmalar kullanın.
2. **Uzay karmaşıklığını** azaltmak için gereksiz dizi kopyalamalardan kaçının, mümkünse sabit miktarda bellek kullanın.
3. Büyük veri kümeleriyle çalışıyorsanız **O(log n) veya O(n log n) zaman karmaşıklığı** olan algoritmaları tercih edin.

Bu bilgilerle, bir algoritmanın **verimli olup olmadığını** anlayabilir ve hangi durumlarda hangi yöntemlerin daha uygun olduğunu belirleyebilirsiniz! 🚀
---

## Javada System
```sh 

```
---

Java'da `System` sınıfı, **java.lang** paketinde bulunan ve Java uygulamalarının temel sistem seviyesinde işlemler gerçekleştirmesini sağlayan bir yardımcı sınıftır. `System` sınıfı, genellikle giriş ve çıkış işlemleri, hata ayıklama, ortam değişkenleri, zaman ölçümleri, çöp toplama (garbage collection) ve sistem özelliklerine erişim gibi işlemler için kullanılır.

---

## 1. **System Sınıfının Genel Yapısı**
- `System` sınıfı **final** olarak tanımlanmıştır, yani **kalıtım alınamaz**.
- **Constructor'ı `private` olduğu için** nesne oluşturulamaz.
- Tüm metodları **static** olduğu için, doğrudan `System.method()` şeklinde çağrılır.

### **System Sınıfının Başlıca Üyeleri**
`System` sınıfının içinde bulunan **static değişkenler** ve **metodlar** şunlardır:

| Üye (Değişken/Metod) | Açıklama |
|----------------------|----------|
| `System.in`  | Konsoldan veri almak için kullanılır (InputStream). |
| `System.out` | Konsola çıktı vermek için kullanılır (PrintStream). |
| `System.err` | Hata mesajlarını göstermek için kullanılır (PrintStream). |
| `System.exit(int status)` | Programı sonlandırır. |
| `System.gc()` | Garbage Collector'ı çağırır. |
| `System.nanoTime()` | Yüksek çözünürlüklü zaman ölçümü yapar. |
| `System.currentTimeMillis()` | Geçerli zamanı alır (Unix Epoch Time). |
| `System.getProperty(String key)` | Sistem özelliklerini getirir. |
| `System.setProperty(String key, String value)` | Sistem özelliklerini ayarlar. |
| `System.getenv(String name)` | Ortam değişkenlerini getirir. |
| `System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)` | Diziler arasında hızlı kopyalama yapar. |

---

## 2. **System Sınıfı İçindeki Önemli Değişkenler**
### 2.1. **`System.in` (Standart Giriş)**
- `System.in`, standart giriş akışıdır (`InputStream` tipindedir).
- Kullanıcıdan veri almak için **`Scanner`** veya **`BufferedReader`** ile kullanılabilir.

**Örnek: Kullanıcıdan veri alma**
```java
import java.util.Scanner;

public class SystemInExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir şey yazın: ");
        String input = scanner.nextLine();
        System.out.println("Girdiğiniz: " + input);
        scanner.close();
    }
}
```

---

### 2.2. **`System.out` (Standart Çıkış)**
- `System.out`, **standart çıkış** nesnesidir (`PrintStream`).
- `print()`, `println()` ve `printf()` metodları ile çıktı yazdırılabilir.

**Örnek: Konsola çıktı yazdırma**
```java
public class SystemOutExample {
    public static void main(String[] args) {
        System.out.println("Merhaba, Dünya!");
        System.out.print("Yan yana yazılır.");
        System.out.printf("\nFormatlı yazdırma: %d + %d = %d", 5, 3, 5+3);
    }
}
```

---

### 2.3. **`System.err` (Hata Çıkışı)**
- `System.err`, hata mesajlarını göstermek için kullanılır (`PrintStream`).
- `System.out` ile aynı işlevdedir ama genellikle **hataları loglamak** için kullanılır.

**Örnek: Hata mesajı yazdırma**
```java
public class SystemErrExample {
    public static void main(String[] args) {
        System.err.println("Bu bir hata mesajıdır!");
    }
}
```

---

## 3. **Sistemle İlgili Bilgilere Erişim**
### 3.1. **System.getProperty() Kullanımı**
- Java'nın çalıştığı sistem hakkında bilgi almak için kullanılır.

**Örnek: Sistem bilgilerini alma**
```java
public class SystemPropertiesExample {
    public static void main(String[] args) {
        System.out.println("Java Versiyonu: " + System.getProperty("java.version"));
        System.out.println("OS Adı: " + System.getProperty("os.name"));
        System.out.println("Kullanıcı Adı: " + System.getProperty("user.name"));
        System.out.println("Çalışma Dizini: " + System.getProperty("user.dir"));
    }
}
```

### 3.2. **System.getenv() Kullanımı**
- Ortam değişkenlerini almak için kullanılır.

**Örnek: Ortam değişkenlerini alma**
```java
public class SystemEnvExample {
    public static void main(String[] args) {
        System.out.println("PATH: " + System.getenv("PATH"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));
    }
}
```

---

## 4. **Garbage Collector'ı Çalıştırma**
- `System.gc()` metodu **çöp toplayıcının çalışmasını önerebilir**, ancak garanti vermez.

**Örnek: Bellek temizleme çağrısı**
```java
public class GarbageCollectorExample {
    public static void main(String[] args) {
        System.out.println("Çöp toplama çağrısı yapılıyor...");
        System.gc();
    }
}
```

---

## 5. **Zaman Ölçme**
### 5.1. **System.currentTimeMillis()**
- Milisaniye cinsinden **geçerli zaman damgası** alır.

**Örnek: Zaman hesaplama**
```java
public class TimeExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        // 1 milyon döngü çalıştır
        for (int i = 0; i < 1_000_000; i++) { }

        long end = System.currentTimeMillis();
        System.out.println("Geçen süre: " + (end - start) + " ms");
    }
}
```

### 5.2. **System.nanoTime()**
- **Daha hassas** zaman ölçümü yapar.

**Örnek: Nano zaman hesaplama**
```java
public class NanoTimeExample {
    public static void main(String[] args) {
        long start = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) { }

        long end = System.nanoTime();
        System.out.println("Geçen süre: " + (end - start) + " ns");
    }
}
```

---

## 6. **Dizi Kopyalama**
- `System.arraycopy()` metodu, diziler arasında **hızlı kopyalama** yapar.

**Örnek: Dizi elemanlarını kopyalama**
```java
public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] kaynak = {1, 2, 3, 4, 5};
        int[] hedef = new int[5];

        System.arraycopy(kaynak, 0, hedef, 0, 5);

        for (int num : hedef) {
            System.out.print(num + " ");
        }
    }
}
```

---

## 7. **Programdan Çıkış Yapma**
- `System.exit(int status)`, programı **belirtilen durum koduyla sonlandırır**.
- **0 başarıyla çıkış**, **1 hata nedeniyle çıkış** anlamına gelir.

**Örnek: Programdan çıkma**
```java
public class SystemExitExample {
    public static void main(String[] args) {
        System.out.println("Program sonlandırılıyor...");
        System.exit(0);
    }
}
```

---

### **Sonuç**
`System` sınıfı, **giriş-çıkış işlemleri, hata mesajları, sistem bilgileri, zaman ölçümü, dizi kopyalama ve programdan çıkış** gibi birçok önemli işlevi kapsayan güçlü bir yardımcı sınıftır. Java programlarında sıkça kullanılan bu sınıfın işlevlerini iyi anlamak, yazılım geliştirmede büyük kolaylık sağlar.


## Javada break ile System.exit(0) Arasındaki Farklar
```sh 

```
---
Java'da `break` ve `System.exit(0)` ifadeleri, programın akışını kontrol etmek için kullanılır, ancak ikisi arasında önemli farklar vardır. İşte temel farklar:

---

## 1. **Temel Farklar**

| Özellik | `break` | `System.exit(0)` |
|---------|--------|-----------------|
| **Kullanım Alanı** | Döngüler (`for`, `while`, `do-while`) ve `switch-case` blokları içinde kullanılır. | Programın tamamını sonlandırır. |
| **Ne Yapıyor?** | Sadece **içinde bulunduğu döngüyü veya switch-case'i** kırar ve bir sonraki satırdan devam eder. | Programı tamamen kapatır ve çalışmasını durdurur. |
| **Etki Alanı** | Yalnızca bulunduğu döngü veya switch bloğunu etkiler. | JVM'yi kapatarak programı tamamen sonlandırır. |
| **Geri Dönüş Değeri (Exit Code)** | Yoktur. | Parametre olarak verilen exit koduna göre sistem çıkış kodu belirlenir. |
| **Try-Finally Bloklarında Davranış** | `break` çalışsa bile `finally` bloğu her zaman çalışır. | `System.exit(0)` çağrıldığında, `finally` bloğu garanti edilmez, bazen çalıştırılmadan çıkış yapılabilir. |

---

## 2. **`break` Kullanımı**

- `break`, **yalnızca döngüleri ve switch-case bloklarını kırmak** için kullanılır. Döngüden çıkıldığında program çalışmaya devam eder.

**Örnek 1: Döngüde `break` Kullanımı**
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // 3 olduğunda döngüyü sonlandırır
            }
            System.out.println("i: " + i);
        }
        System.out.println("Döngüden çıkıldı."); // Döngü sonrası çalışmaya devam eder
    }
}
```
**Çıktı:**
```
i: 1
i: 2
Döngüden çıkıldı.
```

**Örnek 2: `switch-case` ile `break` Kullanımı**
```java
public class SwitchBreakExample {
    public static void main(String[] args) {
        int sayi = 2;
        switch (sayi) {
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break; // Burada kırılır, sonraki case çalışmaz
            case 3:
                System.out.println("Sayı 3");
                break;
            default:
                System.out.println("Bilinmeyen sayı");
        }
    }
}
```
**Çıktı:**
```
Sayı 2
```
Burada `break` olmasaydı, `case 3` de çalışmaya devam ederdi.

---

## 3. **`System.exit(0)` Kullanımı**
- `System.exit(0)`, programın **tamamını sonlandırır** ve JVM'yi kapatır.
- `exit(0)`: **Başarılı çıkışı** ifade eder.
- `exit(1)`, `exit(-1)`, `exit(2)`, vb.: **Hata kodlarıdır**, genellikle bir hata olduğunda sistem tarafından kullanılır.

**Örnek 1: Programı Sonlandırma**
```java
public class ExitExample {
    public static void main(String[] args) {
        System.out.println("Program başlıyor...");
        
        System.exit(0); // Program burada tamamen sonlanır
        
        System.out.println("Bu satır çalışmaz.");
    }
}
```
**Çıktı:**
```
Program başlıyor...
```
Görüldüğü gibi, `System.exit(0)` çağrıldığında, ondan sonraki kodlar çalışmaz.

---

## 4. **`break` ve `System.exit(0)` Farklı Davranışları**
### **4.1. Döngü İçinde Kullanım**
**`break` sadece döngüden çıkar, ama program çalışmaya devam eder:**
```java
public class BreakVsExit {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Sadece döngüden çıkar
            }
            System.out.println("i: " + i);
        }
        System.out.println("Döngüden sonra çalışmaya devam eder.");
    }
}
```
**Çıktı:**
```
i: 1
i: 2
Döngüden sonra çalışmaya devam eder.
```

**`System.exit(0)` programı tamamen kapatır:**
```java
public class BreakVsExit {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.exit(0); // Programı tamamen kapatır
            }
            System.out.println("i: " + i);
        }
        System.out.println("Bu satır çalışmaz.");
    }
}
```
**Çıktı:**
```
i: 1
i: 2
```
Gördüğünüz gibi, `System.exit(0)` çağrıldıktan sonra **program tamamen durduğu için** döngüden sonra kodlar çalışmaz.

---

### **4.2. `finally` Blokları ile Farklılık**
- `break` kullanıldığında `finally` bloğu **her zaman çalışır**.
- `System.exit(0)` kullanıldığında `finally` bloğu **çalışmayabilir**.

**`break` ile `finally` her zaman çalışır:**
```java
public class BreakFinallyExample {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    break;
                }
                System.out.println("i: " + i);
            }
        } finally {
            System.out.println("Finally bloğu çalıştı.");
        }
    }
}
```
**Çıktı:**
```
i: 1
i: 2
Finally bloğu çalıştı.
```

**`System.exit(0)` ile `finally` bloğu çalışmayabilir:**
```java
public class ExitFinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Program başlıyor...");
            System.exit(0);
        } finally {
            System.out.println("Finally bloğu çalıştı."); // Çalışmayabilir
        }
    }
}
```
**Çıktı:**
```
Program başlıyor...
```
Burada `finally` bloğu büyük olasılıkla çalışmaz çünkü JVM kapatılmıştır.

---

## 5. **Özet ve Karşılaştırma**
| **Özellik** | **break** | **System.exit(0)** |
|------------|----------|-------------------|
| **Ne yapar?** | Döngüyü veya switch-case bloğunu kırar. | Programı tamamen kapatır. |
| **Etki Alanı** | Sadece ilgili döngüyü etkiler. | JVM'yi kapatır, program tamamen durur. |
| **Kullanıldığı Yer** | Döngüler (`for`, `while`, `do-while`) ve `switch-case` | Her yerde kullanılabilir. |
| **Sonraki kod çalışır mı?** | Evet, sadece döngüden sonra devam eder. | Hayır, `exit(0)` sonrası kod çalışmaz. |
| **finally bloğu çalışır mı?** | Evet. | Çalışmayabilir. |
| **Çıkış kodu** | Yoktur. | `exit(0)`, `exit(1)`, `exit(-1)` gibi değerler döndürebilir. |

**Sonuç olarak**, `break` yalnızca döngüleri veya switch-case yapısını kırarken, `System.exit(0)` programın tamamını durdurarak JVM'yi kapatır.

## Erişim Belirleyiciler Devam-1
```sh 

```
---
# **Java'da Access Modifier (Erişim Belirleyiciler) Detaylı Anlatım**

Java'da **access modifier (erişim belirleyiciler)**, bir sınıfın, değişkenin, metodun veya yapıcı (constructor) metodun **nerelerden erişilebileceğini** belirler. Erişim belirleyiciler, **nesne yönelimli programlama (OOP) prensipleri** gereği **bilgi gizleme (encapsulation)** sağlamak için kullanılır.

Java'da **dört** temel erişim belirleyici vardır:

| **Modifier** | **Açıklama** | **Aynı Sınıf** | **Aynı Paket** | **Farklı Paket - Alt Sınıf** | **Farklı Paket - Alt Sınıf Olmayan** |
|-------------|-------------|--------------|-------------|----------------------|----------------------|
| `public`    | Her yerden erişilebilir | ✅ | ✅ | ✅ | ✅ |
| `protected` | Aynı paket ve alt sınıflardan erişilebilir | ✅ | ✅ | ✅ | ❌ |
| `default` (Hiçbir şey yazılmaz) | Sadece aynı paket içinden erişilebilir | ✅ | ✅ | ❌ | ❌ |
| `private`   | Sadece tanımlandığı sınıf içinden erişilebilir | ✅ | ❌ | ❌ | ❌ |

---

## **1. `public` Access Modifier**
**`public` anahtar kelimesi, bir sınıf, metod veya değişkenin her yerden erişilebilir olmasını sağlar.**

📌 **Kullanım Alanları:**
- Genel (public) API'ler oluştururken
- Sınıfların dışarıdan erişilebilir olmasını istersek
- Ana metod (`main`) için zorunludur.

### **Örnek: `public` Kullanımı**
```java
// Public Class: Her yerden erişilebilir
public class PublicExample {
    // Public Method: Her yerden erişilebilir
    public void showMessage() {
        System.out.println("Bu bir public metod!");
    }
}
```
Başka bir sınıftan erişim:
```java
public class Test {
    public static void main(String[] args) {
        PublicExample example = new PublicExample();
        example.showMessage();  // ✅ Başarıyla çalışır
    }
}
```

✅ **`public` ile tanımlanan değişken, metod veya sınıf herhangi bir paket veya sınıftan erişilebilir.**

---

## **2. `protected` Access Modifier**
**`protected` erişim belirleyicisi, aynı paketteki tüm sınıflardan ve farklı paketlerdeki alt sınıflardan erişime izin verir.**

📌 **Kullanım Alanları:**
- Kalıtım (Inheritance) kullanılarak oluşturulan alt sınıflar arasında veri paylaşımı yapmak için idealdir.
- Pakete özgü erişim sağlamak ve yalnızca alt sınıfların erişimini açmak için kullanılır.

### **Örnek: `protected` Kullanımı**
```java
package package1;

public class Parent {
    protected String protectedMessage = "Bu bir protected mesajdır!";
}
```
Başka bir sınıfta (aynı pakette):
```java
package package1;

public class SamePackageTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.protectedMessage);  // ✅ Erişebilir
    }
}
```
Farklı bir pakette bir alt sınıf:
```java
package package2;
import package1.Parent;

public class Child extends Parent {
    public void display() {
        System.out.println(protectedMessage);  // ✅ Erişebilir (Kalıtım olduğu için)
    }
}
```
Farklı pakette ve **kalıtım (extends) olmadan** erişmeye çalışırsak:
```java
package package2;
import package1.Parent;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.protectedMessage);  // ❌ Hata! (Protected erişim yok)
    }
}
```
✅ **Özet:**
- Aynı pakette **herkes erişebilir.**
- Farklı pakette yalnızca **alt sınıflar erişebilir.**

---

## **3. `default` (Paket-Özel) Access Modifier**
**Eğer bir erişim belirleyici belirtilmezse (`public`, `protected`, `private` yazılmazsa), Java bunu `default` olarak kabul eder.**  
Bu durumda **yalnızca aynı paketteki sınıflar erişebilir, farklı paketlerdeki sınıflar erişemez.**

📌 **Kullanım Alanları:**
- Yalnızca bir paketin içinde çalışacak bileşenler oluştururken
- Modüler bir yapı içinde, dış paketlerden erişimi kısıtlamak için

### **Örnek: `default` Kullanımı**
```java
package package1;

class DefaultExample {
    void showMessage() {
        System.out.println("Bu bir default metod!");
    }
}
```
Aynı pakette başka bir sınıftan erişim:
```java
package package1;

public class SamePackageTest {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();
        example.showMessage();  // ✅ Erişebilir
    }
}
```
Farklı paketten erişmeye çalışırsak:
```java
package package2;
import package1.DefaultExample;

public class Test {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();  // ❌ Hata! (default erişim yok)
    }
}
```
✅ **Özet:**
- **Aynı paketten erişilebilir.**
- **Farklı paketlerden erişilemez.**

---

## **4. `private` Access Modifier**
**`private` ile tanımlanan değişkenler, metotlar ve constructor’lar yalnızca tanımlandıkları sınıf içinde erişilebilir.**  
Dış sınıflar veya alt sınıflar **kesinlikle erişemez**.

📌 **Kullanım Alanları:**
- **Encapsulation (Kapsülleme)** sağlamak için
- Dışarıdan erişilmesini istemediğimiz verileri saklamak için

### **Örnek: `private` Kullanımı**
```java
public class PrivateExample {
    private String secretMessage = "Bu bir private mesajdır!";

    private void showMessage() {
        System.out.println(secretMessage);
    }

    public void accessPrivateMethod() {
        showMessage();  // Sınıf içinden erişim var
    }
}
```
Başka bir sınıftan erişmeye çalışırsak:
```java
public class Test {
    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        System.out.println(example.secretMessage);  // ❌ Hata! (Private değişkene erişim yok)
        example.showMessage();  // ❌ Hata! (Private metoda erişim yok)
    }
}
```
✅ **Çözüm:** `getter` ve `setter` metodları kullanarak erişim sağlamak:
```java
public class PrivateExample {
    private String secretMessage = "Bu bir private mesajdır!";

    public String getSecretMessage() {
        return secretMessage;  // Getter metodu
    }
}
```
Başka bir sınıfta:
```java
public class Test {
    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        System.out.println(example.getSecretMessage());  // ✅ Getter ile erişim var
    }
}
```
✅ **Özet:**
- `private` olan bir değişken veya metoda **yalnızca aynı sınıf içerisinden** erişilebilir.

---

## **Sonuç ve Karşılaştırma**
| Modifier | Aynı Sınıf | Aynı Paket | Farklı Paket (Alt Sınıf) | Farklı Paket (Alt Sınıf Olmayan) |
|----------|-----------|------------|-----------------|------------------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

Bu detaylı anlatım, **Java'daki erişim belirleyicilerin kullanımını** tam anlamıyla kavramanızı sağlayacaktır. 🚀

## Erişim Belirleyiciler Devam-2
```sh 

```
---
# **📌 Java'da Paketler (Packages) ve Erişim Belirleyiciler (Access Modifiers) Nedir? (Detaylı Açıklama)**

Java'da **paketler (packages)** ve **erişim belirleyiciler (access modifiers)**, programların düzenlenmesi, modüler hale getirilmesi ve **erişim kontrolü** sağlanması için kullanılan iki temel yapıdır.

---

# **🔹 1. Java'da Paketler (Packages) Nedir?**
**📌 Paket (Package)**, **benzer sınıfları (class), arayüzleri (interface) ve diğer bileşenleri bir arada tutan** bir dizin yapısıdır.  
Paketler sayesinde:
- **Kod daha düzenli hale gelir.**
- **Ad çakışmaları (name conflict) önlenir.**
- **Erişim belirleyicilerle güvenlik sağlanır.**
- **Yeniden kullanılabilir bileşenler oluşturulabilir.**

---

## **🔸 1.1 Paket Tanımlama ve Kullanımı**
Bir Java dosyasında paketi belirlemek için **`package`** anahtar kelimesi kullanılır. **Dosyanın en üstüne yazılmalıdır.**

```java
package com.ornek.paket; // Paketin tanımlanması

public class Selam {
    public void mesaj() {
        System.out.println("Merhaba, paket kullanımı!");
    }
}
```
📌 **Paket ismi, genellikle ters domain adı şeklinde belirlenir.**  
Örneğin:
- **`package com.google.search;`**
- **`package org.apache.commons;`**

---

## **🔸 1.2 Paket İçindeki Sınıfı Kullanma (`import`)**
Başka bir paketten bir sınıf kullanmak için **`import`** ifadesi kullanılır.

```java
import com.ornek.paket.Selam; // Paket içindeki sınıfı dahil ettik

public class Main {
    public static void main(String[] args) {
        Selam nesne = new Selam();
        nesne.mesaj();
    }
}
```
📌 **Eğer aynı paketteysek, `import` kullanmadan doğrudan sınıfı çağırabiliriz.**

---

## **🔸 1.3 Tüm Paket İçeriğini Dahil Etme**
Eğer bir paketin **tüm sınıflarını** kullanmak istiyorsak, `*` karakterini kullanabiliriz.

```java
import com.ornek.paket.*;

public class Main {
    public static void main(String[] args) {
        Selam nesne = new Selam();
        nesne.mesaj();
    }
}
```
📌 **Ancak, `import` ile sadece kullanılacak sınıfları dahil etmek daha performanslıdır.**

---

## **🔸 1.4 `static import` ile Metotları ve Değişkenleri Dahil Etme**
Bazı durumlarda, **sınıf adını yazmadan doğrudan bir metot veya değişkene erişmek için `static import` kullanılabilir**.

```java
import static java.lang.Math.*;

public class MathExample {
    public static void main(String[] args) {
        System.out.println(sqrt(25)); // 5.0
        System.out.println(pow(2, 3)); // 8.0
    }
}
```
📌 **Normalde `Math.sqrt(25)` şeklinde çağırılır. Ancak `static import` sayesinde `sqrt(25)` olarak doğrudan çağrılabilir.**

---

## **🔸 1.5 Varsayılan Paket (Default Package)**
Eğer **`package` ifadesi kullanılmazsa**, sınıf **varsayılan pakette (default package)** olur.  
Ancak **varsayılan paket kullanımı büyük projelerde önerilmez**.

```java
public class Varsayilan {
    public void mesaj() {
        System.out.println("Varsayılan paket içindeyim.");
    }
}
```

Bu sınıf, **herhangi bir pakete ait olmadığı için diğer paketler tarafından doğrudan kullanılamaz**.

---

# **🔹 2. Java’da Erişim Belirleyiciler (Access Modifiers)**
Erişim belirleyiciler, **sınıf, metot ve değişkenlerin erişim seviyelerini belirler**.

## **🔸 2.1 Java'daki Erişim Belirleyiciler**
| **Erişim Belirleyici** | **Açıklama** | **Aynı Sınıf** | **Aynı Paket** | **Alt Sınıflar (Inheritance)** | **Diğer Paketler** |
|----------------|----------------------------------------|:------------:|:------------:|:------------------:|:--------------:|
| **`public`**  | **Her yerden erişilebilir.** | ✅ | ✅ | ✅ | ✅ |
| **`private`** | **Sadece tanımlandığı sınıfta erişilebilir.** | ✅ | ❌ | ❌ | ❌ |
| **`protected`** | **Aynı paket ve alt sınıflardan erişilebilir.** | ✅ | ✅ | ✅ | ❌ |
| **Varsayılan (default)** | **Sadece aynı paket içindeki sınıflar erişebilir.** | ✅ | ✅ | ❌ | ❌ |

---

## **🔸 2.2 `public` Erişim Belirleyici**
- **Tüm sınıflardan erişilebilir**.
- **Global kullanılacak metotlar ve sınıflar genellikle `public` olarak tanımlanır.**

```java
package com.ornek;

public class PublicOrnek {
    public String mesaj = "Bu bir public değişkendir.";

    public void goster() {
        System.out.println(mesaj);
    }
}
```
Başka bir sınıfta:
```java
import com.ornek.PublicOrnek;

public class Main {
    public static void main(String[] args) {
        PublicOrnek nesne = new PublicOrnek();
        nesne.goster();
    }
}
```
📌 **Başka paketlerden bile erişilebilir.**

---

## **🔸 2.3 `private` Erişim Belirleyici**
- **Sadece tanımlandığı sınıf içinde erişilebilir**.
- **Dışarıdan çağrılamaz**.

```java
class PrivateOrnek {
    private String gizliMesaj = "Bu bir private değişkendir.";

    private void goster() {
        System.out.println(gizliMesaj);
    }
}
```
📌 **Başka sınıflardan `gizliMesaj` veya `goster()` metoduna erişilemez.**

🚫 **Yanlış Kullanım:**
```java
PrivateOrnek nesne = new PrivateOrnek();
nesne.goster(); // HATA! Erişim engellendi.
```

📌 **Ancak `getter` ve `setter` metotları ile erişim sağlanabilir.**
```java
class PrivateOrnek {
    private String gizliMesaj = "Bu bir private değişkendir.";

    public String getMesaj() {
        return gizliMesaj;
    }
}
```

---

## **🔸 2.4 `protected` Erişim Belirleyici**
- **Aynı paketteki sınıflar ve alt sınıflar (subclass) erişebilir**.
- **Farklı paketlerden sadece `extends` ile türetilen sınıflar erişebilir.**

```java
package com.ornek;

public class ProtectedOrnek {
    protected String mesaj = "Bu bir protected değişkendir.";
}
```
Başka bir paket içindeki **alt sınıfta (subclass) kullanılabilir**:
```java
import com.ornek.ProtectedOrnek;

public class AltSinif extends ProtectedOrnek {
    public void yazdir() {
        System.out.println(mesaj);
    }
}
```

📌 **Ancak `new` ile nesne oluşturulursa erişilemez!**
```java
ProtectedOrnek nesne = new ProtectedOrnek();
System.out.println(nesne.mesaj); // HATA! Çünkü başka paketteyiz.
```

---

## **🔸 2.5 Varsayılan (Default) Erişim**
- **Eğer erişim belirleyici yazılmazsa, sadece aynı paketteki sınıflar erişebilir.**

```java
class DefaultOrnek {
    String mesaj = "Bu bir varsayılan (default) değişkendir.";
}
```
Başka bir pakette:
```java
DefaultOrnek nesne = new DefaultOrnek(); // HATA! Çünkü başka paketteyiz.
```

---

# **📌 Sonuç ve Karşılaştırma**
| **Erişim Belirleyici** | **Sınıf İçinden** | **Aynı Paketten** | **Alt Sınıflardan (Inheritance)** | **Diğer Paketlerden** |
|----------------|--------------|------------|----------------------|--------------|
| **`public`** | ✅ | ✅ | ✅ | ✅ |
| **`private`** | ✅ | ❌ | ❌ | ❌ |
| **`protected`** | ✅ | ✅ | ✅ | ❌ |
| **Varsayılan (default)** | ✅ | ✅ | ❌ | ❌ |

**📌 Paketler ve erişim belirleyiciler, Java’da kodun organize edilmesi ve güvenliği açısından büyük önem taşır! 🚀**



## Javada Class Tanımı
```sh 

```
---

# **Java'da Class (Sınıf) Tanımı - Detaylı Açıklama**

## **1. Class (Sınıf) Nedir?**
Java'da **class (sınıf)**, **nesne yönelimli programlama (OOP)** yaklaşımında **nesnelerin şablonu** veya **kalıbı** olarak kullanılır.  
Bir sınıf; **verileri (değişkenler)** ve **bu verilere uygulanan işlemleri (metodlar)** içinde barındıran bir yapıdır.

Sınıflar sayesinde **kod tekrarını önleyerek** daha **düzenli, modüler ve ölçeklenebilir yazılım** geliştirilir.

### **Özetle bir sınıf:**
- **Özellikler (attributes/fields)**
- **Davranışlar (methods/behaviors)**
- **Kapsülleme (Encapsulation)**
- **Soyutlama (Abstraction)**

İçerir ve **nesne** (object) oluşturmak için bir **şablon** görevi görür.

---

## **2. Java'da Sınıf Tanımlama**
Java'da bir sınıf tanımlamak için `class` anahtar kelimesi kullanılır:

### **Temel Sınıf Tanımı**
```java
class Araba {
    // Özellikler (Fields)
    String marka;
    String model;
    int yil;

    // Metotlar (Davranışlar)
    void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}
```
Bu sınıf, **Araba (Car)** isimli bir nesne oluşturmak için kullanılabilir.

---

## **3. Nesne (Object) Oluşturma**
Bir sınıftan nesne türetmek için `new` anahtar kelimesi kullanılır.

### **Örnek: `Araba` Sınıfından Nesne Oluşturma**
```java
public class Main {
    public static void main(String[] args) {
        // Araba sınıfından bir nesne oluşturma
        Araba araba1 = new Araba();
        
        // Nesne özelliklerine değer atama
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.yil = 2022;
        
        // Metodu çağırma
        araba1.bilgileriGoster();
    }
}
```
📌 **Çıktı:**
```
Marka: Toyota
Model: Corolla
Yıl: 2022
```
Bu kodda, `Araba` sınıfından `araba1` isimli bir nesne oluşturulmuş ve bu nesnenin **özellikleri atanarak** ekrana yazdırılmıştır.

---

## **4. Constructor (Yapıcı Metot) Kullanımı**
Java'da bir sınıfın nesnesi oluşturulurken **otomatik olarak çalışan özel bir metod** vardır, buna **constructor (yapıcı metot)** denir.

### **Constructor Tanımı**
- **Nesne oluşturulduğunda çağrılır.**
- **Sınıf ismi ile aynı olmalıdır.**
- **Geri dönüş tipi (return type) içermez.**
- **Parametre alarak nesneye ilk değerleri atayabilir.**

### **Örnek: Constructor Kullanımı**
```java
class Araba {
    String marka;
    String model;
    int yil;

    // Yapıcı Metot (Constructor)
    Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructor ile nesne oluşturma
        Araba araba1 = new Araba("BMW", "X5", 2023);
        araba1.bilgileriGoster();
    }
}
```
📌 **Çıktı:**
```
Marka: BMW
Model: X5
Yıl: 2023
```
Bu kodda **constructor** sayesinde `araba1` nesnesi oluşturulurken **ilk değerler atanmış** oldu.

---

## **5. Access Modifiers (Erişim Belirleyiciler) ile Sınıf Kullanımı**
Erişim belirleyiciler (`public`, `private`, `protected`, `default`) sınıfın bileşenlerine **erişimi kontrol eder**.

### **Özel Değişkenler ve Getter-Setter Kullanımı**
Genellikle **kapsülleme (encapsulation)** için **değişkenler `private` yapılır** ve dışarıdan erişim `getter` ve `setter` metotları ile sağlanır.

```java
class Araba {
    private String marka;
    private String model;
    private int yil;

    // Constructor
    Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    // Getter metodu (Bilgi almak için)
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYil() {
        return yil;
    }

    // Setter metodu (Değer değiştirmek için)
    public void setYil(int yil) {
        if (yil > 1885) { // İlk otomobil 1886'da üretildi, mantıklı bir kontrol ekleyelim.
            this.yil = yil;
        } else {
            System.out.println("Geçersiz yıl!");
        }
    }

    void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba1 = new Araba("Mercedes", "E-Class", 2022);
        
        // Getter kullanarak değerleri al
        System.out.println("Marka: " + araba1.getMarka());
        System.out.println("Model: " + araba1.getModel());
        System.out.println("Yıl: " + araba1.getYil());

        // Setter ile yıl değerini değiştirelim
        araba1.setYil(2025);
        System.out.println("Güncellenmiş Yıl: " + araba1.getYil());
    }
}
```
📌 **Çıktı:**
```
Marka: Mercedes
Model: E-Class
Yıl: 2022
Güncellenmiş Yıl: 2025
```
Burada **getter ve setter metotları** kullanarak `private` olan değişkenlere güvenli bir şekilde erişim sağladık.

---

## **6. Kalıtım (Inheritance) ile Sınıf Kullanımı**
Java’da **bir sınıf başka bir sınıfın özelliklerini ve metotlarını miras alabilir.**  
Bu işleme **kalıtım (inheritance)** denir ve `extends` anahtar kelimesi kullanılır.

### **Örnek: Kalıtım Kullanımı**
```java
// Üst Sınıf (Parent Class)
class Arac {
    String yakitTuru = "Benzin";
    
    void hareketEt() {
        System.out.println("Araç hareket ediyor...");
    }
}

// Alt Sınıf (Child Class) - Arac sınıfından miras alır
class Araba extends Arac {
    int kapiSayisi = 4;

    void bilgileriGoster() {
        System.out.println("Yakıt Türü: " + yakitTuru);
        System.out.println("Kapı Sayısı: " + kapiSayisi);
    }
}

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.hareketEt();  // Üst sınıf metodunu çağırdı
        araba.bilgileriGoster();
    }
}
```
📌 **Çıktı:**
```
Araç hareket ediyor...
Yakıt Türü: Benzin
Kapı Sayısı: 4
```
✅ **Özet:** Kalıtım sayesinde **`Arac` sınıfının özelliklerini `Araba` sınıfına miras aldık** ve kod tekrarını önledik.

---

## **Sonuç**
- **Sınıflar**, Java'da nesne yönelimli programlamanın temel taşlarıdır.
- **Nesneler**, sınıflardan türetilir.
- **Encapsulation (kapsülleme)** ile veri güvenliği sağlanır.
- **Inheritance (kalıtım)** ile kod tekrarını azaltabiliriz.
- **Constructor** kullanarak nesneleri başlatabiliriz.

Java'da sınıflar, büyük ölçekli projelerde **düzeni ve okunabilirliği artırarak** programlamayı daha etkili hale getirir. 🚀

## if(name!=null && !name.isEmpty())
```sh 

```
---

Kodunuzdaki şu satır:

```java
if(name!=null && !name.isEmpty())
```

### **Ne İşe Yarar?**
Bu kod, `name` değişkeninin **boş (empty) veya null olup olmadığını kontrol eder**.

1. **`name != null`**
    - Eğer `name` değişkeni `null` ise, `NullPointerException` hatasını önlemek için işlem yapmadan devam eder.

2. **`!name.isEmpty()`**
    - `name` değişkeni boş bir string (`""`) içeriyorsa, işlemi yapmadan devam eder. `isEmpty()` metodu, stringin **hiçbir karakter içermediğini** kontrol eder.

### **Örnek Senaryolar**
| `name` Değeri     | `name != null` | `!name.isEmpty()` | Koşul Sonucu (`true/false`) |
|-------------------|--------------|-----------------|-----------------|
| `"Hamit"`        | `true`       | `true`          | ✅ `true` (Çalışır) |
| `""` (boş string) | `true`       | `false`         | ❌ `false` (Çalışmaz) |
| `null`           | `false`      | (Kontrol edilmez) | ❌ `false` (Çalışmaz) |

### **Neden Kullanılır?**
- **NullPointerException hatasından kaçınmak için.**
- **Boş string üzerinde gereksiz işlemler yapmamak için.**

Bu sayede `setName` metodunda `null` veya boş bir string girişi olduğunda hatasız bir şekilde `" "` olarak atanmasını sağlayabiliriz.

## POJO
```sh 

```
---
### **Java'da POJO (Plain Old Java Object) Nedir?**

POJO, **"Plain Old Java Object"** teriminin kısaltmasıdır ve özellikle Java dünyasında, basit, standart Java sınıflarını tanımlamak için kullanılır. POJO'lar, belirli bir çerçeveye (framework) veya Java'nın özel kütüphanelerine bağlı olmayan, genellikle yalnızca değişkenler (fields), getter ve setter metodları, yapıcı metodlar (constructors) ve bazı temel işlemleri içeren sınıflardır.

---

## **POJO'nun Genel Özellikleri**
POJO sınıfları, bazı temel özellikleri taşımalıdır:

1. **Java SE Bağımsızdır:** POJO sınıfları, Java SE'nin (Java Standard Edition) temel özelliklerine dayanır ve özel bir kütüphaneye veya API'ye bağımlı olmadan çalışabilir.
2. **Getter ve Setter Metodları İçerir:** Nesne özelliklerine erişmek ve değiştirmek için getter ve setter metodları kullanılabilir.
3. **Constructor (Yapıcı Metod) Bulundurur:** Parametreli veya parametresiz yapıcı metodlar olabilir.
4. **Serileştirilebilir (Opsiyonel):** POJO nesneleri, eğer kalıcı olarak saklanacaksa veya ağ üzerinden taşınacaksa `Serializable` arayüzünü uygulayabilir.
5. **Annotations (Ek Açıklamalar) Kullanmaya Zorunlu Değildir:** POJO'lar, herhangi bir özel açıklama (annotation) kullanmak zorunda değildir.
6. **Özel Bir Kütüphaneye veya Framework’e Bağlı Değildir:** Örneğin, EJB (Enterprise Java Beans) gibi ağır yapılar içermez.
7. **İçinde İş Mantığı (Business Logic) Olmaz:** Genellikle sadece verileri tutar ve işler.

---

## **POJO'nun Kullanım Amaçları**
POJO sınıfları, genellikle veri taşımak ve depolamak için kullanılır. Bu sınıflar, veri modeli oluştururken temel taşlardır ve aşağıdaki alanlarda yaygın olarak kullanılır:

1. **Veri Transferi (DTO - Data Transfer Object)**
    - Bir katmandan diğerine veri iletmek için kullanılır.
    - Örneğin, bir veritabanından çekilen kullanıcı bilgilerini içeren bir `User` POJO nesnesi oluşturulabilir.

2. **Veritabanı İşlemleri (ORM - Object-Relational Mapping)**
    - Hibernate gibi ORM araçları, veritabanı tablolarını POJO nesneleri ile eşleştirir.
    - Örneğin, `Employee` sınıfı bir veritabanı tablosuna karşılık gelebilir.

3. **JSON veya XML Serileştirme**
    - Spring Boot ve REST API’lerde POJO nesneleri JSON veya XML olarak kullanılabilir.
    - Örneğin, bir REST API çağrısında dönen JSON verisi bir POJO nesnesine dönüştürülebilir.

4. **JavaBeans Yapısına Alternatif Olarak**
    - JavaBeans, özel kuralları (örneğin, `Serializable` olmak, varsayılan yapıcıya sahip olmak vb.) gerektiren daha ağır bir yapı sunarken, POJO'lar daha hafif ve bağımsızdır.

---

## **POJO'nun Örnek Kullanımı**

Aşağıda temel bir **POJO (Plain Old Java Object)** sınıfı örneği verilmiştir:

```java
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Parametresiz Yapıcı (No-Args Constructor)
    public Employee() {}

    // Parametreli Yapıcı (All-Args Constructor)
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter ve Setter Metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString Metodu
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
```

Bu `Employee` sınıfı basit bir POJO’dur. İçinde sadece:

- `id`, `name` ve `salary` gibi alanlar (fields)
- Getter ve setter metodları
- Parametreli ve parametresiz yapıcı metodlar
- `toString()` metodu bulunur.

Herhangi bir özel çerçeveye veya kütüphaneye bağımlı değildir.

---

## **POJO ile İlgili Özel Konular**

### **1. POJO ile JavaBeans Farkı**
POJO, **JavaBeans** ile sıkça karıştırılır. Ancak aralarındaki farklar şunlardır:

| Özellik         | POJO                          | JavaBeans                      |
|----------------|--------------------------------|--------------------------------|
| Bağımsızlık    | Herhangi bir kurala bağlı değildir. | JavaBeans spesifik kurallara sahiptir. |
| Serializable   | Opsiyoneldir. | JavaBeans için zorunludur. |
| No-Arg Constructor | Opsiyoneldir. | Zorunludur. |
| Getter/Setter | Genellikle kullanılır ama zorunlu değildir. | Zorunludur. |
| Framework Kullanımı | ORM, DTO, REST API vb. | Genellikle GUI uygulamalarında kullanılır. |

### **2. POJO ve Lombok Kullanımı**
Java'da POJO sınıfları genellikle getter, setter ve constructor gibi birçok tekrar eden kod içerdiğinden, **Lombok** kütüphanesi POJO'ları daha az kod ile yazmayı sağlar.

Örneğin, yukarıdaki `Employee` sınıfını **Lombok** ile yazarsak:

```java
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private double salary;
}
```

Burada:
- `@Data` → Getter, Setter, `toString()`, `equals()` ve `hashCode()` metodlarını otomatik ekler.
- `@NoArgsConstructor` → Parametresiz yapıcıyı oluşturur.
- `@AllArgsConstructor` → Parametreli yapıcıyı oluşturur.

Bu sayede, POJO'nun gereksiz kodlarını yazmadan aynı fonksiyonelliği elde ederiz.

---

## **Sonuç**
POJO (Plain Old Java Object), Java'da temel veri taşıyıcı sınıfları oluşturmanın standart ve bağımsız bir yoludur. Çeşitli alanlarda, özellikle **DTO (Data Transfer Object)**, **ORM (Hibernate gibi)**, **JSON/XML Serileştirme** gibi yerlerde yaygın olarak kullanılır.

- POJO, herhangi bir özel Java kütüphanesine veya çerçeveye bağlı değildir.
- Getter ve setter metodları ile çalışır.
- JavaBeans kadar sıkı kurallara sahip değildir.
- Lombok gibi araçlarla daha az kod yazmamızı sağlar.

POJO'lar, Java uygulamalarında veri modellerini oluşturmanın en yaygın ve basit yoludur.

## BEAN
```sh 

```
---

### **Java'da Core Bean Nedir?**
Java'da **Core Bean**, genellikle Spring Framework bağlamında kullanılan bir kavramdır. **Bean**, temel olarak Spring Container tarafından yönetilen ve uygulamanın bir parçası olarak kullanılan bir nesnedir. Spring uygulamalarında, özellikle **IoC (Inversion of Control)** ve **Dependency Injection (Bağımlılık Enjeksiyonu)** mekanizmaları sayesinde Bean nesneleri merkezi bir yönetim altına alınır.

Spring Framework'ün ana bileşeni olan **ApplicationContext** veya **BeanFactory** gibi bileşenler, Core Bean'leri yönetir. Core Bean’ler, uygulamanın farklı bileşenleri arasında bağımlılıkları yönetmek için kullanılır.

---

## **1. Core Bean Kavramı**
Core Bean, genellikle aşağıdaki bileşenleri içeren temel Spring nesnelerini ifade eder:

1. **Service Beans** → İş mantığını içeren servis nesneleri.
2. **Repository Beans** → Veritabanı işlemlerini yöneten bileşenler.
3. **Controller Beans** → MVC mimarisinde kullanılan kontrol bileşenleri.
4. **Configuration Beans** → Yapılandırma ve özelleştirme bileşenleri.
5. **Component Beans** → Genel bileşen olarak kullanılan özel sınıflar.

---

## **2. Bean Tanımlama Yöntemleri**
Spring içinde bir **Core Bean** tanımlamanın birkaç yolu vardır:

### **2.1. XML Tabanlı Tanımlama**
Spring’in eski sürümlerinde Bean tanımlamak için XML kullanılıyordu.

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="myBean" class="com.example.MyService"/>
</beans>
```
Bu XML dosyasında, `MyService` sınıfı bir Bean olarak tanımlanmıştır ve `id="myBean"` ile erişilebilir.

---

### **2.2. Java Anotasyonları ile Bean Tanımlama**
Günümüzde XML yerine anotasyon tabanlı tanımlamalar daha yaygın kullanılıyor.

#### **2.2.1. `@Component` ile Bean Tanımlama**
Spring, `@Component` anotasyonu ile sınıfları otomatik olarak bir Bean olarak yönetir.

```java
import org.springframework.stereotype.Component;

@Component
public class MyService {
    public void serve() {
        System.out.println("Service is working...");
    }
}
```
- Bu sınıf bir Bean olarak tanımlanır ve Spring tarafından otomatik olarak yönetilir.
- **Component Scanning** özelliği ile, Spring `@Component` olan sınıfları tarar ve otomatik olarak bir Bean olarak kaydeder.

---

#### **2.2.2. `@Service`, `@Repository`, `@Controller` ile Bean Tanımlama**
Spring, **Component Scanning** mekanizmasını daha anlamlı hale getirmek için aşağıdaki özel anotasyonları sağlar:

1. `@Service` → Servis katmanında kullanılan sınıflar.
2. `@Repository` → Veritabanı erişim katmanında kullanılan sınıflar.
3. `@Controller` → Web katmanında (Spring MVC) kullanılan kontrolcüler.

```java
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUser() {
        return "John Doe";
    }
}
```

Bu anotasyonlar da `@Component` ile aynı işlevi görür ancak semantik olarak daha anlamlıdır.

---

#### **2.2.3. `@Bean` ile Bean Tanımlama**
Spring’de Bean tanımlamanın bir başka yöntemi de **`@Bean`** anotasyonudur.

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
```
Burada:
- `@Configuration` sınıfı, Spring için yapılandırma sınıfı olduğunu belirtir.
- `@Bean` anotasyonu ile bir Bean nesnesi manuel olarak tanımlanmıştır.

---

## **3. Bean Yaşam Döngüsü**
Spring Bean’leri, belirli bir yaşam döngüsü içerisindedir. Bu süreç **Spring Container** tarafından yönetilir.

1. **Bean Tanımlama:** Spring, konfigürasyon dosyası veya anotasyonlar aracılığıyla Bean'i algılar.
2. **Bean Oluşturma:** Bean örneği oluşturulur (new operatörü gibi).
3. **Bağımlılıkların Enjekte Edilmesi:** `@Autowired` gibi anotasyonlarla bağımlılıklar enjekte edilir.
4. **İlk Aşama İşlemleri (Initializing Bean):** Bean ilk oluşturulduğunda bazı başlangıç işlemleri yapılır.
5. **Kullanım:** Bean, Spring Container tarafından yönetilir ve kullanılabilir hale gelir.
6. **Yıkım:** Uygulama kapanırken Bean yok edilir.

---

## **4. Bean Scope (Kapsamı)**
Spring, Bean nesneleri için farklı **kapsamlar (scope)** sunar.

### **4.1. Singleton Scope (Varsayılan)**
- **Tüm uygulama içinde yalnızca bir tane nesne oluşturulur.**
- Aynı Bean tekrar çağrılsa bile aynı nesne döndürülür.

```java
@Component
@Scope("singleton")
public class SingletonBean {
}
```

### **4.2. Prototype Scope**
- **Her çağrıldığında yeni bir nesne oluşturulur.**
- Singleton’ın aksine, her istekte yeni bir nesne döner.

```java
@Component
@Scope("prototype")
public class PrototypeBean {
}
```

### **4.3. Request Scope (Web Uygulamaları için)**
- **Her HTTP isteğinde yeni bir nesne oluşturulur.**
- Sadece Web uygulamalarında kullanılabilir.

```java
@Component
@Scope("request")
public class RequestBean {
}
```

### **4.4. Session Scope**
- **Kullanıcının oturumu boyunca tek bir nesne oluşturulur.**

```java
@Component
@Scope("session")
public class SessionBean {
}
```

---

## **5. Core Bean’lerin Kullanımı**
Bir Bean’i kullanmanın en yaygın yolu **Dependency Injection (Bağımlılık Enjeksiyonu)** ile ona erişmektir.

### **5.1. `@Autowired` ile Bean Enjekte Etme**
Spring, bağımlılıkları otomatik olarak enjekte etmek için `@Autowired` anotasyonunu kullanır.

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void process() {
        myService.serve();
    }
}
```

- `@Autowired`, `MyService` nesnesini otomatik olarak `MyController` içine enjekte eder.

---

## **Sonuç**
Java'da **Core Bean**, Spring Framework içerisinde merkezi bir bileşen olarak kullanılan nesnelerdir. **Dependency Injection, IoC, Bean Scope ve Yaşam Döngüsü** gibi kavramlarla entegre çalışır.

Core Bean’ler:
- XML veya Java tabanlı konfigürasyonla oluşturulabilir.
- `@Component`, `@Service`, `@Repository`, `@Controller`, `@Bean` gibi anotasyonlarla tanımlanabilir.
- Singleton, Prototype, Request, Session gibi farklı kapsamlarla kullanılabilir.
- Dependency Injection mekanizması sayesinde nesnelerin yönetimini Spring üstlenir.

Spring Core Bean mekanizması, uygulamaların yönetilebilir, modüler ve ölçeklenebilir olmasını sağlar.


## Javada static ile constructor nedir ?
```sh 

```
---

# **Java'da `static` ve `constructor` Nedir? Aralarındaki Farklar Nelerdir?**

Java’da `static` ve `constructor`, nesne yönelimli programlamada oldukça önemli iki kavramdır. **İkisi de sınıfların ve nesnelerin yönetimiyle ilgilidir ama farklı işlevlere sahiptirler.**

Bu yazıda, **hem `static` hem de `constructor` kavramlarını ayrı ayrı detaylandıracak, ardından aralarındaki farkları derinlemesine açıklayacağız.**

---

# **🔹 `static` Nedir?**
Java’da `static` bir **anahtar kelimedir** ve sınıf seviyesinde tanımlanan üyeleri (değişkenler, metodlar ve bloklar) belirtmek için kullanılır. **Static üyeler, nesneye bağlı değildir, sınıfa bağlıdır.**

## **🔹 `static` Kullanım Alanları**
1. **Static Değişkenler (`static variables`)**
2. **Static Metodlar (`static methods`)**
3. **Static Bloklar (`static blocks`)**
4. **Static İç Sınıflar (`static nested classes`)**

---

### **📌 1️⃣ `static` Değişkenler (Class Variables)**
Bir değişken `static` olarak tanımlandığında, **bütün nesneler tarafından paylaşılır ve bellekte yalnızca bir kopyası bulunur.**

```java
class Car {
    static int totalCars = 0;  // Static değişken
    String model;

    public Car(String model) {
        this.model = model;
        totalCars++;  // Her nesne oluşturulduğunda artırılır
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW");

        System.out.println("Toplam araba sayısı: " + Car.totalCars); // 2
    }
}
```
**📌 Çıktı:**
```
Toplam araba sayısı: 2
```
**✔ `static` değişkenler tüm nesneler tarafından paylaşılır, her nesne için ayrı bir kopyası olmaz.**

---

### **📌 2️⃣ `static` Metodlar (Class Methods)**
`static` metodlar, nesne oluşturmadan çağrılabilir.

```java
class MathUtils {
    static int square(int num) {
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("5'in karesi: " + MathUtils.square(5)); // 25
    }
}
```
**✔ Static metodlar, sadece `static` değişkenlere erişebilir ve `this` kullanamaz.**

---

### **📌 3️⃣ `static` Bloklar (Static Initialization Blocks)**
**`static` blok, sınıf belleğe yüklendiğinde bir kez çalıştırılır.**

```java
class Config {
    static String appName;

    static {
        appName = "MyApp";
        System.out.println("Static blok çalıştı!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Config.appName);
    }
}
```
**📌 Çıktı:**
```
Static blok çalıştı!
MyApp
```
✔ **Static bloklar, sınıf yüklenirken bir kere çalışır ve genellikle başlangıç ayarları için kullanılır.**

---

# **🔹 Constructor (Yapıcı Metod) Nedir?**
Bir sınıfın nesnesi oluşturulduğunda **otomatik olarak çağrılan özel bir metottur.**

## **🔹 Constructor’ın Özellikleri:**
1. **Sınıf adıyla aynı isme sahip olmalıdır.**
2. **Geri dönüş tipi yoktur.** (void bile yazılmaz!)
3. **Otomatik olarak çağrılır.**
4. **Overloading (Aşırı Yükleme) destekler.**

---

### **📌 Constructor Örneği**
```java
class Car {
    String model;

    // Constructor (Yapıcı Metod)
    public Car(String model) {
        this.model = model;
        System.out.println(model + " oluşturuldu.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla"); // Constructor çağrılır
        Car car2 = new Car("BMW");
    }
}
```
**📌 Çıktı:**
```
Tesla oluşturuldu.
BMW oluşturuldu.
```
✔ **Her nesne oluşturulduğunda constructor çalışır.**

---

## **🔹 Constructor Overloading (Aşırı Yükleme)**
Bir sınıfta birden fazla constructor tanımlanabilir.

```java
class Person {
    String name;
    int age;

    // Constructor 1 (isim ile)
    public Person(String name) {
        this.name = name;
        this.age = 18;  // Varsayılan yaş
    }

    // Constructor 2 (isim ve yaş ile)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali");
        Person p2 = new Person("Veli", 25);

        System.out.println(p1.name + ", " + p1.age); // Ali, 18
        System.out.println(p2.name + ", " + p2.age); // Veli, 25
    }
}
```
✔ **Constructor overloading ile farklı parametreler için farklı yapılandırmalar yapabiliriz.**

---

# **🔹 `static` ve `constructor` Arasındaki Farklar**
| **Özellik** | **`static`** | **`constructor`** |
|------------|-------------|----------------|
| **Nesne oluşturma gerekliliği** | Nesne oluşturmadan kullanılabilir. | Nesne oluşturulduğunda çalışır. |
| **Bellekte Konumu** | **Sınıf belleğe yüklendiğinde çalışır.** | **Nesne oluşturulduğunda çalışır.** |
| **Metod tipi** | Normal metodlar olabilir (geri dönüş tipi vardır). | Geri dönüş tipi yoktur (void bile yazılmaz). |
| **Ana kullanım alanı** | Sınıf seviyesinde değişken/metod yönetimi. | Nesne oluşturma sürecini yönetir. |
| **Çağrılma Şekli** | `ClassName.staticMethod()` ile çağrılır. | `new ClassName()` ile otomatik çağrılır. |
| **Kaç kez çalışır?** | Static bloklar **bir kez** çalışır. | Her nesne oluşturulduğunda tekrar çalışır. |
| **Overloading** | Normal metodlar gibi overload edilebilir. | Overloading destekler. |
| **Özel Anahtar Kelime (`this` veya `super`) Kullanımı** | `this` veya `super` kullanılamaz. | `this` veya `super` kullanılabilir. |

---

# **🔹 Sonuç**
- **`static`, sınıf seviyesinde elemanlar tanımlamak için kullanılır ve nesne oluşturmadan çalışır.**
- **`constructor`, nesne oluşturulduğunda çağrılan bir metottur ve nesnenin başlatılmasını sağlar.**
- **Static bloklar yalnızca bir kez çalışırken, constructor her nesne oluşturulduğunda çağrılır.**
- **`static` metodlar ve değişkenler, nesneye değil sınıfa bağlıdır, ancak constructor her nesne için çalışır.**

✔ **Java’da sınıflar oluştururken, `static` ve `constructor` kavramlarını doğru kullanarak kodumuzu daha verimli hale getirebiliriz!** 🚀


## Javada Serializable
```sh 

```
---

# **Java'da `Serializable` Nedir?**
Java'da `Serializable`, **bir nesnenin byte dizisine dönüştürülmesini (serileştirme) ve daha sonra geri okunmasını (deserileştirme) sağlayan bir arayüzdür.** Nesneleri dosyaya kaydetmek, ağ üzerinden göndermek veya kalıcı hale getirmek için kullanılır.

## **🔹 `Serializable` Ne İşe Yarar?**
- Bir nesnenin durumu **diskte saklanabilir** veya **veritabanına kaydedilebilir**.
- Bir nesne **ağ üzerinden iletilebilir**.
- **RMI (Remote Method Invocation)** gibi sistemlerde nesne transferi için kullanılır.
- **Cache mekanizmaları ve oturum yönetimi** gibi alanlarda nesne saklamak için kullanılır.

---

## **🔹 `Serializable` Kullanımı**
Java'da **`Serializable` bir işaretleyici (marker) arayüzdür.** Yani herhangi bir metod içermez. **Bir sınıfı serileştirmek için `implements Serializable` kullanılır.**

📌 **Örnek: `Person` Sınıfını Serileştirme ve Dosyaya Kaydetme**
```java
import java.io.*;

// Serializable arayüzünü uygulayan sınıf
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Versiyon kontrolü için
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Ana program
public class SerializeDemo {
    public static void main(String[] args) {
        Person person = new Person("Ali", 30);

        // Serileştirme işlemi (ObjectOutputStream ile dosyaya yazma)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            out.writeObject(person);
            System.out.println("Nesne başarıyla serileştirildi.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserileştirme işlemi (ObjectInputStream ile dosyadan okuma)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person readPerson = (Person) in.readObject();
            System.out.println("Nesne başarıyla deserileştirildi: " + readPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```
**📌 Çıktı:**
```
Nesne başarıyla serileştirildi.
Nesne başarıyla deserileştirildi: Name: Ali, Age: 30
```

---

## **🔹 Serileştirmenin Çalışma Mantığı**
📌 **Adım Adım Süreç:**
1. **Nesne, `writeObject()` metodu ile bir dosyaya kaydedilir.**
2. **Nesne, `readObject()` metodu ile geri okunur.**
3. **Serileştirme sırasında nesnenin tüm alanları (field) kaydedilir.**
4. **Deserileştirme sırasında nesne yeniden oluşturulur ve alanları yüklenir.**

---

## **🔹 `serialVersionUID` Nedir?**
Serileştirilmiş bir nesnenin sınıfı değişirse **`InvalidClassException`** hatası alınabilir.  
Bu sorunu önlemek için **`serialVersionUID` tanımlanır.**

```java
private static final long serialVersionUID = 1L;
```
📌 **Eğer `serialVersionUID` eklenmezse:**
- JVM **otomatik bir UID oluşturur.**
- Sınıfta bir değişiklik olursa UID değişir ve **önceki serileştirilmiş nesneler kullanılamaz.**

📌 **Eğer `serialVersionUID` eklenirse:**
- Eski nesneler, yeni sınıfla **hata vermeden yüklenebilir.**
- Ancak **eklenen yeni alanlar null veya varsayılan değerde kalır.**

📌 **Örnek:**  
Önce aşağıdaki sınıfı kaydettik ve bir nesne oluşturduk:
```java
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
}
```
Sonra sınıfa yeni bir alan ekledik:
```java
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String email; // Yeni alan eklendi
}
```
Eğer eski dosyadan deserileştirme yaparsak **`email` alanı `null` kalır ama hata vermez.** Eğer `serialVersionUID` tanımlanmamış olsaydı, **`InvalidClassException`** hatası alırdık.

---

## **🔹 Serileştirme Kuralları ve İstisnalar**

### **1️⃣ `transient` Anahtar Kelimesi**
Bazı alanların serileştirilmesini istemiyorsak **`transient` anahtar kelimesini kullanırız.**

```java
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient String password; // Serileştirilmeyecek

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
```
**📌 Çıktı:**
```bash
Nesne başarıyla serileştirildi.
Nesne başarıyla deserileştirildi: Name: Ali, Age: 30, Password: null
```
- **`transient` alanlar serileştirilmez** ve varsayılan değere (null veya 0) döner.

---

### **2️⃣ `static` Alanlar Serileştirilemez**
```java
class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int counter = 100;
}
```
- **`static` alanlar serileştirilmez** çünkü sınıfa aittir ve nesneye özel değildir.

---

### **3️⃣ Serileştirme ile Miras (Inheritance)**
Eğer bir sınıf `Serializable` değilse, onun alt sınıfları da serileştirilemez.

```java
class Parent {
    int id;
}

class Child extends Parent implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
}
```
📌 **Burada `Parent` serileştirilebilir mi?** ❌ **Hayır, çünkü `Serializable` implement edilmedi!**  
Eğer `Parent`'ı serileştirmek istiyorsak, **ya `Serializable` yapmalıyız ya da `super` alanlarını manuel serileştirmeliyiz.**

```java
class Parent {
    int id;
}

class Child extends Parent implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject(); // Normal serileştirme yap
        out.writeInt(id); // Ekstra: Parent id’yi manuel kaydet
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // Normal deserileştirme yap
        id = in.readInt(); // Ekstra: Parent id’yi geri yükle
    }
}
```
---

## **🔹 Sonuç**
- **`Serializable`**, Java nesnelerini **diskte saklamak veya ağda iletmek için** kullanılır.
- **`serialVersionUID`**, sınıf versiyonlamasında uyumluluğu sağlar.
- **`transient`**, hassas verilerin serileştirilmesini engeller.
- **`static` alanlar serileştirilmez** çünkü sınıfa aittir.
- **Miras kullanıyorsak, üst sınıfların da serileştirildiğinden emin olmalıyız.**

🚀 **Serileştirme, verileri kalıcı hale getirmek için en önemli Java özelliklerinden biridir!** 🚀

## Javada IO(Giriş / Çıkış)
```sh 

```
---
## **Java'da I/O (Input/Output) Nedir?**

**Java'da I/O (Giriş/Çıkış - Input/Output)**, bir programın dış dünyayla veri alışverişi yapmasını sağlayan mekanizmalardır. Bu mekanizmalar, klavye girişi (kullanıcıdan veri alma), dosya okuma/yazma, ağ üzerinden veri transferi gibi işlemleri kapsar. Java'da I/O işlemleri, **java.io** ve **java.nio** (New I/O) paketleri aracılığıyla gerçekleştirilir.

---

## **1. Java I/O Paketleri**
Java'da temel I/O işlemleri için iki ana paket vardır:

1. **java.io**:
    - Geleneksel I/O işlemleri için kullanılır.
    - **Stream (Akış) tabanlıdır**.
    - Yavaş çalışır, ancak kullanımı basittir.
    - **Blocking I/O** mantığıyla çalışır (I/O işlemi tamamlanana kadar program durur).

2. **java.nio (New I/O)**:
    - Daha hızlı ve modern bir yaklaşımdır.
    - **Buffer (Tampon) ve Channel (Kanal) tabanlıdır**.
    - Non-blocking I/O desteği sunar (Asenkron çalışabilir).
    - Büyük veri işlemleri için daha uygundur.

Bu yazıda, geleneksel **java.io** kütüphanesini detaylıca ele alacağız.

---

## **2. Java’da I/O İşlemlerinin Temel Kavramları**
Java'daki I/O işlemleri aşağıdaki temel kavramlar üzerine kuruludur:

### **a) Stream (Akış)**
Java’da **Stream (Akış)**, veri giriş-çıkış işlemlerinin temelidir. Bir akış, **veri kaynağından hedefe veri taşıyan bir soyutlamadır**.

- **InputStream**: Veri giriş işlemlerini yönetir (klavyeden giriş, dosyadan okuma vb.).
- **OutputStream**: Veri çıkış işlemlerini yönetir (ekrana yazma, dosyaya kaydetme vb.).

#### **Akış Türleri:**
1. **Byte Streams (Bayt Akışları)**
    - **Veriyi bayt bazlı işler** (1 byte = 8 bit).
    - **Genellikle resim, video ve ses dosyaları gibi ikili (binary) verileri işlemek için kullanılır**.
    - **Örnekler:**
        - **InputStream** (Giriş Akışı)
        - **OutputStream** (Çıkış Akışı)

2. **Character Streams (Karakter Akışları)**
    - **Metin bazlı verileri işlemek için kullanılır**.
    - **Örnekler:**
        - **Reader (Giriş)**
        - **Writer (Çıkış)**

---

## **3. Java'da I/O Sınıfları ve Kullanımı**
### **a) Byte Streams (Bayt Akışları)**
Bayt akışları, veriyi **byte düzeyinde işler** ve resim, video gibi ikili (binary) veriler için idealdir.

#### **1. FileInputStream - Dosya Okuma**
Bu sınıf, bir dosyadan bayt bayt veri okumanızı sağlar.

```java
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Baytları karaktere çevirerek ekrana yazdır
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Dosyadan bayt bayt okuma yapar ve içeriği ekrana yazdırır.**

---

#### **2. FileOutputStream - Dosyaya Yazma**
Bu sınıf, bir dosyaya bayt bazlı veri yazmanızı sağlar.

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {
        String text = "Merhaba, Java I/O!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes()); // Metni bayt dizisine çevirerek dosyaya yaz
            System.out.println("Dosyaya yazma işlemi tamamlandı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Metni dosyaya bayt bazında yazdırır.**

---

### **b) Character Streams (Karakter Akışları)**
Karakter akışları, **karakter (char) bazında veri işlemek için kullanılır** ve metin dosyaları için idealdir.

#### **1. FileReader - Dosya Okuma**
Bu sınıf, bir dosyadan **karakter karakter veri okumanızı** sağlar.

```java
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("example.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Metin dosyasını karakter karakter okur ve ekrana yazdırır.**

---

#### **2. FileWriter - Dosyaya Yazma**
Bu sınıf, bir dosyaya **karakter bazlı** veri yazmanızı sağlar.

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String text = "Java I/O dersine hoş geldiniz!";
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(text);
            System.out.println("Dosyaya yazma işlemi başarılı!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Metni dosyaya karakter bazında yazdırır.**

---

### **c) Buffered Streams (Tamponlu Akışlar)**
BufferedReader ve BufferedWriter gibi sınıflar, **veriyi tampon (buffer) kullanarak daha hızlı okuma/yazma işlemi yapar.**

#### **1. BufferedReader - Hızlı Dosya Okuma**
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Satır satır okuma yapar
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Dosyayı satır satır okur ve ekrana yazdırır.**

---

#### **2. BufferedWriter - Hızlı Dosya Yazma**
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Java I/O çok önemli!");
            bw.newLine();
            bw.write("Tamponlu yazma işlemi başarıyla tamamlandı.");
            System.out.println("Dosya yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
✅ **Tampon kullanarak veriyi daha hızlı yazdırır.**

---

## **Sonuç ve Özet**
- Java I/O işlemleri **java.io** paketinde tanımlanmıştır.
- **InputStream / OutputStream** bayt bazlı çalışır (Resim, video gibi dosyalar için uygundur).
- **Reader / Writer** karakter bazlı çalışır (Metin dosyaları için uygundur).
- **BufferedReader / BufferedWriter** daha hızlı işlem yapar.
- Dosya okuma/yazma işlemleri genellikle **try-with-resources** yapısı ile kullanılır.

👉 **I/O işlemlerini verimli kullanarak büyük ölçekli projelerde performans kazanabilirsiniz! 🚀**

## Cipher (AES/DES/RSA/HASHING)
```sh 

```
---



## Diğer
```sh 

```
---



