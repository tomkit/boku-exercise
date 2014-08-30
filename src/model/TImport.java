package model;

import java.math.BigDecimal;

public class TImport extends Taxed implements Import{

	public TImport(double price, int quant, String name) {
		super(price, quant, name);
	}
	
	public BigDecimal getTax() {
		return super.getTax().add(getAdditionalTax());
	}

	public BigDecimal getAdditionalTax() {
		return Helper.round(getPrice().multiply(additionalTaxRate));
	}
	
}
