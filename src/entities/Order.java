package entities;

import delivery.IDeliveryType;
import delivery.NoDelivery;

public class Order {

	private int mId;
	private long mStartTime, mEndTime;
	private double mPrice, mTotal;
	private IDeliveryType mIDeliveryType;
	
	public static Order needToDelivery(int id, long startTime, long endTime, double price, IDeliveryType delivery) {
		return new Order(id, startTime, endTime, price, delivery);
	}
	
	public static Order noDeliveryRequired(int id, long startTime, long endTime, double price) {
		return new Order(id, startTime, endTime, price, new NoDelivery());
	}
	
	private Order(int id, long startTime, long endTime, double price, IDeliveryType isDelivery) {
		this.mId = id;
		this.mStartTime = startTime;
		this.mEndTime = endTime;
		this.mIDeliveryType = isDelivery;
		this.mPrice = price;
	}
	
	public void total() {
		mTotal = mPrice + mIDeliveryType.getDeliveryTax();
	}
	
	public int getId() {
		return mId;
	}
	
	public void setId(int mId) {
		this.mId = mId;
	}
	
	public long getStartTime() {
		return mStartTime;
	}
	
	public void setStartTime(long mStartTime) {
		this.mStartTime = mStartTime;
	}
	
	public long getEndTime() {
		return mEndTime;
	}
	
	public void setEndTime(long mEndTime) {
		this.mEndTime = mEndTime;
	}
		
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id :").append(mId).append(" startTime : ").append(mStartTime)
		.append(" endTime : ").append(mEndTime).append(" price : ").append(mPrice)
		.append(" total : ").append(mTotal);
		return sb.toString();
	}
	
}
