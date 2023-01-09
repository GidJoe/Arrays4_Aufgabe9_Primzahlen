import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("n?");
        int anzahl = Integer.parseInt(reader.readLine());
        boolean[] n = new boolean[anzahl + 1];


        for (int a = 2; a < anzahl; a++) {
            for (int b = 2; b < anzahl; b++) {
                if ((a*b)<n.length) {n[a * b] = true;}
            }
        }

        System.out.println("Das sind deine Primzahlen");
        System.out.println("");
        for (int i = 1; i <= anzahl; i++) {
            if (!n[i]) {
                System.out.print(i + " ");
            }
        }


    }

}

