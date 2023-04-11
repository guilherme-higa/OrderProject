package delivery;

public class ExpressDelivery implements IDeliveryType{

	@Override
	public double getDeliveryTax() {
		return 15.50;
	}
}
