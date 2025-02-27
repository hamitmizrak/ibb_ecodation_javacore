Aşağıda, yüklediğiniz Java Core dosyalarına dayanarak bazı sorular ve çözümleri hazırladım:

---

### **1. PSVM (Main Method)**
**Soru:**  
Java'da bir programın çalışması için zorunlu olan ana metodun adı nedir? Bu metod nasıl tanımlanır?

**Cevap:**  
Java'da ana metod (main method) `public static void main(String[] args)` şeklinde tanımlanır. Bu metod, programın başlangıç noktasıdır.

---

### **2. Değişkenler (Variables)**
**Soru:**  
Aşağıdaki kod bloğunun çıktısı ne olur?

```java
int schoolNumber = 23;
System.out.println(schoolNumber);

schoolNumber = 44;
System.out.println(schoolNumber);
```

**Cevap:**  
Kodun çıktısı:
```
23
44
```
Çünkü `schoolNumber` değişkeni önce 23 olarak atanmış, sonra 44 olarak değiştirilmiştir.

---

### **3. Primitive Types**
**Soru:**  
Aşağıdaki veri tiplerinden hangisi en fazla hafıza tüketir?  

- `byte`
- `short`
- `int`
- `long`

**Cevap:**  
`long` en fazla hafıza tüketir çünkü `64 bit` (8 byte) yer kaplar.  
Diğer veri tipleri:
- `byte`: 8 bit (1 byte)
- `short`: 16 bit (2 byte)
- `int`: 32 bit (4 byte)

---

### **4. Wrapper Types**
**Soru:**  
Aşağıdaki ifadelerden hangisi doğrudur?

A) `int` ve `Integer` aynı şeydir.  
B) `Integer` sınıfı, `int` türüne göre daha fazla özellik içerir.  
C) `int` sınıf tabanlı bir veri tipidir.  
D) `Integer` doğrudan bir veri tipi değildir.

**Cevap:**  
Doğru cevap: **B**  
`Integer` bir wrapper class’tır ve `int` türüne göre daha fazla özellik içerir.

---

### **5. Operatörler**
**Soru:**  
Aşağıdaki kodun çıktısı ne olur?

```java
int number1 = 23, number2 = 7;
System.out.println("Kalan: " + (number1 % number2));
```

**Cevap:**  
`23 % 7 = 2` olduğu için çıktı:
```
Kalan: 2
```

---

### **6. Math Kütüphanesi**
**Soru:**  
Aşağıdaki ifadelerden hangisi doğrudur?

A) `Math.sqrt(-25)` kodu `5` çıktısını verir.  
B) `Math.pow(2, 5)` kodu `32` çıktısını verir.  
C) `Math.abs(-7)` kodu `-7` çıktısını verir.  
D) `Math.round(3.4)` kodu `4` çıktısını verir.  

**Cevap:**  
Doğru cevap: **B**  
`Math.pow(2, 5)` kodu `2^5 = 32` sonucunu döndürür.

---

### **7. Escape Characters**
**Soru:**  
Aşağıdaki ifadelerden hangisi ekrana `"Merhaba\tDünya"` çıktısını verir?  

A) `System.out.println("Merhaba Dünya");`  
B) `System.out.println("Merhaba\tDünya");`  
C) `System.out.println("Merhaba\nDünya");`  
D) `System.out.println("Merhaba\"Dünya\"");`  

**Cevap:**  
Doğru cevap: **B**  
`\t` tab (boşluk) ekler.

---

### **8. Scanner Kullanımı**
**Soru:**  
`Scanner` sınıfını kullanarak klavyeden bir tamsayı almak için hangi kod satırı doğrudur?

A) `Scanner scanner = new Scanner(System.in); int number = scanner.nextInt();`  
B) `Scanner scan = Scanner(System.in); int num = scan.read();`  
C) `Scanner sc = new Scanner(); int num = sc.getInt();`  
D) `Scanner s = new Scanner(System); int num = s.getInt();`  

**Cevap:**  
Doğru cevap: **A**  
`Scanner scanner = new Scanner(System.in); int number = scanner.nextInt();`  
Bu kod klavyeden girilen bir tamsayıyı okur.

---
