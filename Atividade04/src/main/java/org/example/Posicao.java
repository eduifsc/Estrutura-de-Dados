package org.example;

public class Posicao implements Comparable<Posicao> {
    private int x;
    private int y;

    public Posicao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Posicao o) {
        return 0;
    }
}
