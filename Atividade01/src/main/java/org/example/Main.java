package org.example;

public class Main {
    static void main() {
        Contato a = new Contato("Juan", "123");
        Contato b = new Contato("Júlia", "456");
        Contato c = new Contato("Juan", "789");
        Contato d = new Contato("Kaio", "123");

        Agenda agenda = new Agenda(10);

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
                new Contato("Drogba", "3", "email3")
        };

        agenda.adicionarContatos(contatosNovos);
        agenda.listarContatos();
    }
}
