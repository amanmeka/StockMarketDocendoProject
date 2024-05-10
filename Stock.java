import java.util.*;
public class Stock {
  private double volatility;
  private double firstOrderForecast;
  private double secondOrderForecast;
  private double stockPrice;

  public Stock() {
    volatility = (Math.random() * 1) + 10;
    secondOrderForecast = (Math.random() * 100) + 1;
    stockPrice = (Math.random() * 100) + 1;
    firstOrderForecast = (Math.random()*5); 
  }

  public void newDay() {
    double change = (Math.random() * 5) - 2.5;
    firstOrderForecast = firstOrderForecast + change;
    stockPrice += ((volatility * firstOrderForecast));
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
}
  
