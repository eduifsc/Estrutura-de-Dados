package org.example;

public class Agenda {
    private Contato[] contatos;
    private int tamanho;

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
        this.tamanho = 0;
    }

    public void adicionarContato(Contato contato) {

        for (int i = 0; i < tamanho; i++) {
            if (contato.getNome().equals(contatos[i].getNome())) {
                IO.println("Nome do contato existente");
                return;
            } else if (contato.getTelefone().equals(contatos[i].getTelefone())) {
                IO.println("Numero do contato já existente");
                return;
            }
        }

        if (tamanho < contatos.length) {
            contatos[tamanho] = contato;
            tamanho++;
            IO.println("Contato adicionado");
        } else {
            IO.print("Vetor cheio");
        }
    }

    public void removerContato(int indice){
        if (indice < 0 || indice >= contatos.length) {
            IO.println("Índice inválido");
            return;
        }

        for (int i = indice; i < tamanho ; i++) {
            contatos[i] = contatos[i + 1];
        }
        contatos[tamanho - 1] = null;
        tamanho--;
    }

    public void buscar(String busca) {
        for (int i = 0; i < tamanho; i++) {
            if (busca.equals(contatos[i].getNome())) {
                IO.println(contatos[i].toString());
                return;
            } else if (busca.equals(contatos[i].getTelefone())) {
                IO.println(contatos[i].toString());
                return;
            }
        }
        IO.println("Contato não encontrado");
    }

    public void editar(String busca, String novoNome, String novoTelefone, String novoEmail) {

    }
}
