package test;

import junit.framework.TestCase;
import model.Ingredient;

import org.junit.Test;




public class addIngredientTest extends TestCase {
	
	private String name;
	
	private double weight;
	
	private Ingredient addIngredient;
	
	@Test 
	public void setUpEscenario1() {
		
	addIngredient = new Ingredient(name, weight); 
	
			
	addIngredient.setName("Tomate");
	
	addIngredient.addWeight(245);
	
	addIngredient.addWeight(54);

	
	}
	
	@Test
	public void setUpEscenario2() {
		
		
		
		
		
	}
	
 }
		


