import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println(" Start trading simulator!");

       Stock[] stocks = {
       new Stock("NVIDIA"), 
       new Stock("AMD"), 
       new Stock("Amazon"), 
       new Stock("Tesla"),
       new Stock("Apple")
    };
       StockMarket stockMarket = new StockMarket(stocks);
       System.out.println("You are a trader! You start out with $10,000 dollars, and your goal is to make $100,000 after strategically investing into 5 companies");
       System.out.println("What is your name?");
       String traderName = scanner.nextLine();
    }
}
