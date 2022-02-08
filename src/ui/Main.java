package ui;

import java.util.Scanner;

import model.Ingredient;

import model.Recipe;


public class Main {
	
	public static  Scanner scan = new Scanner (System.in);
	
	
	static int opcion;
	static boolean salir = false;


	public static void Main(String [] args) {
		
	
		System.out.println("Bienvenido al menu del sistema de pruebas del restaurante");

		
	while (!salir) {
		
		System.out.println("1: \n" + "Verificar addWeight" +"\n" );
		
		System.out.println("2: \n" + "Verificar removeWeight" +"\n" );
		
		System.out.println("3: \n" + "Verificar addIngredient" +"\n" );
		
		
		System.out.println("\n" + "Ingresa la opcion deseada" + "\n");
		opcion = scan.nextInt();
		
		switch (opcion) {
		
		case 1:
			
			System.out.println("Has seleccionado Addweight");
			
			Opcion1();
			
			
			break;
			
		case 2:
			
			System.out.println("Has seleccionado RemoveWeight");
			
			Opcion2();
			
			break;
			
			
		case 3:
			
			System.out.println("Has seleccionado addIngredient");
			
			Opcion3();
			
			break;	
		
		case 4:
			
			salir = true;
			
			default:
				
				System.out.println("Esta opcion no esta disponible");
				
				
			}
		
		
		}
		
		
	}



	private static void Opcion1() {
		
	}


	private static void Opcion2() {
		
	}
	

	private static void Opcion3() {

		
	}



}
