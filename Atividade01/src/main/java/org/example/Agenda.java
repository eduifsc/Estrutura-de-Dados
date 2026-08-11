package org.example;

public class Agenda {
    private Contato[] contatos;
    private int tamanho;

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
        this.tamanho = 0;
    }

    public void adicionarContato(Contato contato) {

        //          VETOR ESTÁTICO:
        for (int i = 0; i < tamanho; i++) {
            if (contato.getNome().equals(contatos[i].getNome())) {
                IO.println("Nome do contato existente");
                return;
            } else if (contato.getTelefone().equals(contatos[i].getTelefone())) {
                IO.println("Numero do contato já existente");
                return;
            }
        }
//
//        if (tamanho < contatos.length) {
//            contatos[tamanho] = contato;
//            tamanho++;
//            IO.println("Contato adicionado");
//        } else {
//            IO.print("Vetor cheio");
//        }
//    }
        // VETOR DINÂMICO:

            if (tamanho == contatos.length) {
                expandir();
            }

            contatos[tamanho] = contato;
            tamanho++;
        }

    private void expandir() {
        Contato[] novo = new Contato[contatos.length * 2];

        for (int i = 0; i < contatos.length; i++) {
            novo[i] = contatos[i];
        }
        contatos = novo;
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
        reduzir(); //vetor estático não tem, somente no dinâmico
    }

    public void reduzir() {

        if (tamanho <= contatos.length/4) {
            Contato[] novo = new Contato[contatos.length/2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = contatos[i];
            }
            contatos = novo;
        }
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

        int indice = -1;

        for (int i = 0; i < tamanho; i++) {
            if (busca.equals(contatos[i].getNome()) || busca.equals(contatos[i].getTelefone())) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            IO.println("Contato não encontrado");
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            if (i != indice) {

                if (novoNome.equals(contatos[i].getNome())) {
                    IO.println("Nome do contato já existente");
                    return;
                }

                if (novoTelefone.equals(contatos[i].getTelefone())) {
                    IO.println("Número do contato já existente");
                    return;
                }

                if (novoTelefone.equals(contatos[i].getEmail())) {
                    IO.println("Endereço de e-mail já existente");
                    return;
                }
            }
        }

        contatos[indice].setNome(novoNome);
        contatos[indice].setTelefone(novoTelefone);
        contatos[indice].setEmail(novoEmail);

        IO.println("Contato editado");
    }

    public void buscarInicio(String busca) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().startsWith(busca)) {
                IO.println(contatos[i]);
            }
        }
    }

    public void adicionarContatos(Contato[] novosContatos) {
        for (Contato contato : novosContatos) {
            adicionarContato(contato);
        }
    }

    public void listarContatos() {
        if (tamanho == 0) {
            IO.println("Nenhum contato cadastrado");
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            IO.println(contatos[i]);
        }
    }
}
