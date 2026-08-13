package org.example;

public class ExemploCaixa {
    static void main() {

        Caixa<String> caixaTexto = new Caixa<>();

        caixaTexto.guardar("Olá mundo");
        IO.println(caixaTexto.abrir());

        Caixa<Integer> caixaNumero = new Caixa<>();

        caixaNumero.guardar(25);
        IO.println(caixaNumero.abrir());
    }
}
