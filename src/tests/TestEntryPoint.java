package tests;

import java.util.Vector;

import controller.CalculatePrice;
import junit.framework.TestCase;
import model.*;

public class TestEntryPoint extends TestCase{
	
	private CalculatePrice control = new CalculatePrice();
	
	public void test0() {
		Vector<Product> list = new Vector<Product>();
		list.add(new NTImport(11.25, 1, "box of imported chocolates"));
		control.calculatePrice(list);
	}
	
	public void test1() {
		Vector<Product> list = new Vector<Product>();
		list.add(new NTDomestic(12.49, 1, "book"));
		list.add(new TDomestic(14.99, 1, "music CD"));
		list.add(new NTDomestic(0.85, 1, "chocolate bar"));
		control.calculatePrice(list);
		
	}
	
	public void test2() {
		Vector<Product> list = new Vector<Product>();
		list.add(new NTImport(10.00, 1, "imported box of chocolates"));
		list.add(new TImport(47.50, 1, "imported bottle of perfume"));
		control.calculatePrice(list);
		
	}
	
	public void test3() {
		Vector<Product> list = new Vector<Product>();
		list.add(new TImport(27.99, 1, "imported bottle of perfume"));
		list.add(new TDomestic(18.99, 1, "bottl of perfume"));
		list.add(new NTDomestic(9.75, 1, "packet of headache pills"));
		list.add(new NTImport(11.25, 1, "box of imported chocolates"));
		control.calculatePrice(list);
		
	}
}
