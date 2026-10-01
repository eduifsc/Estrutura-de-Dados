package org.example;

public class Main {

    static void main() {

        FilaLinear<String> filaLinear = new FilaLinear<>(10);

        filaLinear.enfileirar("A");
        filaLinear.enfileirar("B");
        filaLinear.enfileirar("C");
        filaLinear.enfileirar("D");
        filaLinear.imprimir();
        filaLinear.enfileirar("E");
        filaLinear.desenfileirar();
        filaLinear.imprimir();
    }



}
