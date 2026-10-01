package org.example;

public class Produtor {

    private String nome;
    private String endereco;

    public Produtor(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void produzirPacote(FilaLinear<Pacote> filaLinear, int numero, String origem, String destino, String dados) {
        Pacote pacote = new Pacote(numero, origem, destino, dados);
        filaLinear.enfileirar(pacote);
        IO.println(nome + " produziu " + pacote);
    }
}
