package cm.enspgrp1.dietProblem.administration;

import java.io.File;
import java.util.HashSet;

public interface IConfigurable {

	File file = null;
	
	public HashSet<IConfigurable> readInformation();
	
	public boolean saveInformation(HashSet<IConfigurable> hashSetAdmin);

	
}
