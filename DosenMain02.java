public class DosenMain02 {
    public static void main(String[] args) {

        // dosen 1 - konstruktor default - tampil informasi
        Dosen02 d1 = new Dosen02();
        System.out.println("===- Dosen 1: Rokhimatul Wakhidah, S.Pd., M.T. -===");
        d1.idDosen = "PASD_ROW1";
        d1.nama = "Rokhimatul Wakhidah, S.Pd., M.T.";
        d1.statusAktif = true;
        d1.tahunBergabung = 2002;
        d1.bidangKeahlian = "IT";

        d1.tampilInformasi();
        System.out.println();

        // dosen 2 - konstruktor default - tampil informasi + set status aktif
        Dosen02 d2 = new Dosen02();
        System.out.println("===- Dosen 2: Dr. Annisa Rahayu, S.H., M.H. -===");
        d2.idDosen = "HKM_ARH2";
        d2.nama = "Dr. Annisa Rahayu, S.H., M.H.";
        d2.statusAktif = false;
        d2.tahunBergabung = 1997;
        d2.bidangKeahlian = "Hukum";

        d2.tampilInformasi();
        d2.setStatusAktif(false);
        d2.tampilInformasi();
        System.out.println();

        // dosen 3 - konstruktor berparameter - tampil informasi + set status + hitung masa kerja
        System.out.println("===- Dosen 3: Wilda Imama Sabilla, S.Kom., M.Kom. -===");
        Dosen02 d3 = new Dosen02("PBD_WIS3", "Wilda Imama Sabilla, S.Kom., M.Kom.", true, 2015, "Basis data");
        d3.tampilInformasi();
        d3.setStatusAktif(true);
        System.out.println("Masa Kerja: " + d3.hitungMasaKerja(2026) + " tahun");
        d3.tampilInformasi();
        System.out.println();

        // dosen 4 - konstruktor berparameter - tampil informasi + set status + hitung masa kerja + ubah keahlian
        System.out.println("===- Dosen 4: Ahammad Fandi, S.Kom., M.Kom. -===");
        Dosen02 d4 = new Dosen02("KMP_MAI4", "Ahammad Fandi, S.Kom., M.Kom.", false, 2002, "Teknik Komputer dan Jaringan");
        d4.tampilInformasi();
        d4.setStatusAktif(false);
        System.out.println("Masa Kerja: " + d4.hitungMasaKerja(2026) + " tahun");
        d4.ubahKeahlian("Sains Data");
        d4.tampilInformasi();
        System.out.println();
    }
}
