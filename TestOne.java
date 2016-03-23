package Stocks_Test;

public class TestOne {
	/**
	 * Thread Safety -  resources are by definition not thread-safe
	 *	Code Implicity - You do not know when a  variables is instantiated 
	 *  and whether or not it will be instantiated before another  variable
	 */
	
	 String stockName;
	 double currentPrice;
	 double yearLow;
	 double yearHigh;
	 double changeFromYearLow;
	 double changeFromYearHigh;
	 double openPrice;
	 double previousClose;
	 double fiftyMovingAverage;
	 double twoHundredFiftyMovingAverage;
	 double oneyrTargetPrice;
	
	public  double stockStatus(){
		double difference = this.getCurrentPrice() - this.getPreviousClose();
		if(this.previousClose < this.getCurrentPrice()){
			System.out.println(difference);
		}else{
			System.out.println(difference);
		}
		return difference;
	}
	
	public  double FiftydayMovingAverage(double currentStockPrice, double priceFiftyDays){
		double meanAverage = currentStockPrice - priceFiftyDays;  
		return meanAverage;
	}
	
	public  double TwoHundreddayMovingAverage(double currentStockPrice, double priceTwoHundredFiftyDays){
		double meanAverage = currentStockPrice - priceTwoHundredFiftyDays;  
		return meanAverage;
	}
	
	public  double averagePricePerday(double openPrice, double currentPrice){
		double meanPrice = currentPrice - openPrice;
		return meanPrice;
	}
	
	public  double oneyrTargetPrice(double currentPrice, double projectedPrice) {
		double price = currentPrice - projectedPrice;
		return price;
	}
	public  double getCurrentPrice() {
		return currentPrice;
	}
	public  void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public  double getYearLow() {
		return yearLow;
	}
	public  void setYearLow(double yearLow) {
		this.yearLow = yearLow;
	}
	public  double getYearHigh() {
		return yearHigh;
	}
	public  void setYearHigh(double yearHigh) {
		this.yearHigh = yearHigh;
	}
	public  double getChangeFromYearLow() {
		return changeFromYearLow;
	}
	public  void setChangeFromYearLow(double changeFromYearLow) {
		this.changeFromYearLow = changeFromYearLow;
	}
	public  double getChangeFromYearHigh() {
		return changeFromYearHigh;
	}
	public  void setChangeFromYearHigh(double changeFromYearHigh) {
		this.changeFromYearHigh = changeFromYearHigh;
	}
	public  double getOpenPrice() {
		return openPrice;
	}
	public  void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}
	public  String getStockName() {
		return stockName;
	}
	public  void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public  double getPreviousClose() {
		return previousClose;
	}
	public  void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}
	public  double getFiftyMovingAverage() {
		return fiftyMovingAverage;
	}
	public  void setFiftyMovingAverage(double fiftyMovingAverage) {
		this.fiftyMovingAverage = fiftyMovingAverage;
	}
	public  double getTwoHundredFiftyMovingAverage() {
		return twoHundredFiftyMovingAverage;
	}
	public  void setTwoHundredFiftyMovingAverage(double twoHundredFiftyMovingAverage) {
		this.twoHundredFiftyMovingAverage = twoHundredFiftyMovingAverage;
	}
	public  double getOneyrTargetPrice() {
		return oneyrTargetPrice;
	}
	public  void setOneyrTargetPrice(double oneyrTargetPrice) {
		this.oneyrTargetPrice = oneyrTargetPrice;
	}
	
}
