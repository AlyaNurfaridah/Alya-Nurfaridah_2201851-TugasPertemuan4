import java.util.Scanner;

public class Percabangan3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int x1, y1, tot1, x2, y2, tot2, lama, jam, menit;

        System.out.print("Masukkan Mulai (Jam)      = ");
        x1 = userInput.nextInt();
        System.out.print("Masukkan Mulai (Menit)    = ");
        y1 = userInput.nextInt();
        System.out.print("Masukkan Keluar (Jam)     = ");
        x2 = userInput.nextInt();
        System.out.print("Masukkan Keluar (Menit)   = ");
        y2 = userInput.nextInt();

        tot1 = (x1 * 60) + y1;
        tot2 = (x2 * 60) + y2;

        if (tot2 > tot1) {
            lama = tot2 - tot1;
            System.out.println("Lama = " + lama + " menit");
        } else {
            lama = (12 * 60) + tot2 - tot1;
            System.out.println("Lama = " + lama + " menit");
        }

        jam = lama / 60;
        menit = lama % 60;
        System.out.printf("Lamanya adalah %d jam %d menit%n", jam, menit);
        
        userInput.close();
    }
}
