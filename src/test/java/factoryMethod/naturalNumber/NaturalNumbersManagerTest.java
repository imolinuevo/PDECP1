package factoryMethod.naturalNumber;

import javax.activation.MailcapCommandMap;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumbersManagerTest {

	private NaturalNumberManager naturalNumberManager;

	@Before
	public void before() {
		naturalNumberManager = new NaturalNumberManager();
	}

	@Test
	public void valorInicial() {
		assertEquals(5, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("cinco", naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void cambiarValor() {
		naturalNumberManager.getNaturalNumber().setValue(2);
		assertEquals(2, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("dos", naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void nuevoIdiomaFr() {
		naturalNumberManager.setNaturalNumberCreator(new NaturalNumberFrCreator());
		assertEquals(0, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("zero", naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void nuevoIdiomaEn() {
		naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEnCreator());
		assertEquals(0, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("nill", naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void nuevoIdiomaEs() {
		naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
		assertEquals(0, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("cero", naturalNumberManager.getNaturalNumber().getTextValue());
	}

}
