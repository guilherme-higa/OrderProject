import delivery.DefaultDelivery;
import delivery.ExpressDelivery;
import delivery.ShipDelivery;
import entities.Order;

public class MainActivity {

	public static void main(String[] args) {
		Order order1 = Order.needToDelivery(1, 165896586, 165896599, 87.14, new ExpressDelivery());
		order1.total();
		System.out.println("first order : " + order1);
		
		
		order1 = Order.needToDelivery(2, 165896586, 165896599, 87.14, new DefaultDelivery());
		order1.total();
		System.out.println("secound order : " + order1);
		
		order1 = Order.needToDelivery(3, 165896586, 165896599, 87.14, new ShipDelivery());
		order1.total();
		System.out.println("third order : " + order1);
		
		order1 = Order.noDeliveryRequired(4, 165896586, 165896599, 87.14);
		order1.total();
		System.out.println("fourth order : " + order1);
		
	}

}
