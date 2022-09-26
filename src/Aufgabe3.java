public class Aufgabe3 {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;

        System.out.println("& and | are bitwise operators.");
        int result = a & b;
        System.out.println("a = 60\nb = 13");
        System.out.println("\n& is a binary AND operator.");
        System.out.println("a & b = " + result);
        System.out.println("0011 1100 & 0000 1101 = 0000 1100");

        result = a | b;
        System.out.println("\n| is a binary OR operator");
        System.out.println("a | b = " + result);
        System.out.println("0011 1100 | 0000 1101 = 0011 1101");

        boolean c = true;
        boolean d = false;

        System.out.println("\n\n&& and || are logical operators.");
        boolean resultB = c && d;
        System.out.println("c = true\nd = false");
        System.out.println("\n&& is a logical AND operator.");
        System.out.println("c && d = " + resultB);

        resultB = c || d;
        System.out.println("\n|| is a logical OR operator.");
        System.out.println("c || d = " + resultB);
    }
}
