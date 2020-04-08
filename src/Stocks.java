package src;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Stocks {
    private static List<Stock> stocks = new LinkedList<>();

    public void run() throws IOException, InterruptedException {
        while(true) {
            timestamp();
            refresh(10);
        }
    }

    public void init() throws MalformedURLException {
        Stock AAPl = new Stock("https://financialmodelingprep.com/api/v3/stock/real-time-price/AAPL");
        Stock GOOG = new Stock("https://financialmodelingprep.com/api/v3/stock/real-time-price/GOOG");
        Stock SPY = new Stock("https://financialmodelingprep.com/api/v3/stock/real-time-price/SPY");
        stocks.add(AAPl);
        stocks.add(GOOG);
        stocks.add(SPY);
    }

    private void refresh(int sleepTimeSeconds) throws InterruptedException, IOException {
        for(Stock stock : stocks) {
            stock.refresh();
        }
        Thread.sleep(sleepTimeSeconds * 1000);
    }

    private void timestamp() {
        SimpleDateFormat formatter = new SimpleDateFormat("\ndd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }
}
