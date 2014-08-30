package model;

import java.math.BigDecimal;

public class NTImport extends TaxExempt implements Import {

	public NTImport(double price, int quant, String name) {
		super(price, quant, name);
	}

	public BigDecimal getTax() {
		return super.getTax().add(getAdditionalTax());
	}

	@Override
	public BigDecimal getAdditionalTax() {
		return Helper.round(getPrice().multiply(additionalTaxRate));
	}


}
