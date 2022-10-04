public class Zeitschrift extends Medium{

    private String issn;
    private int volume, nummer;

    public Zeitschrift(String titel, String issn, int volume, int nummer) {
        super(titel);
        this.issn = issn;
        this.volume = volume;
        this.nummer = nummer;
    }

    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titel: ");
        sb.append(getTitel());
        sb.append("\nVolume: ");
        sb.append(volume);
        sb.append("\nNummer: ");
        sb.append(nummer);
        sb.append("\nIssn: ");
        sb.append(issn);

        return sb.toString();
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
}
