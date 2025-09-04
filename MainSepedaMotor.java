// Kelas MainSepedaMotor untuk menjalankan program
public class MainSepedaMotor {
    // method main untuk run program dan testing class SepedaMotor
    public static void main(String[] args) {

        // Instantiasi objek SepedaMotor dengan nama motor1
        SepedaMotor motor1 = new SepedaMotor();
        motor1.merek = "Honda";
        motor1.warna = "Merah";
        motor1.kapasitasMesin = 150;
        motor1.jenisBahanBakar = "Bensin";
        motor1.kapasitasTangki = 5;

        // Instantiasi objek SepedaMotor dengan nama motor2
        SepedaMotor motor2 = new SepedaMotor();
        motor2.merek = "Yamaha";
        motor2.warna = "Hitam";
        motor2.kapasitasMesin = 125;
        motor2.jenisBahanBakar = "Bensin";
        motor2.kapasitasTangki = 4;

        // Menjalankan Method pada objek motor1 yang ada di class SepedaMotor
        System.out.println("Motor 1: " + motor1.merek + ", " + motor1.warna);
        motor1.nyalakanMesin();
        motor1.gas();
        motor1.rem();
        motor1.isiBensin(2);
        motor1.nyalakanLampu();
        motor1.matikanMesin();

        // Memberi jarak antar output motor1 dan motor2
        System.out.println();

        // Menjalankan Method pada objek motor2 yang ada di class SepedaMotor
        System.out.println("Motor 2: " + motor2.merek + ", " + motor2.warna);
        motor2.nyalakanMesin();
        motor2.gas();
        motor2.gas();
        motor2.rem();
        motor2.isiBensin(1.5);
        motor2.nyalakanLampu();
        motor2.matikanMesin();
    }
}