import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1;
	GradeBook g2;
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(75);
		g1.addScore(65);
		g2.addScore(54);
		g2.addScore(30);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("75.0 65.0"));
		assertTrue(g2.toString().equals("54.0 30.0"));
	}

	@Test
	void testSum() {
		assertEquals(140, g1.sum(), .0001);
		assertEquals(84, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(65, g1.minimum(), .001);
		assertEquals(30, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75,g1.finalScore());
		assertEquals(54,g2.finalScore());
	}

	

}
