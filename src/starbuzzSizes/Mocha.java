package starbuzzSizes;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.size;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		// doesn't adjust cost by size
		return .20 + beverage.cost();
	}
}