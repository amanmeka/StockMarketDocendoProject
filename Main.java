public class Main {
    

    public static void main(String[] args) {
        Stock stock = new Stock("rizz");

        for(int i = 0; i < 20; i++) {
            System.out.println(stock.getStockPrice());
            System.out.println("firstOrder: " + stock.getFirstOrderForecast());
            stock.newDay();
        }
    }
}
