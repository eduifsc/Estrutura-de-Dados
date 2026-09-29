package org.example;

public class TesteServidores {

    static void main() {
        Servidor A = new Servidor(2000, 150, 1000);
        Servidor B = new Servidor(500, 1500, 10000);
        Servidor C = new Servidor(20000, 150, 10);

        A.executar(10000);
        B.executar(10000);
        C.executar(10000);

        IO.println(A.toString());
        IO.println();
        IO.println(B.toString());
        IO.println();
        IO.println(C.toString());
    }
}