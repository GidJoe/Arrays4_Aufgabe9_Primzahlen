import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner myscanner = new Scanner(System.in);
        int bereich = myscanner.nextInt();
        boolean[] n = new boolean[bereich + 1];



        // Wir brauchen zwei Schleifen, weil wir hier wieder a*b rechnen
        // Die Position in einem Boolean kann durch eine Rechnung bestimmt werden
        // for (int b = 2; b < bereich; b++) kann ersetzt werden durch
        // b <= (bereich/b)

        for (int a = 2; a < bereich; a++) {

            for (int b = 2; b < bereich; b++) {
                if ((a * b) < n.length) {
                    n[a * b] = true;
                }
            }
        }

        // Ausgabe
        // !n[i] ist eine kurze Version von n[i] = false;

        System.out.println("Das sind deine Primzahlen");
        System.out.println("");
        for (int i = 1; i <= bereich; i++) {
            if (!n[i]) {
                System.out.print(i + " ");
            }
        }


    }

}

