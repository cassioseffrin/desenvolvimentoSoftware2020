package colecoes.pilha;


/**
*
* @author Cassio Seffrin
*/
public class ComparaGenerico {

    public static < T extends Comparable> T maximo(T var1, T var2, T var3) {
        T max = var1; //supoe q x eh maior
        if (var2.compareTo(max) > 0) {
            max = var2;
        }
        if (var3.compareTo(max) > 0) {
            max = var3;
        }
        return max;
    }

    public static void main(String ar[]) {
       System.out.printf("\no valor maximo de %d, %d, %d é: %d", 3, 5, 7, maximo(3, 5, 7));
        System.out.printf("\no valor maximo de %.2f, %.2f, %.2f é: %.2f", 3.34, 5.32, 1.34, maximo(3.34, 5.32, 1.34));
        System.out.printf("\no valor maximo %s", maximo("a", "b", "c"));
        
        /*System.out.println("\ncomparacao: " + "BbbRsfdsfsdf".compareTo("BbbS"));
        Integer a=8;
        Integer b=7;
        Integer c=4;
       
        System.out.println(maximo(a, b, c)); */
    }
}
