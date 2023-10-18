package matematikaa;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        int hasilPertambahan = matematika.pertambahan(20, 10);
        int hasilPengurangan = matematika.pengurangan(10, 5);
        int hasilPerkalian = matematika.perkalian(10, 3);
        double hasilPembagian = matematika.pembagian(21, 2);

        System.out.println("Hasil Pertambahan dari 20 + 10 = " + hasilPertambahan);
        System.out.println("Hasil Pengurangan dari 10 - 5 = " + hasilPengurangan);
        System.out.println("Hasil Perkalian dari 10 * 3 = " + hasilPerkalian);
        System.out.println("Hasil Pembagian dari 21 / 2 = " + hasilPembagian);
    }
}
