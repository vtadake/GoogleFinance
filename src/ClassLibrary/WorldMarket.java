package ClassLibrary;

public class WorldMarket {
	double price;
	String StockName;
	double Percent;

	public WorldMarket(){}
	
	public WorldMarket(String StockName,double price,double Percent)
	{
		this.price=price;
		this.StockName=StockName;
		this.Percent=Percent;
				
	}
	public double getPercent() {
		return Percent;
	}

	public void setPercent(double percent) {
		Percent = percent;
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		StockName = stockName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
