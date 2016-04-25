package vn.edu.imic.leanhtuan;

public class Stock_Change {
	protected String stocksymbol;
	protected String stockname;
	protected double previousClosingPrice;
	protected double currentPrice;
	
	
	public Stock_Change(String stocksymbol, String stockname){
		
	}


	public String getStocksymbol() {
		return stocksymbol;
	}


	public void setStocksymbol(String stocksymbol) {
		this.stocksymbol = stocksymbol;
	}


	public String getStockname() {
		return stockname;
	}


	public void setStockname(String stockname) {
		this.stockname = stockname;
	}


	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}


	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}


	public double getCurrentPrice() {
		return currentPrice;
	}


	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double changePercent(){
		double percentage = previousClosingPrice / currentPrice;
		return percentage;
	}
	
	

}
