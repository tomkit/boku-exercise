package controller;

import java.util.Vector;

import model.*;
import view.ConsoleOut;

public class CalculatePrice{
	private ConsoleOut co = new ConsoleOut();
	
	public void calculatePrice(Vector<Product> items) {
		
		co.displayOutput(items);
		
	}

}
