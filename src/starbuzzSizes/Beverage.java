package starbuzzSizes;

public abstract class Beverage {
	// There are different sizes of a beverage:
	public enum Size { TALL, GRANDE, VENTI };
	// The default is TALL:
	protected Size size = Size.TALL;
	protected String description = "Unknown Beverage";
  
	public String getDescription() {
		return this.size + " " + this.description;
	}
	
	public Size getSize() {
		return size;
	}
 
	public abstract double cost();
	
	protected double getSizeMultiplier() {
		if (this.size == Size.GRANDE) {
			return 2.0;
		}
		if (this.size == Size.VENTI) {
			return 1.5;
		}
		return 1.0;
	}
}
