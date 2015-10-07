package texto;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private final Map<Character, Caracter> map = new HashMap<Character, Caracter>();
	
	private static FactoriaCaracter factoriaCaracter;
	
	public FactoriaCaracter() {
		factoriaCaracter = null;
	}
	
	public static FactoriaCaracter getFactoria() {
		if (factoriaCaracter == null) {
			factoriaCaracter = new FactoriaCaracter();
		}
		return factoriaCaracter;
	}
	
	public Caracter get(char key) {
		if (map.containsKey(key)) {
            return map.get(key);
        } else {
        	Caracter caracter = new Caracter(key);
            map.put(key, caracter);
            return caracter;
        }
	}

}
