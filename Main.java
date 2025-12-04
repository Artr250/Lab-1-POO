import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Dati un numar de trei cifre: ");
        int x = in.nextInt();

        int c1 = x / 100;          // cifra sutelor
        int c2 = (x / 10) % 10;    // cifra zecilor
        int c3 = x % 10;           // cifra unitatilor

        int nrImpare = 0;

        if (c1 % 2 == 1) nrImpare++;
        if (c2 % 2 == 1) nrImpare++;
        if (c3 % 2 == 1) nrImpare++;

        System.out.println("Numar cifre impare: " + nrImpare);
    }
}