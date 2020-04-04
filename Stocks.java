import stocks.*;
import java.util.*;

class Stocks {
  List<Stock> stocks = new LinkedList<>();
    private void init() {
        Stock google = new GOOG();
        Stock spy = new SPY();
        stocks.add(google);
        stocks.add(spy);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
