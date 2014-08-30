package model;

import java.math.BigDecimal;

public abstract class Product {
	protected String name;
	protected BigDecimal price;
	protected int quant;
	
	public Product(double price, int quant, String name) {
		this.price = BigDecimal.valueOf(price);
		this.quant = quant;
		this.name = name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public int getQuant() {
		return quant;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract BigDecimal getTax();
	
}
