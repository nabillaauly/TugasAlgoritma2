import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4,6,0);

        System.out.println("---------------");
        System.out.println("Hasil pertambahan :");
        int hasiltambahnya = s.hsltmbh(14,2);
        System.out.println(hasiltambahnya);

        System.out.println("---------------");
        System.out.println("Hasil Perkalian");
        int hasilkalinya = s.hslkli(60,40);
        System.out.println(hasilkalinya);
    }
}
