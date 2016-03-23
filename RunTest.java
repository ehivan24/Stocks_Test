import java.awt.Color;

public class RunTest {
	public static void main(String[] args){
		TestOne.setStockName("APPL"); //json Symbol
		TestOne.setChangeFromYearHigh(-28.20);
		TestOne.setChangeFromYearLow(31.20);
		TestOne.setCurrentPrice(146.16);
		TestOne.setYearHigh(176.30);
		TestOne.setYearLow(116.90);
		TestOne.setCurrentPrice(123.0);
		TestOne.setPreviousClose(148.10);
		TestOne.setFiftyMovingAverage(133.88);
		TestOne.setTwoHundredFiftyMovingAverage(137.75);
		TestOne.setOneyrTargetPrice(131.57);
		
		String STOCK_NAME = TestOne.getStockName();
		double CHANGE_FROM_YEAR_HIGH = TestOne.getChangeFromYearHigh();
		double CHANGE_FROM_YEAR_LOW = TestOne.getChangeFromYearLow();
		double CURRENT_PRICE = TestOne.getCurrentPrice();
		double GET_YEAR_HIGH = TestOne.getYearHigh();
		double GET_YEAR_LOW = TestOne.getYearLow();
		double GET_OPEN_PRICE = TestOne.getOpenPrice();
		double GET_PREVIOUS_CLOSE_PRICE =  TestOne.getPreviousClose();
		double GET_FIFTY_AVERAGE_MOVING = TestOne.getFiftyMovingAverage();
		double GET_TWo_HUNDRED_FIFTY_AVERAGE_MOVING = TestOne.getTwoHundredFiftyMovingAverage();
		double SET_ONE_YEAR_PRICE = TestOne.getOneyrTargetPrice();
	
		System.out.println("50 Day Move: " + TestOne.FiftydayMovingAverage(CURRENT_PRICE, GET_FIFTY_AVERAGE_MOVING));
		System.out.println("250 Day Move: " + TestOne.TwoHundreddayMovingAverage(CURRENT_PRICE, GET_TWo_HUNDRED_FIFTY_AVERAGE_MOVING));
		System.out.println("Average Price Per Day: " + TestOne.averagePricePerday(GET_OPEN_PRICE, CURRENT_PRICE));
		System.out.println("Target Price: " + TestOne.oneyrTargetPrice(CURRENT_PRICE, SET_ONE_YEAR_PRICE));
		System.out.println("Cuurent Price: " + TestOne.getCurrentPrice());
		System.out.println( STOCK_NAME +" High: " + GET_YEAR_HIGH + " Low: " + GET_YEAR_LOW + " Price: " + CURRENT_PRICE);
		System.out.println( STOCK_NAME +" Year High: " + CHANGE_FROM_YEAR_HIGH + " Year Low: " + CHANGE_FROM_YEAR_LOW + " Last Price: " + GET_PREVIOUS_CLOSE_PRICE);
		TestOne.stockStatus();
	}
}
