public class ContohParameterMethod {

    // Method dengan satu parameter
public static int kaliDua(int angka) {
    int hasil = angka * 2;
    return hasil;
}

//Method dengan beberapa parameter
    public static hitungLuasSegitiga(double alas, double tinggi) {
    return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
    int hasilKaliDua = KaliDua(angka: 5); // Memanggil method dengan argumen 5
        System.out.println("5 x 2 = "+hasilKaliDua);

        double LuasSegitiga = hitungLuasSegitiga(alas 4, tingg 6); // Memanggil method dengan argumen 5
        System.out.prntln("Luas segitiga: "+luasSegitiga);
}
