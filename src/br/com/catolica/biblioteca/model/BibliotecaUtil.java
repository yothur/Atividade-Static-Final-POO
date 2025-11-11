package br.com.catolica.biblioteca.model;

import br.com.catolica.biblioteca.enums.StatusLivro;

public final class BibliotecaUtil {
    public static final int LIMITE_EMPRESTIMO = 2;

    public static int verificarLimite() {
        return LIMITE_EMPRESTIMO;
    }

    public static boolean verificarDisponibilidade(Livro livro){
        return livro.status.equals(StatusLivro.DISPONIVEL);
    }

}
