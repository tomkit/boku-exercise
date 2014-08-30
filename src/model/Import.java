package model;

import java.math.BigDecimal;

public interface Import {
	
	public BigDecimal additionalTaxRate = new BigDecimal("0.05");

	public BigDecimal getAdditionalTax();
}
