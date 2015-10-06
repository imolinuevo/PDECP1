package factoryMethod.naturalNumber;

import static org.junit.Assert.*;

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
		assertEquals(0, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("cero", naturalNumberManager.getNaturalNumber().getTextValue());
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
		naturalNumberManager.createNaturalNumber();
		assertEquals(0, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("zero", naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void nuevoIdiomaEn() {
		naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEnCreator());
		naturalNumberManager.createNaturalNumber();
		assertEquals(0, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("nill", naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void nuevoIdiomaEs() {
		naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
		naturalNumberManager.createNaturalNumber();
		assertEquals(0, naturalNumberManager.getNaturalNumber().getValue());
		assertEquals("cero", naturalNumberManager.getNaturalNumber().getTextValue());
	}
	
	@Test
	public void sinIdioma() {
		NaturalNumber naturalNumber = new NaturalNumber();
		assertEquals(0, naturalNumber.getValue());
		assertEquals("!!!", naturalNumber.getTextValue());
	}

}
