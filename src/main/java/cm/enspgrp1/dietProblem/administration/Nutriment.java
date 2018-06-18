package cm.enspgrp1.dietProblem.administration;

import java.util.HashSet;
import java.util.Scanner;

public class Nutriment extends ConfigurableAdapter{

	private String code;
	private String label;
	
	HashSet<IConfigurable> setNutriment = new HashSet<>();
	HashSet<IConfigurable> genericNutriment = new HashSet<IConfigurable>();
	
	public Nutriment(){
		super();
	}
	
	public Nutriment(String code, String label){
		super();
		this.code = code;
		this.label = label;
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
        Nutriment nutri = new Nutriment(readCode, readLabel);
		setNutriment.add(nutri);
		genericNutriment.addAll(setNutriment);		
		
		return genericNutriment;
	} 

	public boolean saveInformation(HashSet<IConfigurable> hashSetAdmin) {
	if(!genericSet.isEmpty()){
		foodGson = gson.toJson(genericNutriment);
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

}
