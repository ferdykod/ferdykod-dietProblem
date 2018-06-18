package cm.enspgrp1.dietProblem.display;

import java.util.HashMap;
import java.util.TreeMap;

public interface IDisplay {

	public void display(TreeMap<Integer, HashMap<String, Double>> treeMapDisplay);

	void display();
}
