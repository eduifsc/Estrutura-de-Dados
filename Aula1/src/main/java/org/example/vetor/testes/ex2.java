package org.example.vetor.testes;

import org.example.vetor.VetorEstatico;

public class ex2 {
    static void main() {

        VetorEstatico vetor = new VetorEstatico(3);

        vetor.inserir("1");
        vetor.inserir("2");
        vetor.inserir(2,"8");

        vetor.removerUltimo();
        vetor.imprimir();
    }
}
