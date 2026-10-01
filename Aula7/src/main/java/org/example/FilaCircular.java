package org.example;

public class FilaCircular<T extends Comparable<T>>  {

    private T[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;

    public FilaCircular(int capacidade) {
        elementos = (T[]) new Comparable[capacidade];
        tamanho = 0;
        fim = -1;
        inicio = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void enfileirar(T elemento) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("Cheio");
        }

        fim = (fim + 1) % elementos.length;
        elementos[fim] = elemento;
        tamanho++;
    }

    public T desenfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Vazio");
        }
        T valor = elementos[inicio];
        elementos[inicio] = null;

        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valor;
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % elementos.length;
            IO.print(elementos[indice] + " ");
        }
        IO.println();
    }
}
