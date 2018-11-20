package main;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private String surname;
	public List<Training> trainings = new ArrayList<Training>();
	
	public void addTraining(String n) {
		trainings.add(new Training(n));
	}
	
	public Training getTraining(String name) {
		for(Training t: trainings) {
			if(t.name == name) {
				return t;
			}
		}
		return null;
	}
}
