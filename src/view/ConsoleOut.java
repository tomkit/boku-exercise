package view;

import java.math.BigDecimal;
import java.util.Vector;

import model.*;

public class ConsoleOut {

	public void displayOutput(Vector<Product> items) {
		BigDecimal taxes = new BigDecimal("0.");
		BigDecimal total = new BigDecimal("0.");
		
		for(Product i : items) {
			System.out.print(i.getQuant() + " ");
			System.out.print(i.getName() + " ");
			System.out.print(i.getPrice().add(i.getTax()) + "\n");
			
			taxes = taxes.add(i.getTax());
			total = total.add(i.getPrice().add(i.getTax()));
		}
		
		System.out.println("Sales Taxes: " + taxes.setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println("Total: " + total.setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println("");
		
	}
}
