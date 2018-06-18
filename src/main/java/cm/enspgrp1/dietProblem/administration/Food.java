package cm.enspgrp1.dietProblem.administration;

import java.util.HashSet;
import java.util.Scanner;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;

public class Food extends ConfigurableAdapter {

	private String code;
	private String label;
	private double price;
	HashSet<IConfigurable> setFood = new HashSet<>();
	HashSet<IConfigurable> genericSet = new HashSet<IConfigurable>();
	
    public Food(String code, String label, double price){
    	super();
    	this.code = code;
    	this.label = label;
    	this.price = price;
    }
	
    public Food(){
    	super();
    }
    
	
	public HashSet<IConfigurable> readInformation() {
		
		
		System.out.println(" =====================================================");
		@SuppressWarnings("resource")
		Scanner scCode = new Scanner(System.in);
		System.out.println("Entez le code de l'aliment :");
		String readCode = scCode.next();
		@SuppressWarnings("resource")
		Scanner scLabel = new Scanner(System.in);
		System.out.println("Entez le label de l'aliment :");
		String readLabel = scLabel.next();
		@SuppressWarnings("resource")
		Scanner scPrice = new Scanner(System.in);
		System.out.println("Entez le prix de l'aliment :");
		double readPrice = scPrice.nextDouble();
		Food food = new Food(readCode, readLabel, readPrice);
		setFood.add(food);
		genericSet.addAll(genericSet);		
		
		return genericSet;
	}


	
	public boolean saveInformation(HashSet<IConfigurable> hashSetAdmin) {
	
	if(!genericSet.isEmpty()){
		foodGson = gson.toJson(genericSet);
		}else {
			return false;	
		}
	return true;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
