package ClassLibrary;

public class MarketSummary {
	String StockName;

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		StockName = stockName;
	}

	double high;

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	double low;
	double open;

	public MarketSummary() {
	}

	public MarketSummary(String StockName, double low, double high, double open) {
		this.low = low;
		this.StockName = StockName;
		this.high = high;

	}
}
