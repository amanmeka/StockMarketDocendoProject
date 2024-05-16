public class StockMarket {

	private Stock[] stocks;

	public StockMarket(Stock[] stocks) {
		this.stocks = stocks;
	}

	public Stock[] getStockMarket() {
		return stocks;
	}

	public void setStockMarket(Stock[] setStockMarket) {
		stocks = setStockMarket;
	}

	public void simulateStockMarketDay() {
		for (int i = 0; i < stocks.length; i++) {
			stocks[i].newDay();
		}
	}
}