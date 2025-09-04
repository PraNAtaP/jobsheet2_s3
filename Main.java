public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang(10, 5);
    
        System.out.println("Objek 1:");
        pp1.displayInfo();
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());

        System.out.println("\nSetelah update:");
        System.out.println("Objek 1:");
        pp1.displayInfo();
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());

    }
}