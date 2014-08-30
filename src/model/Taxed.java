package model;

import java.math.BigDecimal;

public class Taxed extends Product {

	protected BigDecimal taxRate = new BigDecimal(0.10);
	
	public Taxed(double price, int quant, String name) {
		super(price, quant, name);
	}
	
	public BigDecimal getTax() {
		return Helper.round(getPrice().multiply(taxRate));
	}
	
}
