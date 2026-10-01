package org.example;

public class TesteServidores {

    static void main() {
        Servidor A = new Servidor(1000, 100, 200);
        Servidor B = new Servidor(500, 100, 50);
        Servidor C = new Servidor(500, 100, 30);
        Servidor D = new Servidor(50, 100, 50);
        Servidor E = new Servidor(1000, 100, 10);

        A.executar(10000);
        B.executar(10000);
        C.executar(10000);
        D.executar(10000);
        E.executar(10000);

        IO.println(A.toString());
        IO.println();
        IO.println(B.toString());
        IO.println();
        IO.println(C.toString());
        IO.println();
        IO.println(D.toString());
        IO.println();
        IO.println(E.toString());
    }
}