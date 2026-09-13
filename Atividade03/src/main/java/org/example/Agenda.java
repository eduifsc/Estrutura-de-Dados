package org.example;

public class Agenda {

    private Vetor[] agenda;

    public Agenda() {
        agenda = new Vetor[26];

        for (int i = 0; i < agenda.length; i++) {
            agenda[i] = new Vetor();
        }
    }

    public Vetor[] getAgenda() {
        return agenda;
    }

    public int obterIndice(String nome) {
        if (nome == null || nome.length() == 0) {
            return -1;
        }

        char primeiraLetra = Character.toUpperCase(nome.charAt(0));

        if (primeiraLetra < 'A' || primeiraLetra > 'Z') {
            return -1;
        }

        return primeiraLetra - 'A'; // (A - A = 0), (B - A = 1)
    }

    public void adicionar(String nome, String telefone) {

        int indiceLetra = obterIndice(nome);

        if (indiceLetra == -1) {
            IO.println("Nome invaldo.");
            return;
        }

        Vetor vetor = agenda[indiceLetra];
        Contato novoContato = new Contato(nome, telefone);

        int posicao = 0;

        while (posicao < vetor.getTamanho() && vetor.get(posicao).getNome().compareToIgnoreCase(nome) < 0) {

            posicao++;
        }

        vetor.inserirOrdenado(novoContato, posicao);

        IO.println("Contato adicionado com sucesso.");
    }

    public Contato buscar(String nome) {

        int indiceLetra = obterIndice(nome);

        if (indiceLetra == -1) {
            return null;
        }

        Vetor vetor = agenda[indiceLetra];
        int posicao = vetor.buscar(nome);

        if (posicao == -1) {
            return null;
        }

        return vetor.get(posicao);
    }

    public void remover(String nome) {

        int indiceLetra = obterIndice(nome);

        if (indiceLetra == -1) {
            IO.println("Nome inválido.");
            return;
        }

        Vetor vetor = agenda[indiceLetra];
        int posicao = vetor.buscar(nome);

        if (posicao == -1) {
            IO.println("Contato não encontrado.");
            return;
        }

        vetor.remover(posicao);

        IO.println("Contato removido com sucesso.");
    }

    public void atualizar(String nomeAtual, String novoNome, String novoTelefone) {

        Contato contato = buscar(nomeAtual);

        if (contato == null) {
            IO.println("Contato não encontrado.");
            return;
        }

        int novoIndiceLetra = obterIndice(novoNome);

        if (novoIndiceLetra == -1) {
            IO.println("Novo nome inválido.");
            return;
        }

        remover(nomeAtual);
        adicionar(novoNome, novoTelefone);

        IO.println("Contato atualizado com sucesso.");
    }

    public void listarPorLetra(char letra) {

        letra = Character.toUpperCase(letra);

        if (letra < 'A' || letra > 'Z') {
            IO.println("Letra inválida.");
            return;
        }

        int indice = letra - 'A';

        IO.println("Contatos iniciados por " + letra + ":");
        agenda[indice].exibir();
    }

    public void listarTodos() {

        boolean encontrou = false; //teste,

        for (int i = 0; i < agenda.length; i++) {

            if (agenda[i].getTamanho() > 0) {
                encontrou = true;

                char letra = (char) ('A' + i);

                IO.println("\n--- Letra  " + letra + " ---");


                agenda[i].exibir();
            }
        }

        if (!encontrou) {
            IO.println("A agenda está vazia.");
        }
    }
}