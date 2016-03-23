public class TestOne {
	static String stockName;
	static double currentPrice;
	static double yearLow;
	static double yearHigh;
	static double changeFromYearLow;
	static double changeFromYearHigh;
	static double openPrice;
	static double previousClose;
	static double fiftyMovingAverage;
	static double twoHundredFiftyMovingAverage;
	static double oneyrTargetPrice;
	
	public static void stockStatus(){
		if(TestOne.averagePricePerday(currentPrice, openPrice) < TestOne.getCurrentPrice()){
			System.out.println("-" + currentPrice);
		}else{
			System.out.println("+" + currentPrice);
		}
	}
	
	public static double FiftydayMovingAverage(double currentStockPrice, double priceFiftyDays){
		double meanAverage = currentStockPrice - priceFiftyDays;  
		return meanAverage;
	}
	
	public static double TwoHundreddayMovingAverage(double currentStockPrice, double priceTwoHundredFiftyDays){
		double meanAverage = currentStockPrice - priceTwoHundredFiftyDays;  
		return meanAverage;
	}
	
	public static double averagePricePerday(double openPrice, double currentPrice){
		double meanPrice = currentPrice - openPrice;
		return meanPrice;
	}
	
	public static double oneyrTargetPrice(double currentPrice, double projectedPrice) {
		double price = currentPrice - projectedPrice;
		return price;
	}
	public static double getCurrentPrice() {
		return currentPrice;
	}
	public static void setCurrentPrice(double currentPrice) {
		TestOne.currentPrice = currentPrice;
	}
	public static double getYearLow() {
		return yearLow;
	}
	public static void setYearLow(double yearLow) {
		TestOne.yearLow = yearLow;
	}
	public static double getYearHigh() {
		return yearHigh;
	}
	public static void setYearHigh(double yearHigh) {
		TestOne.yearHigh = yearHigh;
	}
	public static double getChangeFromYearLow() {
		return changeFromYearLow;
	}
	public static void setChangeFromYearLow(double changeFromYearLow) {
		TestOne.changeFromYearLow = changeFromYearLow;
	}
	public static double getChangeFromYearHigh() {
		return changeFromYearHigh;
	}
	public static void setChangeFromYearHigh(double changeFromYearHigh) {
		TestOne.changeFromYearHigh = changeFromYearHigh;
	}
	public static double getOpenPrice() {
		return openPrice;
	}
	public static void setOpenPrice(double openPrice) {
		TestOne.openPrice = openPrice;
	}
	public static String getStockName() {
		return stockName;
	}
	public static void setStockName(String stockName) {
		TestOne.stockName = stockName;
	}
	public static double getPreviousClose() {
		return previousClose;
	}
	public static void setPreviousClose(double previousClose) {
		TestOne.previousClose = previousClose;
	}
	public static double getFiftyMovingAverage() {
		return fiftyMovingAverage;
	}
	public static void setFiftyMovingAverage(double fiftyMovingAverage) {
		TestOne.fiftyMovingAverage = fiftyMovingAverage;
	}
	public static double getTwoHundredFiftyMovingAverage() {
		return twoHundredFiftyMovingAverage;
	}
	public static void setTwoHundredFiftyMovingAverage(double twoHundredFiftyMovingAverage) {
		TestOne.twoHundredFiftyMovingAverage = twoHundredFiftyMovingAverage;
	}
	public static double getOneyrTargetPrice() {
		return oneyrTargetPrice;
	}
	public static void setOneyrTargetPrice(double oneyrTargetPrice) {
		TestOne.oneyrTargetPrice = oneyrTargetPrice;
	}
	
}
