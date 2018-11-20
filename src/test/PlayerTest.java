package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Player;
import main.Training;

public class PlayerTest {

	
	@Test
	public void test() {
		Player p =new Player();
		assertNotNull(p);
		p.addTraining("Trening");
		assertNotNull(p.trainings);
		Training t = p.getTraining("Trening");
		assertNotNull(t);
	}

}
