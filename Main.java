// kelas Main
public class Main {

    // method main untuk run program
    public static void main(String[] args) {

        // Instantiasi objek PersegiPanjang dengan nama pp1
        PersegiPanjang pp1 = new PersegiPanjang(10, 5);
    
        // Menampilkan informasi panjang, lebar, luas, dan keliling persegi panjang
        System.out.println("Persegi Panjang:");
        pp1.displayInfo();

        // Menampilkan luas dan keliling dari method getLuas() dan getKeliling()
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());

    }
}