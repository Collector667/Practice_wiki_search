import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class WikiSearch {
    public static String main(String[] args, String search) throws Exception {
        String s = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
        search = URLEncoder.encode(search, StandardCharsets.UTF_8);
        s = s+search;
        URL SearchReguest = new URL(s);
        URLConnection yc = SearchReguest.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        yc.getInputStream()));
        String inputLine;
        inputLine = in.readLine();
        in.close();
        return (inputLine);
    }
}

