public class Trader {

	private String name;
	private double balance;
	private int nvidiaShares, amdShares, amazonShares, teslaShares, appleShares;

	public Trader(String name) {
		this.name = name;
		balance = 10000.0;
		nvidiaShares = 0;
		amazonShares = 0;
		amdShares = 0;
		teslaShares = 0;
		appleShares = 0;
	}

	public void invest(Stock investStock, int amountShares) {
		if (investStock.getStockName().equals("NVIDIA")) {
			nvidiaShares += amountShares;
			balance -= investStock.stockPrice * amountShares;
			investStock.totalShares -= amountShares;
		}
		else if (investStock.getStockName().equals("AMD")) {
			nvidiaShares += amountShares;
			balance -= investStock.stockPrice * amountShares;
			investStock.totalShares -= amountShares;
		}
		else if (investStock.getStockName().equals("Amazon")) {
			amdShares += amountShares;
			balance -= investStock.stockPrice * amountShares;
			investStock.totalShares -= amountShares;
		}
		else if (investStock.getStockName().equals("Tesla")) {
			teslaShares += amountShares;
			balance -= investStock.stockPrice * amountShares;
			investStock.totalShares -= amountShares;
		}
		else if (investStock.getStockName().equals("Apple")) {
			appleShares += amountShares;
			balance -= investStock.stockPrice * amountShares;
			investStock.totalShares -= amountShares;
		}
	}

	public void sell(Stock investStock, int amountShares) {
		if (investStock.getStockName().equals("NVIDIA")) {
			nvidiaShares -= amountShares;
			balance += investStock.stockPrice * amountShares;
			investStock.totalShares += amountShares;
		}
		else if (investStock.getStockName().equals("AMD")) {
			nvidiaShares -= amountShares;
			balance += investStock.stockPrice * amountShares;
			investStock.totalShares += amountShares;
		}
		else if (investStock.getStockName().equals("Amazon")) {
			amdShares -= amountShares;
			balance += investStock.stockPrice * amountShares;
			investStock.totalShares += amountShares;
		}
		else if (investStock.getStockName().equals("Tesla")) {
			teslaShares -= amountShares;
			balance += investStock.stockPrice * amountShares;
			investStock.totalShares += amountShares;
		}
		else if (investStock.getStockName().equals("Apple")) {
			appleShares -= amountShares;
			balance += investStock.stockPrice * amountShares;
			investStock.totalShares += amountShares;
		}
	}
	}

