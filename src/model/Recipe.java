package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	
	private float ex;
	
	private List<Ingredient> ingredients;
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) {
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		
		try {
			
			if(searched!=null) {
				searched.addWeight(w);
			} 
			else if (w != 0) {
				Ingredient newIngredient = new Ingredient(n, w);
				ingredients.add(newIngredient);
			}	
			
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("The negative numbers are not supported");
		}
		
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
	
	public boolean removeIngredients  (String n, double w) {
		
		boolean resultado = false;
		Ingredient searched = null;
	 
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				
				searched = current;
				
				/*
				
				current.remove(2);
				
				
				for (int j = i; j < ingredients.size() - 1; j++) {
                    ingredients[j]= ingredients.[j + 1];
                }
				
				ingredients[ingredients.size()-1] = 0;
				
				resultado = true;
				
				*/
			}
		}
		
		return resultado;
		
	}
	
	
	
	
	
}
