//Aufgabe 6, 8, 9, 10

public class Viereck extends Form {

    int laengeA,laengeB;

    public Viereck(int _laengeA, int _laengeB) {
        this.laengeA = _laengeA;
        this.laengeB = _laengeB;
    }

    public Viereck(int _laengeA, int _laengeB, String farbe) {
        this.laengeA = _laengeA;
        this.laengeB = _laengeB;
        super.farbe = farbe;
    }

    public int flaeche(){
        return laengeA * laengeB;
    }

    public void drucken() {
        System.out.println("Ich bin ein Viereck.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Laenge A:");
        sb.append(laengeA);
        sb.append(", Laenge B:");
        sb.append(laengeB);
        sb.append(", Flaeche:");
        sb.append(flaeche());
        sb.append(", Farbe:");
        sb.append(farbe);

        return sb.toString();
    }

    public int getLaengeA() {
        return laengeA;
    }

    public void setLaengeA(int laengeA) {
        this.laengeA = laengeA;
    }

    public int getLaengeB() {
        return laengeB;
    }

    public void setLaengeB(int laengeB) {
        this.laengeB = laengeB;
    }
}
