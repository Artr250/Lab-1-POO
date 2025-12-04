import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nr. elemente = ");
        int n = in.nextInt();

        int[] a = new int[n + 1];

        System.out.println("Introdu elementele:");
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }

        // Elemente de pe poziții pare – ordine normală
        System.out.print("Pozitii pare: ");
        int p = 2;
        while (p <= n) {
            System.out.print(a[p] + " ");
            p += 2;
        }
        System.out.println();

        // Elemente de pe poziții impare – ordine inversă
        System.out.print("Pozitii impare invers: ");
        int start = (n % 2 == 1 ? n : n - 1);
        for (int i = start; i > 0; i -= 2) {
            System.out.print(a[i] + " ");
        }
    }
}
