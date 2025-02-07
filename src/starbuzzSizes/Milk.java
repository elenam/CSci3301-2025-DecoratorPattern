package starbuzzSizes;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.size;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 * getSizeMultiplier() + beverage.cost();
	}
}