package model;

import java.math.BigDecimal;

public class TaxExempt extends Product{

	public TaxExempt(double price, int quant, String name) {
		super(price, quant, name);
	}

	public BigDecimal getTax() {
		return new BigDecimal(0.);
	}
}
