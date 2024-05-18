public class Trader {
	private double balance;

	public Trader() {
		balance = 10000.0;
	}

    public int getStockNumber(String ticker) {
        int i = 0;
        for(; i < StockMarket.getStockMarket().size(); i++) {
            if(StockMarket.getStockMarket().get(i).getStockName().equals(ticker)) {
                break;
            }
        }
        return i;
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

	public void sell(String ticker, int amountShares) {
        int i = 0;
        for(; i < StockMarket.getStockMarket().size(); i++) {
            if(StockMarket.getStockMarket().get(i).getStockName().equals(ticker)) {
                break;
            }
        }
        Stock stock = StockMarket.getStockMarket().get(i);
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

    public double getBalance() {
        return balance;
    }
}


