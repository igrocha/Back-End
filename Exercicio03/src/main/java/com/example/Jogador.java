package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jogador {
    private String nome = "Ronaldo";
    private String sobrenome = "Silva";
    private int idade = 26;

    public Jogador() {
    }

    public Jogador(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    // getters e setters aqui
}