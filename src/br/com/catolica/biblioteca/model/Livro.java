package br.com.catolica.biblioteca.model;

import br.com.catolica.biblioteca.enums.StatusLivro;

public class Livro {
    public static int NEXTCODIGO;
    public final int codigo;
    public final String titulo;
    public final String autor;
    public StatusLivro status;
    public static int contadorLivros;

    public Livro(String titulo, String autor){
        NEXTCODIGO++;
        this.codigo = NEXTCODIGO;
        this.titulo = titulo;
        this.autor = autor;
        this.status = StatusLivro.DISPONIVEL;
        contadorLivros++;
    }


    public static int getTotalLivros() {
        return contadorLivros;
    }
}
