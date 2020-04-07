package fooddelivery;

public class Order {
	Food food;
	OrderState state = OrderState.ORDERED;
	
	public Order(Food food) {
		this.food = food;
		this.state = OrderState.ORDERED;
	}

	public void next() throws InterruptedException {
		this.state = OrderState.ORDERED;
		System.out.println("State: " + this.state + " " + this.getFood().getName());
		Thread.sleep(OrderState.DELIVERY.getTime());
		this.state = OrderState.DELIVERY;
		System.out.println("State: " + this.state + " " + this.getFood().getName());
		Thread.sleep(OrderState.COMPLETED.getTime());
		this.state = OrderState.COMPLETED;
		System.out.println("State: " + this.state + " " + this.getFood().getName());
	}

	@Override
	public String toString() {
		return "Order [food=" + food + ", state=" + state + "]";
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}
	
	
}
