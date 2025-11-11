package br.com.catolica.biblioteca.model;

import br.com.catolica.biblioteca.enums.StatusLivro;

import java.util.ArrayList;

public class Membro{
    public static int NEXTID;
    public final int id;
    public String nome;
    public ArrayList<Livro> livrosEmprestados;
    public static int contadorMembros;


    public Membro(String nome){
        NEXTID++;
        this.id = NEXTID;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
        contadorMembros++;
    }

    public boolean emprestarLivro(Livro livro){
        if (livrosEmprestados.size() >= BibliotecaUtil.verificarLimite()){
            return false;
        }
        if (BibliotecaUtil.verificarDisponibilidade(livro)){
            livro.status = StatusLivro.EMPRESTADO;
            this.livrosEmprestados.add(livro);
            return true;
        }
        return false;
    }

    public boolean devolverLivro(Livro livro){
        for (Livro livros : livrosEmprestados) {
            if (livros.equals(livro)){
                this.livrosEmprestados.remove(livro);
                livro.status = StatusLivro.DISPONIVEL;
                return true;
            }
        }
        return false;
    }


    public static int getTotalMembros() {
        return contadorMembros;
    }

}
