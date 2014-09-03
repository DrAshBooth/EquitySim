
import lob.*;

public class Main {

	public static void main(String[] args) {
		
		// Instantiate an order book
		OrderBook limitOrderBook = new OrderBook(0.01);
		
		// Generate some random orders
		Order o1 = new Order(1, true, 100, 1, "bid", 99.0);
		Order o2 = new Order(2, true, 50, 2, "offer", 101.0);
		
		limitOrderBook.processOrder(o1, false);
		limitOrderBook.processOrder(o2, false);
		
		System.out.println(limitOrderBook);
		
	}
	

}
