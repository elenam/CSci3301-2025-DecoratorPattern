package starbuzzSizes;

public abstract class Beverage {
	// There are different sizes of a beverage:
	public enum Size { TALL, GRANDE, VENTI };
	// The default is TALL:
	protected Size size = Size.TALL;
	protected String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
	
	public Size getSize() {
		return size;
	}
 
	public abstract double cost();
}
