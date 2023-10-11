import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarro {

	@Test
	public void testeAcelerar() {
		Carro c = new Carro("");
		c.potencia = 10;
		c.acelerar();
		assertEquals(10, c.getVelocidade());
		
	}

}
