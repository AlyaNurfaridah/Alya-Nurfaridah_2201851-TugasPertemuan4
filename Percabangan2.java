import java.util.Scanner;

public class Percabangan2 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilanganPertama = userInput.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilanganKedua = userInput.nextInt();

        System.out.print("Masukkan operator aritmatika (+, -, *, /, %): ");
        char operator = userInput.next().charAt(0);

        double hasil = 0; // Menggunakan tipe data double untuk menyimpan hasil pembagian

        switch (operator) {
            case '+':
                hasil = bilanganPertama + bilanganKedua;
                break;
            case '-':
                hasil = bilanganPertama - bilanganKedua;
                break;
            case '*':
                hasil = bilanganPertama * bilanganKedua;
                break;
            case '/':
                if (bilanganKedua != 0) {
                    hasil = (double) bilanganPertama / bilanganKedua; // Menggunakan tipe data double dalam pembagian
                } else {
                    System.out.println("Error: Bilangan kedua tidak boleh nol untuk pembagian.");
                    return;
                }
                break;
            case '%':
                hasil = bilanganPertama % bilanganKedua;
                break;
            default:
                System.out.println("Error: Operator aritmatika tidak valid.");
                return;
        }

        // Menampilkan hasil pembagian dengan atau tanpa dua angka desimal setelah koma
        if (operator == '/' && hasil % 1 != 0) {
            System.out.printf("Hasil pembagian %d dan %d adalah: %.2f%n", bilanganPertama, bilanganKedua, hasil);
        } else {
            System.out.printf("Hasil %c %d dan %d adalah: %.0f%n", operator, bilanganPertama, bilanganKedua, hasil);
        }

        userInput.close();
    }
}
