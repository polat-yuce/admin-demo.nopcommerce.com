# 🧪 Techno Study Testing Project 5

Bu proje, **nopCommerce Admin Paneli** üzerinde temel test senaryolarının **Selenium WebDriver** ile **Java** dilinde otomasyonunu içermektedir.

## 🚀 Özellikler

- **Page Object Model (POM)** mimarisi kullanıldı.  
- **Paralel test çalıştırma desteği** (Chrome ve Firefox) sağlandı.  
- Testler **TestNG XML** dosyası üzerinden tetiklenmektedir.  

## 🌐 Test Ortamı

- **Uygulama URL:** [https://admin-demo.nopcommerce.com/login](https://admin-demo.nopcommerce.com/login)  
- **Kullanıcı Bilgileri:**  
  - **Username:** `admin@yourstore.com`  
  - **Password:** `admin`  

## ✅ Test Senaryoları

### 🔐 Test Case 1: Login Test

- Uygulama giriş sayfasına gidilir.  
- Geçerli kullanıcı adı ve şifre girilir.  
- **Login** butonuna tıklanır.  
- Girişin başarılı olduğu doğrulanır.

---

### 📋 Test Case 2: Check LeftNav Menu

- Dashboard altındaki tüm menü başlıklarına tıklanır.  
- Menülerin açılıp açılmadığı kontrol edilir.  
- Açılan menülerin alt başlıklarının varlığı doğrulanır.

---

### 👤 Test Case 3: Create Customer

- **Customers > Customers** menüsüne gidilir.  
- "Add new" butonuna tıklanır.  
- Açılan form eksiksiz doldurulup "Save" butonuna basılır.  
- Yeni müşteri kaydının başarıyla oluşturulduğu doğrulanır.

---

### 📝 Test Case 4: Edit Customer

- **Customers** menüsüne gidilir.  
- Daha önce oluşturulan müşterinin email, ad ve soyadı girilerek arama yapılır.  
- Sonuçlarda ilgili kayıt bulunur.  
- "Edit" butonuna tıklanır, bilgiler güncellenir ve "Save" yapılır.  
- Güncellemenin başarıyla gerçekleştiği doğrulanır.

---

### ❌ Test Case 5: Delete Customer

- **Customers** menüsüne gidilir.  
- Daha önce oluşturulan müşterinin bilgileri ile arama yapılır.  
- Kayıt bulunur ve "Delete" işlemi gerçekleştirilir.  
- Müşteri kaydının silindiği doğrulanır.

---

### 🔍 Test Case 6: Search Test

- Sol üstteki arama kutusuna `Shipments` yazılır.  
- Arama sonucundaki bağlantıya tıklanır.  
- Kullanıcının **Shipments** sayfasına yönlendirildiği doğrulanır.

---

## ⚙️ Teknolojiler

- Java  
- Selenium WebDriver  
- TestNG  
- Maven  




