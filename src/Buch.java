public class Buch extends Medium{

    private int erscheinungsjahr;
    private String verlag, isbn, verfasser;

    public Buch(String titel, int erscheinungsjahr, String verlag, String isbn, String verfasser) {
        super(titel);
        this.erscheinungsjahr = erscheinungsjahr;
        this.verlag = verlag;
        this.verfasser = verfasser;

        int[] tmp = new int[13];
        String tmp2 = isbn.replace("-", "");
        for(int i = 0; i < tmp2.length(); i++) {
            tmp[i] = Integer.parseInt(String.valueOf(tmp2.charAt(i)));
        }

        if(checkISBN10(tmp) || checkISBN13(tmp)) {
            this.isbn = isbn;
        } else {
            System.out.println("Die ISBN ist nicht korrekt.");
        }
    }

    public static boolean checkISBN10(int[] isbn) {
        int sum = 0;
        for (int i = 1; i <= isbn.length; i++) {
            sum += i * isbn[i - 1];
        }
        if (sum % 11 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkISBN13(int[] isbn) {
        int sum = 0;
        for (int i = 1; i < isbn.length; i++) {
            if (i % 2 == 0) {
                sum += isbn[i - 1] * 3;
            } else {
                sum += isbn[i - 1];
            }
        }
        int lastDigit = sum % 10;
        int check = (10 - lastDigit) % 10;
        if (isbn[isbn.length - 1] == check) {
            return true;
        } else {
            return false;
        }
    }

    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titel: ");
        sb.append(getTitel());
        sb.append("\nErscheinungsjahr: ");
        sb.append(erscheinungsjahr);
        sb.append("\nVerlag: ");
        sb.append(verlag);
        sb.append("\nISBN: ");
        sb.append(isbn);
        sb.append("\nVerfasser: ");
        sb.append(verfasser);

        return sb.toString();
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        int[] tmp = new int[13];
        String tmp2 = isbn.replace("-", "");
        for(int i = 0; i < tmp2.length(); i++) {
            tmp[i] = Integer.parseInt(String.valueOf(tmp2.charAt(i)));
        }

        if(checkISBN10(tmp) || checkISBN13(tmp)) {
            this.isbn = isbn;
        } else {
            System.out.println("Die ISBN ist nicht korrekt.");
        }
    }

    public String getVerfasser() {
        return verfasser;
    }

    public void setVerfasser(String verfasser) {
        this.verfasser = verfasser;
    }
}
