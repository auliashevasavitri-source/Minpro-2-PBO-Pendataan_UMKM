# Minpro-2-PBO-Sistem-Pendataan-UMKM

## Deskripsi Program

**Sistem Pendataan UMKM** merupakan program yang digunakan untuk mengelola data UMKM yang mengikuti sebuah event. Program ini merupakan pengembangan dari Mini Project 1 dengan menambahkan beberapa konsep Pemrograman Berorientasi Objek (PBO).

Program dapat digunakan untuk menambah, menampilkan, mengubah, dan menghapus data UMKM. Data yang disimpan terdiri dari ID UMKM, nama usaha, nama pemilik, jenis usaha, dan event yang diikuti.

Pada Mini Project 2 ini, program dikembangkan dengan menerapkan **access modifier, encapsulation, inheritance, input validation, dan dummy data**. Sebagai nilai tambah, program juga menerapkan **MVC (Model View Controller)** agar bagian data, tampilan, dan pengolahan data lebih terstruktur.

---

## Fitur Program

Program memiliki beberapa fitur utama:

1. Menambah data UMKM
2. Menampilkan data UMKM
3. Mengubah data UMKM
4. Menghapus data UMKM
5. Validasi input pengguna
6. Pemilihan jenis usaha Kuliner dan Fashion
7. Dummy data sebagai data awal

---

## Alur Program

Cara kerja program dimulai dari file `Pendataan_UMKM.java` sebagai class utama. Program membuat data event terlebih dahulu, kemudian membuat `UMKMController` untuk mengelola data UMKM.

Setelah itu, program membuat satu dummy data UMKM dengan nama usaha "Dapur Aulia". Data tersebut dimasukkan ke dalam `ArrayList` melalui `UMKMController`. Dummy data digunakan agar program sudah memiliki data ketika pertama kali dijalankan.

Setelah data awal tersedia, program menjalankan `UMKMView` untuk menampilkan menu utama kepada pengguna.

Cara kerja setiap menu dalam program adalah sebagai berikut:

1. **Tambah Data UMKM**  
   Pengguna memasukkan ID, nama usaha, nama pemilik, dan jenis usaha. Program melakukan validasi pada input yang dimasukkan. Jika ID sudah digunakan atau input tidak sesuai, program akan memberikan pesan dan meminta input kembali. Jika semua data sesuai, data UMKM akan dibuat dan disimpan ke dalam `ArrayList`.

2. **Tampilkan Data UMKM**  
   Program mengambil seluruh data UMKM yang tersimpan di dalam `ArrayList`, kemudian menampilkan ID, nama usaha, nama pemilik, jenis usaha, event, dan lokasi.

3. **Ubah Data UMKM**  
   Pengguna memasukkan ID UMKM yang ingin diubah. Program mencari data berdasarkan ID tersebut. Jika data ditemukan, pengguna dapat memasukkan nama usaha, nama pemilik, dan jenis usaha yang baru. Data tersebut kemudian diperbarui menggunakan setter.

4. **Hapus Data UMKM**  
   Pengguna memasukkan ID UMKM yang ingin dihapus. Program mencari data berdasarkan ID tersebut. Jika ditemukan, data akan dihapus dari `ArrayList`. Jika tidak ditemukan, program akan memberikan pesan bahwa data tidak tersedia.

5. **Keluar**  
   Jika pengguna memilih menu keluar, program akan menghentikan menu dan menampilkan pesan bahwa program telah selesai.

Selama program berjalan, validasi input digunakan untuk mencegah kesalahan seperti memasukkan huruf pada input angka, memasukkan angka kurang dari atau sama dengan 0, atau membiarkan input teks kosong.

### Screenshot Alur Program

<img width="547" height="227" alt="image" src="https://github.com/user-attachments/assets/a4155e0a-f7d4-4d3f-993f-aaf6cac54e1f" />


---

# Struktur Project
Program dibagi menjadi beberapa package agar setiap bagian memiliki tugas yang berbeda.
Package yang digunakan terdiri dari:

- `model` digunakan untuk class yang berhubungan dengan data.
- `controller` digunakan untuk mengelola data UMKM.
- `view` digunakan untuk tampilan dan input pengguna.
- `com.mycompany.pendataan_umkm` berisi class utama untuk menjalankan program.
<img width="373" height="257" alt="image" src="https://github.com/user-attachments/assets/a5573c36-ae8e-4e6a-9d09-c99422555637" />

# Penerapan Konsep PBO

## 1. Access Modifier

Pada program ini, atribut dalam class dibuat menggunakan access modifier `private`.

Contohnya pada class `UMKM`:

```java
private int idUMKM;
private String namaUsaha;
private String namaPemilik;
private JenisUsaha jenisUsaha;
private Event event;
```

### Alasan Menggunakan Access Modifier

`private` digunakan agar atribut pada object UMKM tidak dapat diakses dan diubah secara langsung dari class lain.

Data seperti nama usaha, nama pemilik, dan jenis usaha perlu dikontrol ketika akan diubah. Oleh karena itu, data tersebut tidak dibuat `public`.

Data tersebut nantinya diakses menggunakan getter dan setter.

Dengan menggunakan access modifier, data di dalam class menjadi lebih terkontrol dan tidak dapat diubah secara langsung dari luar class.

### Screenshot Access Modifier

<img width="438" height="119" alt="image" src="https://github.com/user-attachments/assets/12a341e8-dcd8-4c3e-ac74-b4006e7905c0" />


## 2. Encapsulation

Encapsulation diterapkan dengan membuat atribut menjadi `private`, kemudian menyediakan getter dan setter untuk mengakses atau mengubah data.

Contohnya:
<img width="441" height="299" alt="image" src="https://github.com/user-attachments/assets/6ff314ae-7c05-4464-bcd7-f47d2ea193f4" />


### Alasan Menggunakan Encapsulation

Encapsulation digunakan karena program memiliki data UMKM yang perlu disimpan dan dapat diubah melalui menu program.

Jika atribut dibuat `public`, class lain dapat mengubah data secara langsung. Dengan encapsulation, data tidak dapat diubah secara langsung dan harus melalui method yang sudah disediakan.

Contohnya ketika pengguna memilih menu **Ubah Data UMKM**, program menggunakan:

```java
umkm.setNamaUsaha(namaUsaha);
```

Dengan cara tersebut, pengelolaan data menjadi lebih teratur dan data yang ada di dalam object tetap terkontrol.

### Screenshot Encapsulation

<!-- Masukkan screenshot getter dan setter pada UMKM.java -->

![Encapsulation](gambar/encapsulation.png)

---

## 3. Inheritance

Inheritance digunakan pada bagian jenis usaha.

Program memiliki satu superclass yaitu `JenisUsaha` dan dua subclass yaitu `JenisKuliner` dan `JenisFashion`.

Struktur inheritance yang digunakan adalah:

```text
JenisUsaha
├── JenisKuliner
└── JenisFashion
```

Contoh penerapan pada class `JenisKuliner`:

```java
public class JenisKuliner extends JenisUsaha {

    public JenisKuliner(String namaJenis) {
        super(namaJenis);
    }
}
```

Class `JenisFashion` juga dibuat sebagai turunan dari `JenisUsaha`.

### Alasan Menggunakan Inheritance

Inheritance digunakan karena Kuliner dan Fashion merupakan jenis dari usaha.

`JenisUsaha` digunakan sebagai class induk yang mewakili jenis usaha secara umum. Kemudian `JenisKuliner` dan `JenisFashion` dibuat sebagai turunannya.

Dengan cara ini, hubungan antar-class menjadi lebih jelas. Selain itu, penerapan ini memenuhi ketentuan Mini Project 2 yang meminta minimal satu superclass dan dua subclass.

Inheritance tidak diterapkan pada class `UMKM` karena Kuliner dan Fashion lebih sesuai menjadi turunan dari `JenisUsaha`, bukan turunan dari UMKM.

### Screenshot Inheritance

<!-- Masukkan screenshot JenisUsaha.java -->

![Superclass JenisUsaha](gambar/jenis-usaha.png)

<!-- Masukkan screenshot JenisKuliner.java -->

![Subclass JenisKuliner](gambar/jenis-kuliner.png)

<!-- Masukkan screenshot JenisFashion.java -->

![Subclass JenisFashion](gambar/jenis-fashion.png)

---

## 4. Input Validation

Program menggunakan validasi input untuk memastikan data yang dimasukkan pengguna sesuai dengan kebutuhan program.

Contoh validasi input angka:

```java
try {
    int angka = Integer.parseInt(scanner.nextLine());

    if (angka <= 0) {
        System.out.println("Input harus lebih dari 0.");
    } else {
        return angka;
    }

} catch (NumberFormatException e) {
    System.out.println("Input harus berupa angka.");
}
```

Program juga melakukan validasi untuk input teks:

```java
if (input.isEmpty()) {
    System.out.println("Input tidak boleh kosong.");
}
```

Program juga melakukan pengecekan ID agar tidak terdapat dua UMKM dengan ID yang sama.

### Alasan Menggunakan Input Validation

Input validation digunakan karena program menerima data secara langsung dari pengguna.

Pengguna dapat memasukkan data yang salah, misalnya memasukkan huruf ketika program meminta ID. Jika tidak dilakukan validasi, input tersebut dapat menyebabkan error pada program.

Oleh karena itu, validasi digunakan agar program dapat menangani input yang tidak sesuai dan memberikan pesan kepada pengguna tanpa membuat program langsung berhenti.

### Screenshot Input Validation

<!-- Masukkan screenshot ketika memasukkan input yang salah -->

![Input Validation](gambar/input-validation.png)

---

## 5. Dummy Data

Program memiliki satu dummy data yang dimasukkan ketika program pertama kali dijalankan.

Data yang digunakan:

```text
ID UMKM      : 1
Nama Usaha   : Dapur Aulia
Nama Pemilik : Aulia
Jenis Usaha  : Kuliner
Event        : Bazar UMKM Samarinda 2026
Lokasi       : Samarinda
```

Dummy data dibuat menggunakan kode:

```java
UMKM umkm = new UMKM(
        1,
        "Dapur Aulia",
        "Aulia",
        new JenisKuliner("Kuliner"),
        event
);

controller.tambahUMKM(umkm);
```

### Alasan Menggunakan Dummy Data

Dummy data digunakan agar program tidak dimulai dalam keadaan kosong.

Dengan adanya dummy data, ketika pengguna memilih menu **Tampilkan Data UMKM**, sudah terdapat data yang dapat ditampilkan.

Dummy data juga memudahkan proses pengujian karena fitur tampil, ubah, dan hapus dapat langsung dicoba tanpa harus memasukkan data terlebih dahulu.

Penggunaan dummy data juga memenuhi ketentuan Mini Project 2 yang meminta minimal satu data awal dalam `ArrayList`.

### Screenshot Dummy Data

<!-- Masukkan screenshot hasil menu Tampilkan Data UMKM -->

![Dummy Data](gambar/dummy-data.png)

---

# Nilai Tambah

## MVC (Model View Controller)

Sebagai nilai tambah, program menerapkan konsep **MVC (Model View Controller)**.

MVC digunakan untuk memisahkan bagian program berdasarkan tugasnya. Dalam program ini, bagian data, tampilan, dan proses pengolahan data ditempatkan pada package yang berbeda.

Struktur MVC pada program:

```text
model
├── Event.java
├── JenisUsaha.java
├── JenisKuliner.java
├── JenisFashion.java
└── UMKM.java

controller
└── UMKMController.java

view
└── UMKMView.java
```

---

## 1. Model

Package `model` berisi class yang berhubungan dengan data program.

Class yang terdapat dalam package `model` yaitu:

- `Event.java`
- `JenisUsaha.java`
- `JenisKuliner.java`
- `JenisFashion.java`
- `UMKM.java`

Contohnya, `UMKM.java` digunakan untuk menyimpan data seperti ID UMKM, nama usaha, nama pemilik, jenis usaha, dan event.

### Alasan Menggunakan Model

Model digunakan agar bagian yang menyimpan data dipisahkan dari tampilan dan proses program.

Dengan pemisahan ini, class seperti `UMKM` dapat fokus pada data yang dimiliki oleh object UMKM tanpa harus mengatur menu atau input pengguna.

Hal ini membuat kode lebih mudah dibaca dan memudahkan jika data UMKM nantinya ingin dikembangkan.

### Screenshot Model

<!-- Masukkan screenshot package model -->

![Model](gambar/model.png)

---

## 2. View

Package `view` berisi class `UMKMView.java`.

View digunakan untuk menampilkan menu dan menerima input dari pengguna.

Contohnya:

```text
==================================
     SISTEM PENDATAAN UMKM
==================================
1. Tambah Data UMKM
2. Tampilkan Data UMKM
3. Ubah Data UMKM
4. Hapus Data UMKM
5. Keluar
==================================
Pilih menu:
```

### Alasan Menggunakan View

View digunakan agar bagian tampilan dan input pengguna tidak bercampur dengan bagian pengolahan data.

Dengan pemisahan ini, jika tampilan menu ingin diubah, bagian yang mengatur data UMKM tidak perlu ikut diubah.

Hal ini membuat kode program lebih teratur karena bagian View hanya berfokus pada interaksi dengan pengguna.

### Screenshot View

<!-- Masukkan screenshot UMKMView.java -->

![View](gambar/view.png)

---

## 3. Controller

Package `controller` berisi class `UMKMController.java`.

Controller digunakan untuk mengatur proses pengelolaan data UMKM, seperti:

- Menambahkan data.
- Mencari data berdasarkan ID.
- Menghapus data.
- Mengakses daftar UMKM.

Contohnya:

```java
public void tambahUMKM(UMKM umkm) {
    daftarUMKM.add(umkm);
}
```

### Alasan Menggunakan Controller

Controller digunakan agar proses pengelolaan data tidak dilakukan langsung oleh bagian tampilan.

Contohnya ketika pengguna memilih menu tambah data, `UMKMView` menerima input dari pengguna. Setelah data dibuat menjadi object `UMKM`, data tersebut diberikan kepada `UMKMController` untuk dimasukkan ke dalam `ArrayList`.

Dengan begitu, View hanya berfokus pada tampilan dan input, sedangkan Controller menangani proses pengelolaan data.

### Screenshot Controller

<!-- Masukkan screenshot UMKMController.java -->

![Controller](gambar/controller.png)

---

## Alasan Menggunakan MVC Sebagai Nilai Tambah

MVC dipilih sebagai nilai tambah karena program memiliki beberapa class dan fitur CRUD sehingga kode program mulai memiliki beberapa bagian yang berbeda.

Jika semua kode diletakkan dalam satu class, kode akan menjadi panjang dan lebih sulit untuk dibaca.

Dengan menggunakan MVC, setiap bagian program memiliki tugas yang lebih jelas. `Model` menangani data, `View` menangani tampilan dan input pengguna, sedangkan `Controller` menangani proses pengelolaan data.

Contohnya pada proses tambah data:

1. Pengguna memasukkan data melalui `UMKMView`.
2. `UMKMView` membuat object `UMKM`.
3. Data diberikan kepada `UMKMController`.
4. `UMKMController` menyimpan data ke dalam `ArrayList`.
5. Data dapat ditampilkan kembali melalui `UMKMView`.

MVC digunakan agar kode program lebih terstruktur, lebih mudah dibaca, dan lebih mudah dikembangkan jika nantinya ingin menambahkan fitur baru.

### Screenshot Penerapan MVC

<!-- Masukkan screenshot struktur package MVC dari NetBeans -->

![Penerapan MVC](gambar/mvc.png)

---

# Tampilan Program

## 1. Menu Utama

<!-- Masukkan screenshot menu utama di sini -->

![Menu Utama](gambar/menu-utama.png)

---

## 2. Tambah Data UMKM

<!-- Masukkan screenshot proses tambah data di sini -->

![Tambah Data](gambar/tambah-data.png)

---

## 3. Tampilkan Data UMKM

<!-- Masukkan screenshot tampilan data UMKM di sini -->

![Tampilkan Data](gambar/tampilkan-data.png)

---

## 4. Ubah Data UMKM

<!-- Masukkan screenshot proses ubah data di sini -->

![Ubah Data](gambar/ubah-data.png)

---

## 5. Hapus Data UMKM

<!-- Masukkan screenshot proses hapus data di sini -->

![Hapus Data](gambar/hapus-data.png)

---

## 6. Validasi Input

<!-- Masukkan screenshot ketika program memberikan pesan validasi -->

![Validasi Input](gambar/validasi.png)

---

# Contoh Output Program

## Menu Utama

```text
==================================
     SISTEM PENDATAAN UMKM
==================================
1. Tambah Data UMKM
2. Tampilkan Data UMKM
3. Ubah Data UMKM
4. Hapus Data UMKM
5. Keluar
==================================
Pilih menu:
```

## Data UMKM

```text
--- Data UMKM ---
----------------------------------
ID UMKM      : 1
Nama Usaha   : Dapur Aulia
Nama Pemilik : Aulia
Jenis Usaha  : Kuliner
Event        : Bazar UMKM Samarinda 2026
Lokasi       : Samarinda
```

---

# Kesimpulan

Pada Mini Project 2 ini, Sistem Pendataan UMKM dikembangkan dengan menerapkan beberapa konsep Pemrograman Berorientasi Objek, yaitu **access modifier, encapsulation, inheritance, input validation, dan dummy data**.

Setiap konsep digunakan sesuai dengan kebutuhan program. Access modifier digunakan agar atribut tidak dapat diakses secara langsung dari class lain. Encapsulation digunakan agar akses dan perubahan data dilakukan melalui getter dan setter. Inheritance digunakan untuk membuat hubungan antara `JenisUsaha`, `JenisKuliner`, dan `JenisFashion`. Input validation digunakan untuk menangani kesalahan input pengguna, sedangkan dummy data digunakan agar program memiliki data awal ketika pertama kali dijalankan.

Sebagai **nilai tambah**, program menerapkan **MVC (Model View Controller)**. MVC digunakan karena program memiliki beberapa class dan fitur CRUD sehingga kode perlu dipisahkan berdasarkan tugasnya. Dengan adanya Model, View, dan Controller, bagian data, tampilan, dan pengolahan data menjadi lebih teratur dan lebih mudah dikembangkan.
