import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        String input;
        long number = 48;
        ArrayList<Long> results = new ArrayList<Long>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number greater than 0: ");
        input  = sc.nextLine();
        number = Long.parseLong(input);

        System.out.println("Input: " + number);
        results.add(number);

        while(number > 9) {
            number = quersumme(number);
            results.add(number);
        }

        System.out.println("Output: " + results.toString());
    }

    private static long quersumme(long number) {
        if (number <= 9) return number;
        number = number%10 + quersumme(number/10);

        return number;
    }
}