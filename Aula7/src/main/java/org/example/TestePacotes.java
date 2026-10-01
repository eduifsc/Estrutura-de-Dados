package org.example;

public class TestePacotes {
    static void main() {
        FilaLinear<Pacote> filaLinear = new FilaLinear<>(10);

        Produtor produtorA = new Produtor("Humberto", "PC-A");
        Produtor produtorB = new Produtor("Doisberto", "PC-B");

        produtorA.produzirPacote(filaLinear, 1, "login", "Servidor 1", "0000");
        produtorA.produzirPacote(filaLinear, 2, "imagem", "Servidor 2", "0000");

        produtorB.produzirPacote(filaLinear, 3, "imagem", "Servidor 3", "0000");

        IO.println("FILA DE PACOTES");
        filaLinear.imprimir();

        filaLinear.desenfileirar();
        filaLinear.imprimir();
    }
}