package app;

import tad.Queue;
import tadchar.QueueChar;

/**
 *
 * @author Siabreu
 */
public class AppQueue {
    public static void main(String[] args) {
        Queue fila = new Queue();//início e fim apontam para null
        
        fila.enqueue(5);
        fila.enqueue(8);
        fila.enqueue(10);
        
        System.out.println("==== Dados da Fila ==== \n" + fila);
        
        while(!fila.isEmpty()){
            System.out.println("Saiu da fila: " + fila.dequeue());
        }
        
        try{ //exceção!!!!
            System.out.println("Saiu da fila: " + fila.dequeue());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
            //Fila Char
        
    }
}
