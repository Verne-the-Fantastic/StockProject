package stocks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Stock {
    URL url;
    public Stock(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    public void refresh() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            for (String line; (line = reader.readLine()) != null;) {
                System.out.println(line);
            }
        }
    }
}
