package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Training;;

public class TrainingTest {
	
	

	@Test
	public void test() {
		Training t =new Training("Training");
		assertNotNull(t);
		t.addGrade(10);
		assertNotNull(t.grade);
		Integer bestGrade = t.getBestGrade();
		assertNotNull(bestGrade);
		int avg = t.getAvg();
		assertNotNull(avg);
	}

}
