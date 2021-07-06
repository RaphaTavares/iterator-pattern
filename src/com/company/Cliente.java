package com.company;

public class Cliente {
    private String nome;
    private boolean aulas;

    public Cliente(String nome, boolean aulas)
    {
        this.nome = nome;
        this.aulas = aulas;
    }

    public String getNome() {
        return nome;
    }

    public Cliente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public boolean isAulas() {
        return aulas;
    }

    public Cliente setAulas(boolean aulas) {
        this.aulas = aulas;
        return this;
    }
}
