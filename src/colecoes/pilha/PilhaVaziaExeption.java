/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes.pilha;

/**
*
* @author Cassio Seffrin
*/
class PilhaVaziaExeption extends Exception {

    public PilhaVaziaExeption(String exception) {
        super(exception);
    }

    public PilhaVaziaExeption() {
        this("A pilha esta vazia");
    }
    
    
    
}
