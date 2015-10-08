package flyweight.fila;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	private final Map<Character, CharacterConcrete> map = new HashMap<Character, CharacterConcrete>();

	public CharacterConcrete get(char key) {
		if (map.containsKey(key)) {
			return map.get(key);
		} else {
			CharacterConcrete characterConcrete = new CharacterConcrete(key);
			map.put(key, characterConcrete);
			return characterConcrete;
		}
	}

}
