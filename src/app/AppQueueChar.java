/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import tadchar.QueueChar;

/**
 *
 * @author groov
 */
public class AppQueueChar {
    public static void main(String[] args) {
        QueueChar fila =  new QueueChar();
            fila.enqueue('A');
            fila.enqueue('B');
            fila.enqueue('C');
            System.out.println("==== Dados da Fila ==== \n" + fila);
        
        while(!fila.isEmpty()){
            System.out.println("Saiu da fila: " + fila.dequeue());
        }
        
        try{ //exceção!!!!
            System.out.println("Saiu da fila: " + fila.dequeue());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
}
}