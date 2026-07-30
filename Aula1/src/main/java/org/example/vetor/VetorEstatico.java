package org.example.vetor;

public class VetorEstatico {
    private String[] elementos;
    private int tamanho;

    public VetorEstatico(int quantidade) {
        elementos = new String[quantidade];
        this.tamanho = 0;
    }

//    public void inserir(String elemento) {
//        for (int i = 0; i < elementos.length; i++) { // Precisa percorrer o vetor inteiro pra preencher (problemático)
//            if (elementos[i] == null) {
//                elementos[i] = elemento;
//                return;
//            }
//        }
//        IO.println("Não existe posição disponível");
//    }
//
    public void inserir(String elemento){ // Contem variável de controle pra otimizar pesquisa

        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            IO.println("Vetor cheio!");
        }
    }

    public void inserir(int indice, String elemento) {

        if (tamanho >= elementos.length) {
            IO.println("Vetor cheio");
            return;
        }

        if (indice < 0 || indice > elementos.length) {
            IO.println("Índice inválido");
            return;
        }

        for (int i = tamanho; i > indice ; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[indice] = elemento;
        tamanho++;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public void removerUltimo() {
        elementos[tamanho - 1] = null;
        tamanho--;
    }

    public void imprimir(){
        IO.print("[");

        for (int i = 0; i < elementos.length; i++) {
            IO.print(elementos[i]);
            if (i < elementos.length -1) {
                IO.print(", ");
            }
        }
        IO.print("]");
    }
}


