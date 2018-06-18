package cm.enspgrp1.dietProblem.administration;

import java.util.HashSet;
import com.google.gson.Gson;



public abstract class ConfigurableAdapter implements IConfigurable {

	HashSet<IConfigurable> genericSet = new HashSet<IConfigurable>();
	Gson gson = new Gson();
	String foodGson;
	
	public HashSet<IConfigurable> readInformation(HashSet<Object> hashSet) throws InstantiationException{
		
		HashSet<IConfigurable> genericSet = new HashSet<IConfigurable>();

		genericSet.addAll(genericSet);		
		return genericSet ;
	}
	
	public boolean saveInformation(HashSet<IConfigurable> hashSetAdmin) {
		
		if(!genericSet.isEmpty()){
			foodGson = gson.toJson(genericSet);
			}else {
				return false;	
			}
		return true;
	}

	
}
