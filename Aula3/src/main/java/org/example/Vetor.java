package org.example;

public class Vetor<T> {

    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int quantidade) {
        elementos = (T[]) new Object[quantidade];
        tamanho = 0;
    }

    public void inserir(T elemento) {

        if (tamanho == elementos.length) {
            expandir();
        }

        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void remover(int indice) {

        if (indice < 0 || indice >= elementos.length) {
            IO.println("Índice inválido");
            return;
        }

        for (int i = indice; i < tamanho ; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamanho - 1] = null;
        tamanho--;
        reduzir();
    }

    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[]) new Object[elementos.length * 2];

        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        elementos = novo;
    }

    @SuppressWarnings("unchecked")
    public void reduzir() {

        if (tamanho <= elementos.length/4) {
            T[] novo = (T[]) new Object[elementos.length/2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }
    }

    public void imprimir(){
        IO.print("[");

        for (int i = 0; i < elementos.length; i++) {
            IO.print(elementos[i]);
            if (i < elementos.length -1) {
                IO.print(", ");
            }
        }
        IO.println("]");
    }



}
