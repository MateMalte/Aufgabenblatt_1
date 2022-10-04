//Aufgabe 8, 9, 10

public abstract class Form {

    String farbe;

    public Form() {
    }

    public Form(String _farbe) {
        this.farbe = _farbe;
    }

    public abstract void drucken();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Farbe: ");
        sb.append(farbe);

        return sb.toString();
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
