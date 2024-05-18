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
        Scanner scanner = new Scanner(System.in);

        boolean game = true;

        System.out.println("Welcome to the Ultimate Stock Trading Game!");

        System.out.println("Here are the stocks you can choose from: \n");

        while(trader.getBalance() < 100000) {

            for(int i = 0; i < stockMarket.getStockMarket().size(); i++) {
                System.out.println(stockMarket.getStockMarket().get(i));
            }

            boolean invest = true;
            while (invest) {
                System.out.println("Do you want to invest in any stocks today? (Y/N)");
                String answer = scanner.nextLine();
                if(answer.equals("Y")) {
                    System.out.println("Which stock do you want to invest in?");
                    String ticker = scanner.nextLine();

                    System.out.println("How many shares do you want to buy?");
                    int shares = scanner.nextInt();

                    trader.invest(ticker, shares);
                } else {
                    invest = false;
                }
            }

            boolean sell = true;
            while (sell) {
                System.out.println("Do you want to invest in any stocks today? (Y/N)");
                String answer = scanner.nextLine();
                if(answer.equals("Y")) {
                    System.out.println("Which stock do you want to sell?");
                    String ticker = scanner.nextLine();

                    System.out.println("How many shares do you want to sell?");
                    int shares = scanner.nextInt();

                    if(shares > trader.getStockNumber(ticker)) {
                        trader.sell(ticker, trader.getStockNumber(ticker));
                    }

                    trader.sell(ticker, shares);
                } else {
                    sell = false;
                }   
            }

            stockMarket.simulateStockMarketDay();

            System.out.println("Balance: " + trader.getBalance());
            System.out.println("Money in stocks: " + trader.getStockMarketMoney());
        }
    }
}
