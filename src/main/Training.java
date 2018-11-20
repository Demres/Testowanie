package main;

import java.util.ArrayList;
import java.util.List;

public class Training {

	public String name;
	public List<Integer> grade = new ArrayList<Integer>();
	public Training(String n) {
		this.name = n;
	}
	
	public void addGrade(Integer i) {
		grade.add(i);
	}
	
	public int getBestGrade() {
		int max = -1;
		for(Integer g: grade) {
			if(max < g) {
				max = g;
			}
		}
		return max;
	}
	
}
