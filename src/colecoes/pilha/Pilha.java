package colecoes.pilha;

/**
*
* @author Cassio Seffrin
*/
public class Pilha<E> {

	private final int tamanho;
	private int elementoCorrente;
	private E[] elements;

	public Pilha() {
		this(10);
	}

	public Pilha(int s) {
		tamanho = s > 0 ? s : 10; // configura tamanho
		elementoCorrente = -1;
		elements = (E[]) new Object[tamanho]; // cria o array
	}

	public void inserir(E elementoInserir) throws PilhaCheiaException {
		if (elementoCorrente == tamanho - 1) {
			throw new PilhaCheiaException(String.format("Pilha cheia, nao eh possivel inserir %s ", elementoInserir));
		}
		elements[++elementoCorrente] = elementoInserir;
	}

	// retorna elemento anterior se nao estiver vazia
	public E extrair() throws PilhaVaziaExeption {
		if (elementoCorrente == -1) {
			throw new PilhaVaziaExeption("Pilha vazia, nao é possivel extrair mais nada");
		}
		return elements[elementoCorrente--]; // remove e retorna elemento superior da Pilha
	}
}
