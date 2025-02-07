package starbuzzSizes;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.size;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}