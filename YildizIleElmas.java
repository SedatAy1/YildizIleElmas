import java.util.Scanner;
public class YildizIleElmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = scanner.nextInt();

        int orta = n / 2 + 1;
        // Üst kısmı
        for (int i = 1; i <= orta; i++) {
            for (int j = 1; j <= orta - i; j++)
                System.out.print(" ");

            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }

        // Alt kısmı
        for (int i = orta - 1; i >= 1; i--) {
            for (int j = 1; j <= orta - i; j++)
                System.out.print(" ");

            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}

