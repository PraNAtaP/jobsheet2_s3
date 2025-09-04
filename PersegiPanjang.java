public class PersegiPanjang {
    public int panjang;
    public int lebar;

    // Constructor
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menampilkan info
    void displayInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
    }

    // Method untuk menghitung luas
    int getLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    int getKeliling() {
        return 2 * (panjang + lebar);
    }    
}