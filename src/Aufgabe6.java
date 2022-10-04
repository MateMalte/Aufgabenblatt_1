public class Aufgabe6 {

    public static void main(String[] args) {
        Viereck[] viereckArr = new Viereck[2];

        viereckArr[0] = new Viereck(3,4);
        viereckArr[1] = new Viereck(5,6);

        for(int i = 0; i < viereckArr.length; i++) {
            System.out.printf("Viereck %d: Kantenlängen %d, %d Flaeche: %d %n", i,
                    viereckArr[i].getLaengeA(),
                    viereckArr[i].getLaengeB(),
                    viereckArr[i].flaeche());
        }

        //Aufgabe 8
        Form[] formArr = new Form[2];
        formArr[0] = new Viereck(3,4);
        formArr[1] = new Dreieck();
        for(int j = 0; j < 2; j++) {
            formArr[j].drucken();
        }

        //Aufgabe 9
        formArr[0] = new Viereck(3,4, "rot");
        formArr[1] = new Dreieck(3,4,5, "blau");

        //Aufgabe 10
        for(int j = 0; j < 2; j++) {
            System.out.println(formArr[j].toString());
        }
    }
}
