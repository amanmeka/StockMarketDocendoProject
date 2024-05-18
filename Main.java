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

        boolean game = true;

        System.out.println(" Welcome to the Ultimate Stock Trading Game:");
        
        while(game == true) {

            for(int i = 0; i < stockMarket.getStockMarket().size(); i++) {
                System.out.println(stockMarket.getStockMarket().get(i));
            }
            

        }
    }
}
