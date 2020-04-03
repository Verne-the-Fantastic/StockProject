import stocks.*

class Stocks {
  List<Stock> stocks = new LinkedList<>();
    private void init() {
        Stock google = new GOOG();
        Stock spy = new SPY();
        stocks.add(google);
        stocks.add(spy);
    }

    private List<Stock> getTop5() {
      List<Stock> sortedStocks = sort(stocks);
    }

    public static void main(String[] args) {
      for(5 minutes) {
        init();
        execute();
      }
    }
}
