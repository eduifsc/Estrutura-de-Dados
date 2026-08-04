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
            if (contatos[i].getNome().equals(contato.getNome())) {
                IO.println("Nome do contato existente");
            } else if (contatos[i].getTelefone().equals(contato.getTelefone())) {
                IO.println("Numero do contato já existente");
            } else if (tamanho < contatos.length) {
                contatos[tamanho] = contato;
                tamanho++;
            } else {
                IO.print("Vetor cheio");
            }
        }
    }
}
