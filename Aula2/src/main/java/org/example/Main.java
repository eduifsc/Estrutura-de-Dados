package org.example;

public class Main {
    static void main() {

//        VetorDinamico vetor = new VetorDinamico(2);
//
//        vetor.inserir("Carlos");
//        vetor.inserir("Carlos");
//        vetor.imprimir();
//
//        // Expande
//        vetor.inserir("Carlos");
//        vetor.imprimir();
//        vetor.inserir("Carlos");
//        vetor.inserir("Carlos");
//        vetor.inserir("Carlos");
//        vetor.inserir("Carlos");
//        vetor.imprimir();

        VetorDinamico vetor = new VetorDinamico(2);

        vetor.inserir("Davy Jones");
        vetor.inserir("Davy Jones");
        vetor.inserir("Davy Jones");
        vetor.inserir("Davy Jones");
        vetor.inserir("Davy Jones");
        vetor.inserir("Davy Jones");


        vetor.remover(1);
        vetor.imprimir();
        vetor.remover(1);
        vetor.imprimir();
        vetor.remover(1);
        vetor.imprimir();
        vetor.remover(1);
        vetor.imprimir();
        vetor.remover(1);
        vetor.imprimir();
    }
}
