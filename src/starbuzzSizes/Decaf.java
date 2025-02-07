package starbuzzSizes;

import starbuzzSizes.Beverage.Size;

public class Decaf extends Beverage {
	public Decaf(Size size) {
		this.size = size;	
		this.description = "Decaf Coffee";
	}
	
	public Decaf() {
		this.description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05 * getSizeMultiplier();
	}
}