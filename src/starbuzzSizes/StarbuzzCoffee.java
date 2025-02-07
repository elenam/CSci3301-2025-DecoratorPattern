package starbuzzSizes;

import starbuzzSizes.Beverage.Size;

public class StarbuzzCoffee {
	 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
		
		Beverage sizeGrande = new DarkRoast(Size.GRANDE);
		//System.out.println(sizeGrande.getSize());
		sizeGrande = new Milk(sizeGrande);
		//System.out.println(sizeGrande.getSize());
		sizeGrande = new Whip(sizeGrande);
		//System.out.println(sizeGrande.getSize());
		System.out.println(sizeGrande.getDescription() 
				+ " $" + sizeGrande.cost());
	}
	
	/* 
	 * We would like to be able to create beverages of different sizes
	 * The cost of the beverage for be adjusted by size:
	 * 
	 * Size.TALL adjustment is 1.0 (it's the standard size)
	 * Size.GRANDE adjustment is 1.5 
	 * Size.VENTE adjustment is 2.0 
	 * 
	 * The adjustment must be applied to the coffee (the basis of beverages)
	 * The cost of different condiments may or may not be adjusted. 
	 * In our example the amount of whipped cream and mocha is the same 
	 * for all sizes of beverages, but the amount of milk is adjusted with 
	 * the size. 
	 * 
	 * Note the added `size` variable in the Beverage class. 
	 * The book proposes adding setSize() and getSize() methods to the Beverage class. 
	 * Discuss the benefits and downsides of adding each of these two methods; think
	 * of their possible implementation.  
	 * 
	 * Think carefully about what objects we are creating and where they get their
	 * instance variable. Propose an approach that can't create incorrect or 
	 * misleading results. 
	 * 
	 * Issues with setSize():
	 * 1. Each condiment has its own size variable, so setting size to one doesn't propagate to 
	 * another one, and sizes become inconsistent
	 * 2. Resetting a size in the middle of making a beverage doesn't sound like a good idea. 
	 */
}
