package model;

public class Ingredient {
	private String name;
	private double weight;
	
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
	
	public void removeWeith () {
		
		
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
