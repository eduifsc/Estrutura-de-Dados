package org.example;

public class TestePacotes {
    static void main() {
        Fila<Pacote> fila = new Fila<>(10);

        Produtor produtorA = new Produtor("Humberto", "PC-A");
        Produtor produtorB = new Produtor("Doisberto", "PC-B");

        produtorA.produzirPacote(fila, 1, "login", "Servidor 1", "0000");
        produtorA.produzirPacote(fila, 2, "imagem", "Servidor 2", "0000");

        produtorB.produzirPacote(fila, 3, "imagem", "Servidor 3", "0000");

        IO.println("FILA DE PACOTES");
        fila.imprimir();

        fila.desenfileirar();
        fila.imprimir();
    }
}