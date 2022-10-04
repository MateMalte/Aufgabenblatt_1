import java.net.URL;

public class ElektronischesMedium extends Medium{

    private String url;

    public ElektronischesMedium(String titel, String url) {
        super(titel);

        if(checkURL(url)) {
            this.url = url;
        } else {
            System.out.println("Die URL ist nicht korrekt.");
        }
    }

    public static boolean checkURL(String urlString)
    {
        try
        {
            URL url = new URL(urlString);
            url.toURI();
            return true;
        } catch (Exception exception)
        {
            return false;
        }
    }

    public String calculateRepresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titel: ");
        sb.append(getTitel());
        sb.append("\nURL: ");
        sb.append(url);

        return sb.toString();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if(checkURL(url)) {
            this.url = url;
        } else {
            System.out.println("Die URL ist nicht korrekt.");
        }
    }
}
