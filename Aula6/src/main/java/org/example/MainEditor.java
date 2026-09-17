package org.example;

public class MainEditor {
    static void main() {

        EditorTexto editor = new EditorTexto();

        editor.escrever("Boa ");
        editor.escrever("noite");

        IO.println("Conteudo atual: " + editor.getConteudo());

        editor.desfazer();
        IO.println("Conteudo após desfazer: " + editor.getConteudo());

        editor.refazer();
        IO.println("Conteudo apos rafazer: " + editor.getConteudo());

        editor.escrever("");
    }
}
