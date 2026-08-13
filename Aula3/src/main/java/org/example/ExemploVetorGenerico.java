package org.example;

public class ExemploVetorGenerico {

    static void main(){

        Vetor<Produto> estoque = new Vetor<>(10);

        estoque.inserir(new Produto(1, "mesa", 1200));
        estoque.inserir(new Produto(2, "tenis", 150));
        estoque.inserir(new Produto(3, "meia", 5));

        estoque.imprimir();
    }
}
