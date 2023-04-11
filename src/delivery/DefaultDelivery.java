package delivery;

public class DefaultDelivery implements IDeliveryType{

	@Override
	public double getDeliveryTax() {
		return 8.77;
	}
}
