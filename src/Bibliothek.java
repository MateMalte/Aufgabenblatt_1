public class Bibliothek {
//TODO javadoc
    public static void main(String [] args) {
        Medium[] mediumArr = new Medium[4];

        mediumArr[0] = new Buch("Duden 01. Die deutsche Rechtschreibung", 2004,
                "Bibliographisches Institut, Mannheim", "3-411-04013-0", "-");
        mediumArr[1] = new CD("1", "Apple (Bea (EMI))", "The Beatles");
        mediumArr[2] = new Zeitschrift("Der Spiegel", "0038-7452", 54, 6);
        mediumArr[3] = new ElektronischesMedium("Hochschule Stralsund", "http://www.hochschule-stralsund.de");

        for(int i = 0;  i < 4; i++) {
            System.out.println(mediumArr[i].calculateRepresentation() + "\n");
        }
    }
}
