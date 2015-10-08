package flyweight.fila;

public class FlyweightMain {

	public static void main(String[] args) {
		CharacterFactory characterFactory = new CharacterFactory();
		CharacterConcrete[] lista = new CharacterConcrete[3];
		lista[0] = characterFactory.get('a');
		lista[1] = characterFactory.get('b');
		lista[2] = characterFactory.get('c');
		for (CharacterConcrete characterConcrete : lista) {
			System.out.println(characterConcrete.getIntrinsic());
			System.out.println(characterConcrete.mayus());
		}

	}

}
