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
    //Desktop
    void wikipedia(int pageId) {
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