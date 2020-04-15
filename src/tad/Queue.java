package tad;

/**
 *
 * @author Siabreu
 */
public class Queue {

    //atributos
    private No inicio;
    private No fim;
    private int total;

    //Construtor
    public Queue() {
        //inicio e fim da fila aponta para null
        inicio = fim = null;
        total = 0;
    }

    //insere dado no fim da fila
    public void enqueue(int dado) {
        No novoNo = new No(dado); //cria o nó

        if (isEmpty()) {
            inicio = fim = novoNo;
        } else {
            fim.prox = novoNo; //faz o prox do fim nó apontar para o novo nó
            fim = novoNo; //faz o fim apontar para o nó criado
        }
        total++;
    }

    //retira dado do inicio da fila
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("==>Fila Vazia!!");
        }

        No temp = inicio; //recupera o dado do inicio 

        //tem apenas 1 dado? seta null para inicio e fim
        if (size() == 1) {
            inicio = fim = null;
        } else {
            inicio = inicio.prox; //inicio passa a ser o próximo nó
        }
        total--;

        return temp.dado;
    }

    //retorna dado do início da fila sem remover
    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("==>Fila Vazia!!");
        }
        return inicio.dado;
    }

    //verifica se a fila está vazia
    public boolean isEmpty() {
        return total == 0;
    }

    //retorna o total de dados da fila
    public int size() {
        return total;
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();

        No atual = inicio; //atual aponta para o início da fila
        //enquanto não encontrar null
        while (atual != null) {
            saida.append(atual.dado).append(" ");
            //avança para a próxima referência
            atual = atual.prox;
        }
        return saida.toString();
    }
}
