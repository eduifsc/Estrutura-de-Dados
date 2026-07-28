package org.example;

public class Main {
    static void main() {

        Gerente g = new Gerente(90, "Robson");
        Funcionario a = new Funcionario(20, "1");
        Funcionario b = new Funcionario(20, "4");
        Funcionario c = new Funcionario(20, "3");
        Funcionario d = new Funcionario(20, "4");

        Equipe equipe1 = new Equipe(g, new Funcionario[]{a, b, c, d}, 1);

        IO.println(equipe1.salarioFinalGerente());
        IO.println(equipe1.custoTotal());


    }
}
