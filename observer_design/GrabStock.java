package com.collabera.jump.design_pattern.observer_design;

public class GrabStock {
	
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		stockGrabber.unregister(observer1);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		Runnable getIBM = new GetTheStock(stockGrabber,2,"IBM",197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber,2,"AAPL",197.00);
		Runnable getGOOG = new GetTheStock(stockGrabber,2,"GOOG",197.00);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
		
	}
	
	
	

}
