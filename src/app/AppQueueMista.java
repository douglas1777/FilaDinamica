
package app;

import java.util.Random;
import tad.Queue;

/**
 *
 * @author groov
 */
public class AppQueueMista {
    public static void main(String[] args) {
        Queue fila = new Queue();
        Queue fila1 = new Queue();
        Queue filam= new Queue();
        
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            fila.enqueue(r.nextInt(100)+1);
        }
        for (int i = 0; i < 8; i++) {
            fila1.enqueue(r.nextInt(100)+1);
            
        }
            
                      
        
        System.out.println("Fila 1: " + fila);
        System.out.println("Fila 2: "+fila1 );
        misturar(fila,fila1, filam );
        System.out.println("Fila mista: "+filam);
    }
    static public void misturar(Queue f1, Queue f2, Queue f3){
    while(!f1.isEmpty()||!f2.isEmpty()){
        if(!f1.isEmpty()){ 
        f3.enqueue(f1.dequeue());}
        if(!f2.isEmpty()){
         f3.enqueue(f2.dequeue());}
    }
    } 
}
