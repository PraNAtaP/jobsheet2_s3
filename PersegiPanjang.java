//  Kelas PersegiPanjang
public class PersegiPanjang {

    // Deklarasi Attributes
    int panjang;
    int lebar;

    // Pembuatan Constructor berparameter
    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menampilkan info panjang dan lebar persegi panjang
    void displayInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }

    // Method untuk menghitung luas dengan tipe data integer
    int getLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling dengan tipe data integer
    int getKeliling() {
        return 2 * (panjang + lebar);
    }    
}