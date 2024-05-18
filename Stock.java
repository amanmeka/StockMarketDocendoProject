
public class Stock {
  private String stockName;
  private double volatility;
  private double firstOrderForecast;
  private double secondOrderForecast;
  private double stockPrice;
  private double sharesInCompany;

  public Stock(String stockName) {
    this.stockName = stockName;
    volatility = Math.random() * 2.5;
    secondOrderForecast = (Math.random() * 100) + 1;
    stockPrice = (Math.random() * 100) + 1;
    firstOrderForecast = (Math.random()*5);
    sharesInCompany = 0.0;
  }

  public void newDay() {
    double firstChange = (Math.random() * 5) - 2.5;
    firstOrderForecast = firstOrderForecast + firstChange;

    double secondChange = (Math.random() - 0.5) / 5;
    secondOrderForecast += secondChange;

    stockPrice += (getFunction()/2);

  }

  public double getFunction() {
    if (stockPrice - 10 >= secondOrderForecast) {
      return volatility*firstOrderForecast - 4.0;
    } else if (stockPrice - 5 >= secondOrderForecast) {
      return volatility*firstOrderForecast - 2.0;
    } else if (stockPrice > secondOrderForecast) {
      return volatility*firstOrderForecast - 1.0;
    } else if (stockPrice == secondOrderForecast) {
      return volatility*firstOrderForecast;
    } else if (stockPrice < secondOrderForecast) {
      return volatility*firstOrderForecast + 1.0;
    } else if (stockPrice + 5 <= secondOrderForecast) {
      return volatility*firstOrderForecast + 2.0;
    } else if (stockPrice + 10 <= secondOrderForecast) {
      return volatility*firstOrderForecast + 4.0;
    }
    return volatility*firstOrderForecast;
  }

  public void addShares(int add) {
    sharesInCompany += add;
  }

  public void sellShares(int delete){
    sharesInCompany -= delete;
  }

  public String getStockName() {
    return stockName;
  }

  public double getVolatility() {
    return volatility;
  }

  public double getFirstOrderForecast() {
    return firstOrderForecast;
  }

  public double getSecondOrderForecast() {
    return secondOrderForecast;
  }

  public double getStockPrice() {
    return stockPrice;
  }

  public double getSharesInCompany() {
    return sharesInCompany;
  }

  public String toString() {
    return stockName + ", stock price: " + stockPrice + ", shares in stock: " + sharesInCompany;
  }
}
  