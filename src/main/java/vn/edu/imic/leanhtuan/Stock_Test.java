package vn.edu.imic.leanhtuan;

public class Stock_Test extends Stock_Change{

	public Stock_Test(String stocksymbol, String stockname) {
		super(stocksymbol, stockname);
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String [] args){
		Stock_Change stock = new Stock_Change("SUNW", "Sun Microsystems Inc" );
		stock.previousClosingPrice = 100;
		stock.currentPrice = 90;
		System.out.println("Ket qua la : " + stock.changePercent());
		
	}
}
