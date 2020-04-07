package fooddelivery;

public enum OrderState {
	ORDERED(0), DELIVERY(2000), COMPLETED(7000);
	
	private OrderState(long time) {
		this.time = time;
	}
	
	final long time;
	
	public long getTime() {
		return time;
	}
}
