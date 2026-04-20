# Praktikum Pra UTS — Java OOP (Sesi 1)

Repositori ini berisi kode Java hasil praktikum Pra UTS sesi pertama, mata kuliah Pemrograman Berorientasi Objek (OOP). Materi mencakup konsep dasar OOP: kelas, objek, atribut, metode, parameter, constructor, enkapsulasi, pewarisan, dan polimorfisme.

---

## Struktur Folder

```
PraUTS/
├── E1/           → Praktik 1 : Membuat Kelas, Objek, dan Memanggil Atribut
├── E1P2/         → Praktik 2 : Membuat dan Memanggil Metode
├── E2P3/         → Praktik 3 : Membuat Parameter
├── E3P4/         → Praktik 4 : Membuat Constructor
├── F1P5/         → Praktik 5 : Enkapsulasi
├── F2P6/         → Praktik 6 : Pewarisan (Inheritance)
├── F3P7/         → Praktik 7 : Polimorfisme
└── G1T1/         → Tugas 1   : Membuat Class Mahasiswa
```

---

## Daftar Praktikum

### E1 — Membuat Kelas, Objek, dan Memanggil Atribut

**File:** `Motor.java`, `MotorBeraksi.java` | **Package:** `Pra1.E1`

Class `Motor` mendefinisikan dua atribut `private` yaitu `warna` dan `merk`. Constructor menerima kedua atribut saat objek dibuat. Method `tampilkanInfo()` mencetak nilai atribut ke konsol. Objek dibuat dan dijalankan dari class `MotorBeraksi`.

**Konsep:** Class, Object, Constructor, Access Modifier (`private`), Method

**Output:**
```
Warna: Merah
Merk: Honda
```

---

### E1P2 — Membuat dan Memanggil Metode

**File:** `Motor2.java`, `Motor2Beraksi.java` | **Package:** `Pra1.E1P2`

Pengembangan dari E1. Class `Motor2` menambahkan dua setter method — `setWarna()` dan `setMerk()` — sehingga nilai atribut bisa diubah setelah objek dibuat. Mendemonstrasikan bagaimana state objek dapat dimutasi melalui method.

**Konsep:** Setter Method, Pemanggilan Method, Mutasi State Objek

**Output:**
```
Warna: Hitam
Merk: Yamaha
Warna: Biru
Merk: Suzuki
```

---

### E2P3 — Membuat Parameter

**File:** `Sepeda.java`, `SepedaBeraksi.java` | **Package:** `Pra1.E2P3`

Class `Sepeda` memiliki atribut `merk` (String) dan `kecepatan` (int). Method `ubahKecepatan(int kecepatanBaru)` menerima parameter untuk memperbarui nilai kecepatan. Mendemonstrasikan cara passing data ke dalam method melalui parameter.

**Konsep:** Parameter Method, Tipe Data `int`, Mutasi Atribut via Parameter

**Output:**
```
Merk: Polygon
Kecepatan: 20 km/jam
Merk: Polygon
Kecepatan: 30 km/jam
```

---

### E3P4 — Membuat Constructor

**File:** `MobilBaru.java`, `MobilBaruBeraksi.java` | **Package:** `Pra1.E3P4`

Class `MobilBaru` menggunakan constructor berparameter `(String warna, String merk)` untuk menginisialisasi atribut saat objek pertama kali dibuat, menggunakan keyword `this` untuk membedakan variabel instance dari parameter.

**Konsep:** Constructor Berparameter, Inisialisasi Objek, Keyword `this`

**Output:**
```
Warna: Putih
Merk: Toyota
```

---

### F1P5 — Enkapsulasi

**File:** `Mahasiswa.java`, `Sks.java` | **Package:** `Pra1.F1P5`

Menerapkan prinsip enkapsulasi pada class `Mahasiswa`. Atribut `nama` dan `sks` dideklarasikan `private` sehingga tidak bisa diakses langsung dari luar. Disediakan getter `getSks()` dan setter `setSks()` sebagai jalur akses yang terkontrol.

**Konsep:** Enkapsulasi, Access Modifier `private`, Getter, Setter

**Output:**
```
Nama: Budi
SKS: 24
Nama: Budi
SKS: 30
```

---

### F2P6 — Pewarisan (Inheritance)

**File:** `Main.java` | **Package:** `Pra1.F2P6`

Semua class ditulis dalam satu file `Main.java`. Class `Orang` bertindak sebagai superclass dengan atribut `nama` dan `umur`. Class `Mahasiswa` dan `Dosen` mewarisi `Orang` menggunakan keyword `extends` dan masing-masing menambahkan atribut tambahan (`nim` dan `nidn`).

**Hierarki Class:**
```
Orang
├── Mahasiswa  (+nim, +tampilkanNim())
└── Dosen      (+nidn, +tampilkanNidn())
```

**Konsep:** Pewarisan, Superclass, Subclass, `extends`, Method Warisan

**Output:**
```
Nama: Budi
Umur: 20
NIM: 123456
Nama: Dr. Ahmad
Umur: 40
NIDN: 654321
```

---

### F3P7 — Polimorfisme

**File:** `HewanPolimor.java` | **Package:** `Pra1.F3P7`

Semua class ditulis dalam satu file. Hierarki class: `Hewan` (base) → `Herbivora` dan `Karnivora` → `Kelinci` (subclass dari `Herbivora`). Setiap class meng-override method `suara()`. Di class utama, semua objek disimpan dalam variabel bertipe `Hewan` — output berbeda sesuai tipe runtime objek.

**Hierarki Class:**
```
Hewan
├── Herbivora
│   └── Kelinci
└── Karnivora
```

**Konsep:** Polimorfisme, Method Overriding, Upcasting, Runtime Dispatch

**Output:**
```
Suara hewan
Suara herbivora
Suara karnivora
Suara kelinci
```

---

### G1T1 — Tugas 1: Membuat Class Mahasiswa

**File:** `Mahasiswa.java`, `MahasiswaBeraksi.java` | **Package:** `Pra1.G1T1`

Tugas mandiri membuat class `Mahasiswa` dengan atribut `name` dan `nim`, serta tiga method: `tampilkanNama()`, `tampilkanNIM()`, dan `olahraga()`. Tiga objek diinstansiasi di `MahasiswaBeraksi` untuk merepresentasikan tiga mahasiswa berbeda.

**Konsep:** Class, Object, Multiple Instance, Pemanggilan Method

**Output:**
```
Nama: Rein
NIM: 109397
Olahraga Favorite: Sepak Bola, Bola Voli
Nama: Nei
NIM: 781394
Olahraga Favorite: Sepak Bola, Bola Voli
Nama: Sen
NIM: 241902
Olahraga Favorite: Sepak Bola, Bola Voli
```

---

## Ringkasan Konsep OOP

| Konsep | Praktik |
|---|---|
| Class & Object | E1, E1P2, E2P3, E3P4 |
| Constructor | E1, E3P4 |
| Access Modifier (`private`) | E1, E1P2, F1P5 |
| Setter & Getter | E1P2, F1P5 |
| Enkapsulasi | F1P5 |
| Pewarisan (`extends`) | F2P6 |
| Polimorfisme | F3P7 |
| Method Overriding | F3P7 |

---

## Cara Menjalankan

Semua file menggunakan deklarasi `package`, sehingga harus dikompilasi dari **folder root** `PraUTS/`.

**1. Compile:**
```bash
javac Pra1/E1/*.java
javac Pra1/E1P2/*.java
javac Pra1/E2P3/*.java
javac Pra1/E3P4/*.java
javac Pra1/F1P5/*.java
javac Pra1/F2P6/*.java
javac Pra1/F3P7/*.java
javac Pra1/G1T1/*.java
```

**2. Run:**
```bash
java Pra1.E1.MotorBeraksi
java Pra1.E1P2.Motor2Beraksi
java Pra1.E2P3.SepedaBeraksi
java Pra1.E3P4.MobilBaruBeraksi
java Pra1.F1P5.Sks
java Pra1.F2P6.Main
java Pra1.F3P7.HewanPolimor
java Pra1.G1T1.MahasiswaBeraksi
```

> Atau buka project di **NetBeans** dan jalankan file `*Beraksi.java` / `Main.java` di masing-masing folder.

---

## Info Mata Kuliah

| Info | Detail |
|---|---|
| Mata Kuliah | Pemrograman Berorientasi Objek |
| Fakultas | FILKOM |
| Bahasa | Java |
| Tipe | Praktikum Pra UTS Sesi 1 |
