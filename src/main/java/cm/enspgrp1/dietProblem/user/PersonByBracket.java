package cm.enspgrp1.dietProblem.user;

import cm.enspgrp1.dietProblem.administration.Bracket;

public class PersonByBracket {
	
	private int personNumber;
	private Bracket bracket;
	
	public boolean equals(){
		
		return false;
	}

	public String hash(){
		
		return null;	
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	public Bracket getBracket() {
		return bracket;
	}

	public void setBracket(Bracket bracket) {
		this.bracket = bracket;
	}
	
	
}
