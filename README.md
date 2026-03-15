# Tugas UTS - Aplikasi Manajemen Penilaian Dosen

## 👤 Identitas Mahasiswa
* **Nama:** Salsabila Nur Shafa
* **NIM:** 42430040
* **Program Studi:** Teknologi Informasi

## 📋 Deskripsi Modul

### Modul 2 & 3: Layouting & Responsivitas (UI/UX)
* **Implementasi:** Membuat halaman Login sebagai gerbang utama aplikasi.
* **Fitur Utama:** Menggunakan skema warna **Sage Green (#81A263)** yang teduh di mata untuk meningkatkan pengalaman pengguna.
* **Responsivitas:** Mendukung tampilan **Portrait** dan **Landscape** menggunakan resource layout khusus (`layout-land`) agar UI tidak terpotong saat orientasi layar berubah.

### Modul 4: Intent & Navigasi Antar Halaman
* **Implementasi:** Menggunakan **Explicit Intent** untuk mengirimkan data antar Activity.
* **Alur Data:** 1. Mengirim Nama Dosen dari `LoginActivity` ke `MainActivity`.
  2. Mengirim Nama Dosen, Jumlah Mahasiswa, dan Rata-rata Nilai dari `MainActivity` ke `ResultActivity`.

### Modul 5: Logika Pemrograman (Control Flow)
* **Logika Kondisi (If-Else):** Menentukan status kelas secara otomatis berdasarkan input rata-rata nilai:
  - `>= 80`: Sangat Baik
  - `>= 60`: Cukup
  - `< 60`: Perlu Perhatian
* **Logika Perulangan (For-Loop):** Menghasilkan daftar absensi otomatis berdasarkan jumlah mahasiswa yang diinput oleh pengguna.

---

## 📸 Dokumentasi Output

| Halaman Login (Portrait) | Halaman Login (Landscape) |
| :---: | :---: |
| ![Login Portrait](isi_link_gambar_di_sini) | ![Login Landscape](isi_link_gambar_di_sini) |

| Halaman Input Data | Hasil Generate (If-Else & Loop) |
| :---: | :---: |
| ![Input Data](isi_link_gambar_di_sini) | ![Output](isi_link_gambar_di_sini) |

---
