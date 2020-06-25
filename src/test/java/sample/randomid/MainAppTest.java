package sample.randomid;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;


public class MainAppTest{
	
	@Test
	public void getApptesting() {
		File file = new File("id-set.txt");
		assertFalse(file.exists());
	}
	
	@Test
	public void checkMain() {
		MainApp app = new MainApp();
		app.printNum();
	}
}
