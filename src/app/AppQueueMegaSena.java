/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;
import tad.Queue;

/**
 *
 * @author groov
 */
public class AppQueueMegaSena {
    public static void main(String[] args) {
        Queue fila =  new Queue();
        Random r = new Random();
        for (int i = 0; i <6; i++) {
            fila.enqueue(r.nextInt(60)+1);
        
        }
                   
            System.out.println("+++Sorteio da Mega Sena+++");
            System.out.println("Teste a sorte nesses números: "+fila);
            
        
        
    }
    
}
