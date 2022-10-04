public class CD extends Medium{

    private String label, kuenstler;

    public CD(String titel, String label, String kuenstler) {
        super(titel);
        this.label = label;
        this.kuenstler = kuenstler;
    }

    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titel: ");
        sb.append(getTitel());
        sb.append("\nKuenstler: ");
        sb.append(kuenstler);
        sb.append("\nLabel: ");
        sb.append(label);

        return sb.toString();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getKuenstler() {
        return kuenstler;
    }

    public void setKuenstler(String kuenstler) {
        this.kuenstler = kuenstler;
    }
}
