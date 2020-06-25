package sample.randomid;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MainApp2Test {
	
	@Test
	public void printLetters() {
		System.out.println("abcdefghijklmnopqrstuvwxyz");
		String[] args = {"Hola"};
		String[] args2 = {"Hola"};
		assertArrayEquals(args, args2);
	}
	
	@Test
	public void printNumbers() {
		System.out.println("0123456789");
		String[] args = {"Singapore"};
		String[] args2 = {"Japan"};
		assertNotEquals(args, args2);
	}
}
