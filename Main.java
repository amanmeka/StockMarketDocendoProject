import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Stock> stocks = new ArrayList<Stock>();

        stocks.add(new Stock("NVIDIA"));
        stocks.add(new Stock("AAPL"));
        stocks.add(new Stock("TSLA"));
        stocks.add(new Stock("AMD"));
        stocks.add(new Stock("GOOGL"));
        stocks.add(new Stock("AMZN"));
        stocks.add(new Stock("DUOL"));
        stocks.add(new Stock("MSFT"));
        StockMarket stockMarket = new StockMarket(stocks);
        Trader trader = new Trader();

        trader.invest("TSLA", 9);
        trader.invest("GOOGL", 10);
        trader.invest("NVIDIA", 6);
        trader.invest("TSLA", 23);

        System.out.println("Stock Shares Money: " + trader.getStockMarketMoney());
        for(int i = 0; i < 20; i++) {
        stockMarket.simulateStockMarketDay();
        System.out.println("Stock Share Money: " + trader.getStockMarketMoney());
        for(int j = 0; j < stockMarket.getStockMarket().size(); j++) {
            stockMarket.getStockMarket().get(j);
        }
        }
    }
}
