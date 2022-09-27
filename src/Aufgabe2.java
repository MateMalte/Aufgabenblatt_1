import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        String eingabe;
        long zahl = 48;
        ArrayList<Long> ergebnisse = new ArrayList<Long>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number greater than 0: ");
        eingabe  = sc.nextLine();
        zahl = Long.parseLong(eingabe);

        System.out.println("Eingabe: " + zahl);
        ergebnisse.add(zahl);

        while(zahl > 9) {
            zahl = quersumme(zahl);
            ergebnisse.add(zahl);
        }

        System.out.println("Output: " + ergebnisse.toString());
    }

    private static long quersumme(long zahl) {
        if (zahl <= 9) return zahl;
        zahl = zahl%10 + quersumme(zahl/10);

        return zahl;
    }
}