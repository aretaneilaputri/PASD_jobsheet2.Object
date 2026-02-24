# PASD_jobsheet2.Object

Pertanyaan Percobaan 1
1. Sebutkan dua karakteristik class atau object!
Jawaban : Dua karakteristik utama dari class atau object adalah:
Atribut(data/field)
Digunakan untuk menyimpan informasi atau keadaan dari objek.
Method(perilaku/function)
Digunakan untuk menjalankan aksi atau operasi terhadap objek tersebut.
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
Jawab : Ada 4 atribut, yaitu:
        nim
        nama
    	kelas
        ipk
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
Jawab : Ada 4 method, yaitu:
        void tampilkanInformasi()
        void ubahKelas(String kelasBaru)
        void updateIPK(double ipkBaru)
        String nilaiKinerja()
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
Jawab: Cara kerja method nilaiKinerja()
Method ini digunakan untuk menilai performa mahasiswa berdasarkan nilai IPK.
Logikanya seperti ini:
•	IPK ≥ 3.5 -> Sangat Baik
•	IPK ≥ 3.0 -> Baik
•	IPK ≥ 2.5 -> Cukup
•	IPK < 2.5 -> Kurang
Method ini akan mengembalikan nilai berupa teks (String) yang menunjukkan kategori kinerja mahasiswa.
