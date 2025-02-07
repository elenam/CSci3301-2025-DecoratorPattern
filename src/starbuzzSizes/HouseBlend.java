package starbuzzSizes;

import starbuzzSizes.Beverage.Size;

public class HouseBlend extends Beverage {
	public HouseBlend(Size size) {
		this.size = size;
		this.description = "House Blend Coffee";
	}
	
	public HouseBlend() {
		this.description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89 * getSizeMultiplier();
	}
}
