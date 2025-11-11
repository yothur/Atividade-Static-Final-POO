package br.com.catolica.biblioteca.main;

import br.com.catolica.biblioteca.model.BibliotecaUtil;
import br.com.catolica.biblioteca.model.Livro;
import br.com.catolica.biblioteca.model.Membro;

public class TesteBiblioteca {
    public static void main(String[] args) {

        // Criar livros
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo");
        Livro livro3 = new Livro("Memórias Póstumas", "Machado de Assis");

        // Criar membros
        Membro membro1 = new Membro("João Silva");
        Membro membro2 = new Membro("Maria Santos");

        // Testar empréstimos

        System.out.println("=== TESTANDO EMPRÉSTIMOS ===");
        System.out.println(membro1.emprestarLivro(livro1));
        System.out.println(membro1.emprestarLivro(livro2));

        System.out.println(membro1.emprestarLivro(livro3));
        System.out.println(membro2.emprestarLivro(livro2));

        // Testar devoluções
        System.out.println("\n=== TESTANDO DEVOLUÇÕES ===");
        System.out.println(membro1.devolverLivro(livro1));
        System.out.println(membro2.emprestarLivro(livro1));

        // Mostrar estatísticas

        System.out.println("\n=== ESTATÍSTICAS ===");
        System.out.println("Total de livros: " + Livro.getTotalLivros());
        System.out.println("Total de membros: " + Membro.getTotalMembros());
        System.out.println("Limite de empréstimos: " + BibliotecaUtil.LIMITE_EMPRESTIMO);

        System.out.println("\n=== DISPONIBILIDADES ===");

        System.out.println("Verificando disponibilidade do livro 1: " + BibliotecaUtil.verificarDisponibilidade(livro1));
        System.out.println("Verificando disponibilidade do livro 2: " + BibliotecaUtil.verificarDisponibilidade(livro2));
        System.out.println("Verificando disponibilidade do livro 3: " + BibliotecaUtil.verificarDisponibilidade(livro3));

    }

}
