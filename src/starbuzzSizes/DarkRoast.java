package starbuzzSizes;

public class DarkRoast extends Beverage {
	public DarkRoast(Size size) {
		this.size = size;
		this.description = "Dark Roast Coffee";
	}
	
	public DarkRoast() {
		this.description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99 * getSizeMultiplier();
	}
}