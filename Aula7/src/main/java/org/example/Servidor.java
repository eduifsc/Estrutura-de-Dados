package org.example;

import java.util.Random;

public class Servidor {

    private int totalReqGeradas = 0;
    private int totalReqAtendidas = 0;
    private int totalReqPerdidas = 0;

    private Random aleatorio;
    private final Fila<String> fila;
    private int n;
    private int numProcessadores;

    public Servidor(int capacidade, int n, int numProcessadores) {
        this.fila = new Fila<>(capacidade);
        this.n = n;
        this.numProcessadores = numProcessadores;
        this.aleatorio = new Random();
    }

    public void executar(int ciclos) {

        for (int ciclo = 0; ciclo < ciclos ; ciclo++) {

            for (int processador = 0; processador < numProcessadores; processador++) {

                if (!fila.isEmpty()) {
                    fila.desenfileirar();
                    totalReqAtendidas++;
                }
            }

            int novasReq = aleatorio.nextInt(1, n);

            for (int i = 0; i < novasReq; i++) {
                if (!fila.isFull()) {
                    fila.enfileirar(".");
                } else {
                    totalReqPerdidas++;
                }
                totalReqGeradas++;
            }
        }
    }

    @Override
    public String toString() {
        return "Servidor: \n" +
                "Requisições: " + totalReqGeradas +
                "\n Atendidas: " + totalReqAtendidas +
                "\nPerdidas: " + totalReqPerdidas +
                "\n Perdidas%: " + (totalReqPerdidas/totalReqGeradas)*100;
    }
}
