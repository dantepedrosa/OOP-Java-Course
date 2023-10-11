import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutoridadeTest {

	@Test
	void testInformal() {
		Autoridade a = new Autoridade("José", "Benedito", new Informal());		
		assertEquals("José", a.getTratamento());
	}
	
	@Test
	void testRespeitoso() {
		Autoridade a = new Autoridade("James", "Bond", new Respeitoso("Masculino"));
		assertEquals("Sr. Bond", a.getTratamento());
	}
	
	@Test
	void testComTitulo() {
		Autoridade a = new Autoridade("Stevan", "Estranho", new ComTitulo("Dr."));
		assertEquals("Dr. Stevan Estranho", a.getTratamento());
	}

}
