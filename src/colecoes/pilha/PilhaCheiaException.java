package colecoes.pilha;

/**
*
* @author Cassio Seffrin
*/
class PilhaCheiaException extends Exception {

    public PilhaCheiaException() {
           this("A pilha esta cheia");
    }
    
    public PilhaCheiaException(String format) {
            super(format);
    }
    
    
}
