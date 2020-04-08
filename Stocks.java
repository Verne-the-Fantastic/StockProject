import stocks.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

class Stocks {

    private static List<Stock> stocks = new LinkedList<>();

    private static void init() throws MalformedURLException {
        Stock AAPl = new Stock("https://financialmodelingprep.com/api/v3/stock/real-time-price/AAPL");
        Stock GOOG = new Stock("https://financialmodelingprep.com/api/v3/stock/real-time-price/GOOG");
        Stock SPY = new Stock("https://financialmodelingprep.com/api/v3/stock/real-time-price/SPY");
        stocks.add(AAPl);
        stocks.add(GOOG);
        stocks.add(SPY);
    }

    private static void refresh(int sleepTimeSeconds) throws InterruptedException, IOException {
        for(Stock stock : stocks) {
            stock.refresh();
        }
        Thread.sleep(sleepTimeSeconds * 1000);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        init();
        while(true) {
            refresh(5);
        }
    }
}
