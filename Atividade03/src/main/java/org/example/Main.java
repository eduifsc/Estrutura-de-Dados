package org.example;

public class Main {
    static void main() {

        Agenda agenda = new Agenda();

        int opcao;

        do { // menu
            IO.println("");
            IO.println("===== AGENDA =====");
            IO.println("1 - Adicionar contato");
            IO.println("2 - Buscar contato");
            IO.println("3 - Remover contato");
            IO.println("4 - Atualizar contato");
            IO.println("5 - Listar contatos por letra");
            IO.println("6 - Listar todos os contatos");
            IO.println("0 - Sair");

            opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

            switch (opcao) {

                case 1: {
                    String nome = IO.readln("Digite o nome: ");
                    String telefone = IO.readln("Digite o telefone: ");

                    agenda.adicionar(nome, telefone);
                    break;
                }

                case 2: {
                    String nome = IO.readln("Digite o nome que deseja buscar: ");

                    Contato contato = agenda.buscar(nome);

                    if (contato == null) {
                        IO.println("Contato não encontrado.");
                    } else {
                        IO.println("Contato encontrado:");
                        IO.println(contato.toString());
                    }

                    break;
                }

                case 3: {
                    String nome = IO.readln("Digite o nome que deseja remover: ");

                    agenda.remover(nome);
                    break;
                }

                case 4: {
                    String nomeAtual = IO.readln("Digite o nome atual: ");

                    String novoNome = IO.readln("Digite o novo nome: ");

                    String novoTelefone = IO.readln("Digite o novo telefone: ");

                    agenda.atualizar(nomeAtual, novoNome, novoTelefone);

                    break;
                }

                case 5: {
                    String letraTexto = IO.readln("Digite a letra desejada: ");

                    if (letraTexto.length() == 0) {

                        IO.println("Nenhuma letra foi informada.");
                    } else {
                        agenda.listarPorLetra(letraTexto.charAt(0));
                    }
                    break;
                }


                case 6: {
                    agenda.listarTodos();
                    break;
                }

                case 0: {
                    IO.println("Programa encerrado.");
                    break;
                }

                default: {
                    IO.println("Opção inválida.");
                    break;
                }
            }


        } while (opcao != 0);
    }
}