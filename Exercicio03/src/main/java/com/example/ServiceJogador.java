package com.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ServiceJogador {
    ArrayList<Jogador> listacandidatos = new ArrayList<>();

    @Autowired
    ArmazenamentoRepositorio armazenamentoRepositorio;

    public void listar(Jogador jogador){
        System.out.println("O jogador " + jogador.getClass() + "foi indicado ao bola de ouro");

        if (listacandidatos.size() >= 0){
            armazenamentoRepositorio.armazenar(String.valueOf(jogador.getClass()));

        }else {
            listacandidatos.add(jogador);
        }

    }


}
