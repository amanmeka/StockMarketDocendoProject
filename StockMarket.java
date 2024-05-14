public class StockMarket {

	private Stock[] stockMarket;

	public StockMarket(Stock[] stocks) {
		stockMarket = stocks;
	}

	public Stock[] getStockMarket() {
		return stockMarket;
	}

	public void setStockMarket(Stock[] setStockMarket) {
		stockMarket = setStockMarket;
	}

	public void simulateStockMarketDay() {
		for (int i = 0; i < stockMarket.length; i++) {
			stockMarket[i].newDay();
		}
	}
}
