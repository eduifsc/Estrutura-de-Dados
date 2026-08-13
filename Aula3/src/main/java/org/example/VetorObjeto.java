package org.example;

public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int quantidade) {
        elementos = new Object[quantidade];
        this.tamanho = 0;
    }

    public void inserir(Object elemento) {

        if (tamanho == elementos.length) {
            IO.println("Cheio");
            return;
        }

        elementos[tamanho] = elemento;
        tamanho++;
    }

    public Object ler(int indice) {
        return elementos[indice];
    }
}
