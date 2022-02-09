package model;

import org.junit.Test;

public class Ingredient {
	
	
	private String name;
	private double weight;
	
	
	private Ingredient addIngredient;
	private Ingredient removeIngredient;
	
	
	public Ingredient(String n, double w) {
		setName(n);
		weight = w;
	}

	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) {
		weight = weight + additionalW;
	}
	
	public void removeWeith(double weight) {
		
		
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	@Test 
	public void setUpEscenario1() {
		
	addIngredient = new Ingredient(name, weight); 
	
			
	addIngredient.setName("Tomate");
	
	addIngredient.addWeight(245);
	
	addIngredient.addWeight(54);
	
	removeIngredient.removeWeith(45);
	
	removeIngredient.removeWeith(-100);
	
	}
	
	
}
