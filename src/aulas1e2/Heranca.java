package aulas1e2;

abstract class Animal {
	// metodo abstrado (sem implementacao)
	public abstract void tocarSom();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Cachorro extends Animal {
	public void tocarSom() {

		System.out.println("play latir.mp3");
	}
}

class Gato extends Animal {
	public void tocarSom() {

		System.out.println("play miar.mp3");
	}
}

class Principal {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.tocarSom();
		cachorro.sleep();
	}
}