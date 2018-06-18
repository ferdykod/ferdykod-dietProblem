package cm.enspgrp1.dietProblem.administration;

import java.util.HashSet;
import java.util.Scanner;



public class Bracket extends ConfigurableAdapter{
  
	private String code;
	private String label;
	
	HashSet<IConfigurable> setBracket = new HashSet<>();
	HashSet<IConfigurable> genericBracket = new HashSet<IConfigurable>();
	
	public Bracket(){
		super();
	}
	
	public Bracket(String code, String label){
		super();
		this.code = code;
		this.label = label;
		
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
        Bracket bracket = new Bracket(readCode, readLabel);
		setBracket.add(bracket);
		genericBracket.addAll(setBracket);		
		
		return genericBracket;
	} 

	public boolean saveInformation(HashSet<IConfigurable> hashSetAdmin) {
	if(!genericSet.isEmpty()){
		foodGson = gson.toJson(genericBracket);
		}else {
			return false;	
		}
	return true;
	} 
	
	
}
