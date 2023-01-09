import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader cock = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("n?");
        int anzahl = Integer.parseInt(cock.readLine());
        boolean[] zahlen = new boolean[anzahl + 1];


        for (int zahl = 2; zahl < anzahl; zahl++) {
            for (int vielfaches = 2; vielfaches <= (anzahl / zahl); vielfaches++) {
                zahlen[zahl * vielfaches] = true;
            }
        }

        for (int i = 1; i <= anzahl; i++) {
            if (!zahlen[i]) {
                System.out.print(i + " ");
            }
        }


    }

}

