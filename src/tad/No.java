package tad;
/**
 *
 * @author Siabreu
 */
public class No {
    //atributos
    int dado;
    No prox; //auto referencia
    
    public No(int dado){
        this.dado = dado;
        prox = null; //referencia nula
    }

    @Override
    public String toString() {
        return String.valueOf(dado);
    }
}