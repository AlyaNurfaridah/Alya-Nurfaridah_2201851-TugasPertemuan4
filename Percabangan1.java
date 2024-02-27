import java.util.Scanner;

public class Percabangan1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan bilangan riil: ");
        double bilanganRiil = userInput.nextDouble();

        // Mengambil angka di depan koma
        int angkaDepanKoma = (int) bilanganRiil;

        // Mengambil dua digit angka di belakang koma
        int angkaBelakangKoma = (int) ((bilanganRiil - angkaDepanKoma) * 100);

        // Memeriksa apakah angka di depan dan di belakang koma adalah kelipatan 3
        if (angkaDepanKoma % 3 == 0 && angkaBelakangKoma % 3 == 0) {
            System.out.println("Angka di depan dan di belakang koma kelipatan 3.");
        } else {
            System.out.println("Angka di depan dan di belakang koma bukan kelipatan 3.");
        }

        userInput.close();
    }
} 
