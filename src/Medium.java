public abstract class Medium {

   private String titel;

    public Medium(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public abstract String calculateRepresentation();
}
