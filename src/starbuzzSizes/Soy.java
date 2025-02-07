package starbuzzSizes;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.size;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 * getSizeMultiplier() + beverage.cost();
	}
}