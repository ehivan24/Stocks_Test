package Stocks_Test;

public class RunTest {
	
	public static void main(String[] args){
		TestOne testOneObj = new TestOne();
		
		testOneObj.setStockName("APPL"); //json Symbol
		testOneObj.setChangeFromYearHigh(-28.20);
		testOneObj.setChangeFromYearLow(31.20);
		testOneObj.setCurrentPrice(146.16);
		testOneObj.setYearHigh(176.30);
		testOneObj.setYearLow(116.90);
		testOneObj.setCurrentPrice(123.0);
		testOneObj.setPreviousClose(148.10);
		testOneObj.setFiftyMovingAverage(133.88);
		testOneObj.setTwoHundredFiftyMovingAverage(137.75);
		testOneObj.setOneyrTargetPrice(131.57);
		
		String STOCK_NAME = testOneObj.getStockName();
		double CHANGE_FROM_YEAR_HIGH = testOneObj.getChangeFromYearHigh();
		double CHANGE_FROM_YEAR_LOW = testOneObj.getChangeFromYearLow();
		double CURRENT_PRICE = testOneObj.getCurrentPrice();
		double GET_YEAR_HIGH = testOneObj.getYearHigh();
		double GET_YEAR_LOW = testOneObj.getYearLow();
		double GET_OPEN_PRICE = testOneObj.getOpenPrice();
		double GET_PREVIOUS_CLOSE_PRICE =  testOneObj.getPreviousClose();
		double GET_FIFTY_AVERAGE_MOVING = testOneObj.getFiftyMovingAverage();
		double GET_TWo_HUNDRED_FIFTY_AVERAGE_MOVING = testOneObj.getTwoHundredFiftyMovingAverage();
		double SET_ONE_YEAR_PRICE = testOneObj.getOneyrTargetPrice();
	
		System.out.println("50 Day Move: " + testOneObj.FiftydayMovingAverage(CURRENT_PRICE, GET_FIFTY_AVERAGE_MOVING));
		System.out.println("250 Day Move: " + testOneObj.TwoHundreddayMovingAverage(CURRENT_PRICE, GET_TWo_HUNDRED_FIFTY_AVERAGE_MOVING));
		System.out.println("Average Price Per Day: " + testOneObj.averagePricePerday(GET_OPEN_PRICE, CURRENT_PRICE));
		System.out.println("Target Price: " + testOneObj.oneyrTargetPrice(CURRENT_PRICE, SET_ONE_YEAR_PRICE));
		System.out.println("Cuurent Price: " + testOneObj.getCurrentPrice());
		System.out.println( STOCK_NAME +" High: " + GET_YEAR_HIGH + " Low: " + GET_YEAR_LOW + " Price: " + CURRENT_PRICE);
		System.out.println( STOCK_NAME +" Year High: " + CHANGE_FROM_YEAR_HIGH + " Year Low: " + CHANGE_FROM_YEAR_LOW + " Last Price: " + GET_PREVIOUS_CLOSE_PRICE);
		System.out.println("Status: " + testOneObj.stockStatus());
	}
}
