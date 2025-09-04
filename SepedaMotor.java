//  Kelas SepedaMotor
public class SepedaMotor {

    // Deklarasi Attributes Sepeda Motor
    String merek;
    String warna;
    double kapasitasMesin;
    String jenisBahanBakar;
    double kecepatan;
    double kapasitasTangki;

    // Inisialisasi mesinNyala menjadi false karna awal mulanya mesin mati
    boolean mesinNyala = false;

    // Method Menyalakan mesin motor
    boolean nyalakanMesin() {
        // Set mesinNyala menjadi true
        mesinNyala = true;
        System.out.println("Mesin dinyalakan.");
        // Mengembalikan status mesinNyala
        return mesinNyala;
    }

    // Mematikan mesin motor
    boolean matikanMesin() {
        // Set mesinNyala menjadi false
        mesinNyala = false;
        System.out.println("Mesin dimatikan.");
        // Mengembalikan status mesinNyala
        return mesinNyala;
    }

    // Menambah kecepatan motor
    double gas() {
        // Validasi jika mesinNyala true
        if (mesinNyala) {
            // Tambah kecepatan 10 setiap kali method gas() dipanggil
            kecepatan += 10;
            System.out.println("Gas! Kecepatan sekarang: " + kecepatan);
        } else {
            // Jika mesinNyala false, tampilkan pesan
            System.out.println("Mesin belum dinyalakan.");
        }
        // Mengembalikan kecepatan
        return kecepatan;
    }

    // Mengurangi kecepatan motor
    double rem() {
        // Validasi jika kecepatan lebih dari 0
        if (kecepatan > 0) {
            // Kurangi kecepatan 10 setiap kali method rem() dipanggil
            kecepatan -= 10;
            // Validasi jika kecepatan kurang dari 0
            if (kecepatan < 0) kecepatan = 0;
            System.out.println("Rem! Kecepatan sekarang: " + kecepatan);
        } else {
            // Jika kecepatan sudah 0, tampilkan pesan
            System.out.println("Motor sudah berhenti.");
        }
        return kecepatan;
    }

    // Method Mengisi bensin ke tangki motor
    double isiBensin(double jumlah) {
        // Validasi jika jumlah bensin positif
        if (jumlah > 0) {
            // Tambah kapasitasTangki dengan jumlah bensin yang diisi
            kapasitasTangki += jumlah;
            System.out.println("Isi bensin: " + jumlah + " liter. Total: " + kapasitasTangki + " liter.");
        } else {
            // Jika jumlah bensin tidak valid (kurang dari 0), tampilkan pesan
            System.out.println("Jumlah bensin tidak valid.");
        }
        return kapasitasTangki;
    }

    // Menyalakan lampu motor
    void nyalakanLampu() {
        // Menampilkan pesan lampu dinyalakan
        System.out.println("Lampu dinyalakan.");
    }
}