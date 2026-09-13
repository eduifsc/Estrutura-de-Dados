package org.example;

public class Vetor {

    private Contato[] contatos;
    private int tamanho;

    public Vetor() {
        contatos = new Contato[10];
        tamanho = 0;
    }

    public Vetor(int capacidade) {
        contatos = new Contato[capacidade];
        tamanho = 0;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getCapacidade() {
        return contatos.length;
    }

    public Contato get(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return null;
        }

        return contatos[indice];
    }

    public void expandir() {
        Contato[] novoVetor = new Contato[contatos.length * 2];

        for (int i = 0; i < tamanho; i++) { // copia o vetor
            novoVetor[i] = contatos[i];
        }

        contatos = novoVetor;
    }

    public void inserirOrdenado(Contato contato, int indice) {

        if (indice < 0 || indice > tamanho)   {
            return;
        }

        if (tamanho == contatos.length) {
            expandir();
        }

        for (int i = tamanho; i > indice; i--) {
            contatos[i] = contatos[i - 1];
        }

        contatos[indice] = contato;
        tamanho++;
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return;
        }

        for (int i = indice; i < tamanho - 1; i++) {
            contatos[i] = contatos[i + 1];
        }

        contatos[tamanho - 1] = null;
        tamanho--;
    }

    public int buscar(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return i;
            }
        }

        return -1;
    }

    public void exibir() {
        if (tamanho == 0) {
            IO.println("Nenhum contato cadastrado.");
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            IO.println((i + 1) + " - " + contatos[i]);
        }
    }
}