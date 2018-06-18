package cm.enspgrp1.dietProblem.user;

import java.util.HashSet;

import cm.enspgrp1.dietProblem.display.IDisplay;

public interface IComputation {
	
	//void compute(IDisplay, HashSet<PersonByBracket>);
	
	void compute(IDisplay display, HashSet<PersonByBracket> hashSetPerson);

	void compute();
}
