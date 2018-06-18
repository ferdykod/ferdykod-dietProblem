package cm.enspgrp1.dietProblem.administration;

import java.util.HashSet;
//import java.util.Scanner;

public class BracketNutrimentNeed extends ConfigurableAdapter{

	private Bracket bracket;
	private double maximumPropertie;
	private double minimumPropertie;
	private Nutriment nutriment;
	private double propertie;
	HashSet<BracketNutrimentNeed> setBracketNutri = new HashSet<>();
	HashSet<IConfigurable> genericBracketNtri = new HashSet<IConfigurable>();
	
	public BracketNutrimentNeed(Bracket bracket, double maximumPropertie, double minimumProperties,
											Nutriment nutriment, double propertie){
		super();
		this.bracket = bracket;
		this.maximumPropertie = maximumPropertie;
		this.minimumPropertie = minimumProperties;
		this.nutriment = nutriment;
		this.propertie = propertie;
		
	}
	
	public BracketNutrimentNeed(){
		super();
	}
	
public HashSet<IConfigurable> readInformation() {
		
		System.out.println(" =====================================================");
			
		/*
		@SuppressWarnings("resource")
		Scanner scCode = new Scanner(System.in);
		System.out.println("Entez le code de l'aliment :");
		@SuppressWarnings("unused")
		String readCode = scCode.next();
		@SuppressWarnings("resource")
		Scanner scLabel = new Scanner(System.in);
		System.out.println("Entez le label de l'aliment :");
		@SuppressWarnings("unused")
		String readLabel = scLabel.next();
		*/
        BracketNutrimentNeed BracketNeed = new BracketNutrimentNeed();
        setBracketNutri.add(BracketNeed);
		genericBracketNtri.addAll(setBracketNutri);		
		
		return genericBracketNtri;
	} 

	public boolean saveInformation(HashSet<IConfigurable> hashSetAdmin) {
	if(!genericSet.isEmpty()){
		foodGson = gson.toJson(genericBracketNtri);
		}else {
			return false;	
		}
	return true;
	} 
	

	public Bracket getBracket() {
		return bracket;
	}

	public void setBracket(Bracket bracket) {
		this.bracket = bracket;
	}

	public double getMaximumPropertie() {
		return maximumPropertie;
	}

	public void setMaximumPropertie(double maximumPropertie) {
		this.maximumPropertie = maximumPropertie;
	}

	public double getMinimumPropertie() {
		return minimumPropertie;
	}

	public void setMinimumPropertie(double minimumPropertie) {
		this.minimumPropertie = minimumPropertie;
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
