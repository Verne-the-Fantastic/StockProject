/* https://financialmodelingprep.com/developer/docs/ */

package src;

import java.io.IOException;

class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        Stocks stocks = new Stocks();
        stocks.init();
        stocks.run();
    }
}
