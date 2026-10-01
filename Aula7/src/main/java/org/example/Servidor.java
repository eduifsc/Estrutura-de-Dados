package org.example;

import java.util.Random;

public class Servidor {

    private int totalReqGeradas = 0;
    private int totalReqAtendidas = 0;
    private int totalReqPerdidas = 0;

    private Random aleatorio;
    private final FilaLinear<String> filaLinear;
    private int n;
    private int numProcessadores;

    public Servidor(int capacidade, int n, int numProcessadores) {
        this.filaLinear = new FilaLinear<>(capacidade);
        this.n = n;
        this.numProcessadores = numProcessadores;
        this.aleatorio = new Random();
    }

    public void executar(int ciclos) {

        for (int ciclo = 0; ciclo < ciclos ; ciclo++) {

            for (int processador = 0; processador < numProcessadores; processador++) {

                if (!filaLinear.isEmpty()) {
                    filaLinear.desenfileirar();
                    totalReqAtendidas++;
                }
            }

            int novasReq = aleatorio.nextInt(1, n);

            for (int i = 0; i < novasReq; i++) {
                if (!filaLinear.isFull()) {
                    filaLinear.enfileirar(".");
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
                "\n Perdidas%: " + ((double) totalReqPerdidas / totalReqGeradas) * 100;
    }
}
