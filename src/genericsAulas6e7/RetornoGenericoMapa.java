package genericsAulas6e7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cassio Seffrin
 */
public class RetornoGenericoMapa {

	public static class Animal {
		private Map<String, Animal> amigos = new HashMap<>();

		public void addFriend(String nome, Animal animal) {
			amigos.put(nome, animal);
		}

		public <T> T callFriend(String nome) {
			return (T) amigos.get(nome);
		}
	}

	public static class cachorro extends Animal {

		public void latir() {
			System.out.println("Sou um cachorro");
		}
	}

	public static class gato extends Animal {

		public void miar() {
			System.out.println("Sou um gato");
		}
	}

	public static void main(String[] args) {
		Animal animals = new Animal();
		animals.addFriend("cachorro", new cachorro());
		animals.addFriend("gato", new gato());

		cachorro cachorro = animals.callFriend("cachorro");
		cachorro.latir();

		gato gato = animals.callFriend("gato");
		gato.miar();

	}
}