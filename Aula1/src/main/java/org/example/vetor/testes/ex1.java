package org.example.vetor.testes;

import org.example.vetor.VetorEstatico;

public class ex1 {

    static void main(){
        VetorEstatico vetor = new VetorEstatico(3);

        vetor.inserir("1");
        vetor.inserir("2");
        vetor.inserir("3");
        vetor.inserir("4");

        vetor.imprimir();
    }
}
