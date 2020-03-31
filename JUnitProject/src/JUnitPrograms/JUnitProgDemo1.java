package JUnitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class JUnitProgDemo1 {
	
	@Test
	@Disabled
	public void test1() {
		String s1="Senthil";
		assertEquals("Senthil", s1);
	}
	
	@Test
	public void test2() {
		String s1="Selenium";
		assertEquals("Selenium", s1);
	}
	

}
