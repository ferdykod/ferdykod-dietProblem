package cm.enspgrp1.dietProblem.administration;

import java.util.HashSet;
import java.util.Scanner;

public class FoodNutrimentPropety extends ConfigurableAdapter{

	private Food food;
	private Nutriment nutriment;
	private double propertie;
	
	HashSet<IConfigurable> setNutriPro = new HashSet<>();
	HashSet<IConfigurable> genericFoodPro = new HashSet<IConfigurable>();
	
	public FoodNutrimentPropety(){
		super();
	}
	
	public FoodNutrimentPropety(Food food, Nutriment nutriment, double propertie){
		super();
		this.food = food;
		this.nutriment = nutriment;
		this.propertie = propertie;
	}

public HashSet<IConfigurable> readInformation() {
		
		
		System.out.println(" =====================================================");
		//@ To do complet code
		
		@SuppressWarnings("resource")
		Scanner scPrice = new Scanner(System.in);
		System.out.println("Entez le prix de l'aliment :");
		@SuppressWarnings("unused")
		double readPropertie = scPrice.nextDouble();
		FoodNutrimentPropety foodElement = new FoodNutrimentPropety();
		setNutriPro.add(foodElement);
		genericSet.addAll(genericFoodPro);		
		
		return genericSet;
	}


	
	public boolean saveInformation(HashSet<IConfigurable> hashSetAdmin) {
	
	if(!genericSet.isEmpty()){
		foodGson = gson.toJson(genericFoodPro);
		}else {
			return false;	
		}
	return true;
	}
	
	
	
	public Food getFoo() {
		return food;
	}

	public void setFoo(Food food) {
		this.food = food;
	}

	public Nutriment getNutriment() {
		return nutriment;
	}

	public void setNutriment(Nutriment nutriment) {
		this.nutriment = nutriment;
	}

	public double getPropertie() {
		return propertie;
	}

	public void setPropertie(double propertie) {
		this.propertie = propertie;
	}
	
	

}
