package com.exemplo.model;

public class User {
    private String nome;
    private String email;

    public User(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nome + " (" + email + ")";
    }
}
