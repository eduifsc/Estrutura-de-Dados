package org.example;

public class Main {

    static void main() {

        Fila<String> fila = new Fila<>(10);

        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");
        fila.imprimir();
        fila.enfileirar("E");
        fila.desenfileirar();
        fila.imprimir();
    }



}
