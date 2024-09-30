public class TanpaMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjunganTransport = 5000000;
        int tunjunganMakan = 3000000;
        int bonus = 1000000;
        int pajak = (gajiPokok + tunjunganTransport + tunjunganMakan + bonus) * 10 / 100;
        int gajiBersih = (gajiPokok + tunjunganTransport + tunjunganMakan + bonus) - pajak;

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Transport: " + tunjunganTransport);
        System.out.println("Tunjugan Makan: " + tunjunganMakan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}


