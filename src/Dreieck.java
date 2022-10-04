//Aufgabe 8, 9, 10

public class Dreieck extends Form{

    int laengeA, laengeB, laengeC;
    public Dreieck() {

    }

    public Dreieck(int _laengeA, int _laengeB, int  _laengeC) {
        this.laengeA = _laengeA;
        this.laengeB = _laengeB;
        this.laengeC = _laengeC;
    }

    public Dreieck(int _laengeA, int _laengeB, int  _laengeC, String farbe) {
        this.laengeA = _laengeA;
        this.laengeB = _laengeB;
        this.laengeC = _laengeC;
        super.farbe = farbe;
    }

    public double flaeche() {

        double s = 0.5 * (laengeA + laengeB + laengeC);
        double flaeche = Math.sqrt(s * (s - laengeA) * (s - laengeB) * (s - laengeC));

        return flaeche;
    }

    @Override
    public void drucken() {
        System.out.println("Ich bin ein Dreieck");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Laenge A:");
        sb.append(laengeA);
        sb.append(", Laenge B:");
        sb.append(laengeB);
        sb.append(", Laenge C:");
        sb.append(laengeC);
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

    public int getLaengeC() {
        return laengeC;
    }

    public void setLaengeC(int laengeC) {
        this.laengeC = laengeC;
    }
}
