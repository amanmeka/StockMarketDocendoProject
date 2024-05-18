public class Trader {

	private String name;
	private double balance;

	public Trader(String name) {
		this.name = name;
		balance = 10000.0;
	}

	public void invest(String ticker, int amountShares) {
        int i = 0;
        for(; i < StockMarket.getStockMarket().size(); i++) {
            if(StockMarket.getStockMarket().get(i).getStockName().equals(ticker)) {
                break;
            }
        }
        Stock stock = StockMarket.getStockMarket().get(i);
		stock.addShares(amountShares);
        balance -= stock.getStockPrice() * amountShares;
	}

	public void sell(Stock investStock, int amountShares) {
        int index = StockMarket.getStockMarket().indexOf(investStock);
        Stock stock = StockMarket.getStockMarket().get(index);
		stock.sellShares(amountShares);
        balance += stock.getStockPrice() * amountShares;
	}

    public double getStockMarketMoney() {
        double total = 0.0;
        for(int i = 0; i < StockMarket.getStockMarket().size(); i++) {
            Stock stock = StockMarket.getStockMarket().get(i);
            total += stock.getSharesInCompany() * stock.getStockPrice();
        }
        return total;
    }
}


