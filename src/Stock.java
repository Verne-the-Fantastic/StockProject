package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class Stock {
    URL url;
    HashMap<String, String> data;
    public Stock(String url) throws MalformedURLException {
        this.url = new URL(url);
        data = new HashMap<>();
        data.put("symbol", "");
        data.put("price", "");
    }

    public void refresh() throws IOException {
        getData();
        printData();
    }

    private void printData() {
        System.out.printf("\t%-5s : %-5s\n", data.get("symbol"), data.get("price"));
    }

    private void getData() throws IOException{
        String symbol;
        String price;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
            reader.readLine();
            symbol = reader.readLine();
            symbol = symbol.substring((symbol.indexOf(":") + 3), symbol.lastIndexOf("\""));
            price = reader.readLine();
            price = price.substring(price.indexOf(":") + 2);
            reader.readLine();
        }
        data.replace("symbol", symbol);
        data.replace("price", price);
    }


}
