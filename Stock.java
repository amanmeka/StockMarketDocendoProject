
public class Stock {
  private String stockName;
  private double volatility;
  private double firstOrderForecast;
  private double secondOrderForecast;
  private double stockPrice;
  private int totalShares;
  private double totalStockValue;

  public Stock(String stockName) {
    this.stockName = stockName;
    volatility = (Math.random() * 1) + 10;
    secondOrderForecast = (Math.random() * 100) + 1;
    stockPrice = (Math.random() * 100) + 1;
    firstOrderForecast = (Math.random()*5); 
    totalShares = 1000;
    totalStockValue = 1000 * stockPrice;

  }

  public void newDay() {
    double change = (Math.random() * 5) - 2.5;
    firstOrderForecast = firstOrderForecast + change;
    stockPrice += ((volatility * firstOrderForecast));
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
  
  public int getTotalShares() {
    return totalShares;
  }

  public double getTotalStockValue() {
    return totalStockValue;
  }
}
  
