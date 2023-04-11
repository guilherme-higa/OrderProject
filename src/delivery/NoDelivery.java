package delivery;

public class NoDelivery implements IDeliveryType {

	@Override
	public double getDeliveryTax() {
		return 0;
	}

}
