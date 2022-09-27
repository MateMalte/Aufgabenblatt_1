public class Aufgabe3 {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;

        System.out.println("& und | sind Bit Operatoren.");
        int ergebniss = a & b;
        System.out.println("a = 60\nb = 13");
        System.out.println("\n& is ein binärer UND Operator.");
        System.out.println("a & b = " + ergebniss);
        System.out.println("0011 1100 & 0000 1101 = 0000 1100");

        ergebniss = a | b;
        System.out.println("\n| ist ein binärer ODER Operator");
        System.out.println("a | b = " + ergebniss);
        System.out.println("0011 1100 | 0000 1101 = 0011 1101");

        boolean c = true;
        boolean d = false;

        System.out.println("\n\n&& und || sind logische Operatoren.");
        boolean ergebnissB = c && d;
        System.out.println("c = true\nd = false");
        System.out.println("\n&& ist ein logischer UND Operator.");
        System.out.println("c && d = " + ergebnissB);

        ergebnissB = c || d;
        System.out.println("\n|| ist ein logischer ODER Operator.");
        System.out.println("c || d = " + ergebnissB);
    }
}
