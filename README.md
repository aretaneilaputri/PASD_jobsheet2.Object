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

Pertanyaan Percobaan 2
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
Jawab: Baris kode yang digunakan untuk membuat objek adalah:
	Mahasiswa02 mhs1 = new Mahasiswa02();
Pada baris tersebut dilakukan proses instansiasi dari class Mahasiswa02.
Nama objek yang dihasilkan adalah mhs1. Objek ini nantinya digunakan untuk mengakses atribut dan method yang ada di dalam class Mahasiswa.
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
Jawab: Atribut dan method dapat diakses menggunakan nama objek diikuti tanda titik (.).
	mhs1.nama = "Muhammad Ali Farhan";
    mhs1.tampilkanInformasi();
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
Jawab: Output yang dihasilkan berbeda karena sebelum pemanggilan method yang kedua dilakukan perubahan data pada objek. Perubahan tersebut dilakukan menggunakan method ubahKelas() dan updateIpk(). Setelah data pada objek berubah, ketika method tampilkanInformasi() dipanggil kembali maka informasi yang ditampilkan juga ikut berubah sesuai dengan data terbaru.

Pertanyaan Percobaan 3
1.	Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
Jawab: Mahasiswa(String nama, String nim, double ipk, String kelas) {
    this.nama = nama;
    this.nim = nim;
    this.ipk = ipk;
    this.kelas = kelas;
}       
2.	Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
    Mahasiswa02 mhs2 =new Mahasiswa02("Annisa Nabila","2141720160", 3.25,"TI 2L");
Jawab : Baris program tersebut digunakan untuk membuat objek baru bernama mhs2 dari class Mahasiswa. Pada saat objek dibuat, nilai atribut seperti nama, nim, ipk, dan kelas langsung diisi melalui konstruktor berparameter.
Dengan begitu, objek sudah memiliki data tanpa perlu mengisi atribut satu per satu.
3.	Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
Jawab: Jika konstruktor default dihapus sementara pada program masih terdapat kode:
	Mahasiswa mhs1 = new Mahasiswa();
maka program akan mengalami error saat proses compile. Hal ini terjadi karena Java tidak menemukan konstruktor tanpa parameter yang digunakan untuk membuat objek tersebut.
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
Jawab: Tidak harus. Method dapat dipanggil sesuai kebutuhan program. Selama objek sudah dibuat, method apa pun bisa dipanggil kapan saja dan tidak harus mengikuti urutan tertentu.



        
