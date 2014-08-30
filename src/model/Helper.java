package model;

import java.math.BigDecimal;

public class Helper {

	public static BigDecimal round(BigDecimal val) {
		val = val.multiply(new BigDecimal(2.)).add(new BigDecimal(0.049)).setScale(1, BigDecimal.ROUND_HALF_UP);
		val = val.divide(new BigDecimal(2.)).setScale(2, BigDecimal.ROUND_HALF_UP);
		return val;
	}
}
