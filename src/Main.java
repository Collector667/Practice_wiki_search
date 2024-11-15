import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.awt.Desktop;

class ConsoleInput {
    Scanner in = new Scanner(System.in);

    String getWikiRequest() {
        System.out.print("Введите поисковой запрос: ");
        String wikiRequest = this.in.nextLine();
        return wikiRequest;
    }

    void close() {
        this.in.close();
    }
}

class OpenInBrowser {
    void wikipedia(int pageid) {
        String link = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
        link += String.valueOf(pageid);
        try {
            Desktop.getDesktop().browse(new URI(link));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        ConsoleInput cip = new ConsoleInput();
        String wikiRequest = cip.getWikiRequest();
        cip.close();
    }
}