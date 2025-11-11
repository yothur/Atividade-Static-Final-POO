package br.com.catolica.usuario.model;

public class User {
    public static int NEXTID;
    public final int id;
    public String nome;
    public String email;
    public static int totalUsers = 0;



    public User(String nome, String email){
        NEXTID++;
        this.id = NEXTID;
        this.nome = nome;
        this.email = email;
        totalUsers++;
    }

    public int getId() {
        return this.id;
    }

    public static int getTotalUsers(){
        return totalUsers;
    }

    public static boolean isValidEmail(String email){
        return email.contains("@");
    }
}
