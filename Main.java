public class Main {
    

    public static void main(String[] args) {
        Stock stock = new Stock("rizz");

        for(int i = 0; i < 40; i++) {
            System.out.println(stock.getStockPrice());
            // System.out.println("firstOrder: " + stock.getFirstOrderForecast());
            // System.out.println("secondOrder: " + stock.getSecondOrderForecast());
            // System.out.println("funtion: " + stock.getFunction()/2);
            stock.newDay();
        }
    }
}
