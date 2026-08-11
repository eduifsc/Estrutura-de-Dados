package org.example;

public class Main {
    static void main() {
        Contato a = new Contato("Juan", "123");
        Contato b = new Contato("Júlia", "456");
        Contato c = new Contato("Juan", "789");
        Contato d = new Contato("Kaio", "123");

        Agenda agenda = new Agenda(1);

//        agenda.adicionarContato(a);
//
//        agenda.adicionarContato(b);
//
//        agenda.adicionarContato(c);
//
//        agenda.buscar("Juan");
//
//        agenda.editar("Juan", "João", "000000", "email");
//        agenda.buscar("João");
//
//        agenda.buscarInicio("Jo");

        Contato[] contatosNovos = {
                new Contato("Jonas", "1", "emal1"),
                new Contato("MAurício", "2", "email2"),
                new Contato("Drogba", "3", "email3"),
                new Contato("Jona", "4", "eml1"),
                new Contato("MAurcio", "5", "emai2"),
                new Contato("Drogba", "6", "eail3")

        };

        agenda.adicionarContatos(contatosNovos);
        agenda.listarContatos();
        agenda.removerContato(0);
        agenda.listarContatos();
        agenda.removerContato(0);
        agenda.listarContatos();
        agenda.removerContato(0);
        agenda.listarContatos();
        agenda.removerContato(0);
        agenda.listarContatos();
        agenda.removerContato(0);
        agenda.listarContatos();


    }
}
