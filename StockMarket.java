import java.util.*;

public class StockMarket {

	private static ArrayList<Stock> stocks;

	public StockMarket(ArrayList<Stock> stocks) {
		this.stocks = stocks;
	}

	public static ArrayList<Stock> getStockMarket() {
		return stocks;
	}

	public void setStockMarket(ArrayList<Stock> setStockMarket) {
		stocks = setStockMarket;
	}

	public static void simulateStockMarketDay() {
		for (int i = 0; i < stocks.size(); i++) {
			stocks.get(i).newDay();
		}
	}
}