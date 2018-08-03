import Stock.Broker;
import Stock.Holder;
import Stock.StockSingleton;

public class Testclass {
public static void main(String[] args) {
	Holder h = StockSingleton.getStock();
	h.viewQuote();
			
	Broker b = StockSingleton.getStock();
	b.getQuote();
	
	System.out.println(h==b);
}
}
