import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Cate valori doriti sa introduceti? ");
        int n = in.nextInt();

        double prod = 1;

        System.out.println("Introdu valorile:");
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            prod = prod * x;
        }

        double mg = Math.pow(prod, 1.0 / n);

        System.out.printf("Media geometrica este: %.2f", mg);
    }
}
