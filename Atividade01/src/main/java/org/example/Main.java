package org.example;

public class Main {
    static void main() {
        Contato a = new Contato("Juan", "123");
        Contato b = new Contato("Júlia", "456");
        Contato c = new Contato("Juan", "789");
        Contato d = new Contato("Kaio", "123");

        Agenda agenda = new Agenda(2);

        agenda.adicionarContato(a);

        agenda.adicionarContato(b);

        agenda.adicionarContato(c);

        agenda.buscar("Juan");
    }
}
