public class Main {
    public static void main(String[] args) {
        Tendik t1 = new Tendik("2980", "Boby Bibo", "Depok, Sleman", "20 Maret 2003", "Laki-Laki", 2016);
        t1.setJamLembur(20);
        System.out.println("Contoh Tendik");
        t1.cetak();

        Dosen d1 = new Dosen("1908", "Japrut ", "Banguntapan, Bantul ", "24 Desember 2001", "Laki-laki", 2015,
                "psikologi", "28990976");
        d1.setSksLebih(6);
        System.out.println("Contoh Dosen");
        d1.cetak();

    }
}