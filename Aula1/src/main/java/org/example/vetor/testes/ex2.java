package org.example.vetor.testes;

import org.example.vetor.VetorEstatico;

public class ex2 {
    static void main() {

        VetorEstatico vetor = new VetorEstatico(9);

        vetor.inserir("1");
        vetor.inserir("2");
        vetor.inserir(2,"8");
        vetor.remover(2);
        vetor.remover("1");

        vetor.imprimir();
    }
}
