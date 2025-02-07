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
		return .20 + beverage.cost();
	}
}