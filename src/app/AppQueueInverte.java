/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import tadInverte.QueueInverte;
import tadInverte.Stack;

/**
 *
 * @author groov
 */
public class AppQueueInverte {
    public static void main(String[] args) {
        QueueInverte fila =  new QueueInverte();//Fila inicial
        QueueInverte fila1= new QueueInverte();//Fila invertida
        Stack pilha = new Stack();// Pilha para inverter a fila
        //Inserção manual de dados
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        
        System.out.println("Fila 1 \n"+fila);//Imprime os dados inseridos
        transferir(fila, pilha, fila1);//transfere os dados da fila para a pilha e da piha para a fila1
        System.out.println("Fila inversa: \n"+fila1);//Imprime os dados invertido
    

    }
    static public void transferir(QueueInverte f1, Stack p1, QueueInverte f2){//método para transferir os dados
    while(!f1.isEmpty()){//laço para verificar se a fila inicial não está vazia
        p1.push( f1.dequeue());// enquanto ela não estiver vazia, vai fazer um dequeue na pilha
     
    }
    while(!p1.isEmpty()){ //laço para verificar se a pilha não está vazia
        f2.enqueue(p1.pop());// enquanto ela não estiver vazia, fará um pop na fila 3.
    }

}
}