package org.example;

public class TesteFilaCircular {
    static void main() {
        FilaCircular<String> fila = new FilaCircular<>(4);

        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");

        fila.imprimir();

        IO.println("Removido " + fila.desenfileirar());
        IO.println("Removido " + fila.desenfileirar());

        fila.imprimir();

        fila.enfileirar("F");
        fila.enfileirar("G");

        fila.imprimir();
    }
}
