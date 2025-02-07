package starbuzzSizes;

import starbuzzSizes.Beverage.Size;

public class Espresso extends Beverage {
	public Espresso(Size size) {
		this.size = size;
		this.description = "Espresso";
	}
	  
	public Espresso() {
		this.description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}